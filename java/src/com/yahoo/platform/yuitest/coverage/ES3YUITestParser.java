// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g 2010-02-12 10:07:59

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:945:1: newExpression : ( NEW primaryExpression | NEW functionExpression );
    public final ES3YUITestParser.newExpression_return newExpression() throws RecognitionException {
        ES3YUITestParser.newExpression_return retval = new ES3YUITestParser.newExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:946:2: ( NEW primaryExpression | NEW functionExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEW) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==FUNCTION) ) {
                    alt12=2;
                }
                else if ( ((LA12_1>=NULL && LA12_1<=FALSE)||LA12_1==THIS||LA12_1==LBRACE||LA12_1==LPAREN||LA12_1==LBRACK||(LA12_1>=Identifier && LA12_1<=StringLiteral)||LA12_1==RegularExpressionLiteral||(LA12_1>=DecimalLiteral && LA12_1<=HexIntegerLiteral)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:946:4: NEW primaryExpression
                    {
                    match(input,NEW,FOLLOW_NEW_in_newExpression3325); 
                    pushFollow(FOLLOW_primaryExpression_in_newExpression3327);
                    primaryExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:947:11: NEW functionExpression
                    {
                    match(input,NEW,FOLLOW_NEW_in_newExpression3339); 
                    pushFollow(FOLLOW_functionExpression_in_newExpression3341);
                    functionExpression();

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
    // $ANTLR end "newExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:951:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN ;
    public final ES3YUITestParser.arguments_return arguments() throws RecognitionException {
        ES3YUITestParser.arguments_return retval = new ES3YUITestParser.arguments_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:952:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:952:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_arguments3357); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:952:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=NULL && LA14_0<=FALSE)||LA14_0==DELETE||LA14_0==FUNCTION||LA14_0==NEW||LA14_0==THIS||LA14_0==TYPEOF||LA14_0==VOID||LA14_0==LBRACE||LA14_0==LPAREN||LA14_0==LBRACK||(LA14_0>=ADD && LA14_0<=SUB)||(LA14_0>=INC && LA14_0<=DEC)||(LA14_0>=NOT && LA14_0<=INV)||(LA14_0>=Identifier && LA14_0<=StringLiteral)||LA14_0==RegularExpressionLiteral||(LA14_0>=DecimalLiteral && LA14_0<=HexIntegerLiteral)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:952:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3361);
                    assignmentExpression();

                    state._fsp--;

                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:952:34: ( COMMA assignmentExpression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:952:36: COMMA assignmentExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arguments3365); 
                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3367);
                    	    assignmentExpression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_arguments3375); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:956:1: leftHandSideExpression : ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )* ;
    public final ES3YUITestParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        ES3YUITestParser.leftHandSideExpression_return retval = new ES3YUITestParser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:957:2: ( ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:958:2: ( memberExpression ) ( arguments | LBRACK expression RBRACK | DOT Identifier )*
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:958:2: ( memberExpression )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:959:3: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3394);
            memberExpression();

            state._fsp--;


            }

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:961:2: ( arguments | LBRACK expression RBRACK | DOT Identifier )*
            loop15:
            do {
                int alt15=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt15=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt15=2;
                    }
                    break;
                case DOT:
                    {
                    alt15=3;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:962:3: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3407);
            	    arguments();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:963:5: LBRACK expression RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3416); 
            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3418);
            	    expression();

            	    state._fsp--;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3420); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:964:5: DOT Identifier
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3427); 
            	    match(input,Identifier,FOLLOW_Identifier_in_leftHandSideExpression3429); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:978:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final ES3YUITestParser.postfixExpression_return postfixExpression() throws RecognitionException {
        ES3YUITestParser.postfixExpression_return retval = new ES3YUITestParser.postfixExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:979:2: ( leftHandSideExpression ( postfixOperator )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:979:4: leftHandSideExpression ( postfixOperator )?
            {
            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3452);
            leftHandSideExpression();

            state._fsp--;

             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:979:95: ( postfixOperator )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=INC && LA16_0<=DEC)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:979:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression3458);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:982:1: postfixOperator : (op= INC | op= DEC );
    public final ES3YUITestParser.postfixOperator_return postfixOperator() throws RecognitionException {
        ES3YUITestParser.postfixOperator_return retval = new ES3YUITestParser.postfixOperator_return();
        retval.start = input.LT(1);

        Token op=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:983:2: (op= INC | op= DEC )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==INC) ) {
                alt17=1;
            }
            else if ( (LA17_0==DEC) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:983:4: op= INC
                    {
                    op=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator3475); 
                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:984:4: op= DEC
                    {
                    op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator3484); 
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:991:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final ES3YUITestParser.unaryExpression_return unaryExpression() throws RecognitionException {
        ES3YUITestParser.unaryExpression_return retval = new ES3YUITestParser.unaryExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:992:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=NULL && LA18_0<=FALSE)||LA18_0==FUNCTION||LA18_0==NEW||LA18_0==THIS||LA18_0==LBRACE||LA18_0==LPAREN||LA18_0==LBRACK||(LA18_0>=Identifier && LA18_0<=StringLiteral)||LA18_0==RegularExpressionLiteral||(LA18_0>=DecimalLiteral && LA18_0<=HexIntegerLiteral)) ) {
                alt18=1;
            }
            else if ( (LA18_0==DELETE||LA18_0==TYPEOF||LA18_0==VOID||(LA18_0>=ADD && LA18_0<=SUB)||(LA18_0>=INC && LA18_0<=DEC)||(LA18_0>=NOT && LA18_0<=INV)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:992:4: postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3501);
                    postfixExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:993:4: unaryOperator unaryExpression
                    {
                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression3506);
                    unaryOperator();

                    state._fsp--;

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3508);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:996:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT );
    public final ES3YUITestParser.unaryOperator_return unaryOperator() throws RecognitionException {
        ES3YUITestParser.unaryOperator_return retval = new ES3YUITestParser.unaryOperator_return();
        retval.start = input.LT(1);

        Token op=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:997:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT )
            int alt19=9;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt19=1;
                }
                break;
            case VOID:
                {
                alt19=2;
                }
                break;
            case TYPEOF:
                {
                alt19=3;
                }
                break;
            case INC:
                {
                alt19=4;
                }
                break;
            case DEC:
                {
                alt19=5;
                }
                break;
            case ADD:
                {
                alt19=6;
                }
                break;
            case SUB:
                {
                alt19=7;
                }
                break;
            case INV:
                {
                alt19=8;
                }
                break;
            case NOT:
                {
                alt19=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:997:4: DELETE
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_unaryOperator3520); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:998:4: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_unaryOperator3525); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:999:4: TYPEOF
                    {
                    match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator3530); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1000:4: INC
                    {
                    match(input,INC,FOLLOW_INC_in_unaryOperator3535); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1001:4: DEC
                    {
                    match(input,DEC,FOLLOW_DEC_in_unaryOperator3540); 

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1002:4: op= ADD
                    {
                    op=(Token)match(input,ADD,FOLLOW_ADD_in_unaryOperator3547); 
                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1003:4: op= SUB
                    {
                    op=(Token)match(input,SUB,FOLLOW_SUB_in_unaryOperator3556); 
                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1004:4: INV
                    {
                    match(input,INV,FOLLOW_INV_in_unaryOperator3563); 

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1005:4: NOT
                    {
                    match(input,NOT,FOLLOW_NOT_in_unaryOperator3568); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1012:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final ES3YUITestParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        ES3YUITestParser.multiplicativeExpression_return retval = new ES3YUITestParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1013:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1013:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3583);
            unaryExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1013:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=MUL && LA20_0<=MOD)||LA20_0==DIV) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1013:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3601);
            	    unaryExpression();

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
    // $ANTLR end "multiplicativeExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1020:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final ES3YUITestParser.additiveExpression_return additiveExpression() throws RecognitionException {
        ES3YUITestParser.additiveExpression_return retval = new ES3YUITestParser.additiveExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1021:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1021:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3619);
            multiplicativeExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1021:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=ADD && LA21_0<=SUB)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1021:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3633);
            	    multiplicativeExpression();

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
    // $ANTLR end "additiveExpression"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "shiftExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1028:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final ES3YUITestParser.shiftExpression_return shiftExpression() throws RecognitionException {
        ES3YUITestParser.shiftExpression_return retval = new ES3YUITestParser.shiftExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1029:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1029:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression3652);
            additiveExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1029:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=SHL && LA22_0<=SHU)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1029:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression3670);
            	    additiveExpression();

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
    // $ANTLR end "shiftExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1036:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final ES3YUITestParser.relationalExpression_return relationalExpression() throws RecognitionException {
        ES3YUITestParser.relationalExpression_return retval = new ES3YUITestParser.relationalExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1037:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1037:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression3689);
            shiftExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1037:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=IN && LA23_0<=INSTANCEOF)||(LA23_0>=LT && LA23_0<=GTE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1037:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression3719);
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
    // $ANTLR end "relationalExpression"

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1040:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final ES3YUITestParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.relationalExpressionNoIn_return retval = new ES3YUITestParser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1041:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1041:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3733);
            shiftExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1041:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==INSTANCEOF||(LA24_0>=LT && LA24_0<=GTE)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1041:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3759);
            	    shiftExpression();

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
    // $ANTLR end "relationalExpressionNoIn"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1048:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final ES3YUITestParser.equalityExpression_return equalityExpression() throws RecognitionException {
        ES3YUITestParser.equalityExpression_return retval = new ES3YUITestParser.equalityExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1049:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1049:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3778);
            relationalExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1049:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=EQ && LA25_0<=NSAME)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1049:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3800);
            	    relationalExpression();

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
    // $ANTLR end "equalityExpression"

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "equalityExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1052:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final ES3YUITestParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.equalityExpressionNoIn_return retval = new ES3YUITestParser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1053:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1053:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3814);
            relationalExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1053:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=EQ && LA26_0<=NSAME)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1053:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3836);
            	    relationalExpressionNoIn();

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
    // $ANTLR end "equalityExpressionNoIn"

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseANDExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1060:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final ES3YUITestParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        ES3YUITestParser.bitwiseANDExpression_return retval = new ES3YUITestParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:2: ( equalityExpression ( AND equalityExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:4: equalityExpression ( AND equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3856);
            equalityExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:23: ( AND equalityExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AND) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1061:25: AND equalityExpression
            	    {
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpression3860); 
            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3862);
            	    equalityExpression();

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
    // $ANTLR end "bitwiseANDExpression"

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseANDExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1064:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final ES3YUITestParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.bitwiseANDExpressionNoIn_return retval = new ES3YUITestParser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1065:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1065:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3876);
            equalityExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1065:27: ( AND equalityExpressionNoIn )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1065:29: AND equalityExpressionNoIn
            	    {
            	    match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn3880); 
            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3882);
            	    equalityExpressionNoIn();

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
    // $ANTLR end "bitwiseANDExpressionNoIn"

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseXORExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1068:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final ES3YUITestParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        ES3YUITestParser.bitwiseXORExpression_return retval = new ES3YUITestParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3898);
            bitwiseANDExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:25: ( XOR bitwiseANDExpression )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==XOR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1069:27: XOR bitwiseANDExpression
            	    {
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression3902); 
            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3904);
            	    bitwiseANDExpression();

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
    // $ANTLR end "bitwiseXORExpression"

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseXORExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1072:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final ES3YUITestParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.bitwiseXORExpressionNoIn_return retval = new ES3YUITestParser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1073:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1073:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3920);
            bitwiseANDExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1073:29: ( XOR bitwiseANDExpressionNoIn )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==XOR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1073:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn3924); 
            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3926);
            	    bitwiseANDExpressionNoIn();

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
    // $ANTLR end "bitwiseXORExpressionNoIn"

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseORExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1076:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final ES3YUITestParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        ES3YUITestParser.bitwiseORExpression_return retval = new ES3YUITestParser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3941);
            bitwiseXORExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:25: ( OR bitwiseXORExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==OR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1077:27: OR bitwiseXORExpression
            	    {
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpression3945); 
            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3947);
            	    bitwiseXORExpression();

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
    // $ANTLR end "bitwiseORExpression"

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bitwiseORExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1080:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final ES3YUITestParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.bitwiseORExpressionNoIn_return retval = new ES3YUITestParser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1081:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1081:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3962);
            bitwiseXORExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1081:29: ( OR bitwiseXORExpressionNoIn )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1081:31: OR bitwiseXORExpressionNoIn
            	    {
            	    match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn3966); 
            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3968);
            	    bitwiseXORExpressionNoIn();

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
    // $ANTLR end "bitwiseORExpressionNoIn"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1088:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final ES3YUITestParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        ES3YUITestParser.logicalANDExpression_return retval = new ES3YUITestParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression3987);
            bitwiseORExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:24: ( LAND bitwiseORExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==LAND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1089:26: LAND bitwiseORExpression
            	    {
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpression3991); 
            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression3993);
            	    bitwiseORExpression();

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
    // $ANTLR end "logicalANDExpression"

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalANDExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1092:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final ES3YUITestParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.logicalANDExpressionNoIn_return retval = new ES3YUITestParser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1093:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1093:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4007);
            bitwiseORExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1093:28: ( LAND bitwiseORExpressionNoIn )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LAND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1093:30: LAND bitwiseORExpressionNoIn
            	    {
            	    match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4011); 
            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4013);
            	    bitwiseORExpressionNoIn();

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
    // $ANTLR end "logicalANDExpressionNoIn"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1096:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final ES3YUITestParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        ES3YUITestParser.logicalORExpression_return retval = new ES3YUITestParser.logicalORExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4028);
            logicalANDExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:25: ( LOR logicalANDExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1097:27: LOR logicalANDExpression
            	    {
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpression4032); 
            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4034);
            	    logicalANDExpression();

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
    // $ANTLR end "logicalORExpression"

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "logicalORExpressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1100:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final ES3YUITestParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.logicalORExpressionNoIn_return retval = new ES3YUITestParser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4049);
            logicalANDExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:29: ( LOR logicalANDExpressionNoIn )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1101:31: LOR logicalANDExpressionNoIn
            	    {
            	    match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4053); 
            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4055);
            	    logicalANDExpressionNoIn();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1108:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final ES3YUITestParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        ES3YUITestParser.conditionalExpression_return retval = new ES3YUITestParser.conditionalExpression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4074);
            logicalORExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==QUE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1109:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpression4078); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4080);
                    assignmentExpression();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_conditionalExpression4082); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4084);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1112:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final ES3YUITestParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.conditionalExpressionNoIn_return retval = new ES3YUITestParser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4098);
            logicalORExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==QUE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1113:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4102); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4104);
                    assignmentExpressionNoIn();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4106); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4108);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1142:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final ES3YUITestParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        ES3YUITestParser.assignmentExpression_return retval = new ES3YUITestParser.assignmentExpression_return();
        retval.start = input.LT(1);

        ES3YUITestParser.conditionalExpression_return lhs = null;



        	Object[] isLhs = new Object[1];

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1147:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1147:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4136);
            lhs=conditionalExpression();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1148:2: ({...}? assignmentOperator assignmentExpression )?
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
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1148:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4143);
                    assignmentOperator();

                    state._fsp--;

                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4145);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1151:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final ES3YUITestParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        ES3YUITestParser.assignmentOperator_return retval = new ES3YUITestParser.assignmentOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1152:2: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1155:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final ES3YUITestParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        ES3YUITestParser.assignmentExpressionNoIn_return retval = new ES3YUITestParser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        ES3YUITestParser.conditionalExpressionNoIn_return lhs = null;



        	Object[] isLhs = new Object[1];

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1160:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1160:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4222);
            lhs=conditionalExpressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1161:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=ASSIGN && LA40_0<=XORASS)||LA40_0==DIVASS) ) {
                int LA40_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1161:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4229);
                    assignmentOperator();

                    state._fsp--;

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4231);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1168:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* ;
    public final ES3YUITestParser.expression_return expression() throws RecognitionException {
        ES3YUITestParser.expression_return retval = new ES3YUITestParser.expression_return();
        retval.start = input.LT(1);

        List list_exprs=null;
        RuleReturnScope exprs = null;
        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1169:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1169:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4253);
            exprs=assignmentExpression();

            state._fsp--;

            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTemplate());

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1169:32: ( COMMA exprs+= assignmentExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1169:34: COMMA exprs+= assignmentExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression4257); 
            	    pushFollow(FOLLOW_assignmentExpression_in_expression4261);
            	    exprs=assignmentExpression();

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
    // $ANTLR end "expression"

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expressionNoIn"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1174:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* ;
    public final ES3YUITestParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        ES3YUITestParser.expressionNoIn_return retval = new ES3YUITestParser.expressionNoIn_return();
        retval.start = input.LT(1);

        List list_exprs=null;
        RuleReturnScope exprs = null;
        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1175:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1175:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4281);
            exprs=assignmentExpressionNoIn();

            state._fsp--;

            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTemplate());

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1175:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1175:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4285); 
            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4289);
            	    exprs=assignmentExpressionNoIn();

            	    state._fsp--;

            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1202:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final ES3YUITestParser.semic_return semic() throws RecognitionException {
        ES3YUITestParser.semic_return retval = new ES3YUITestParser.semic_return();
        retval.start = input.LT(1);


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1210:2: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt43=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt43=1;
                }
                break;
            case EOF:
                {
                alt43=2;
                }
                break;
            case RBRACE:
                {
                alt43=3;
                }
                break;
            case EOL:
                {
                alt43=4;
                }
                break;
            case MultiLineComment:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1210:4: SEMIC
                    {
                    match(input,SEMIC,FOLLOW_SEMIC_in_semic4323); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1211:4: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_semic4328); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1212:4: RBRACE
                    {
                    match(input,RBRACE,FOLLOW_RBRACE_in_semic4333); 
                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1213:4: EOL
                    {
                    match(input,EOL,FOLLOW_EOL_in_semic4340); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1213:10: MultiLineComment
                    {
                    match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic4344); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1221:1: statement options {k=1; } : ({...}? block | statementTail ) -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text);
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
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1245:2: ( ({...}? block | statementTail ) -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1245:4: ({...}? block | statementTail )
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1245:4: ({...}? block | statementTail )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1245:5: {...}? block
                    {
                    if ( !(( ((statement_scope)statement_stack.peek()).isBlock = input.LA(1) == LBRACE )) ) {
                        throw new FailedPredicateException(input, "statement", " $statement::isBlock = input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement4387);
                    block();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1245:62: statementTail
                    {
                    pushFollow(FOLLOW_statementTail_in_statement4391);
                    statementTail();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 1246:4: -> {instrument && !$statement::isBlock}? cover_line(src=$program::namecode=$textline=$start.getLine())
            if (instrument && !((statement_scope)statement_stack.peek()).isBlock) {
                retval.st = templateLib.getInstanceOf("cover_line",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("line", ((Token)retval.start).getLine()));
            }
            else // 1247:4: -> ignore(code=$text)
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1250:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final ES3YUITestParser.statementTail_return statementTail() throws RecognitionException {
        ES3YUITestParser.statementTail_return retval = new ES3YUITestParser.statementTail_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1251:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt45=13;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1251:4: variableStatement
                    {
                    pushFollow(FOLLOW_variableStatement_in_statementTail4439);
                    variableStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1252:4: emptyStatement
                    {
                    pushFollow(FOLLOW_emptyStatement_in_statementTail4444);
                    emptyStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1253:4: expressionStatement
                    {
                    pushFollow(FOLLOW_expressionStatement_in_statementTail4449);
                    expressionStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1254:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statementTail4454);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1255:4: iterationStatement
                    {
                    pushFollow(FOLLOW_iterationStatement_in_statementTail4459);
                    iterationStatement();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1256:4: continueStatement
                    {
                    pushFollow(FOLLOW_continueStatement_in_statementTail4464);
                    continueStatement();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1257:4: breakStatement
                    {
                    pushFollow(FOLLOW_breakStatement_in_statementTail4469);
                    breakStatement();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1258:4: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statementTail4474);
                    returnStatement();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1259:4: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statementTail4479);
                    withStatement();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1260:4: labelledStatement
                    {
                    pushFollow(FOLLOW_labelledStatement_in_statementTail4484);
                    labelledStatement();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1261:4: switchStatement
                    {
                    pushFollow(FOLLOW_switchStatement_in_statementTail4489);
                    switchStatement();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1262:4: throwStatement
                    {
                    pushFollow(FOLLOW_throwStatement_in_statementTail4494);
                    throwStatement();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1263:4: tryStatement
                    {
                    pushFollow(FOLLOW_tryStatement_in_statementTail4499);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1268:1: block : lb= LBRACE ( statement )* RBRACE ;
    public final ES3YUITestParser.block_return block() throws RecognitionException {
        ES3YUITestParser.block_return retval = new ES3YUITestParser.block_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1269:2: (lb= LBRACE ( statement )* RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1269:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block4514); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1269:14: ( statement )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=NULL && LA46_0<=BREAK)||LA46_0==CONTINUE||(LA46_0>=DELETE && LA46_0<=DO)||(LA46_0>=FOR && LA46_0<=IF)||(LA46_0>=NEW && LA46_0<=WITH)||LA46_0==LBRACE||LA46_0==LPAREN||LA46_0==LBRACK||LA46_0==SEMIC||(LA46_0>=ADD && LA46_0<=SUB)||(LA46_0>=INC && LA46_0<=DEC)||(LA46_0>=NOT && LA46_0<=INV)||(LA46_0>=Identifier && LA46_0<=StringLiteral)||LA46_0==RegularExpressionLiteral||(LA46_0>=DecimalLiteral && LA46_0<=HexIntegerLiteral)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1269:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block4516);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_block4519); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1277:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic ;
    public final ES3YUITestParser.variableStatement_return variableStatement() throws RecognitionException {
        ES3YUITestParser.variableStatement_return retval = new ES3YUITestParser.variableStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1278:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1278:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            match(input,VAR,FOLLOW_VAR_in_variableStatement4537); 
            pushFollow(FOLLOW_variableDeclaration_in_variableStatement4539);
            variableDeclaration();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1278:28: ( COMMA variableDeclaration )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1278:30: COMMA variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement4543); 
            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement4545);
            	    variableDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement4550);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1282:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
    public final ES3YUITestParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        ES3YUITestParser.variableDeclaration_return retval = new ES3YUITestParser.variableDeclaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1283:2: ( Identifier ( ASSIGN assignmentExpression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1283:4: Identifier ( ASSIGN assignmentExpression )?
            {
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration4563); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1283:15: ( ASSIGN assignmentExpression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ASSIGN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1283:17: ASSIGN assignmentExpression
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration4567); 
                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration4569);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1286:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final ES3YUITestParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        ES3YUITestParser.variableDeclarationNoIn_return retval = new ES3YUITestParser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1287:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1287:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn4584); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1287:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASSIGN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1287:17: ASSIGN assignmentExpressionNoIn
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn4588); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4590);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1294:1: emptyStatement : SEMIC ;
    public final ES3YUITestParser.emptyStatement_return emptyStatement() throws RecognitionException {
        ES3YUITestParser.emptyStatement_return retval = new ES3YUITestParser.emptyStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1295:2: ( SEMIC )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1295:4: SEMIC
            {
            match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement4609); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1308:1: expressionStatement : expression semic ;
    public final ES3YUITestParser.expressionStatement_return expressionStatement() throws RecognitionException {
        ES3YUITestParser.expressionStatement_return retval = new ES3YUITestParser.expressionStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1309:2: ( expression semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1309:4: expression semic
            {
            pushFollow(FOLLOW_expression_in_expressionStatement4627);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_semic_in_expressionStatement4629);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1317:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? elseStatement )? -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\";
    public final ES3YUITestParser.ifStatement_return ifStatement() throws RecognitionException {
        ES3YUITestParser.ifStatement_return retval = new ES3YUITestParser.ifStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement1 = null;

        ES3YUITestParser.elseStatement_return elseStatement2 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1319:2: ( IF LPAREN expression RPAREN statement ({...}? elseStatement )? -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1319:4: IF LPAREN expression RPAREN statement ({...}? elseStatement )?
            {
            match(input,IF,FOLLOW_IF_in_ifStatement4647); 
            match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement4649); 
            pushFollow(FOLLOW_expression_in_ifStatement4651);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement4653); 
            pushFollow(FOLLOW_statement_in_ifStatement4655);
            statement1=statement();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1319:42: ({...}? elseStatement )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ELSE) ) {
                int LA50_1 = input.LA(2);

                if ( (( input.LA(1) == ELSE )) ) {
                    alt50=1;
                }
            }
            switch (alt50) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1319:44: {...}? elseStatement
                    {
                    if ( !(( input.LA(1) == ELSE )) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    pushFollow(FOLLOW_elseStatement_in_ifStatement4661);
                    elseStatement2=elseStatement();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 1321:2: -> template(p=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)body=wrapInBraces($statement.start, $statement.stop, input)elseClause=\n\t $elseStatement.stop != null ? input.toString($statement.stop.getTokenIndex()+1, $elseStatement.stop.getTokenIndex() ) : null) \"<p><body><elseClause>\"
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1327:1: elseStatement : ELSE statement -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\";
    public final ES3YUITestParser.elseStatement_return elseStatement() throws RecognitionException {
        ES3YUITestParser.elseStatement_return retval = new ES3YUITestParser.elseStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement3 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1328:2: ( ELSE statement -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1328:4: ELSE statement
            {
            match(input,ELSE,FOLLOW_ELSE_in_elseStatement4733); 
            pushFollow(FOLLOW_statement_in_elseStatement4735);
            statement3=statement();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1329:2: -> template(prefix=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<prefix><stmt>\"
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1336:1: iterationStatement : ( doStatement | whileStatement | forStatement );
    public final ES3YUITestParser.iterationStatement_return iterationStatement() throws RecognitionException {
        ES3YUITestParser.iterationStatement_return retval = new ES3YUITestParser.iterationStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1337:2: ( doStatement | whileStatement | forStatement )
            int alt51=3;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt51=1;
                }
                break;
            case WHILE:
                {
                alt51=2;
                }
                break;
            case FOR:
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
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1337:4: doStatement
                    {
                    pushFollow(FOLLOW_doStatement_in_iterationStatement4772);
                    doStatement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1338:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_iterationStatement4777);
                    whileStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1339:4: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_iterationStatement4782);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1342:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\";
    public final ES3YUITestParser.doStatement_return doStatement() throws RecognitionException {
        ES3YUITestParser.doStatement_return retval = new ES3YUITestParser.doStatement_return();
        retval.start = input.LT(1);

        Token WHILE5=null;
        Token RPAREN6=null;
        ES3YUITestParser.statement_return statement4 = null;

        ES3YUITestParser.semic_return semic7 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1343:2: ( DO statement WHILE LPAREN expression RPAREN semic -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1343:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            match(input,DO,FOLLOW_DO_in_doStatement4794); 
            pushFollow(FOLLOW_statement_in_doStatement4796);
            statement4=statement();

            state._fsp--;

            WHILE5=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStatement4798); 
            match(input,LPAREN,FOLLOW_LPAREN_in_doStatement4800); 
            pushFollow(FOLLOW_expression_in_doStatement4802);
            expression();

            state._fsp--;

            RPAREN6=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStatement4804); 
            pushFollow(FOLLOW_semic_in_doStatement4806);
            semic7=semic();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1344:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)post=input.toString($WHILE, $RPAREN)end=$semic.text) \"<pre><stmt><post><end>\"
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1350:1: whileStatement : WHILE LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
    public final ES3YUITestParser.whileStatement_return whileStatement() throws RecognitionException {
        ES3YUITestParser.whileStatement_return retval = new ES3YUITestParser.whileStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement8 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1351:2: ( WHILE LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1351:4: WHILE LPAREN expression RPAREN statement
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement4892); 
            match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement4894); 
            pushFollow(FOLLOW_expression_in_whileStatement4896);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement4898); 
            pushFollow(FOLLOW_statement_in_whileStatement4900);
            statement8=statement();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1352:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1398:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final ES3YUITestParser.forStatement_return forStatement() throws RecognitionException {
        ES3YUITestParser.forStatement_return retval = new ES3YUITestParser.forStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1399:2: ( FOR LPAREN forControl RPAREN statement )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1399:4: FOR LPAREN forControl RPAREN statement
            {
            match(input,FOR,FOLLOW_FOR_in_forStatement4961); 
            match(input,LPAREN,FOLLOW_LPAREN_in_forStatement4963); 
            pushFollow(FOLLOW_forControl_in_forStatement4965);
            forControl();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_forStatement4967); 
            pushFollow(FOLLOW_statement_in_forStatement4969);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1405:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final ES3YUITestParser.forControl_return forControl() throws RecognitionException {
        ES3YUITestParser.forControl_return retval = new ES3YUITestParser.forControl_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1406:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt52=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt52=1;
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
                alt52=2;
                }
                break;
            case SEMIC:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1406:4: forControlVar
                    {
                    pushFollow(FOLLOW_forControlVar_in_forControl4986);
                    forControlVar();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1407:4: forControlExpression
                    {
                    pushFollow(FOLLOW_forControlExpression_in_forControl4991);
                    forControlExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1408:4: forControlSemic
                    {
                    pushFollow(FOLLOW_forControlSemic_in_forControl4996);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1411:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) ) ;
    public final ES3YUITestParser.forControlVar_return forControlVar() throws RecognitionException {
        ES3YUITestParser.forControlVar_return retval = new ES3YUITestParser.forControlVar_return();
        retval.start = input.LT(1);

        ES3YUITestParser.expression_return ex1 = null;

        ES3YUITestParser.expression_return ex2 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1412:2: ( VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) ) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1412:4: VAR variableDeclarationNoIn ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) )
            {
            match(input,VAR,FOLLOW_VAR_in_forControlVar5007); 
            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5009);
            variableDeclarationNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1413:2: ( ( IN expression ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IN) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=SEMIC && LA56_0<=COMMA)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1414:3: ( IN expression )
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1414:3: ( IN expression )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1415:4: IN expression
                    {
                    match(input,IN,FOLLOW_IN_in_forControlVar5021); 
                    pushFollow(FOLLOW_expression_in_forControlVar5023);
                    expression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1419:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:4: ( COMMA variableDeclarationNoIn )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==COMMA) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:6: COMMA variableDeclarationNoIn
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_forControlVar5046); 
                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5048);
                    	    variableDeclarationNoIn();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5053); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:48: (ex1= expression )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=NULL && LA54_0<=FALSE)||LA54_0==DELETE||LA54_0==FUNCTION||LA54_0==NEW||LA54_0==THIS||LA54_0==TYPEOF||LA54_0==VOID||LA54_0==LBRACE||LA54_0==LPAREN||LA54_0==LBRACK||(LA54_0>=ADD && LA54_0<=SUB)||(LA54_0>=INC && LA54_0<=DEC)||(LA54_0>=NOT && LA54_0<=INV)||(LA54_0>=Identifier && LA54_0<=StringLiteral)||LA54_0==RegularExpressionLiteral||(LA54_0>=DecimalLiteral && LA54_0<=HexIntegerLiteral)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5057);
                            ex1=expression();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5060); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:70: (ex2= expression )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=NULL && LA55_0<=FALSE)||LA55_0==DELETE||LA55_0==FUNCTION||LA55_0==NEW||LA55_0==THIS||LA55_0==TYPEOF||LA55_0==VOID||LA55_0==LBRACE||LA55_0==LPAREN||LA55_0==LBRACK||(LA55_0>=ADD && LA55_0<=SUB)||(LA55_0>=INC && LA55_0<=DEC)||(LA55_0>=NOT && LA55_0<=INV)||(LA55_0>=Identifier && LA55_0<=StringLiteral)||LA55_0==RegularExpressionLiteral||(LA55_0>=DecimalLiteral && LA55_0<=HexIntegerLiteral)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1420:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5064);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1426:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) ) ;
    public final ES3YUITestParser.forControlExpression_return forControlExpression() throws RecognitionException {
        ES3YUITestParser.forControlExpression_return retval = new ES3YUITestParser.forControlExpression_return();
        retval.start = input.LT(1);

        ES3YUITestParser.expressionNoIn_return ex1 = null;

        ES3YUITestParser.expression_return ex2 = null;

        ES3YUITestParser.expression_return ex3 = null;



        	Object[] isLhs = new Object[1];

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1431:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) ) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1431:4: ex1= expressionNoIn ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5094);
            ex1=expressionNoIn();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1432:2: ({...}? ( IN ex2= expression ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IN) ) {
                alt59=1;
            }
            else if ( (LA59_0==SEMIC) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1433:3: {...}? ( IN ex2= expression )
                    {
                    if ( !(( isLeftHandSideIn(ex1, isLhs) )) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1433:37: ( IN ex2= expression )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1434:4: IN ex2= expression
                    {
                    match(input,IN,FOLLOW_IN_in_forControlExpression5109); 
                    pushFollow(FOLLOW_expression_in_forControlExpression5113);
                    ex2=expression();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? )
                    {
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1438:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? )
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1439:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5134); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1439:13: (ex2= expression )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=NULL && LA57_0<=FALSE)||LA57_0==DELETE||LA57_0==FUNCTION||LA57_0==NEW||LA57_0==THIS||LA57_0==TYPEOF||LA57_0==VOID||LA57_0==LBRACE||LA57_0==LPAREN||LA57_0==LBRACK||(LA57_0>=ADD && LA57_0<=SUB)||(LA57_0>=INC && LA57_0<=DEC)||(LA57_0>=NOT && LA57_0<=INV)||(LA57_0>=Identifier && LA57_0<=StringLiteral)||LA57_0==RegularExpressionLiteral||(LA57_0>=DecimalLiteral && LA57_0<=HexIntegerLiteral)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1439:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5138);
                            ex2=expression();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5141); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1439:35: (ex3= expression )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==DELETE||LA58_0==FUNCTION||LA58_0==NEW||LA58_0==THIS||LA58_0==TYPEOF||LA58_0==VOID||LA58_0==LBRACE||LA58_0==LPAREN||LA58_0==LBRACK||(LA58_0>=ADD && LA58_0<=SUB)||(LA58_0>=INC && LA58_0<=DEC)||(LA58_0>=NOT && LA58_0<=INV)||(LA58_0>=Identifier && LA58_0<=StringLiteral)||LA58_0==RegularExpressionLiteral||(LA58_0>=DecimalLiteral && LA58_0<=HexIntegerLiteral)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1439:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5145);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1445:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? ;
    public final ES3YUITestParser.forControlSemic_return forControlSemic() throws RecognitionException {
        ES3YUITestParser.forControlSemic_return retval = new ES3YUITestParser.forControlSemic_return();
        retval.start = input.LT(1);

        ES3YUITestParser.expression_return ex1 = null;

        ES3YUITestParser.expression_return ex2 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1446:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1446:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5168); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1446:13: (ex1= expression )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=Identifier && LA60_0<=StringLiteral)||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1446:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5172);
                    ex1=expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5175); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1446:35: (ex2= expression )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||(LA61_0>=Identifier && LA61_0<=StringLiteral)||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1446:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5179);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1459:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final ES3YUITestParser.continueStatement_return continueStatement() throws RecognitionException {
        ES3YUITestParser.continueStatement_return retval = new ES3YUITestParser.continueStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1460:2: ( CONTINUE ( Identifier )? semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1460:4: CONTINUE ( Identifier )? semic
            {
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5200); 
             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1460:66: ( Identifier )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Identifier) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1460:66: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement5204); 

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement5207);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1472:1: breakStatement : BREAK ( Identifier )? semic ;
    public final ES3YUITestParser.breakStatement_return breakStatement() throws RecognitionException {
        ES3YUITestParser.breakStatement_return retval = new ES3YUITestParser.breakStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1473:2: ( BREAK ( Identifier )? semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1473:4: BREAK ( Identifier )? semic
            {
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement5225); 
             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1473:63: ( Identifier )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Identifier) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1473:63: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement5229); 

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement5232);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1493:1: returnStatement : RETURN ( expression )? semic ;
    public final ES3YUITestParser.returnStatement_return returnStatement() throws RecognitionException {
        ES3YUITestParser.returnStatement_return retval = new ES3YUITestParser.returnStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1494:2: ( RETURN ( expression )? semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1494:4: RETURN ( expression )? semic
            {
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement5250); 
             promoteEOL(null); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1494:33: ( expression )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||LA64_0==FUNCTION||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||(LA64_0>=Identifier && LA64_0<=StringLiteral)||LA64_0==RegularExpressionLiteral||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1494:33: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement5254);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement5257);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1501:1: withStatement : WITH LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\";
    public final ES3YUITestParser.withStatement_return withStatement() throws RecognitionException {
        ES3YUITestParser.withStatement_return retval = new ES3YUITestParser.withStatement_return();
        retval.start = input.LT(1);

        ES3YUITestParser.statement_return statement9 = null;


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1502:2: ( WITH LPAREN expression RPAREN statement -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\")
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1502:4: WITH LPAREN expression RPAREN statement
            {
            match(input,WITH,FOLLOW_WITH_in_withStatement5273); 
            match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5275); 
            pushFollow(FOLLOW_expression_in_withStatement5277);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5279); 
            pushFollow(FOLLOW_statement_in_withStatement5281);
            statement9=statement();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1503:2: -> template(pre=input.toString($start.getTokenIndex(), $statement.start.getTokenIndex() - 1)stmt=wrapInBraces($statement.start, $statement.stop, input)) \"<pre><stmt>\"
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1512:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE ;
    public final ES3YUITestParser.switchStatement_return switchStatement() throws RecognitionException {
        ES3YUITestParser.switchStatement_return retval = new ES3YUITestParser.switchStatement_return();
        retval.start = input.LT(1);


        	int defaultClauseCount = 0;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1517:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1517:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement5350); 
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement5352); 
            pushFollow(FOLLOW_expression_in_switchStatement5354);
            expression();

            state._fsp--;

            match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement5356); 
            match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement5358); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1517:43: ({...}? => defaultClause | caseClause )*
            loop65:
            do {
                int alt65=3;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==DEFAULT) && (( defaultClauseCount == 0 ))) {
                    alt65=1;
                }
                else if ( (LA65_0==CASE) ) {
                    alt65=2;
                }


                switch (alt65) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1517:45: {...}? => defaultClause
            	    {
            	    if ( !(( defaultClauseCount == 0 )) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement5365);
            	    defaultClause();

            	    state._fsp--;

            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1517:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement5371);
            	    caseClause();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement5376); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1521:1: caseClause : CASE expression COLON ( statement )* ;
    public final ES3YUITestParser.caseClause_return caseClause() throws RecognitionException {
        ES3YUITestParser.caseClause_return retval = new ES3YUITestParser.caseClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1522:2: ( CASE expression COLON ( statement )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1522:4: CASE expression COLON ( statement )*
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause5389); 
            pushFollow(FOLLOW_expression_in_caseClause5391);
            expression();

            state._fsp--;

            match(input,COLON,FOLLOW_COLON_in_caseClause5393); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1522:26: ( statement )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=NULL && LA66_0<=BREAK)||LA66_0==CONTINUE||(LA66_0>=DELETE && LA66_0<=DO)||(LA66_0>=FOR && LA66_0<=IF)||(LA66_0>=NEW && LA66_0<=WITH)||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||LA66_0==SEMIC||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||(LA66_0>=Identifier && LA66_0<=StringLiteral)||LA66_0==RegularExpressionLiteral||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1522:26: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause5395);
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
    // $ANTLR end "caseClause"

    public static class defaultClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "defaultClause"
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1525:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final ES3YUITestParser.defaultClause_return defaultClause() throws RecognitionException {
        ES3YUITestParser.defaultClause_return retval = new ES3YUITestParser.defaultClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1526:2: ( DEFAULT COLON ( statement )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1526:4: DEFAULT COLON ( statement )*
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause5408); 
            match(input,COLON,FOLLOW_COLON_in_defaultClause5410); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1526:18: ( statement )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=NULL && LA67_0<=BREAK)||LA67_0==CONTINUE||(LA67_0>=DELETE && LA67_0<=DO)||(LA67_0>=FOR && LA67_0<=IF)||(LA67_0>=NEW && LA67_0<=WITH)||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||LA67_0==SEMIC||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||(LA67_0>=Identifier && LA67_0<=StringLiteral)||LA67_0==RegularExpressionLiteral||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1526:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause5412);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1533:1: labelledStatement : Identifier COLON statement ;
    public final ES3YUITestParser.labelledStatement_return labelledStatement() throws RecognitionException {
        ES3YUITestParser.labelledStatement_return retval = new ES3YUITestParser.labelledStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1534:2: ( Identifier COLON statement )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1534:4: Identifier COLON statement
            {
            match(input,Identifier,FOLLOW_Identifier_in_labelledStatement5429); 
            match(input,COLON,FOLLOW_COLON_in_labelledStatement5431); 
            pushFollow(FOLLOW_statement_in_labelledStatement5433);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1557:1: throwStatement : THROW expression semic ;
    public final ES3YUITestParser.throwStatement_return throwStatement() throws RecognitionException {
        ES3YUITestParser.throwStatement_return retval = new ES3YUITestParser.throwStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1558:2: ( THROW expression semic )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1558:4: THROW expression semic
            {
            match(input,THROW,FOLLOW_THROW_in_throwStatement5453); 
             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement5457);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_semic_in_throwStatement5459);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1565:1: tryStatement : TRY block ( catchClause ( finallyClause )? | finallyClause ) ;
    public final ES3YUITestParser.tryStatement_return tryStatement() throws RecognitionException {
        ES3YUITestParser.tryStatement_return retval = new ES3YUITestParser.tryStatement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:2: ( TRY block ( catchClause ( finallyClause )? | finallyClause ) )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:4: TRY block ( catchClause ( finallyClause )? | finallyClause )
            {
            match(input,TRY,FOLLOW_TRY_in_tryStatement5475); 
            pushFollow(FOLLOW_block_in_tryStatement5477);
            block();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:14: ( catchClause ( finallyClause )? | finallyClause )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==CATCH) ) {
                alt69=1;
            }
            else if ( (LA69_0==FINALLY) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:16: catchClause ( finallyClause )?
                    {
                    pushFollow(FOLLOW_catchClause_in_tryStatement5481);
                    catchClause();

                    state._fsp--;

                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:28: ( finallyClause )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==FINALLY) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:28: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement5483);
                            finallyClause();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1566:45: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement5488);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1569:1: catchClause : CATCH LPAREN Identifier RPAREN block ;
    public final ES3YUITestParser.catchClause_return catchClause() throws RecognitionException {
        ES3YUITestParser.catchClause_return retval = new ES3YUITestParser.catchClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1570:2: ( CATCH LPAREN Identifier RPAREN block )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1570:4: CATCH LPAREN Identifier RPAREN block
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause5502); 
            match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5504); 
            match(input,Identifier,FOLLOW_Identifier_in_catchClause5506); 
            match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5508); 
            pushFollow(FOLLOW_block_in_catchClause5510);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1573:1: finallyClause : FINALLY block ;
    public final ES3YUITestParser.finallyClause_return finallyClause() throws RecognitionException {
        ES3YUITestParser.finallyClause_return retval = new ES3YUITestParser.finallyClause_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1574:2: ( FINALLY block )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1574:4: FINALLY block
            {
            match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause5522); 
            pushFollow(FOLLOW_block_in_finallyClause5524);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1588:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionDeclarationBody -> {instrument}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text);
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
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1610:2: ( FUNCTION name= Identifier formalParameterList functionDeclarationBody -> {instrument}? cover_line(src=$program::namecode=$textline=$start.getLine()) -> ignore(code=$text))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1610:4: FUNCTION name= Identifier formalParameterList functionDeclarationBody
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration5560); 
            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration5564); 
            ((functionDeclaration_scope)functionDeclaration_stack.peek()).funcName =(name!=null?name.getText():null);
            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration5568);
            formalParameterList();

            state._fsp--;

            pushFollow(FOLLOW_functionDeclarationBody_in_functionDeclaration5570);
            functionDeclarationBody();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1611:4: -> {instrument}? cover_line(src=$program::namecode=$textline=$start.getLine())
            if (instrument) {
                retval.st = templateLib.getInstanceOf("cover_line",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("line", ((Token)retval.start).getLine()));
            }
            else // 1612:4: -> ignore(code=$text)
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1615:1: functionExpression : FUNCTION ( Identifier )? formalParameterList functionExpressionBody ;
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
                ((functionExpression_scope)functionExpression_stack.peek()).funcName = input.LT(-2).getText().replace("\"", "\\\"").replace("'", "\\'");

                //TODO: Continue walking back in case the identifier is object.name
                //right now, I end up just with name.
            } else {
                ((functionExpression_scope)functionExpression_stack.peek()).funcName = "(anonymous " +  (++((program_scope)program_stack.peek()).anonymousFunctionCount) + ")";
            }


        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1654:2: ( FUNCTION ( Identifier )? formalParameterList functionExpressionBody )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1654:4: FUNCTION ( Identifier )? formalParameterList functionExpressionBody
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression5625); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1654:13: ( Identifier )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Identifier) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1654:13: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_functionExpression5627); 

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression5630);
            formalParameterList();

            state._fsp--;

            pushFollow(FOLLOW_functionExpressionBody_in_functionExpression5632);
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1657:1: formalParameterList : LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN ;
    public final ES3YUITestParser.formalParameterList_return formalParameterList() throws RecognitionException {
        ES3YUITestParser.formalParameterList_return retval = new ES3YUITestParser.formalParameterList_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1658:2: ( LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1658:4: LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList5643); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1658:11: ( Identifier ( COMMA Identifier )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Identifier) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1658:13: Identifier ( COMMA Identifier )*
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5647); 
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1658:24: ( COMMA Identifier )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==COMMA) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1658:26: COMMA Identifier
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_formalParameterList5651); 
                    	    match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5653); 

                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList5661); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1661:1: functionDeclarationBody : lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE ;
    public final ES3YUITestParser.functionDeclarationBody_return functionDeclarationBody() throws RecognitionException {
        ES3YUITestParser.functionDeclarationBody_return retval = new ES3YUITestParser.functionDeclarationBody_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1662:2: (lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1662:4: lb= LBRACE ( functionDeclarationBodyWithoutBraces )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionDeclarationBody5674); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1662:14: ( functionDeclarationBodyWithoutBraces )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=NULL && LA73_0<=BREAK)||LA73_0==CONTINUE||(LA73_0>=DELETE && LA73_0<=DO)||(LA73_0>=FOR && LA73_0<=IF)||(LA73_0>=NEW && LA73_0<=WITH)||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||LA73_0==SEMIC||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||(LA73_0>=Identifier && LA73_0<=StringLiteral)||LA73_0==RegularExpressionLiteral||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1662:14: functionDeclarationBodyWithoutBraces
                    {
                    pushFollow(FOLLOW_functionDeclarationBodyWithoutBraces_in_functionDeclarationBody5676);
                    functionDeclarationBodyWithoutBraces();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_functionDeclarationBody5679); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1665:1: functionExpressionBody : lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE ;
    public final ES3YUITestParser.functionExpressionBody_return functionExpressionBody() throws RecognitionException {
        ES3YUITestParser.functionExpressionBody_return retval = new ES3YUITestParser.functionExpressionBody_return();
        retval.start = input.LT(1);

        Token lb=null;

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1666:2: (lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1666:4: lb= LBRACE ( functionExpressionBodyWithoutBraces )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionExpressionBody5692); 
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1666:14: ( functionExpressionBodyWithoutBraces )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=NULL && LA74_0<=BREAK)||LA74_0==CONTINUE||(LA74_0>=DELETE && LA74_0<=DO)||(LA74_0>=FOR && LA74_0<=IF)||(LA74_0>=NEW && LA74_0<=WITH)||LA74_0==LBRACE||LA74_0==LPAREN||LA74_0==LBRACK||LA74_0==SEMIC||(LA74_0>=ADD && LA74_0<=SUB)||(LA74_0>=INC && LA74_0<=DEC)||(LA74_0>=NOT && LA74_0<=INV)||(LA74_0>=Identifier && LA74_0<=StringLiteral)||LA74_0==RegularExpressionLiteral||(LA74_0>=DecimalLiteral && LA74_0<=HexIntegerLiteral)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1666:14: functionExpressionBodyWithoutBraces
                    {
                    pushFollow(FOLLOW_functionExpressionBodyWithoutBraces_in_functionExpressionBody5694);
                    functionExpressionBodyWithoutBraces();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_functionExpressionBody5697); 

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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1670:1: functionExpressionBodyWithoutBraces : sourceElement ( sourceElement )* -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textname=escapeQuotes($functionExpression::funcName)line=$functionExpression::funcLine) -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine);
    public final ES3YUITestParser.functionExpressionBodyWithoutBraces_return functionExpressionBodyWithoutBraces() throws RecognitionException {
        ES3YUITestParser.functionExpressionBodyWithoutBraces_return retval = new ES3YUITestParser.functionExpressionBodyWithoutBraces_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1681:2: ( sourceElement ( sourceElement )* -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textname=escapeQuotes($functionExpression::funcName)line=$functionExpression::funcLine) -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1681:4: sourceElement ( sourceElement )*
            {
            pushFollow(FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5714);
            sourceElement();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1681:18: ( sourceElement )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=NULL && LA75_0<=BREAK)||LA75_0==CONTINUE||(LA75_0>=DELETE && LA75_0<=DO)||(LA75_0>=FOR && LA75_0<=IF)||(LA75_0>=NEW && LA75_0<=WITH)||LA75_0==LBRACE||LA75_0==LPAREN||LA75_0==LBRACK||LA75_0==SEMIC||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)||(LA75_0>=Identifier && LA75_0<=StringLiteral)||LA75_0==RegularExpressionLiteral||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1681:18: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5716);
            	    sourceElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            	
            	


            // TEMPLATE REWRITE
            // 1685:2: -> {$functionExpression::funcName!=null}? cover_func(src=$program::namecode=$textname=escapeQuotes($functionExpression::funcName)line=$functionExpression::funcLine)
            if (((functionExpression_scope)functionExpression_stack.peek()).funcName!=null) {
                retval.st = templateLib.getInstanceOf("cover_func",
              new STAttrMap().put("src", ((program_scope)program_stack.peek()).name).put("code", input.toString(retval.start,input.LT(-1))).put("name", escapeQuotes(((functionExpression_scope)functionExpression_stack.peek()).funcName)).put("line", ((functionExpression_scope)functionExpression_stack.peek()).funcLine));
            }
            else // 1686:2: -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine)
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1689:1: functionDeclarationBodyWithoutBraces : sourceElement ( sourceElement )* -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine);
    public final ES3YUITestParser.functionDeclarationBodyWithoutBraces_return functionDeclarationBodyWithoutBraces() throws RecognitionException {
        ES3YUITestParser.functionDeclarationBodyWithoutBraces_return retval = new ES3YUITestParser.functionDeclarationBodyWithoutBraces_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1690:2: ( sourceElement ( sourceElement )* -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1690:4: sourceElement ( sourceElement )*
            {
            pushFollow(FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5783);
            sourceElement();

            state._fsp--;

            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1690:18: ( sourceElement )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=NULL && LA76_0<=BREAK)||LA76_0==CONTINUE||(LA76_0>=DELETE && LA76_0<=DO)||(LA76_0>=FOR && LA76_0<=IF)||(LA76_0>=NEW && LA76_0<=WITH)||LA76_0==LBRACE||LA76_0==LPAREN||LA76_0==LBRACK||LA76_0==SEMIC||(LA76_0>=ADD && LA76_0<=SUB)||(LA76_0>=INC && LA76_0<=DEC)||(LA76_0>=NOT && LA76_0<=INV)||(LA76_0>=Identifier && LA76_0<=StringLiteral)||LA76_0==RegularExpressionLiteral||(LA76_0>=DecimalLiteral && LA76_0<=HexIntegerLiteral)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1690:18: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5785);
            	    sourceElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 1691:2: -> cover_func(src=$program::namecode=$textname=$functionDeclaration::funcNameline=$functionDeclaration::funcLine)
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1698:1: program : ( ( sourceElement )* ) -> cover_file(src=$program::namecode=$textlines=$program::executableLinesfuncs=$program::functions);
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
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1713:2: ( ( ( sourceElement )* ) -> cover_file(src=$program::namecode=$textlines=$program::executableLinesfuncs=$program::functions))
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1713:4: ( ( sourceElement )* )
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1713:4: ( ( sourceElement )* )
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1713:5: ( sourceElement )*
            {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1713:5: ( sourceElement )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=NULL && LA77_0<=BREAK)||LA77_0==CONTINUE||(LA77_0>=DELETE && LA77_0<=DO)||(LA77_0>=FOR && LA77_0<=IF)||(LA77_0>=NEW && LA77_0<=WITH)||LA77_0==LBRACE||LA77_0==LPAREN||LA77_0==LBRACK||LA77_0==SEMIC||(LA77_0>=ADD && LA77_0<=SUB)||(LA77_0>=INC && LA77_0<=DEC)||(LA77_0>=NOT && LA77_0<=INV)||(LA77_0>=Identifier && LA77_0<=StringLiteral)||LA77_0==RegularExpressionLiteral||(LA77_0>=DecimalLiteral && LA77_0<=HexIntegerLiteral)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1713:5: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program5837);
            	    sourceElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

            java.util.Collections.sort(((program_scope)program_stack.peek()).executableLines);


            // TEMPLATE REWRITE
            // 1714:2: -> cover_file(src=$program::namecode=$textlines=$program::executableLinesfuncs=$program::functions)
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
    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1722:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final ES3YUITestParser.sourceElement_return sourceElement() throws RecognitionException {
        ES3YUITestParser.sourceElement_return retval = new ES3YUITestParser.sourceElement_return();
        retval.start = input.LT(1);

        try {
            // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1727:2: ({...}? functionDeclaration | statement )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1727:4: {...}? functionDeclaration
                    {
                    if ( !(( input.LA(1) == FUNCTION )) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement5898);
                    functionDeclaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\nzakas\\My Documents\\Projects\\yui\\yuitest\\java\\src\\com\\yahoo\\platform\\yuitest\\coverage\\grammar\\ES3YUITest.g:1728:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_sourceElement5903);
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


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA44_eotS =
        "\44\uffff";
    static final String DFA44_eofS =
        "\44\uffff";
    static final String DFA44_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA44_maxS =
        "\1\u00a1\1\0\42\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA44_transitionS = {
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
            return "1245:4: ({...}? block | statementTail )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( ((statement_scope)statement_stack.peek()).isBlock = input.LA(1) == LBRACE )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\17\uffff";
    static final String DFA45_eofS =
        "\4\uffff\1\3\12\uffff";
    static final String DFA45_minS =
        "\1\4\3\uffff\1\23\12\uffff";
    static final String DFA45_maxS =
        "\1\u00a1\3\uffff\1\u0092\12\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\15\1\12";
    static final String DFA45_specialS =
        "\17\uffff}>";
    static final String[] DFA45_transitionS = {
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1250:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );";
        }
    }
    static final String DFA78_eotS =
        "\44\uffff";
    static final String DFA78_eofS =
        "\44\uffff";
    static final String DFA78_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA78_maxS =
        "\1\u00a1\1\0\42\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA78_transitionS = {
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "1722:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == FUNCTION )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
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
    public static final BitSet FOLLOW_NEW_in_newExpression3339 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_functionExpression_in_newExpression3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3357 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000EL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_arguments3365 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3394 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3407 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3416 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3420 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression3429 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression3506 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3583 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3587 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3601 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression3623 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3652 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_shiftExpression3656 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3670 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3689 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalExpression3693 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3719 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3733 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn3737 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3759 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3778 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpression3782 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3800 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3814 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn3818 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3836 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3856 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression3860 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3862 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3876 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn3880 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3882 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3898 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression3902 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression3904 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3920 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn3924 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn3926 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3941 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression3945 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression3947 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3962 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn3966 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn3968 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression3987 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression3991 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression3993 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4007 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4011 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4013 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4028 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4032 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4034 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4049 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4053 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4055 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4074 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4078 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4082 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4098 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4102 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4104 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4106 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4136 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4143 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4222 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4229 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4253 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expression4257 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn4285 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEMIC_in_semic4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block4514 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_block4516 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_RBRACE_in_block4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement4537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4539 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement4543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4545 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_variableStatement4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration4563 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration4567 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn4584 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn4588 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement4627 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement4647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement4649 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_ifStatement4651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement4653 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_ifStatement4655 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStatement4733 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_elseStatement4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement4794 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_doStatement4796 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement4798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement4800 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_doStatement4802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement4804 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_doStatement4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement4894 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_whileStatement4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement4898 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_whileStatement4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement4961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement4963 = new BitSet(new long[]{0x8000000039221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_forControl_in_forStatement4965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement4967 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_forStatement4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar5007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5009 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_IN_in_forControlVar5021 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5048 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5053 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5060 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5094 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5109 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5134 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5141 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5168 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5175 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement5200 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000160000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement5204 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_continueStatement5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement5225 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000160000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement5229 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_breakStatement5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement5250 = new BitSet(new long[]{0x8000000029221070L,0x00000000303300CBL,0x0000000388360000L});
    public static final BitSet FOLLOW_expression_in_returnStatement5254 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_returnStatement5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement5273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement5275 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_withStatement5277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement5279 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_withStatement5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement5350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement5352 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_switchStatement5354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement5356 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement5358 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement5365 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement5371 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause5389 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_caseClause5391 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause5393 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_caseClause5395 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause5408 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause5410 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_defaultClause5412 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement5429 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement5431 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement5453 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_throwStatement5457 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000060000L});
    public static final BitSet FOLLOW_semic_in_throwStatement5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement5475 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_tryStatement5477 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement5481 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause5502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause5504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause5506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause5508 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause5522 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_finallyClause5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration5564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration5568 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionDeclarationBody_in_functionDeclaration5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression5625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression5627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression5630 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionExpressionBody_in_functionExpression5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList5651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionDeclarationBody5674 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionDeclarationBodyWithoutBraces_in_functionDeclarationBody5676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_functionDeclarationBody5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionExpressionBody5692 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionExpressionBodyWithoutBraces_in_functionExpressionBody5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_functionExpressionBody5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5714 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionExpressionBodyWithoutBraces5716 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5783 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionDeclarationBodyWithoutBraces5785 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_program5837 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement5903 = new BitSet(new long[]{0x0000000000000002L});

}