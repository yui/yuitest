// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g 2010-01-29 16:45:16

/*
 * YUI Test Coverage
 * Author: Nicholas C. Zakas <nzakas@yahoo-inc.com>
 * Copyright (c) 2009, Yahoo! Inc. All rights reserved.
 * Code licensed under the BSD License:
 *     http://developer.yahoo.net/yui/license.txt
 */
package com.yahoo.platform.yuitest.coverage;
import org.antlr.runtime.tree.Tree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class ES3YUITestParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "Identifier", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int VT=134;
    public static final int LOR=95;
    public static final int FUNCTION=17;
    public static final int PACKAGE=52;
    public static final int SHR=87;
    public static final int RegularExpressionChar=170;
    public static final int LT=72;
    public static final int WHILE=30;
    public static final int MOD=83;
    public static final int SHL=86;
    public static final int CONST=37;
    public static final int BackslashSequence=168;
    public static final int LS=142;
    public static final int CASE=8;
    public static final int CHAR=35;
    public static final int NEW=21;
    public static final int DQUOTE=131;
    public static final int DO=13;
    public static final int NOT=92;
    public static final int DecimalDigit=152;
    public static final int BYFIELD=114;
    public static final int EOF=-1;
    public static final int CEXPR=117;
    public static final int BREAK=7;
    public static final int Identifier=148;
    public static final int DIVASS=110;
    public static final int BYINDEX=115;
    public static final int FORSTEP=120;
    public static final int FINAL=43;
    public static final int RPAREN=66;
    public static final int INC=84;
    public static final int IMPORT=47;
    public static final int EOL=145;
    public static final int POS=129;
    public static final int OctalDigit=156;
    public static final int THIS=24;
    public static final int RETURN=22;
    public static final int ExponentPart=157;
    public static final int ARGS=111;
    public static final int DOUBLE=39;
    public static final int WhiteSpace=139;
    public static final int VAR=28;
    public static final int EXPORT=41;
    public static final int VOID=29;
    public static final int LABELLED=122;
    public static final int SUPER=58;
    public static final int GOTO=45;
    public static final int EQ=76;
    public static final int XORASS=108;
    public static final int ADDASS=99;
    public static final int ARRAY=112;
    public static final int SHU=88;
    public static final int RBRACK=68;
    public static final int RBRACE=64;
    public static final int PRIVATE=53;
    public static final int STATIC=57;
    public static final int INV=93;
    public static final int SWITCH=23;
    public static final int NULL=4;
    public static final int ELSE=14;
    public static final int NATIVE=51;
    public static final int THROWS=60;
    public static final int INT=48;
    public static final int DELETE=12;
    public static final int MUL=82;
    public static final int IdentifierStartASCII=151;
    public static final int TRY=26;
    public static final int FF=135;
    public static final int SHLASS=103;
    public static final int OctalEscapeSequence=164;
    public static final int USP=138;
    public static final int RegularExpressionFirstChar=169;
    public static final int ANDASS=106;
    public static final int TYPEOF=27;
    public static final int IdentifierNameASCIIStart=154;
    public static final int QUE=96;
    public static final int OR=90;
    public static final int DEBUGGER=38;
    public static final int GT=73;
    public static final int PDEC=127;
    public static final int CALL=116;
    public static final int CharacterEscapeSequence=162;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=167;
    public static final int LAND=94;
    public static final int MULASS=101;
    public static final int THROW=25;
    public static final int PINC=128;
    public static final int OctalIntegerLiteral=160;
    public static final int PROTECTED=54;
    public static final int DEC=85;
    public static final int CLASS=36;
    public static final int LBRACK=67;
    public static final int HexEscapeSequence=165;
    public static final int ORASS=107;
    public static final int SingleLineComment=147;
    public static final int NAMEDVALUE=123;
    public static final int LBRACE=63;
    public static final int GTE=75;
    public static final int FOR=16;
    public static final int RegularExpressionLiteral=155;
    public static final int SUB=81;
    public static final int FLOAT=44;
    public static final int ABSTRACT=32;
    public static final int AND=89;
    public static final int DecimalIntegerLiteral=158;
    public static final int HexDigit=150;
    public static final int LTE=74;
    public static final int LPAREN=65;
    public static final int IF=18;
    public static final int SUBASS=100;
    public static final int EXPR=118;
    public static final int BOOLEAN=33;
    public static final int SYNCHRONIZED=59;
    public static final int IN=19;
    public static final int IMPLEMENTS=46;
    public static final int OBJECT=125;
    public static final int CONTINUE=10;
    public static final int COMMA=71;
    public static final int FORITER=119;
    public static final int TRANSIENT=61;
    public static final int SHRASS=104;
    public static final int MODASS=102;
    public static final int PS=143;
    public static final int DOT=69;
    public static final int IdentifierPart=153;
    public static final int MultiLineComment=146;
    public static final int WITH=31;
    public static final int ADD=80;
    public static final int BYTE=34;
    public static final int XOR=91;
    public static final int ZeroToThree=163;
    public static final int ITEM=121;
    public static final int VOLATILE=62;
    public static final int UnicodeEscapeSequence=166;
    public static final int SHUASS=105;
    public static final int DEFAULT=11;
    public static final int NSAME=79;
    public static final int TAB=133;
    public static final int SHORT=56;
    public static final int INSTANCEOF=20;
    public static final int SQUOTE=132;
    public static final int DecimalLiteral=159;
    public static final int TRUE=5;
    public static final int SAME=78;
    public static final int StringLiteral=149;
    public static final int COLON=97;
    public static final int PAREXPR=126;
    public static final int NEQ=77;
    public static final int ENUM=40;
    public static final int FINALLY=15;
    public static final int HexIntegerLiteral=161;
    public static final int NBSP=137;
    public static final int SP=136;
    public static final int BLOCK=113;
    public static final int LineTerminator=144;
    public static final int NEG=124;
    public static final int ASSIGN=98;
    public static final int INTERFACE=49;
    public static final int DIV=109;
    public static final int SEMIC=70;
    public static final int CR=141;
    public static final int LONG=50;
    public static final int EXTENDS=42;
    public static final int PUBLIC=55;
    public static final int BSLASH=130;
    public static final int LF=140;

    // delegates
    // delegators


        public ES3YUITestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ES3YUITestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ES3YUITestParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return ES3YUITestParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g"; }



    private boolean verbose = false;

    public void setVerbose(boolean newVerbose){
        verbose = newVerbose;
    }

    private final String escapeQuotes(String text){
        return text.replace("\"", "\\\"");
    }

    private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result;
    	if (isLeftHandSideExpression(lhs))
    	{
    		switch (input.LA(1))
    		{
    			case ASSIGN:
    			case MULASS:
    			case DIVASS:
    			case MODASS:
    			case ADDASS:
    			case SUBASS:
    			case SHLASS:
    			case SHRASS:
    			case SHUASS:
    			case ANDASS:
    			case XORASS:
    			case ORASS:
    				result = true;
    				break;
    			default:
    				result = false;
    				break;
    		}
    	}
    	else
    	{
    		result = false;
    	}
    	
    	cached[0] = new Boolean(result);
    	return result;
    }

    @SuppressWarnings("unused")

    private final String wrapInBraces(Token start, Token stop, TokenStream tokens) {
      if (start == null || stop == null) {    
        return null;
      }
      if ("{".equals(start.getText())) {
        return tokens.toString(start, stop);
      }
      
      if (verbose){
        System.err.println("\n[INFO] Adding braces around statement at line " + start.getLine());
      }
      return "{" + tokens.toString(start, stop) + "}";
    }

    private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
    {
    	if (lhs.getTree() == null) // e.g. during backtracking
    	{
    		return true;
    	}
    	else
    	{
    		switch (((Tree)lhs.getTree()).getType())
    		{
    		// primaryExpression
    			case THIS:
    			case Identifier:
    			case NULL:
    			case TRUE:
    			case FALSE:
    			case DecimalLiteral:
    			case OctalIntegerLiteral:
    			case HexIntegerLiteral:
    			case StringLiteral:
    			case RegularExpressionLiteral:
    			case ARRAY:
    			case OBJECT:
    			case PAREXPR:
    		// functionExpression
    			case FUNCTION:
    		// newExpression
    			case NEW:
    		// leftHandSideExpression
    			case CALL:
    			case BYFIELD:
    			case BYINDEX:
    				return true;
    			
    			default:
    				return false;
    		}
    	}
    }
    	
    private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final void promoteEOL(ParserRuleReturnScope rule)
    {
    	// Get current token and its type (the possibly offending token).
    	Token lt = input.LT(1);
    	int la = lt.getType();
    	
    	// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
    	// EOL and MultiLineComment are not offending as they're already promoted in a previous call to this method.
    	// Promoting an EOL means switching it from off channel to on channel.
    	// A MultiLineComment gets promoted when it contains an EOL.
    	if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment))
    	{
    		// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
    		for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
    		{
    			lt = input.get(ix);
    			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
    			{
    				// On channel token found: stop scanning.
    				break;
    			}
    			else if (lt.getType() == EOL || (lt.getType() == MultiLineComment && lt.getText().matches("/.*\r\n|\r|\n")))
    			{
    				// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
    				lt.setChannel(Token.DEFAULT_CHANNEL);
    				input.seek(lt.getTokenIndex());
    				if (rule != null)
    				{
    					rule.start = lt;
    				}
    				break;
    			}
    		}
    	}
    }	


    public static class token_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "token"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:562:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral );
    public final ES3YUITestParser.token_return token() throws RecognitionException {
        ES3YUITestParser.token_return retval = new ES3YUITestParser.token_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:563:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral )
            int alt1=5;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt1=1;
                }
                break;
            case Identifier:
                {
                alt1=2;
                }
                break;
            case LBRACE:
            case RBRACE:
            case LPAREN:
            case RPAREN:
            case LBRACK:
            case RBRACK:
            case DOT:
            case SEMIC:
            case COMMA:
            case LT:
            case GT:
            case LTE:
            case GTE:
            case EQ:
            case NEQ:
            case SAME:
            case NSAME:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case INC:
            case DEC:
            case SHL:
            case SHR:
            case SHU:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case INV:
            case LAND:
            case LOR:
            case QUE:
            case COLON:
            case ASSIGN:
            case ADDASS:
            case SUBASS:
            case MULASS:
            case MODASS:
            case SHLASS:
            case SHRASS:
            case SHUASS:
            case ANDASS:
            case ORASS:
            case XORASS:
            case DIV:
            case DIVASS:
                {
                alt1=3;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=4;
                }
                break;
            case StringLiteral:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:563:4: reservedWord
                    {
                    pushFollow(FOLLOW_reservedWord_in_token1762);
                    reservedWord();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:564:4: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_token1767); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:565:4: punctuator
                    {
                    pushFollow(FOLLOW_punctuator_in_token1772);
                    punctuator();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:566:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_token1777);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:567:4: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_token1782); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token"

    public static class reservedWord_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reservedWord"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:572:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final ES3YUITestParser.reservedWord_return reservedWord() throws RecognitionException {
        ES3YUITestParser.reservedWord_return retval = new ES3YUITestParser.reservedWord_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:573:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt2=2;
                }
                break;
            case NULL:
                {
                alt2=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:573:4: keyword
                    {
                    pushFollow(FOLLOW_keyword_in_reservedWord1795);
                    keyword();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:574:4: futureReservedWord
                    {
                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1800);
                    futureReservedWord();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:575:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_reservedWord1805); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:576:4: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord1810);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reservedWord"

    public static class keyword_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "keyword"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:583:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH );
    public final ES3YUITestParser.keyword_return keyword() throws RecognitionException {
        ES3YUITestParser.keyword_return retval = new ES3YUITestParser.keyword_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:584:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
            {
            if ( (input.LA(1)>=BREAK && input.LA(1)<=WITH) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class futureReservedWord_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "futureReservedWord"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:615:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final ES3YUITestParser.futureReservedWord_return futureReservedWord() throws RecognitionException {
        ES3YUITestParser.futureReservedWord_return retval = new ES3YUITestParser.futureReservedWord_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:616:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
            {
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "futureReservedWord"

    public static class punctuator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "punctuator"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:693:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS );
    public final ES3YUITestParser.punctuator_return punctuator() throws RecognitionException {
        ES3YUITestParser.punctuator_return retval = new ES3YUITestParser.punctuator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:694:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
            {
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "punctuator"

    public static class literal_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:748:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
    public final ES3YUITestParser.literal_return literal() throws RecognitionException {
        ES3YUITestParser.literal_return retval = new ES3YUITestParser.literal_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:749:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
            int alt3=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt3=3;
                }
                break;
            case StringLiteral:
                {
                alt3=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:749:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_literal2491); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:750:4: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal2496);
                    booleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:751:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal2501);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:752:4: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2506); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:753:4: RegularExpressionLiteral
                    {
                    match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2511); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "booleanLiteral"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:756:1: booleanLiteral : ( TRUE | FALSE );
    public final ES3YUITestParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        ES3YUITestParser.booleanLiteral_return retval = new ES3YUITestParser.booleanLiteral_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:757:2: ( TRUE | FALSE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
            {
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "numericLiteral"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:803:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final ES3YUITestParser.numericLiteral_return numericLiteral() throws RecognitionException {
        ES3YUITestParser.numericLiteral_return retval = new ES3YUITestParser.numericLiteral_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:804:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
            {
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:891:1: primaryExpression : ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN );
    public final ES3YUITestParser.primaryExpression_return primaryExpression() throws RecognitionException {
        ES3YUITestParser.primaryExpression_return retval = new ES3YUITestParser.primaryExpression_return();
        retval.start = input.LT(1);

        Token lpar=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:892:2: ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN )
            int alt4=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
            case Identifier:
                {
                alt4=2;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=3;
                }
                break;
            case LBRACK:
                {
                alt4=4;
                }
                break;
            case LBRACE:
                {
                alt4=5;
                }
                break;
            case LPAREN:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:892:4: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3124); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:893:4: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3129); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:894:4: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3134);
                    literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:895:4: arrayLiteral
                    {
                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3139);
                    arrayLiteral();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:896:4: objectLiteral
                    {
                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3144);
                    objectLiteral();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:897:4: lpar= LPAREN expression RPAREN
                    {
                    lpar=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3151); 
                    pushFollow(FOLLOW_expression_in_primaryExpression3153);
                    expression();

                    state._fsp--;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3155); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayLiteral"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:900:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK ;
    public final ES3YUITestParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        ES3YUITestParser.arrayLiteral_return retval = new ES3YUITestParser.arrayLiteral_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:901:2: (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:901:4: lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
            {
            lb=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3169); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:901:14: ( arrayItem ( COMMA arrayItem )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==DELETE||LA6_0==FUNCTION||LA6_0==NEW||LA6_0==THIS||LA6_0==TYPEOF||LA6_0==VOID||LA6_0==LBRACE||LA6_0==LPAREN||LA6_0==LBRACK||LA6_0==COMMA||(LA6_0>=ADD && LA6_0<=SUB)||(LA6_0>=INC && LA6_0<=DEC)||(LA6_0>=NOT && LA6_0<=INV)||(LA6_0>=Identifier && LA6_0<=StringLiteral)||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RBRACK) ) {
                int LA6_2 = input.LA(2);

                if ( (( input.LA(1) == COMMA )) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:901:16: arrayItem ( COMMA arrayItem )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3173);
                    arrayItem();

                    state._fsp--;

                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:901:26: ( COMMA arrayItem )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:901:28: COMMA arrayItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3177); 
                    	    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3179);
                    	    arrayItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3187); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"

    public static class arrayItem_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayItem"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:905:1: arrayItem : (expr= assignmentExpression | {...}?) ;
    public final ES3YUITestParser.arrayItem_return arrayItem() throws RecognitionException {
        ES3YUITestParser.arrayItem_return retval = new ES3YUITestParser.arrayItem_return();
        retval.start = input.LT(1);

        ES3YUITestParser.assignmentExpression_return expr = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:906:2: ( (expr= assignmentExpression | {...}?) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:906:4: (expr= assignmentExpression | {...}?)
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:906:4: (expr= assignmentExpression | {...}?)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=Identifier && LA7_0<=StringLiteral)||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK||LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:906:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3204);
                    expr=assignmentExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:906:34: {...}?
                    {
                    if ( !(( input.LA(1) == COMMA )) ) {
                        throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayItem"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "objectLiteral"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:910:1: objectLiteral : lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE ;
    public final ES3YUITestParser.objectLiteral_return objectLiteral() throws RecognitionException {
        ES3YUITestParser.objectLiteral_return retval = new ES3YUITestParser.objectLiteral_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:911:2: (lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:911:4: lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3225); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:911:14: ( nameValuePair ( COMMA nameValuePair )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Identifier && LA9_0<=StringLiteral)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:911:16: nameValuePair ( COMMA nameValuePair )*
                    {
                    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3229);
                    nameValuePair();

                    state._fsp--;

                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:911:30: ( COMMA nameValuePair )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:911:32: COMMA nameValuePair
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3233); 
                    	    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3235);
                    	    nameValuePair();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3243); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectLiteral"

    public static class nameValuePair_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "nameValuePair"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:919:1: nameValuePair : propertyName COLON assignmentExpression ;
    public final ES3YUITestParser.nameValuePair_return nameValuePair() throws RecognitionException {
        ES3YUITestParser.nameValuePair_return retval = new ES3YUITestParser.nameValuePair_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:920:2: ( propertyName COLON assignmentExpression )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:920:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3259);
            propertyName();

            state._fsp--;

            match(input,COLON,FOLLOW_COLON_in_nameValuePair3261); 
            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3263);
            assignmentExpression();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nameValuePair"

    public static class propertyName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "propertyName"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:924:1: propertyName : ( Identifier | StringLiteral | numericLiteral );
    public final ES3YUITestParser.propertyName_return propertyName() throws RecognitionException {
        ES3YUITestParser.propertyName_return retval = new ES3YUITestParser.propertyName_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:925:2: ( Identifier | StringLiteral | numericLiteral )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt10=1;
                }
                break;
            case StringLiteral:
                {
                alt10=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:925:4: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_propertyName3276); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:926:4: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3281); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:927:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_propertyName3286);
                    numericLiteral();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyName"

    public static class memberExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "memberExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:939:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final ES3YUITestParser.memberExpression_return memberExpression() throws RecognitionException {
        ES3YUITestParser.memberExpression_return retval = new ES3YUITestParser.memberExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:940:2: ( primaryExpression | functionExpression | newExpression )
            int alt11=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt11=1;
                }
                break;
            case FUNCTION:
                {
                alt11=2;
                }
                break;
            case NEW:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:940:4: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3304);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:941:4: functionExpression
                    {
                    pushFollow(FOLLOW_functionExpression_in_memberExpression3309);
                    functionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:942:4: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_memberExpression3314);
                    newExpression();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "memberExpression"

    public static class newExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "newExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:945:1: newExpression : NEW primaryExpression ;
    public final ES3YUITestParser.newExpression_return newExpression() throws RecognitionException {
        ES3YUITestParser.newExpression_return retval = new ES3YUITestParser.newExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:946:2: ( NEW primaryExpression )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:946:4: NEW primaryExpression
            {
            match(input,NEW,FOLLOW_NEW_in_newExpression3325); 
            pushFollow(FOLLOW_primaryExpression_in_newExpression3327);
            primaryExpression();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:950:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN ;
    public final ES3YUITestParser.arguments_return arguments() throws RecognitionException {
        ES3YUITestParser.arguments_return retval = new ES3YUITestParser.arguments_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3340); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=NULL && LA13_0<=FALSE)||LA13_0==DELETE||LA13_0==FUNCTION||LA13_0==NEW||LA13_0==THIS||LA13_0==TYPEOF||LA13_0==VOID||LA13_0==LBRACE||LA13_0==LPAREN||LA13_0==LBRACK||(LA13_0>=ADD && LA13_0<=SUB)||(LA13_0>=INC && LA13_0<=DEC)||(LA13_0>=NOT && LA13_0<=INV)||(LA13_0>=Identifier && LA13_0<=StringLiteral)||LA13_0==RegularExpressionLiteral||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3344);
                    assignmentExpression();

                    state._fsp--;

                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:34: ( COMMA assignmentExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:36: COMMA assignmentExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments3348); 
                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3350);
                    	    assignmentExpression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_arguments3358); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "leftHandSideExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:955:1: leftHandSideExpression : ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )* ;
    public final ES3YUITestParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        ES3YUITestParser.leftHandSideExpression_return retval = new ES3YUITestParser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:956:2: ( ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:957:2: ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )*
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:957:2: ( memberExpression )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:958:3: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3377);
            memberExpression();

            state._fsp--;


            }

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:960:2: ( arguments | LBRACK expression RBRACK | DOT Identifier )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt14=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt14=2;
                    }
                    break;
                case DOT:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:961:3: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3390);
            	    arguments();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:962:5: LBRACK expression RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3399); 
            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3401);
            	    expression();

            	    state._fsp--;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3403); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:963:5: DOT Identifier
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3410); 
            	    match(input,Identifier,FOLLOW_Identifier_in_leftHandSideExpression3412); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leftHandSideExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "postfixExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:977:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final ES3YUITestParser.postfixExpression_return postfixExpression() throws RecognitionException {
        ES3YUITestParser.postfixExpression_return retval = new ES3YUITestParser.postfixExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:978:2: ( leftHandSideExpression ( postfixOperator )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:978:4: leftHandSideExpression ( postfixOperator )?
            {
            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3435);
            leftHandSideExpression();

            state._fsp--;

             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:978:95: ( postfixOperator )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=INC && LA15_0<=DEC)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:978:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression3441);
                    postfixOperator();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class postfixOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "postfixOperator"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:981:1: postfixOperator : (op= INC | op= DEC );
    public final ES3YUITestParser.postfixOperator_return postfixOperator() throws RecognitionException {
        ES3YUITestParser.postfixOperator_return retval = new ES3YUITestParser.postfixOperator_return();
        retval.start = input.LT(1);

        Token op=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:982:2: (op= INC | op= DEC )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INC) ) {
                alt16=1;
            }
            else if ( (LA16_0==DEC) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:982:4: op= INC
                    {
                    op=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator3458); 
                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:983:4: op= DEC
                    {
                    op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator3467); 
                     op.setType(PDEC); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixOperator"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:990:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final ES3YUITestParser.unaryExpression_return unaryExpression() throws RecognitionException {
        ES3YUITestParser.unaryExpression_return retval = new ES3YUITestParser.unaryExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:991:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=NULL && LA17_0<=FALSE)||LA17_0==FUNCTION||LA17_0==NEW||LA17_0==THIS||LA17_0==LBRACE||LA17_0==LPAREN||LA17_0==LBRACK||(LA17_0>=Identifier && LA17_0<=StringLiteral)||LA17_0==RegularExpressionLiteral||(LA17_0>=DecimalLiteral && LA17_0<=HexIntegerLiteral)) ) {
                alt17=1;
            }
            else if ( (LA17_0==DELETE||LA17_0==TYPEOF||LA17_0==VOID||(LA17_0>=ADD && LA17_0<=SUB)||(LA17_0>=INC && LA17_0<=DEC)||(LA17_0>=NOT && LA17_0<=INV)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:991:4: postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3484);
                    postfixExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:992:4: unaryOperator unaryExpression
                    {
                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression3489);
                    unaryOperator();

                    state._fsp--;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3491);
                    unaryExpression();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "unaryOperator"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:995:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT );
    public final ES3YUITestParser.unaryOperator_return unaryOperator() throws RecognitionException {
        ES3YUITestParser.unaryOperator_return retval = new ES3YUITestParser.unaryOperator_return();
        retval.start = input.LT(1);

        Token op=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:996:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT )
            int alt18=9;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt18=1;
                }
                break;
            case VOID:
                {
                alt18=2;
                }
                break;
            case TYPEOF:
                {
                alt18=3;
                }
                break;
            case INC:
                {
                alt18=4;
                }
                break;
            case DEC:
                {
                alt18=5;
                }
                break;
            case ADD:
                {
                alt18=6;
                }
                break;
            case SUB:
                {
                alt18=7;
                }
                break;
            case INV:
                {
                alt18=8;
                }
                break;
            case NOT:
                {
                alt18=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:996:4: DELETE
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator3503); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:997:4: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator3508); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:998:4: TYPEOF
                    {
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator3513); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:999:4: INC
                    {
                    match(input,INC,FOLLOW_INC_in_unaryOperator3518); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:4: DEC
                    {
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator3523); 

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1001:4: op= ADD
                    {
                    op=(Token)match(input,ADD,FOLLOW_ADD_in_unaryOperator3530); 
                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1002:4: op= SUB
                    {
                    op=(Token)match(input,SUB,FOLLOW_SUB_in_unaryOperator3539); 
                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1003:4: INV
                    {
                    match(input,INV,FOLLOW_INV_in_unaryOperator3546); 

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1004:4: NOT
                    {
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator3551); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryOperator"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1011:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final ES3YUITestParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        ES3YUITestParser.multiplicativeExpression_return retval = new ES3YUITestParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1012:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1012:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3566);
            unaryExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1012:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MUL && LA19_0<=MOD)||LA19_0==DIV) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1012:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3584);
            	    unaryExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1019:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final ES3YUITestParser.additiveExpression_return additiveExpression() throws RecognitionException {
        ES3YUITestParser.additiveExpression_return retval = new ES3YUITestParser.additiveExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1020:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1020:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3602);
            multiplicativeExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1020:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=ADD && LA20_0<=SUB)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1020:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3616);
            	    multiplicativeExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "shiftExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1027:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final ES3YUITestParser.shiftExpression_return shiftExpression() throws RecognitionException {
        ES3YUITestParser.shiftExpression_return retval = new ES3YUITestParser.shiftExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1028:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1028:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression3635);
            additiveExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1028:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=SHL && LA21_0<=SHU)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1028:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression3653);
            	    additiveExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1035:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final ES3YUITestParser.relationalExpression_return relationalExpression() throws RecognitionException {
        ES3YUITestParser.relationalExpression_return retval = new ES3YUITestParser.relationalExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1036:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1036:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression3672);
            shiftExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1036:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=IN && LA22_0<=INSTANCEOF)||(LA22_0>=LT && LA22_0<=GTE)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1036:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression3702);
            	    shiftExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1039:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final ES3YUITestParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.relationalExpressionNoIn_return retval = new ES3YUITestParser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3716);
            shiftExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==INSTANCEOF||(LA23_0>=LT && LA23_0<=GTE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3742);
            	    shiftExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpressionNoIn"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1047:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final ES3YUITestParser.equalityExpression_return equalityExpression() throws RecognitionException {
        ES3YUITestParser.equalityExpression_return retval = new ES3YUITestParser.equalityExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1048:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1048:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3761);
            relationalExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1048:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=EQ && LA24_0<=NSAME)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1048:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3783);
            	    relationalExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1051:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final ES3YUITestParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.equalityExpressionNoIn_return retval = new ES3YUITestParser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1052:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1052:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3797);
            relationalExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1052:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=EQ && LA25_0<=NSAME)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1052:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3819);
            	    relationalExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpressionNoIn"

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseANDExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1059:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final ES3YUITestParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        ES3YUITestParser.bitwiseANDExpression_return retval = new ES3YUITestParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1060:2: ( equalityExpression ( AND equalityExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1060:4: equalityExpression ( AND equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3839);
            equalityExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1060:23: ( AND equalityExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1060:25: AND equalityExpression
            	    {
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression3843); 
            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3845);
            	    equalityExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpression"

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseANDExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1063:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final ES3YUITestParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.bitwiseANDExpressionNoIn_return retval = new ES3YUITestParser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1064:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1064:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3859);
            equalityExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1064:27: ( AND equalityExpressionNoIn )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AND) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1064:29: AND equalityExpressionNoIn
            	    {
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn3863); 
            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3865);
            	    equalityExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpressionNoIn"

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseXORExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1067:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final ES3YUITestParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        ES3YUITestParser.bitwiseXORExpression_return retval = new ES3YUITestParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1068:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1068:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3881);
            bitwiseANDExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1068:25: ( XOR bitwiseANDExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==XOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1068:27: XOR bitwiseANDExpression
            	    {
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression3885); 
            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3887);
            	    bitwiseANDExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpression"

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseXORExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1071:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final ES3YUITestParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.bitwiseXORExpressionNoIn_return retval = new ES3YUITestParser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1072:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1072:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3903);
            bitwiseANDExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1072:29: ( XOR bitwiseANDExpressionNoIn )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==XOR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1072:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn3907); 
            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3909);
            	    bitwiseANDExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpressionNoIn"

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseORExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1075:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final ES3YUITestParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        ES3YUITestParser.bitwiseORExpression_return retval = new ES3YUITestParser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1076:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1076:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3924);
            bitwiseXORExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1076:25: ( OR bitwiseXORExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1076:27: OR bitwiseXORExpression
            	    {
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression3928); 
            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3930);
            	    bitwiseXORExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpression"

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseORExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1079:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final ES3YUITestParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.bitwiseORExpressionNoIn_return retval = new ES3YUITestParser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1080:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1080:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3945);
            bitwiseXORExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1080:29: ( OR bitwiseXORExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==OR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1080:31: OR bitwiseXORExpressionNoIn
            	    {
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn3949); 
            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3951);
            	    bitwiseXORExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpressionNoIn"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1087:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final ES3YUITestParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        ES3YUITestParser.logicalANDExpression_return retval = new ES3YUITestParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1088:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1088:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression3970);
            bitwiseORExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1088:24: ( LAND bitwiseORExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LAND) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1088:26: LAND bitwiseORExpression
            	    {
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression3974); 
            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression3976);
            	    bitwiseORExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalANDExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1091:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final ES3YUITestParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.logicalANDExpressionNoIn_return retval = new ES3YUITestParser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1092:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1092:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn3990);
            bitwiseORExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1092:28: ( LAND bitwiseORExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==LAND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1092:30: LAND bitwiseORExpressionNoIn
            	    {
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn3994); 
            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn3996);
            	    bitwiseORExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpressionNoIn"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1095:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final ES3YUITestParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        ES3YUITestParser.logicalORExpression_return retval = new ES3YUITestParser.logicalORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1096:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1096:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4011);
            logicalANDExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1096:25: ( LOR logicalANDExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LOR) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1096:27: LOR logicalANDExpression
            	    {
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4015); 
            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4017);
            	    logicalANDExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1099:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final ES3YUITestParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.logicalORExpressionNoIn_return retval = new ES3YUITestParser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1100:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1100:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4032);
            logicalANDExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1100:29: ( LOR logicalANDExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1100:31: LOR logicalANDExpressionNoIn
            	    {
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4036); 
            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4038);
            	    logicalANDExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalORExpressionNoIn"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1107:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final ES3YUITestParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        ES3YUITestParser.conditionalExpression_return retval = new ES3YUITestParser.conditionalExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1108:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1108:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4057);
            logicalORExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1108:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==QUE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1108:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4061); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4063);
                    assignmentExpression();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4065); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4067);
                    assignmentExpression();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "conditionalExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1111:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final ES3YUITestParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.conditionalExpressionNoIn_return retval = new ES3YUITestParser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1112:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1112:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4081);
            logicalORExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1112:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==QUE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1112:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4085); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4087);
                    assignmentExpressionNoIn();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4089); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4091);
                    assignmentExpressionNoIn();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpressionNoIn"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1141:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final ES3YUITestParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        ES3YUITestParser.assignmentExpression_return retval = new ES3YUITestParser.assignmentExpression_return();
        retval.start = input.LT(1);

        ES3YUITestParser.conditionalExpression_return lhs = null;



        	Object[] isLhs = new Object[1];

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1146:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1146:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4119);
            lhs=conditionalExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1147:2: ({...}? assignmentOperator assignmentExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=ASSIGN && LA38_0<=XORASS)||LA38_0==DIVASS) ) {
                int LA38_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1147:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4126);
                    assignmentOperator();

                    state._fsp--;

                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4128);
                    assignmentExpression();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentOperator"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1150:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final ES3YUITestParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        ES3YUITestParser.assignmentOperator_return retval = new ES3YUITestParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1151:2: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:
            {
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignmentExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1154:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final ES3YUITestParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.assignmentExpressionNoIn_return retval = new ES3YUITestParser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        ES3YUITestParser.conditionalExpressionNoIn_return lhs = null;



        	Object[] isLhs = new Object[1];

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1159:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1159:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4205);
            lhs=conditionalExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1160:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=ASSIGN && LA39_0<=XORASS)||LA39_0==DIVASS) ) {
                int LA39_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1160:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4212);
                    assignmentOperator();

                    state._fsp--;

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4214);
                    assignmentExpressionNoIn();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpressionNoIn"

    public static class expression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1167:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* ;
    public final ES3YUITestParser.expression_return expression() throws RecognitionException {
        ES3YUITestParser.expression_return retval = new ES3YUITestParser.expression_return();
        retval.start = input.LT(1);

        List list_exprs=null;
        RuleReturnScope exprs = null;
        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1168:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1168:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4236);
            exprs=assignmentExpression();

            state._fsp--;

            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTemplate());

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1168:32: ( COMMA exprs+= assignmentExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1168:34: COMMA exprs+= assignmentExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression4240); 
            	    pushFollow(FOLLOW_assignmentExpression_in_expression4244);
            	    exprs=assignmentExpression();

            	    state._fsp--;

            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1173:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* ;
    public final ES3YUITestParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        ES3YUITestParser.expressionNoIn_return retval = new ES3YUITestParser.expressionNoIn_return();
        retval.start = input.LT(1);

        List list_exprs=null;
        RuleReturnScope exprs = null;
        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1174:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1174:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4264);
            exprs=assignmentExpressionNoIn();

            state._fsp--;

            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTemplate());

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1174:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1174:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4268); 
            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4272);
            	    exprs=assignmentExpressionNoIn();

            	    state._fsp--;

            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionNoIn"

    public static class semic_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "semic"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1201:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final ES3YUITestParser.semic_return semic() throws RecognitionException {
        ES3YUITestParser.semic_return retval = new ES3YUITestParser.semic_return();
        retval.start = input.LT(1);


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1209:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt42=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt42=1;
                }
                break;
            case EOF:
                {
                alt42=2;
                }
                break;
            case RBRACE:
                {
                alt42=3;
                }
                break;
            case EOL:
                {
                alt42=4;
                }
                break;
            case MultiLineComment:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1209:4: SEMIC
                    {
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic4306); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1210:4: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_semic4311); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:4: RBRACE
                    {
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic4316); 
                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1212:4: EOL
                    {
                    match(input,EOL,FOLLOW_EOL_in_semic4323); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1212:10: MultiLineComment
                    {
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic4327); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "semic"

    protected static class statement_scope {
        boolean isBlock;
    }
    protected Stack statement_stack = new Stack();

    public static class statement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1220:1: statement options {k=1; } : ({...}? block | statementTail ) -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text);
    public final ES3YUITestParser.statement_return statement() throws RecognitionException {
        statement_stack.push(new statement_scope());
        ES3YUITestParser.statement_return retval = new ES3YUITestParser.statement_return();
        retval.start = input.LT(1);


                boolean instrument = false;
               
        	if (((Token)retval.start).getLine() > ((program_scope)program_stack.peek()).stopLine) {
        	  ((program_scope)program_stack.peek()).stopLine = ((Token)retval.start).getLine();
        	  instrument = true;
        	}	

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1244:2: ( ({...}? block | statementTail ) -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1244:4: ({...}? block | statementTail )
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1244:4: ({...}? block | statementTail )
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1244:5: {...}? block
                    {
                    if ( !(( ((statement_scope)statement_stack.peek()).isBlock = input.LA(1) == LBRACE )) ) {
                        throw new FailedPredicateException(input, "statement", " $statement::isBlock = input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement4370);
                    block();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1244:62: statementTail
                    {
                    pushFollow(FOLLOW_statementTail_in_statement4374);
                    statementTail();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 1245:4: -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textline=$start.getLine())
            if (instrument && !((statement_scope)statement_stack.peek()).isBlock) {
                retval.st = templateLib.getInstanceOf("cover_line",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("line", ((Token)retval.start).getLine()));
            }
            else // 1246:4: -> ignore(code=$text)
            {
                retval.st = templateLib.getInstanceOf("ignore",
              new STAttrMap().put("code", input.toString(retval.start,input.LT(-1))));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);


                    if (instrument && !((statement_scope)statement_stack.peek()).isBlock) {
                       ((program_scope)program_stack.peek()).executableLines.add(((Token)retval.start).getLine());
                    }
            	if (verbose){
            		System.err.println("\n[INFO] Instrumenting statement on line " + ((Token)retval.start).getLine());
            	}

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            statement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementTail_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statementTail"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1249:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final ES3YUITestParser.statementTail_return statementTail() throws RecognitionException {
        ES3YUITestParser.statementTail_return retval = new ES3YUITestParser.statementTail_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1250:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt44=13;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1250:4: variableStatement
                    {
                    pushFollow(FOLLOW_variableStatement_in_statementTail4422);
                    variableStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1251:4: emptyStatement
                    {
                    pushFollow(FOLLOW_emptyStatement_in_statementTail4427);
                    emptyStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1252:4: expressionStatement
                    {
                    pushFollow(FOLLOW_expressionStatement_in_statementTail4432);
                    expressionStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1253:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statementTail4437);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1254:4: iterationStatement
                    {
                    pushFollow(FOLLOW_iterationStatement_in_statementTail4442);
                    iterationStatement();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1255:4: continueStatement
                    {
                    pushFollow(FOLLOW_continueStatement_in_statementTail4447);
                    continueStatement();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1256:4: breakStatement
                    {
                    pushFollow(FOLLOW_breakStatement_in_statementTail4452);
                    breakStatement();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1257:4: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statementTail4457);
                    returnStatement();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1258:4: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statementTail4462);
                    withStatement();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1259:4: labelledStatement
                    {
                    pushFollow(FOLLOW_labelledStatement_in_statementTail4467);
                    labelledStatement();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1260:4: switchStatement
                    {
                    pushFollow(FOLLOW_switchStatement_in_statementTail4472);
                    switchStatement();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1261:4: throwStatement
                    {
                    pushFollow(FOLLOW_throwStatement_in_statementTail4477);
                    throwStatement();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1262:4: tryStatement
                    {
                    pushFollow(FOLLOW_tryStatement_in_statementTail4482);
                    tryStatement();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementTail"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1267:1: block : lb= LBRACE ( statement )* RBRACE ;
    public final ES3YUITestParser.block_return block() throws RecognitionException {
        ES3YUITestParser.block_return retval = new ES3YUITestParser.block_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1268:2: (lb= LBRACE ( statement )* RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1268:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block4497); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1268:14: ( statement )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=NULL && LA45_0<=BREAK)||LA45_0==CONTINUE||(LA45_0>=DELETE && LA45_0<=DO)||(LA45_0>=FOR && LA45_0<=IF)||(LA45_0>=NEW && LA45_0<=WITH)||LA45_0==LBRACE||LA45_0==LPAREN||LA45_0==LBRACK||LA45_0==SEMIC||(LA45_0>=ADD && LA45_0<=SUB)||(LA45_0>=INC && LA45_0<=DEC)||(LA45_0>=NOT && LA45_0<=INV)||(LA45_0>=Identifier && LA45_0<=StringLiteral)||LA45_0==RegularExpressionLiteral||(LA45_0>=DecimalLiteral && LA45_0<=HexIntegerLiteral)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1268:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block4499);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_block4502); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class variableStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1276:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic ;
    public final ES3YUITestParser.variableStatement_return variableStatement() throws RecognitionException {
        ES3YUITestParser.variableStatement_return retval = new ES3YUITestParser.variableStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1277:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1277:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            match(input,VAR,FOLLOW_VAR_in_variableStatement4520); 
            pushFollow(FOLLOW_variableDeclaration_in_variableStatement4522);
            variableDeclaration();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1277:28: ( COMMA variableDeclaration )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1277:30: COMMA variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement4526); 
            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement4528);
            	    variableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement4533);
            semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableStatement"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1281:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
    public final ES3YUITestParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        ES3YUITestParser.variableDeclaration_return retval = new ES3YUITestParser.variableDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1282:2: ( Identifier ( ASSIGN assignmentExpression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1282:4: Identifier ( ASSIGN assignmentExpression )?
            {
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration4546); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1282:15: ( ASSIGN assignmentExpression )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ASSIGN) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1282:17: ASSIGN assignmentExpression
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration4550); 
                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration4552);
                    assignmentExpression();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarationNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1285:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final ES3YUITestParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        ES3YUITestParser.variableDeclarationNoIn_return retval = new ES3YUITestParser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1286:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1286:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn4567); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1286:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ASSIGN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1286:17: ASSIGN assignmentExpressionNoIn
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn4571); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4573);
                    assignmentExpressionNoIn();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarationNoIn"

    public static class emptyStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "emptyStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1293:1: emptyStatement : SEMIC ;
    public final ES3YUITestParser.emptyStatement_return emptyStatement() throws RecognitionException {
        ES3YUITestParser.emptyStatement_return retval = new ES3YUITestParser.emptyStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1294:2: ( SEMIC )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1294:4: SEMIC
            {
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement4592); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "emptyStatement"

    public static class expressionStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1307:1: expressionStatement : expression semic ;
    public final ES3YUITestParser.expressionStatement_return expressionStatement() throws RecognitionException {
        ES3YUITestParser.expressionStatement_return retval = new ES3YUITestParser.expressionStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1308:2: ( expression semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1308:4: expression semic
            {
            pushFollow(FOLLOW_expression_in_expressionStatement4610);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_semic_in_expressionStatement4612);
            semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1316:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? elseStatement )? -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\";
    public final ES3YUITestParser.ifStatement_return ifStatement() throws RecognitionException {
        ES3YUITestParser.ifStatement_return retval = new ES3YUITestParser.ifStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement1 = null;

        ES3YUITestParser.elseStatement_return elseStatement2 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1318:2: ( IF LPAREN expression RPAREN statement ({...}? elseStatement )? -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1318:4: IF LPAREN expression RPAREN statement ({...}? elseStatement )?
            {
            match(input,IF,FOLLOW_IF_in_ifStatement4630); 
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement4632); 
            pushFollow(FOLLOW_expression_in_ifStatement4634);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement4636); 
            pushFollow(FOLLOW_statement_in_ifStatement4638);
            statement1=statement();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1318:42: ({...}? elseStatement )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ELSE) ) {
                int LA49_1 = input.LA(2);

                if ( (( input.LA(1) == ELSE )) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1318:44: {...}? elseStatement
                    {
                    if ( !(( input.LA(1) == ELSE )) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    pushFollow(FOLLOW_elseStatement_in_ifStatement4644);
                    elseStatement2=elseStatement();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 1320:2: -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\"
            {
                retval.st = new StringTemplate(templateLib, "<p><body><elseClause>",
              new STAttrMap().put("p", input.toString(((Token)retval.start).getTokenIndex(), (statement1!=null?((Token)statement1.start):null).getTokenIndex() - 1)).put("body", wrapInBraces((statement1!=null?((Token)statement1.start):null), (statement1!=null?((Token)statement1.stop):null), input)).put("elseClause", 
            	             (elseStatement2!=null?((Token)elseStatement2.stop):null) != null ? input.toString((statement1!=null?((Token)statement1.stop):null).getTokenIndex()+1, (elseStatement2!=null?((Token)elseStatement2.stop):null).getTokenIndex() ) : null));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class elseStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elseStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1326:1: elseStatement : ELSE statement -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\";
    public final ES3YUITestParser.elseStatement_return elseStatement() throws RecognitionException {
        ES3YUITestParser.elseStatement_return retval = new ES3YUITestParser.elseStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement3 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1327:2: ( ELSE statement -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1327:4: ELSE statement
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStatement4716); 
            pushFollow(FOLLOW_statement_in_elseStatement4718);
            statement3=statement();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1328:2: -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\"
            {
                retval.st = new StringTemplate(templateLib, "<prefix><stmt>",
              new STAttrMap().put("prefix", input.toString(((Token)retval.start).getTokenIndex(), (statement3!=null?((Token)statement3.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement3!=null?((Token)statement3.start):null), (statement3!=null?((Token)statement3.stop):null), input)));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class iterationStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "iterationStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1335:1: iterationStatement : ( doStatement | whileStatement | forStatement );
    public final ES3YUITestParser.iterationStatement_return iterationStatement() throws RecognitionException {
        ES3YUITestParser.iterationStatement_return retval = new ES3YUITestParser.iterationStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1336:2: ( doStatement | whileStatement | forStatement )
            int alt50=3;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt50=1;
                }
                break;
            case WHILE:
                {
                alt50=2;
                }
                break;
            case FOR:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1336:4: doStatement
                    {
                    pushFollow(FOLLOW_doStatement_in_iterationStatement4755);
                    doStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1337:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_iterationStatement4760);
                    whileStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1338:4: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_iterationStatement4765);
                    forStatement();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iterationStatement"

    public static class doStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "doStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1341:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\";
    public final ES3YUITestParser.doStatement_return doStatement() throws RecognitionException {
        ES3YUITestParser.doStatement_return retval = new ES3YUITestParser.doStatement_return();
        retval.start = input.LT(1);

        Token WHILE5=null;
        Token RPAREN6=null;
        ES3YUITestParser.statement_return statement4 = null;

        ES3YUITestParser.semic_return semic7 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1342:2: ( DO statement WHILE LPAREN expression RPAREN semic -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1342:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            match(input,DO,FOLLOW_DO_in_doStatement4777); 
            pushFollow(FOLLOW_statement_in_doStatement4779);
            statement4=statement();

            state._fsp--;

            WHILE5=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStatement4781); 
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement4783); 
            pushFollow(FOLLOW_expression_in_doStatement4785);
            expression();

            state._fsp--;

            RPAREN6=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStatement4787); 
            pushFollow(FOLLOW_semic_in_doStatement4789);
            semic7=semic();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1343:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\"
            {
                retval.st = new StringTemplate(templateLib, "<pre><stmt><post><end>",
              new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement4!=null?((Token)statement4.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement4!=null?((Token)statement4.start):null), (statement4!=null?((Token)statement4.stop):null), input)).put("post", input.toString(WHILE5, RPAREN6)).put("end", (semic7!=null?input.toString(semic7.start,semic7.stop):null)));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "whileStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1349:1: whileStatement : WHILE LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
    public final ES3YUITestParser.whileStatement_return whileStatement() throws RecognitionException {
        ES3YUITestParser.whileStatement_return retval = new ES3YUITestParser.whileStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement8 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1350:2: ( WHILE LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1350:4: WHILE LPAREN expression RPAREN statement
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement4875); 
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement4877); 
            pushFollow(FOLLOW_expression_in_whileStatement4879);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement4881); 
            pushFollow(FOLLOW_statement_in_whileStatement4883);
            statement8=statement();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1351:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
            {
                retval.st = new StringTemplate(templateLib, "<pre><stmt>",
              new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement8!=null?((Token)statement8.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement8!=null?((Token)statement8.start):null), (statement8!=null?((Token)statement8.stop):null), input)));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1397:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final ES3YUITestParser.forStatement_return forStatement() throws RecognitionException {
        ES3YUITestParser.forStatement_return retval = new ES3YUITestParser.forStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1398:2: ( FOR LPAREN forControl RPAREN statement )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1398:4: FOR LPAREN forControl RPAREN statement
            {
            match(input,FOR,FOLLOW_FOR_in_forStatement4944); 
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement4946); 
            pushFollow(FOLLOW_forControl_in_forStatement4948);
            forControl();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement4950); 
            pushFollow(FOLLOW_statement_in_forStatement4952);
            statement();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class forControl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControl"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1404:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final ES3YUITestParser.forControl_return forControl() throws RecognitionException {
        ES3YUITestParser.forControl_return retval = new ES3YUITestParser.forControl_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1405:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt51=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt51=1;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt51=2;
                }
                break;
            case SEMIC:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1405:4: forControlVar
                    {
                    pushFollow(FOLLOW_forControlVar_in_forControl4969);
                    forControlVar();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1406:4: forControlExpression
                    {
                    pushFollow(FOLLOW_forControlExpression_in_forControl4974);
                    forControlExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1407:4: forControlSemic
                    {
                    pushFollow(FOLLOW_forControlSemic_in_forControl4979);
                    forControlSemic();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControl"

    public static class forControlVar_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControlVar"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1410:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) ) ;
    public final ES3YUITestParser.forControlVar_return forControlVar() throws RecognitionException {
        ES3YUITestParser.forControlVar_return retval = new ES3YUITestParser.forControlVar_return();
        retval.start = input.LT(1);

        ES3YUITestParser.expression_return ex1 = null;

        ES3YUITestParser.expression_return ex2 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1411:2: ( VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) ) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1411:4: VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) )
            {
            match(input,VAR,FOLLOW_VAR_in_forControlVar4990); 
            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar4992);
            variableDeclarationNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1412:2: ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IN) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=SEMIC && LA55_0<=COMMA)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1413:3: ( IN expression )
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1413:3: ( IN expression )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1414:4: IN expression
                    {
                    match(input,IN,FOLLOW_IN_in_forControlVar5004); 
                    pushFollow(FOLLOW_expression_in_forControlVar5006);
                    expression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1418:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1418:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:4: ( COMMA variableDeclarationNoIn )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==COMMA) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:6: COMMA variableDeclarationNoIn
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5029); 
                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5031);
                    	    variableDeclarationNoIn();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5036); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:48: (ex1= expression )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( ((LA53_0>=NULL && LA53_0<=FALSE)||LA53_0==DELETE||LA53_0==FUNCTION||LA53_0==NEW||LA53_0==THIS||LA53_0==TYPEOF||LA53_0==VOID||LA53_0==LBRACE||LA53_0==LPAREN||LA53_0==LBRACK||(LA53_0>=ADD && LA53_0<=SUB)||(LA53_0>=INC && LA53_0<=DEC)||(LA53_0>=NOT && LA53_0<=INV)||(LA53_0>=Identifier && LA53_0<=StringLiteral)||LA53_0==RegularExpressionLiteral||(LA53_0>=DecimalLiteral && LA53_0<=HexIntegerLiteral)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5040);
                            ex1=expression();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5043); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:70: (ex2= expression )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==THIS||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)||(LA54_0>=Identifier && LA54_0<=StringLiteral)||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5047);
                            ex2=expression();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlVar"

    public static class forControlExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControlExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1425:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) ) ;
    public final ES3YUITestParser.forControlExpression_return forControlExpression() throws RecognitionException {
        ES3YUITestParser.forControlExpression_return retval = new ES3YUITestParser.forControlExpression_return();
        retval.start = input.LT(1);

        ES3YUITestParser.expressionNoIn_return ex1 = null;

        ES3YUITestParser.expression_return ex2 = null;

        ES3YUITestParser.expression_return ex3 = null;



        	Object[] isLhs = new Object[1];

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1430:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) ) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1430:4: ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5077);
            ex1=expressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1431:2: ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==IN) ) {
                alt58=1;
            }
            else if ( (LA58_0==SEMIC) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1432:3: {...}? ( IN ex2= expression )
                    {
                    if ( !(( isLeftHandSideIn(ex1, isLhs) )) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1432:37: ( IN ex2= expression )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1433:4: IN ex2= expression
                    {
                    match(input,IN,FOLLOW_IN_in_forControlExpression5092); 
                    pushFollow(FOLLOW_expression_in_forControlExpression5096);
                    ex2=expression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1437:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? )
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1437:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5117); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:13: (ex2= expression )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=NULL && LA56_0<=FALSE)||LA56_0==DELETE||LA56_0==FUNCTION||LA56_0==NEW||LA56_0==THIS||LA56_0==TYPEOF||LA56_0==VOID||LA56_0==LBRACE||LA56_0==LPAREN||LA56_0==LBRACK||(LA56_0>=ADD && LA56_0<=SUB)||(LA56_0>=INC && LA56_0<=DEC)||(LA56_0>=NOT && LA56_0<=INV)||(LA56_0>=Identifier && LA56_0<=StringLiteral)||LA56_0==RegularExpressionLiteral||(LA56_0>=DecimalLiteral && LA56_0<=HexIntegerLiteral)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5121);
                            ex2=expression();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5124); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:35: (ex3= expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=NULL && LA57_0<=FALSE)||LA57_0==DELETE||LA57_0==FUNCTION||LA57_0==NEW||LA57_0==THIS||LA57_0==TYPEOF||LA57_0==VOID||LA57_0==LBRACE||LA57_0==LPAREN||LA57_0==LBRACK||(LA57_0>=ADD && LA57_0<=SUB)||(LA57_0>=INC && LA57_0<=DEC)||(LA57_0>=NOT && LA57_0<=INV)||(LA57_0>=Identifier && LA57_0<=StringLiteral)||LA57_0==RegularExpressionLiteral||(LA57_0>=DecimalLiteral && LA57_0<=HexIntegerLiteral)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5128);
                            ex3=expression();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlExpression"

    public static class forControlSemic_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forControlSemic"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1444:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? ;
    public final ES3YUITestParser.forControlSemic_return forControlSemic() throws RecognitionException {
        ES3YUITestParser.forControlSemic_return retval = new ES3YUITestParser.forControlSemic_return();
        retval.start = input.LT(1);

        ES3YUITestParser.expression_return ex1 = null;

        ES3YUITestParser.expression_return ex2 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5151); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:13: (ex1= expression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=NULL && LA59_0<=FALSE)||LA59_0==DELETE||LA59_0==FUNCTION||LA59_0==NEW||LA59_0==THIS||LA59_0==TYPEOF||LA59_0==VOID||LA59_0==LBRACE||LA59_0==LPAREN||LA59_0==LBRACK||(LA59_0>=ADD && LA59_0<=SUB)||(LA59_0>=INC && LA59_0<=DEC)||(LA59_0>=NOT && LA59_0<=INV)||(LA59_0>=Identifier && LA59_0<=StringLiteral)||LA59_0==RegularExpressionLiteral||(LA59_0>=DecimalLiteral && LA59_0<=HexIntegerLiteral)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5155);
                    ex1=expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5158); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:35: (ex2= expression )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=Identifier && LA60_0<=StringLiteral)||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5162);
                    ex2=expression();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlSemic"

    public static class continueStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "continueStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1458:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final ES3YUITestParser.continueStatement_return continueStatement() throws RecognitionException {
        ES3YUITestParser.continueStatement_return retval = new ES3YUITestParser.continueStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1459:2: ( CONTINUE ( Identifier )? semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1459:4: CONTINUE ( Identifier )? semic
            {
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5183); 
             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1459:66: ( Identifier )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Identifier) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1459:66: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement5187); 

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement5190);
            semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "continueStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "breakStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1471:1: breakStatement : BREAK ( Identifier )? semic ;
    public final ES3YUITestParser.breakStatement_return breakStatement() throws RecognitionException {
        ES3YUITestParser.breakStatement_return retval = new ES3YUITestParser.breakStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1472:2: ( BREAK ( Identifier )? semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1472:4: BREAK ( Identifier )? semic
            {
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement5208); 
             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1472:63: ( Identifier )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Identifier) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1472:63: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement5212); 

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement5215);
            semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "breakStatement"

    public static class returnStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "returnStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1492:1: returnStatement : RETURN ( expression )? semic ;
    public final ES3YUITestParser.returnStatement_return returnStatement() throws RecognitionException {
        ES3YUITestParser.returnStatement_return retval = new ES3YUITestParser.returnStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1493:2: ( RETURN ( expression )? semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1493:4: RETURN ( expression )? semic
            {
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement5233); 
             promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1493:33: ( expression )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||(LA63_0>=Identifier && LA63_0<=StringLiteral)||LA63_0==RegularExpressionLiteral||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1493:33: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement5237);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement5240);
            semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "withStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1500:1: withStatement : WITH LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
    public final ES3YUITestParser.withStatement_return withStatement() throws RecognitionException {
        ES3YUITestParser.withStatement_return retval = new ES3YUITestParser.withStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement9 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1501:2: ( WITH LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1501:4: WITH LPAREN expression RPAREN statement
            {
            match(input,WITH,FOLLOW_WITH_in_withStatement5256); 
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5258); 
            pushFollow(FOLLOW_expression_in_withStatement5260);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5262); 
            pushFollow(FOLLOW_statement_in_withStatement5264);
            statement9=statement();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1502:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
            {
                retval.st = new StringTemplate(templateLib, "<pre><stmt>",
              new STAttrMap().put("pre", input.toString(((Token)retval.start).getTokenIndex(), (statement9!=null?((Token)statement9.start):null).getTokenIndex() - 1)).put("stmt", wrapInBraces((statement9!=null?((Token)statement9.start):null), (statement9!=null?((Token)statement9.stop):null), input)));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "withStatement"

    public static class switchStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1511:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE ;
    public final ES3YUITestParser.switchStatement_return switchStatement() throws RecognitionException {
        ES3YUITestParser.switchStatement_return retval = new ES3YUITestParser.switchStatement_return();
        retval.start = input.LT(1);


        	int defaultClauseCount = 0;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1516:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1516:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement5333); 
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement5335); 
            pushFollow(FOLLOW_expression_in_switchStatement5337);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement5339); 
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement5341); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1516:43: ({...}? => defaultClause | caseClause )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==DEFAULT) && (( defaultClauseCount == 0 ))) {
                    alt64=1;
                }
                else if ( (LA64_0==CASE) ) {
                    alt64=2;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1516:45: {...}? => defaultClause
            	    {
            	    if ( !(( defaultClauseCount == 0 )) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement5348);
            	    defaultClause();

            	    state._fsp--;

            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1516:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement5354);
            	    caseClause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement5359); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "switchStatement"

    public static class caseClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "caseClause"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1520:1: caseClause : CASE expression COLON ( statement )* ;
    public final ES3YUITestParser.caseClause_return caseClause() throws RecognitionException {
        ES3YUITestParser.caseClause_return retval = new ES3YUITestParser.caseClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1521:2: ( CASE expression COLON ( statement )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1521:4: CASE expression COLON ( statement )*
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause5372); 
            pushFollow(FOLLOW_expression_in_caseClause5374);
            expression();

            state._fsp--;

            match(input,COLON,FOLLOW_COLON_in_caseClause5376); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1521:26: ( statement )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=NULL && LA65_0<=BREAK)||LA65_0==CONTINUE||(LA65_0>=DELETE && LA65_0<=DO)||(LA65_0>=FOR && LA65_0<=IF)||(LA65_0>=NEW && LA65_0<=WITH)||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||LA65_0==SEMIC||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)||(LA65_0>=Identifier && LA65_0<=StringLiteral)||LA65_0==RegularExpressionLiteral||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1521:26: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause5378);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "caseClause"

    public static class defaultClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "defaultClause"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1524:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final ES3YUITestParser.defaultClause_return defaultClause() throws RecognitionException {
        ES3YUITestParser.defaultClause_return retval = new ES3YUITestParser.defaultClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1525:2: ( DEFAULT COLON ( statement )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1525:4: DEFAULT COLON ( statement )*
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause5391); 
            match(input,COLON,FOLLOW_COLON_in_defaultClause5393); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1525:18: ( statement )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=NULL && LA66_0<=BREAK)||LA66_0==CONTINUE||(LA66_0>=DELETE && LA66_0<=DO)||(LA66_0>=FOR && LA66_0<=IF)||(LA66_0>=NEW && LA66_0<=WITH)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||LA66_0==SEMIC||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||(LA66_0>=Identifier && LA66_0<=StringLiteral)||LA66_0==RegularExpressionLiteral||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1525:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause5395);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defaultClause"

    public static class labelledStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "labelledStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1532:1: labelledStatement : Identifier COLON statement ;
    public final ES3YUITestParser.labelledStatement_return labelledStatement() throws RecognitionException {
        ES3YUITestParser.labelledStatement_return retval = new ES3YUITestParser.labelledStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1533:2: ( Identifier COLON statement )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1533:4: Identifier COLON statement
            {
            match(input,Identifier,FOLLOW_Identifier_in_labelledStatement5412); 
            match(input,COLON,FOLLOW_COLON_in_labelledStatement5414); 
            pushFollow(FOLLOW_statement_in_labelledStatement5416);
            statement();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "labelledStatement"

    public static class throwStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "throwStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1556:1: throwStatement : THROW expression semic ;
    public final ES3YUITestParser.throwStatement_return throwStatement() throws RecognitionException {
        ES3YUITestParser.throwStatement_return retval = new ES3YUITestParser.throwStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1557:2: ( THROW expression semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1557:4: THROW expression semic
            {
            match(input,THROW,FOLLOW_THROW_in_throwStatement5436); 
             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement5440);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_semic_in_throwStatement5442);
            semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throwStatement"

    public static class tryStatement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "tryStatement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1564:1: tryStatement : TRY block ( catchClause ( finallyClause )? | finallyClause ) ;
    public final ES3YUITestParser.tryStatement_return tryStatement() throws RecognitionException {
        ES3YUITestParser.tryStatement_return retval = new ES3YUITestParser.tryStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:2: ( TRY block ( catchClause ( finallyClause )? | finallyClause ) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:4: TRY block ( catchClause ( finallyClause )? | finallyClause )
            {
            match(input,TRY,FOLLOW_TRY_in_tryStatement5458); 
            pushFollow(FOLLOW_block_in_tryStatement5460);
            block();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:14: ( catchClause ( finallyClause )? | finallyClause )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CATCH) ) {
                alt68=1;
            }
            else if ( (LA68_0==FINALLY) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:16: catchClause ( finallyClause )?
                    {
                    pushFollow(FOLLOW_catchClause_in_tryStatement5464);
                    catchClause();

                    state._fsp--;

                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:28: ( finallyClause )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==FINALLY) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:28: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement5466);
                            finallyClause();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:45: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement5471);
                    finallyClause();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tryStatement"

    public static class catchClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catchClause"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1568:1: catchClause : CATCH LPAREN Identifier RPAREN block ;
    public final ES3YUITestParser.catchClause_return catchClause() throws RecognitionException {
        ES3YUITestParser.catchClause_return retval = new ES3YUITestParser.catchClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1569:2: ( CATCH LPAREN Identifier RPAREN block )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1569:4: CATCH LPAREN Identifier RPAREN block
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause5485); 
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5487); 
            match(input,Identifier,FOLLOW_Identifier_in_catchClause5489); 
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5491); 
            pushFollow(FOLLOW_block_in_catchClause5493);
            block();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class finallyClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "finallyClause"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1572:1: finallyClause : FINALLY block ;
    public final ES3YUITestParser.finallyClause_return finallyClause() throws RecognitionException {
        ES3YUITestParser.finallyClause_return retval = new ES3YUITestParser.finallyClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1573:2: ( FINALLY block )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1573:4: FINALLY block
            {
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause5505); 
            pushFollow(FOLLOW_block_in_finallyClause5507);
            block();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "finallyClause"

    protected static class functionDeclaration_scope {
        String funcName;
        Integer funcLine;
    }
    protected Stack functionDeclaration_stack = new Stack();

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDeclaration"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1587:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionDeclarationBody -> {instrument}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text);
    public final ES3YUITestParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        functionDeclaration_stack.push(new functionDeclaration_scope());
        ES3YUITestParser.functionDeclaration_return retval = new ES3YUITestParser.functionDeclaration_return();
        retval.start = input.LT(1);

        Token name=null;


        	
                boolean instrument = false;
        	if (((Token)retval.start).getLine() > ((program_scope)program_stack.peek()).stopLine) {
        	  ((program_scope)program_stack.peek()).executableLines.add(((Token)retval.start).getLine());
        	  ((program_scope)program_stack.peek()).stopLine = ((Token)retval.start).getLine();
        	  instrument = true;
        	}
        	((functionDeclaration_scope)functionDeclaration_stack.peek()).funcLine = ((Token)retval.start).getLine();		

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1609:2: ( FUNCTION name= Identifier formalParameterList functionDeclarationBody -> {instrument}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1609:4: FUNCTION name= Identifier formalParameterList functionDeclarationBody
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration5543); 
            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration5547); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName =(name!=null?name.getText():null);
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration5551);
            formalParameterList();

            state._fsp--;

            pushFollow(FOLLOW_functionDeclarationBody_in_functionDeclaration5553);
            functionDeclarationBody();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1610:4: -> {instrument}? cover_line(src=$program::namecode=$textline=$start.getLine())
            if (instrument) {
                retval.st = templateLib.getInstanceOf("cover_line",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("line", ((Token)retval.start).getLine()));
            }
            else // 1611:4: -> ignore(code=$text)
            {
                retval.st = templateLib.getInstanceOf("ignore",
              new STAttrMap().put("code", input.toString(retval.start,input.LT(-1))));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

             
            	((program_scope)program_stack.peek()).functions.add("\"" + ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName + ":" + ((Token)retval.start).getLine() + "\""); 
              	if (verbose){
                		System.err.println("\n[INFO] Instrumenting function " + ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName + " on line " +  ((Token)retval.start).getLine());
              	}

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            functionDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    protected static class functionExpression_scope {
        String funcName;
        Integer funcLine;
    }
    protected Stack functionExpression_stack = new Stack();

    public static class functionExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1614:1: functionExpression : FUNCTION ( Identifier )? formalParameterList functionExpressionBody ;
    public final ES3YUITestParser.functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_stack.push(new functionExpression_scope());
        ES3YUITestParser.functionExpression_return retval = new ES3YUITestParser.functionExpression_return();
        retval.start = input.LT(1);


            ((functionExpression_scope)functionExpression_stack.peek()).funcLine =((Token)retval.start).getLine();

            /*
             * The function expression might have an identifier, and if so, use that as
             * the name.
             *
             * This might be a function that's a method in an object literal. If so,
             * the previous token will be a colon and the one prior to that will be the
             * identifier.
             *
             * Function may also be assigned to a variable. In that case, the previous
             * token will be the equals sign (=) and the token prior to that is the
             * variable/property.
             *
             * Even after all that, the function expression might have a declared name
             * as if it were a function declaration. If so, the declared function name
             * takes precendence over any object literal or variable assignment.
             */
            int lastTT = input.LA(-1);   //look for = or :
            int nextTT = input.LA(2);    //look for an identifer

            if (nextTT == Identifier){
                ((functionExpression_scope)functionExpression_stack.peek()).funcName = input.LT(2).getText();
            } else if (lastTT == COLON || lastTT == ASSIGN) {
                ((functionExpression_scope)functionExpression_stack.peek()).funcName = input.LT(-2).getText();
                //TODO: Continue walking back in case the identifier is object.name
                //right now, I end up just with name.
            } else {
                ((functionExpression_scope)functionExpression_stack.peek()).funcName = "(anonymous " +  (++((program_scope)program_stack.peek()).anonymousFunctionCount) + ")";
            }


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1652:2: ( FUNCTION ( Identifier )? formalParameterList functionExpressionBody )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1652:4: FUNCTION ( Identifier )? formalParameterList functionExpressionBody
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression5608); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1652:13: ( Identifier )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Identifier) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1652:13: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_functionExpression5610); 

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression5613);
            formalParameterList();

            state._fsp--;

            pushFollow(FOLLOW_functionExpressionBody_in_functionExpression5615);
            functionExpressionBody();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            functionExpression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "functionExpression"

    public static class formalParameterList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterList"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1655:1: formalParameterList : LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN ;
    public final ES3YUITestParser.formalParameterList_return formalParameterList() throws RecognitionException {
        ES3YUITestParser.formalParameterList_return retval = new ES3YUITestParser.formalParameterList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1656:2: ( LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1656:4: LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList5626); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1656:11: ( Identifier ( COMMA Identifier )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Identifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1656:13: Identifier ( COMMA Identifier )*
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5630); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1656:24: ( COMMA Identifier )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==COMMA) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1656:26: COMMA Identifier
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList5634); 
                    	    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5636); 

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList5644); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class functionDeclarationBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDeclarationBody"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1659:1: functionDeclarationBody : lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE ;
    public final ES3YUITestParser.functionDeclarationBody_return functionDeclarationBody() throws RecognitionException {
        ES3YUITestParser.functionDeclarationBody_return retval = new ES3YUITestParser.functionDeclarationBody_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1660:2: (lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1660:4: lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionDeclarationBody5657); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1660:14: ( functionDeclarationBodyWithoutBraces )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=NULL && LA72_0<=BREAK)||LA72_0==CONTINUE||(LA72_0>=DELETE && LA72_0<=DO)||(LA72_0>=FOR && LA72_0<=IF)||(LA72_0>=NEW && LA72_0<=WITH)||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||LA72_0==SEMIC||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||(LA72_0>=Identifier && LA72_0<=StringLiteral)||LA72_0==RegularExpressionLiteral||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1660:14: functionDeclarationBodyWithoutBraces
                    {
                    pushFollow(FOLLOW_functionDeclarationBodyWithoutBraces_in_functionDeclarationBody5659);
                    functionDeclarationBodyWithoutBraces();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_functionDeclarationBody5662); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclarationBody"

    public static class functionExpressionBody_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionExpressionBody"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1663:1: functionExpressionBody : lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE ;
    public final ES3YUITestParser.functionExpressionBody_return functionExpressionBody() throws RecognitionException {
        ES3YUITestParser.functionExpressionBody_return retval = new ES3YUITestParser.functionExpressionBody_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1664:2: (lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1664:4: lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionExpressionBody5675); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1664:14: ( functionExpressionBodyWithoutBraces )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=NULL && LA73_0<=BREAK)||LA73_0==CONTINUE||(LA73_0>=DELETE && LA73_0<=DO)||(LA73_0>=FOR && LA73_0<=IF)||(LA73_0>=NEW && LA73_0<=WITH)||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||LA73_0==SEMIC||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||(LA73_0>=Identifier && LA73_0<=StringLiteral)||LA73_0==RegularExpressionLiteral||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1664:14: functionExpressionBodyWithoutBraces
                    {
                    pushFollow(FOLLOW_functionExpressionBodyWithoutBraces_in_functionExpressionBody5677);
                    functionExpressionBodyWithoutBraces();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_functionExpressionBody5680); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpressionBody"

    public static class functionExpressionBodyWithoutBraces_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionExpressionBodyWithoutBraces"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1668:1: functionExpressionBodyWithoutBraces : sourceElement ( sourceElement )* -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textname=escapeQuotes($functionExpression::funcName)line=$functionExpression::funcLine) -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine);
    public final ES3YUITestParser.functionExpressionBodyWithoutBraces_return functionExpressionBodyWithoutBraces() throws RecognitionException {
        ES3YUITestParser.functionExpressionBodyWithoutBraces_return retval = new ES3YUITestParser.functionExpressionBodyWithoutBraces_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1679:2: ( sourceElement ( sourceElement )* -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textname=escapeQuotes($functionExpression::funcName)line=$functionExpression::funcLine) -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1679:4: sourceElement ( sourceElement )*
            {
            pushFollow(FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5697);
            sourceElement();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1679:18: ( sourceElement )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=NULL && LA74_0<=BREAK)||LA74_0==CONTINUE||(LA74_0>=DELETE && LA74_0<=DO)||(LA74_0>=FOR && LA74_0<=IF)||(LA74_0>=NEW && LA74_0<=WITH)||LA74_0==LBRACE||LA74_0==LPAREN||LA74_0==LBRACK||LA74_0==SEMIC||(LA74_0>=ADD && LA74_0<=SUB)||(LA74_0>=INC && LA74_0<=DEC)||(LA74_0>=NOT && LA74_0<=INV)||(LA74_0>=Identifier && LA74_0<=StringLiteral)||LA74_0==RegularExpressionLiteral||(LA74_0>=DecimalLiteral && LA74_0<=HexIntegerLiteral)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1679:18: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5699);
            	    sourceElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            	
            	


            // TEMPLATE REWRITE
            // 1683:2: -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textname=escapeQuotes($functionExpression::funcName)line=$functionExpression::funcLine)
            if (((functionExpression_scope)functionExpression_stack.peek()).funcName!=null) {
                retval.st = templateLib.getInstanceOf("cover_func",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("name", escapeQuotes(((functionExpression_scope)functionExpression_stack.peek()).funcName)).put("line", ((functionExpression_scope)functionExpression_stack.peek()).funcLine));
            }
            else // 1684:2: -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine)
            {
                retval.st = templateLib.getInstanceOf("cover_func",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("name", ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName).put("line", ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcLine));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

             
            	//favor the function expression's declared name, otherwise assign an anonymous function name
            	((program_scope)program_stack.peek()).functions.add("\"" + ((functionExpression_scope)functionExpression_stack.peek()).funcName + ":" + ((functionExpression_scope)functionExpression_stack.peek()).funcLine + "\"");
            	
            	if (verbose){
            			System.err.println("\n[INFO] Instrumenting function expression '" + ((functionExpression_scope)functionExpression_stack.peek()).funcName + "' on line " + ((functionExpression_scope)functionExpression_stack.peek()).funcLine);

            	}	
            	

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpressionBodyWithoutBraces"

    public static class functionDeclarationBodyWithoutBraces_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionDeclarationBodyWithoutBraces"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1687:1: functionDeclarationBodyWithoutBraces : sourceElement ( sourceElement )* -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine);
    public final ES3YUITestParser.functionDeclarationBodyWithoutBraces_return functionDeclarationBodyWithoutBraces() throws RecognitionException {
        ES3YUITestParser.functionDeclarationBodyWithoutBraces_return retval = new ES3YUITestParser.functionDeclarationBodyWithoutBraces_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1688:2: ( sourceElement ( sourceElement )* -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1688:4: sourceElement ( sourceElement )*
            {
            pushFollow(FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5766);
            sourceElement();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1688:18: ( sourceElement )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=NULL && LA75_0<=BREAK)||LA75_0==CONTINUE||(LA75_0>=DELETE && LA75_0<=DO)||(LA75_0>=FOR && LA75_0<=IF)||(LA75_0>=NEW && LA75_0<=WITH)||LA75_0==LBRACE||LA75_0==LPAREN||LA75_0==LBRACK||LA75_0==SEMIC||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)||(LA75_0>=Identifier && LA75_0<=StringLiteral)||LA75_0==RegularExpressionLiteral||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1688:18: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5768);
            	    sourceElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 1689:2: -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine)
            {
                retval.st = templateLib.getInstanceOf("cover_func",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("name", ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName).put("line", ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcLine));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclarationBodyWithoutBraces"

    protected static class program_scope {
        java.util.List<Integer> executableLines;
        java.util.List<String> functions;
        int stopLine;
        String name;
        int anonymousFunctionCount;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1696:1: program : ( ( sourceElement )* ) -> cover_file(src=$program::namecode=$textlines=$program::executableLinesfuncs=$program::functions);
    public final ES3YUITestParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        ES3YUITestParser.program_return retval = new ES3YUITestParser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).executableLines = new java.util.LinkedList();
          ((program_scope)program_stack.peek()).functions = new java.util.LinkedList();
          ((program_scope)program_stack.peek()).stopLine = 0;
          ((program_scope)program_stack.peek()).name = getSourceName();
          ((program_scope)program_stack.peek()).anonymousFunctionCount = 0;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1711:2: ( ( ( sourceElement )* ) -> cover_file(src=$program::namecode=$textlines=$program::executableLinesfuncs=$program::functions))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1711:4: ( ( sourceElement )* )
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1711:4: ( ( sourceElement )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1711:5: ( sourceElement )*
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1711:5: ( sourceElement )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=NULL && LA76_0<=BREAK)||LA76_0==CONTINUE||(LA76_0>=DELETE && LA76_0<=DO)||(LA76_0>=FOR && LA76_0<=IF)||(LA76_0>=NEW && LA76_0<=WITH)||LA76_0==LBRACE||LA76_0==LPAREN||LA76_0==LBRACK||LA76_0==SEMIC||(LA76_0>=ADD && LA76_0<=SUB)||(LA76_0>=INC && LA76_0<=DEC)||(LA76_0>=NOT && LA76_0<=INV)||(LA76_0>=Identifier && LA76_0<=StringLiteral)||LA76_0==RegularExpressionLiteral||(LA76_0>=DecimalLiteral && LA76_0<=HexIntegerLiteral)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1711:5: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program5820);
            	    sourceElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

            java.util.Collections.sort(((program_scope)program_stack.peek()).executableLines);


            // TEMPLATE REWRITE
            // 1712:2: -> cover_file(src=$program::namecode=$textlines=$program::executableLinesfuncs=$program::functions)
            {
                retval.st = templateLib.getInstanceOf("cover_file",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("lines", ((program_scope)program_stack.peek()).executableLines).put("funcs", ((program_scope)program_stack.peek()).functions));
            }

            ((TokenRewriteStream)input).replace(
              ((Token)retval.start).getTokenIndex(),
              input.LT(-1).getTokenIndex(),
              retval.st);
            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class sourceElement_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "sourceElement"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1720:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final ES3YUITestParser.sourceElement_return sourceElement() throws RecognitionException {
        ES3YUITestParser.sourceElement_return retval = new ES3YUITestParser.sourceElement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1725:2: ({...}? functionDeclaration | statement )
            int alt77=2;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1725:4: {...}? functionDeclaration
                    {
                    if ( !(( input.LA(1) == FUNCTION )) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement5881);
                    functionDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1726:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_sourceElement5886);
                    statement();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sourceElement"

    // Delegated rules


    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA77 dfa77 = new DFA77(this);
    static final String DFA43_eotS =
        "\44\uffff";
    static final String DFA43_eofS =
        "\44\uffff";
    static final String DFA43_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA43_maxS =
        "\1\u00a1\1\0\42\uffff";
    static final String DFA43_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA43_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA43_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\3\2\2\uffff\13\2\37\uffff"+
            "\1\1\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff\2\2\2\uffff"+
            "\2\2\6\uffff\2\2\66\uffff\2\2\5\uffff\1\2\3\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1244:4: ({...}? block | statementTail )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_1 = input.LA(1);

                         
                        int index43_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( ((statement_scope)statement_stack.peek()).isBlock = input.LA(1) == LBRACE )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index43_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\17\uffff";
    static final String DFA44_eofS =
        "\4\uffff\1\3\12\uffff";
    static final String DFA44_minS =
        "\1\4\3\uffff\1\23\12\uffff";
    static final String DFA44_maxS =
        "\1\u00a1\3\uffff\1\u0092\12\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\15\1\12";
    static final String DFA44_specialS =
        "\17\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\3\1\10\2\uffff\1\7\1\uffff\1\3\1\6\2\uffff\1\6\1\3\1\5\2"+
            "\uffff\1\3\1\11\1\13\1\3\1\14\1\15\1\3\1\1\1\3\1\6\1\12\37\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\2\11\uffff\2\3\2\uffff"+
            "\2\3\6\uffff\2\3\66\uffff\1\4\1\3\5\uffff\1\3\3\uffff\3\3",
            "",
            "",
            "",
            "\2\3\53\uffff\2\3\1\uffff\1\3\1\uffff\27\3\2\uffff\3\3\1\16"+
            "\15\3\42\uffff\2\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "1249:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );";
        }
    }
    static final String DFA77_eotS =
        "\44\uffff";
    static final String DFA77_eofS =
        "\44\uffff";
    static final String DFA77_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA77_maxS =
        "\1\u00a1\1\0\42\uffff";
    static final String DFA77_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA77_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA77_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\1\1\2\2\uffff\13"+
            "\2\37\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff"+
            "\2\2\2\uffff\2\2\6\uffff\2\2\66\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
    static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
    static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
    static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
    static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
    static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
    static final short[][] DFA77_transition;

    static {
        int numStates = DFA77_transitionS.length;
        DFA77_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
        }
    }

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = DFA77_eot;
            this.eof = DFA77_eof;
            this.min = DFA77_min;
            this.max = DFA77_max;
            this.accept = DFA77_accept;
            this.special = DFA77_special;
            this.transition = DFA77_transition;
        }
        public String getDescription() {
            return "1720:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA77_1 = input.LA(1);

                         
                        int index77_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == FUNCTION )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index77_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 77, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_reservedWord_in_token1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_token1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3151 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3169 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0x0000000388300000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3177 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0x0000000388300000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000380300000L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000380300000L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3259 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3261 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_propertyName3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3325 = new BitSet(new long[]{0x8000000001000070L,0x000000000000000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_primaryExpression_in_newExpression3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3340 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000EL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_arguments3348 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3377 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3390 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3399 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3403 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression3412 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression3489 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3566 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3570 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3584 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression3606 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3635 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_shiftExpression3639 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3653 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3672 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalExpression3676 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3702 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3716 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn3720 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3742 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3761 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpression3765 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3783 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3797 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn3801 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3819 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3839 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression3843 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3845 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3859 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn3863 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3865 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3881 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression3885 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3887 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3903 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn3907 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3909 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3924 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression3928 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3930 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3945 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn3949 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3951 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression3970 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression3974 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression3976 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn3990 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn3994 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn3996 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4011 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4015 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4017 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4032 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4036 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4038 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4057 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4061 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4063 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4065 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4081 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4085 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4087 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4089 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4119 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4126 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4205 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4212 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expression4240 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4264 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn4268 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEMIC_in_semic4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block4497 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_block4499 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_RBRACE_in_block4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement4520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4522 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement4526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4528 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_variableStatement4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration4546 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration4550 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn4567 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn4571 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement4610 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement4630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement4632 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_ifStatement4634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement4636 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_ifStatement4638 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStatement4716 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_elseStatement4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement4777 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_doStatement4779 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement4781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement4783 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_doStatement4785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement4787 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_doStatement4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement4875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement4877 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_whileStatement4879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement4881 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_whileStatement4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement4944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement4946 = new BitSet(new long[]{0x8000000039221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_forControl_in_forStatement4948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement4950 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_forStatement4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar4990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar4992 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_IN_in_forControlVar5004 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5031 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5036 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5043 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5077 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5092 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5117 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5124 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5151 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5158 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement5183 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000160000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement5187 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_continueStatement5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement5208 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000160000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement5212 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_breakStatement5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement5233 = new BitSet(new long[]{0x8000000029221070L,0x00000000303300CBL,0x0000000388360000L});
    public static final BitSet FOLLOW_expression_in_returnStatement5237 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_returnStatement5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement5256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement5258 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_withStatement5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement5262 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_withStatement5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement5333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement5335 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_switchStatement5337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement5339 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement5341 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement5348 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement5354 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause5372 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_caseClause5374 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause5376 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_caseClause5378 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause5391 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause5393 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_defaultClause5395 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement5412 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement5414 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement5436 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_throwStatement5440 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_throwStatement5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement5458 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_tryStatement5460 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement5464 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause5485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause5487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause5489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause5491 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause5505 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_finallyClause5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration5543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration5547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration5551 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionDeclarationBody_in_functionDeclaration5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression5608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression5610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression5613 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionExpressionBody_in_functionExpression5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList5630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList5634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList5636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionDeclarationBody5657 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionDeclarationBodyWithoutBraces_in_functionDeclarationBody5659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_functionDeclarationBody5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionExpressionBody5675 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionExpressionBodyWithoutBraces_in_functionExpressionBody5677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_functionExpressionBody5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5697 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5699 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5766 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5768 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_program5820 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement5886 = new BitSet(new long[]{0x0000000000000002L});

}