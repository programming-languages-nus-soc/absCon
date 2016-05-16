grammar AbsCon;

program : global abDecls conDecls;

global : '#declares' BLOCKOPEN globalDecl BLOCKCLOSE;
abDecls: '#abstract' BLOCKOPEN abDecl BLOCKCLOSE;
conDecls: '#concrete' BLOCKOPEN conDecl BLOCKCLOSE;

//Global Declarations
globalDecl: (ftrDecl)+;
ftrDecl: ftrAssign | ftrSet;
ftrAssign:ID ASSIGN (ID|DIGITS) SEMICOLON;
ftrSet : ID ASSIGN 'setOf' OPENBRACE ids CLOSEBRACE  SEMICOLON;
ids: ID | ID COMMA ids;

//Abstraction Declarations
abDecl : concreteVector abstractVector  abAssign;
concreteVector:'#concVec' ID SEMICOLON;
abstractVector:'#abstVec' ID SEMICOLON;

abAssign:'#assigns' BLOCKOPEN (assign)+ BLOCKCLOSE;
assign: iAssign|gAssign;
iAssign:accessor ASSIGN expr SEMICOLON;
accessor: featureAccessor | indexAccessor;
featureAccessor: ID OPENBRACE ID CLOSEBRACE ;
indexAccessor: ID SQUAREBRACEOPEN DIGITS SQUAREBRACECLOSE;
gAssign:'setFeatures' OPENBRACE ID COMMA ID CLOSEBRACE ASSIGN expr SEMICOLON ;
expr: exp+;
exp: paranthesizedExp | exp MULDIV exp | exp ADDSUB exp | accessor |DIGITS | sumOfFeatures  | sourceOf | sourceOfSize|absFeature |id;
id:ID;
paranthesizedExp: OPENBRACE exp CLOSEBRACE;
sumOfFeatures :'sumOfFeatures' OPENBRACE (ID | sourceOf) COMMA (ID|sourceOf) CLOSEBRACE;
sourceOf:'sourceOf' OPENBRACE ID CLOSEBRACE OPENBRACE (ID|DIGITS) CLOSEBRACE OPENBRACE DIGITS CLOSEBRACE;
sourceOfSize:'sourceOfSize' OPENBRACE ID CLOSEBRACE OPENBRACE (ID|DIGITS) CLOSEBRACE;
absFeature:'abs' OPENBRACE ID CLOSEBRACE;

//Concretization Declarations
conDecl: cloneVector queryVector concFtrDecl;
cloneVector:'#clone' ID SEMICOLON;
queryVector:'#query' ID SEMICOLON;

concFtrDecl: '#filters' BLOCKOPEN filters BLOCKCLOSE;
filters: (filter)+ | '' ;
filter:letBlk | conditions;
conditions:existl| univsl| rExpr | bExpr;
letBlk: 'let' BLOCKOPEN (simpAssign)+ BLOCKCLOSE 'in' BLOCKOPEN (conditions)+ BLOCKCLOSE;
rExpr: rExp SEMICOLON;
rExp:(expr rop)+ expr;
rop: DOUBLEEQUAL | LESSTHAN | GREATERTHAN | NOTEQUAL | LESSTHANEQUAL | GREATERTHANEQUAL;
existl:  'exists' eltChk COLON BLOCKOPEN bExpr BLOCKCLOSE ;
univsl: 'forall' OPENBRACE eltChk CLOSEBRACE COLON BLOCKOPEN bExpr BLOCKCLOSE SEMICOLON;
eltChk: elt 'in' set;
elt: ID | OPENBRACE ids CLOSEBRACE;
set: ID |setOfIds| inlineInto | numRange;
numRange: DIGITS '..' size;
inlineInto: 'inlinedInto' OPENBRACE ID CLOSEBRACE;
setOfIds: 'setOf' BLOCKOPEN ids BLOCKCLOSE;
size:DIGITS | sizeOf;
sizeOf: 'sizeOf' OPENBRACE ID CLOSEBRACE;
bExpr: (bExp)+ SEMICOLON;
bExp: rExp bop rExp | rExp bop rExp | bop rExp | rExp;
bop:'&&' | '||' | 'not';

//Common Statements
simpAssign: ID ASSIGN expr SEMICOLON;

//CONSTANTS
MULDIV:'*'|'/';
ADDSUB:'+'|'-';
COMMA:',';
DIGITS : [0-9]+;
SQUAREBRACEOPEN:'[';
SQUAREBRACECLOSE:']';
BLOCKOPEN:'{';
BLOCKCLOSE:'}';
ID: [a-zA-Z0-9_]+;
ASSIGN:'=';
SEMICOLON:';';
OPENBRACE:'(';
CLOSEBRACE:')';
DOUBLEEQUAL:'==';
LESSTHAN:'<';
GREATERTHAN:'>';
NOTEQUAL:'!=';
LESSTHANEQUAL:'<=';
GREATERTHANEQUAL:'>=';
COLON:':';
WS:[ \t\n\r]+ -> skip;
COMMENTS: '//' ~[\r\n]* -> skip;