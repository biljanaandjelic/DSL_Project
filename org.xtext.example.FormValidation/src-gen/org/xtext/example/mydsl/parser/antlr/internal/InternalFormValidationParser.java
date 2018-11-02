package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.FormValidationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormValidationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'type'", "'isRequired'", "'Required'", "'isEmail'", "'Email'", "'MinLength'", "'MaxLength'", "'Length'", "'MinNumber'", "'MinDate'", "'MaxNumber'", "'MaxDate'", "'AcceptableValuesString'", "','", "'AcceptableValuesDate'", "'StringPattern'", "'DatePattern'", "'.'", "'NotEquals'", "'attributearray'", "'GreaterThan'", "'classattribute'", "'Equals'", "'LessThan'", "'('", "')'", "'String'", "'Number'", "'Date'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFormValidationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormValidationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormValidationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFormValidation.g"; }



     	private FormValidationGrammarAccess grammarAccess;

        public InternalFormValidationParser(TokenStream input, FormValidationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ValidationClass";
       	}

       	@Override
       	protected FormValidationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleValidationClass"
    // InternalFormValidation.g:65:1: entryRuleValidationClass returns [EObject current=null] : iv_ruleValidationClass= ruleValidationClass EOF ;
    public final EObject entryRuleValidationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationClass = null;


        try {
            // InternalFormValidation.g:65:56: (iv_ruleValidationClass= ruleValidationClass EOF )
            // InternalFormValidation.g:66:2: iv_ruleValidationClass= ruleValidationClass EOF
            {
             newCompositeNode(grammarAccess.getValidationClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidationClass=ruleValidationClass();

            state._fsp--;

             current =iv_ruleValidationClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidationClass"


    // $ANTLR start "ruleValidationClass"
    // InternalFormValidation.g:72:1: ruleValidationClass returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleValidationClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_classattribute_3_0 = null;

        EObject lv_classattribute_4_0 = null;

        EObject lv_classrule_5_0 = null;

        EObject lv_classrule_6_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:78:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )* )? otherlv_7= '}' ) )
            // InternalFormValidation.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )* )? otherlv_7= '}' )
            {
            // InternalFormValidation.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )* )? otherlv_7= '}' )
            // InternalFormValidation.g:80:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )* )? otherlv_7= '}'
            {
            // InternalFormValidation.g:80:3: ()
            // InternalFormValidation.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValidationClassAccess().getValidationClassAction_0(),
            					current);
            			

            }

            // InternalFormValidation.g:87:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFormValidation.g:88:4: (lv_name_1_0= ruleEString )
            {
            // InternalFormValidation.g:88:4: (lv_name_1_0= ruleEString )
            // InternalFormValidation.g:89:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValidationClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.FormValidation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getValidationClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValidation.g:110:3: ( ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFormValidation.g:111:4: ( (lv_classattribute_3_0= ruleClassAttribute ) ) ( (lv_classattribute_4_0= ruleClassAttribute ) )*
                    {
                    // InternalFormValidation.g:111:4: ( (lv_classattribute_3_0= ruleClassAttribute ) )
                    // InternalFormValidation.g:112:5: (lv_classattribute_3_0= ruleClassAttribute )
                    {
                    // InternalFormValidation.g:112:5: (lv_classattribute_3_0= ruleClassAttribute )
                    // InternalFormValidation.g:113:6: lv_classattribute_3_0= ruleClassAttribute
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_classattribute_3_0=ruleClassAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						add(
                    							current,
                    							"classattribute",
                    							lv_classattribute_3_0,
                    							"org.xtext.example.mydsl.FormValidation.ClassAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:130:4: ( (lv_classattribute_4_0= ruleClassAttribute ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFormValidation.g:131:5: (lv_classattribute_4_0= ruleClassAttribute )
                    	    {
                    	    // InternalFormValidation.g:131:5: (lv_classattribute_4_0= ruleClassAttribute )
                    	    // InternalFormValidation.g:132:6: lv_classattribute_4_0= ruleClassAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_classattribute_4_0=ruleClassAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"classattribute",
                    	    							lv_classattribute_4_0,
                    	    							"org.xtext.example.mydsl.FormValidation.ClassAttribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValidation.g:150:3: ( ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31||LA4_0==33||(LA4_0>=35 && LA4_0<=36)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFormValidation.g:151:4: ( (lv_classrule_5_0= ruleClassRule ) ) ( (lv_classrule_6_0= ruleClassRule ) )*
                    {
                    // InternalFormValidation.g:151:4: ( (lv_classrule_5_0= ruleClassRule ) )
                    // InternalFormValidation.g:152:5: (lv_classrule_5_0= ruleClassRule )
                    {
                    // InternalFormValidation.g:152:5: (lv_classrule_5_0= ruleClassRule )
                    // InternalFormValidation.g:153:6: lv_classrule_5_0= ruleClassRule
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_classrule_5_0=ruleClassRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						add(
                    							current,
                    							"classrule",
                    							lv_classrule_5_0,
                    							"org.xtext.example.mydsl.FormValidation.ClassRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:170:4: ( (lv_classrule_6_0= ruleClassRule ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==31||LA3_0==33||(LA3_0>=35 && LA3_0<=36)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFormValidation.g:171:5: (lv_classrule_6_0= ruleClassRule )
                    	    {
                    	    // InternalFormValidation.g:171:5: (lv_classrule_6_0= ruleClassRule )
                    	    // InternalFormValidation.g:172:6: lv_classrule_6_0= ruleClassRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_classrule_6_0=ruleClassRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"classrule",
                    	    							lv_classrule_6_0,
                    	    							"org.xtext.example.mydsl.FormValidation.ClassRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getValidationClassAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationClass"


    // $ANTLR start "entryRuleClassRule"
    // InternalFormValidation.g:198:1: entryRuleClassRule returns [EObject current=null] : iv_ruleClassRule= ruleClassRule EOF ;
    public final EObject entryRuleClassRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRule = null;


        try {
            // InternalFormValidation.g:198:50: (iv_ruleClassRule= ruleClassRule EOF )
            // InternalFormValidation.g:199:2: iv_ruleClassRule= ruleClassRule EOF
            {
             newCompositeNode(grammarAccess.getClassRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassRule=ruleClassRule();

            state._fsp--;

             current =iv_ruleClassRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassRule"


    // $ANTLR start "ruleClassRule"
    // InternalFormValidation.g:205:1: ruleClassRule returns [EObject current=null] : (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan ) ;
    public final EObject ruleClassRule() throws RecognitionException {
        EObject current = null;

        EObject this_NotEquals_0 = null;

        EObject this_GreaterThan_1 = null;

        EObject this_Equals_2 = null;

        EObject this_LessThan_3 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:211:2: ( (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan ) )
            // InternalFormValidation.g:212:2: (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan )
            {
            // InternalFormValidation.g:212:2: (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 36:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFormValidation.g:213:3: this_NotEquals_0= ruleNotEquals
                    {

                    			newCompositeNode(grammarAccess.getClassRuleAccess().getNotEqualsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotEquals_0=ruleNotEquals();

                    state._fsp--;


                    			current = this_NotEquals_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:222:3: this_GreaterThan_1= ruleGreaterThan
                    {

                    			newCompositeNode(grammarAccess.getClassRuleAccess().getGreaterThanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreaterThan_1=ruleGreaterThan();

                    state._fsp--;


                    			current = this_GreaterThan_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFormValidation.g:231:3: this_Equals_2= ruleEquals
                    {

                    			newCompositeNode(grammarAccess.getClassRuleAccess().getEqualsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equals_2=ruleEquals();

                    state._fsp--;


                    			current = this_Equals_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFormValidation.g:240:3: this_LessThan_3= ruleLessThan
                    {

                    			newCompositeNode(grammarAccess.getClassRuleAccess().getLessThanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LessThan_3=ruleLessThan();

                    state._fsp--;


                    			current = this_LessThan_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassRule"


    // $ANTLR start "entryRuleAttributeRule"
    // InternalFormValidation.g:252:1: entryRuleAttributeRule returns [EObject current=null] : iv_ruleAttributeRule= ruleAttributeRule EOF ;
    public final EObject entryRuleAttributeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRule = null;


        try {
            // InternalFormValidation.g:252:54: (iv_ruleAttributeRule= ruleAttributeRule EOF )
            // InternalFormValidation.g:253:2: iv_ruleAttributeRule= ruleAttributeRule EOF
            {
             newCompositeNode(grammarAccess.getAttributeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeRule=ruleAttributeRule();

            state._fsp--;

             current =iv_ruleAttributeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeRule"


    // $ANTLR start "ruleAttributeRule"
    // InternalFormValidation.g:259:1: ruleAttributeRule returns [EObject current=null] : (this_Required_0= ruleRequired | this_Email_1= ruleEmail | this_MinLength_2= ruleMinLength | this_MaxLength_3= ruleMaxLength | this_Length_4= ruleLength | this_MinNumber_5= ruleMinNumber | this_MinDate_6= ruleMinDate | this_MaxNumber_7= ruleMaxNumber | this_MaxDate_8= ruleMaxDate | this_AcceptableValuesString_9= ruleAcceptableValuesString | this_AcceptableValuesDate_10= ruleAcceptableValuesDate | this_StringPattern_11= ruleStringPattern | this_DatePattern_12= ruleDatePattern ) ;
    public final EObject ruleAttributeRule() throws RecognitionException {
        EObject current = null;

        EObject this_Required_0 = null;

        EObject this_Email_1 = null;

        EObject this_MinLength_2 = null;

        EObject this_MaxLength_3 = null;

        EObject this_Length_4 = null;

        EObject this_MinNumber_5 = null;

        EObject this_MinDate_6 = null;

        EObject this_MaxNumber_7 = null;

        EObject this_MaxDate_8 = null;

        EObject this_AcceptableValuesString_9 = null;

        EObject this_AcceptableValuesDate_10 = null;

        EObject this_StringPattern_11 = null;

        EObject this_DatePattern_12 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:265:2: ( (this_Required_0= ruleRequired | this_Email_1= ruleEmail | this_MinLength_2= ruleMinLength | this_MaxLength_3= ruleMaxLength | this_Length_4= ruleLength | this_MinNumber_5= ruleMinNumber | this_MinDate_6= ruleMinDate | this_MaxNumber_7= ruleMaxNumber | this_MaxDate_8= ruleMaxDate | this_AcceptableValuesString_9= ruleAcceptableValuesString | this_AcceptableValuesDate_10= ruleAcceptableValuesDate | this_StringPattern_11= ruleStringPattern | this_DatePattern_12= ruleDatePattern ) )
            // InternalFormValidation.g:266:2: (this_Required_0= ruleRequired | this_Email_1= ruleEmail | this_MinLength_2= ruleMinLength | this_MaxLength_3= ruleMaxLength | this_Length_4= ruleLength | this_MinNumber_5= ruleMinNumber | this_MinDate_6= ruleMinDate | this_MaxNumber_7= ruleMaxNumber | this_MaxDate_8= ruleMaxDate | this_AcceptableValuesString_9= ruleAcceptableValuesString | this_AcceptableValuesDate_10= ruleAcceptableValuesDate | this_StringPattern_11= ruleStringPattern | this_DatePattern_12= ruleDatePattern )
            {
            // InternalFormValidation.g:266:2: (this_Required_0= ruleRequired | this_Email_1= ruleEmail | this_MinLength_2= ruleMinLength | this_MaxLength_3= ruleMaxLength | this_Length_4= ruleLength | this_MinNumber_5= ruleMinNumber | this_MinDate_6= ruleMinDate | this_MaxNumber_7= ruleMaxNumber | this_MaxDate_8= ruleMaxDate | this_AcceptableValuesString_9= ruleAcceptableValuesString | this_AcceptableValuesDate_10= ruleAcceptableValuesDate | this_StringPattern_11= ruleStringPattern | this_DatePattern_12= ruleDatePattern )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
                {
                alt6=6;
                }
                break;
            case 22:
                {
                alt6=7;
                }
                break;
            case 23:
                {
                alt6=8;
                }
                break;
            case 24:
                {
                alt6=9;
                }
                break;
            case 25:
                {
                alt6=10;
                }
                break;
            case 27:
                {
                alt6=11;
                }
                break;
            case 28:
                {
                alt6=12;
                }
                break;
            case 29:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFormValidation.g:267:3: this_Required_0= ruleRequired
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getRequiredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Required_0=ruleRequired();

                    state._fsp--;


                    			current = this_Required_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:276:3: this_Email_1= ruleEmail
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getEmailParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Email_1=ruleEmail();

                    state._fsp--;


                    			current = this_Email_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFormValidation.g:285:3: this_MinLength_2= ruleMinLength
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMinLengthParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinLength_2=ruleMinLength();

                    state._fsp--;


                    			current = this_MinLength_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFormValidation.g:294:3: this_MaxLength_3= ruleMaxLength
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMaxLengthParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxLength_3=ruleMaxLength();

                    state._fsp--;


                    			current = this_MaxLength_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFormValidation.g:303:3: this_Length_4= ruleLength
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getLengthParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Length_4=ruleLength();

                    state._fsp--;


                    			current = this_Length_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFormValidation.g:312:3: this_MinNumber_5= ruleMinNumber
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMinNumberParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinNumber_5=ruleMinNumber();

                    state._fsp--;


                    			current = this_MinNumber_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFormValidation.g:321:3: this_MinDate_6= ruleMinDate
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMinDateParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinDate_6=ruleMinDate();

                    state._fsp--;


                    			current = this_MinDate_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFormValidation.g:330:3: this_MaxNumber_7= ruleMaxNumber
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMaxNumberParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxNumber_7=ruleMaxNumber();

                    state._fsp--;


                    			current = this_MaxNumber_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFormValidation.g:339:3: this_MaxDate_8= ruleMaxDate
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMaxDateParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxDate_8=ruleMaxDate();

                    state._fsp--;


                    			current = this_MaxDate_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFormValidation.g:348:3: this_AcceptableValuesString_9= ruleAcceptableValuesString
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getAcceptableValuesStringParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptableValuesString_9=ruleAcceptableValuesString();

                    state._fsp--;


                    			current = this_AcceptableValuesString_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalFormValidation.g:357:3: this_AcceptableValuesDate_10= ruleAcceptableValuesDate
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getAcceptableValuesDateParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptableValuesDate_10=ruleAcceptableValuesDate();

                    state._fsp--;


                    			current = this_AcceptableValuesDate_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalFormValidation.g:366:3: this_StringPattern_11= ruleStringPattern
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getStringPatternParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringPattern_11=ruleStringPattern();

                    state._fsp--;


                    			current = this_StringPattern_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalFormValidation.g:375:3: this_DatePattern_12= ruleDatePattern
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getDatePatternParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatePattern_12=ruleDatePattern();

                    state._fsp--;


                    			current = this_DatePattern_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeRule"


    // $ANTLR start "entryRuleEString"
    // InternalFormValidation.g:387:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFormValidation.g:387:47: (iv_ruleEString= ruleEString EOF )
            // InternalFormValidation.g:388:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFormValidation.g:394:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFormValidation.g:400:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFormValidation.g:401:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFormValidation.g:401:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalFormValidation.g:402:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:410:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleClassAttribute"
    // InternalFormValidation.g:421:1: entryRuleClassAttribute returns [EObject current=null] : iv_ruleClassAttribute= ruleClassAttribute EOF ;
    public final EObject entryRuleClassAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAttribute = null;


        try {
            // InternalFormValidation.g:421:55: (iv_ruleClassAttribute= ruleClassAttribute EOF )
            // InternalFormValidation.g:422:2: iv_ruleClassAttribute= ruleClassAttribute EOF
            {
             newCompositeNode(grammarAccess.getClassAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassAttribute=ruleClassAttribute();

            state._fsp--;

             current =iv_ruleClassAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassAttribute"


    // $ANTLR start "ruleClassAttribute"
    // InternalFormValidation.g:428:1: ruleClassAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_attributetype_3_0= ruleAttributeType ) ) ( ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleClassAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_attributetype_3_0 = null;

        EObject lv_attributerule_4_0 = null;

        EObject lv_attributerule_5_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:434:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_attributetype_3_0= ruleAttributeType ) ) ( ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )* )? otherlv_6= '}' ) )
            // InternalFormValidation.g:435:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_attributetype_3_0= ruleAttributeType ) ) ( ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )* )? otherlv_6= '}' )
            {
            // InternalFormValidation.g:435:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_attributetype_3_0= ruleAttributeType ) ) ( ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )* )? otherlv_6= '}' )
            // InternalFormValidation.g:436:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_attributetype_3_0= ruleAttributeType ) ) ( ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )* )? otherlv_6= '}'
            {
            // InternalFormValidation.g:436:3: ( (lv_name_0_0= ruleEString ) )
            // InternalFormValidation.g:437:4: (lv_name_0_0= ruleEString )
            {
            // InternalFormValidation.g:437:4: (lv_name_0_0= ruleEString )
            // InternalFormValidation.g:438:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.FormValidation.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getClassAttributeAccess().getTypeKeyword_2());
            		
            // InternalFormValidation.g:463:3: ( (lv_attributetype_3_0= ruleAttributeType ) )
            // InternalFormValidation.g:464:4: (lv_attributetype_3_0= ruleAttributeType )
            {
            // InternalFormValidation.g:464:4: (lv_attributetype_3_0= ruleAttributeType )
            // InternalFormValidation.g:465:5: lv_attributetype_3_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getClassAttributeAccess().getAttributetypeAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_attributetype_3_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassAttributeRule());
            					}
            					set(
            						current,
            						"attributetype",
            						lv_attributetype_3_0,
            						"org.xtext.example.mydsl.FormValidation.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormValidation.g:482:3: ( ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=25)||(LA9_0>=27 && LA9_0<=29)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFormValidation.g:483:4: ( (lv_attributerule_4_0= ruleAttributeRule ) ) ( (lv_attributerule_5_0= ruleAttributeRule ) )*
                    {
                    // InternalFormValidation.g:483:4: ( (lv_attributerule_4_0= ruleAttributeRule ) )
                    // InternalFormValidation.g:484:5: (lv_attributerule_4_0= ruleAttributeRule )
                    {
                    // InternalFormValidation.g:484:5: (lv_attributerule_4_0= ruleAttributeRule )
                    // InternalFormValidation.g:485:6: lv_attributerule_4_0= ruleAttributeRule
                    {

                    						newCompositeNode(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_attributerule_4_0=ruleAttributeRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassAttributeRule());
                    						}
                    						add(
                    							current,
                    							"attributerule",
                    							lv_attributerule_4_0,
                    							"org.xtext.example.mydsl.FormValidation.AttributeRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:502:4: ( (lv_attributerule_5_0= ruleAttributeRule ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=14 && LA8_0<=25)||(LA8_0>=27 && LA8_0<=29)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalFormValidation.g:503:5: (lv_attributerule_5_0= ruleAttributeRule )
                    	    {
                    	    // InternalFormValidation.g:503:5: (lv_attributerule_5_0= ruleAttributeRule )
                    	    // InternalFormValidation.g:504:6: lv_attributerule_5_0= ruleAttributeRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributerule_5_0=ruleAttributeRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassAttributeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributerule",
                    	    							lv_attributerule_5_0,
                    	    							"org.xtext.example.mydsl.FormValidation.AttributeRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClassAttributeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalFormValidation.g:530:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalFormValidation.g:530:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalFormValidation.g:531:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalFormValidation.g:537:1: ruleAttributeType returns [EObject current=null] : ( () ( (lv_vrsta_1_0= ruleEVrsta ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_vrsta_1_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:543:2: ( ( () ( (lv_vrsta_1_0= ruleEVrsta ) ) ) )
            // InternalFormValidation.g:544:2: ( () ( (lv_vrsta_1_0= ruleEVrsta ) ) )
            {
            // InternalFormValidation.g:544:2: ( () ( (lv_vrsta_1_0= ruleEVrsta ) ) )
            // InternalFormValidation.g:545:3: () ( (lv_vrsta_1_0= ruleEVrsta ) )
            {
            // InternalFormValidation.g:545:3: ()
            // InternalFormValidation.g:546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_0(),
            					current);
            			

            }

            // InternalFormValidation.g:552:3: ( (lv_vrsta_1_0= ruleEVrsta ) )
            // InternalFormValidation.g:553:4: (lv_vrsta_1_0= ruleEVrsta )
            {
            // InternalFormValidation.g:553:4: (lv_vrsta_1_0= ruleEVrsta )
            // InternalFormValidation.g:554:5: lv_vrsta_1_0= ruleEVrsta
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getVrstaEVrstaEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_vrsta_1_0=ruleEVrsta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"vrsta",
            						lv_vrsta_1_0,
            						"org.xtext.example.mydsl.FormValidation.EVrsta");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleRequired"
    // InternalFormValidation.g:575:1: entryRuleRequired returns [EObject current=null] : iv_ruleRequired= ruleRequired EOF ;
    public final EObject entryRuleRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequired = null;


        try {
            // InternalFormValidation.g:575:49: (iv_ruleRequired= ruleRequired EOF )
            // InternalFormValidation.g:576:2: iv_ruleRequired= ruleRequired EOF
            {
             newCompositeNode(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequired=ruleRequired();

            state._fsp--;

             current =iv_ruleRequired; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // InternalFormValidation.g:582:1: ruleRequired returns [EObject current=null] : ( () ( (lv_isRequired_1_0= 'isRequired' ) )? otherlv_2= 'Required' ) ;
    public final EObject ruleRequired() throws RecognitionException {
        EObject current = null;

        Token lv_isRequired_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFormValidation.g:588:2: ( ( () ( (lv_isRequired_1_0= 'isRequired' ) )? otherlv_2= 'Required' ) )
            // InternalFormValidation.g:589:2: ( () ( (lv_isRequired_1_0= 'isRequired' ) )? otherlv_2= 'Required' )
            {
            // InternalFormValidation.g:589:2: ( () ( (lv_isRequired_1_0= 'isRequired' ) )? otherlv_2= 'Required' )
            // InternalFormValidation.g:590:3: () ( (lv_isRequired_1_0= 'isRequired' ) )? otherlv_2= 'Required'
            {
            // InternalFormValidation.g:590:3: ()
            // InternalFormValidation.g:591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredAccess().getRequiredAction_0(),
            					current);
            			

            }

            // InternalFormValidation.g:597:3: ( (lv_isRequired_1_0= 'isRequired' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFormValidation.g:598:4: (lv_isRequired_1_0= 'isRequired' )
                    {
                    // InternalFormValidation.g:598:4: (lv_isRequired_1_0= 'isRequired' )
                    // InternalFormValidation.g:599:5: lv_isRequired_1_0= 'isRequired'
                    {
                    lv_isRequired_1_0=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(lv_isRequired_1_0, grammarAccess.getRequiredAccess().getIsRequiredIsRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRequiredRule());
                    					}
                    					setWithLastConsumed(current, "isRequired", true, "isRequired");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRequiredAccess().getRequiredKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleEmail"
    // InternalFormValidation.g:619:1: entryRuleEmail returns [EObject current=null] : iv_ruleEmail= ruleEmail EOF ;
    public final EObject entryRuleEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmail = null;


        try {
            // InternalFormValidation.g:619:46: (iv_ruleEmail= ruleEmail EOF )
            // InternalFormValidation.g:620:2: iv_ruleEmail= ruleEmail EOF
            {
             newCompositeNode(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmail=ruleEmail();

            state._fsp--;

             current =iv_ruleEmail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmail"


    // $ANTLR start "ruleEmail"
    // InternalFormValidation.g:626:1: ruleEmail returns [EObject current=null] : ( () ( (lv_isEmail_1_0= 'isEmail' ) )? otherlv_2= 'Email' ) ;
    public final EObject ruleEmail() throws RecognitionException {
        EObject current = null;

        Token lv_isEmail_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFormValidation.g:632:2: ( ( () ( (lv_isEmail_1_0= 'isEmail' ) )? otherlv_2= 'Email' ) )
            // InternalFormValidation.g:633:2: ( () ( (lv_isEmail_1_0= 'isEmail' ) )? otherlv_2= 'Email' )
            {
            // InternalFormValidation.g:633:2: ( () ( (lv_isEmail_1_0= 'isEmail' ) )? otherlv_2= 'Email' )
            // InternalFormValidation.g:634:3: () ( (lv_isEmail_1_0= 'isEmail' ) )? otherlv_2= 'Email'
            {
            // InternalFormValidation.g:634:3: ()
            // InternalFormValidation.g:635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmailAccess().getEmailAction_0(),
            					current);
            			

            }

            // InternalFormValidation.g:641:3: ( (lv_isEmail_1_0= 'isEmail' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFormValidation.g:642:4: (lv_isEmail_1_0= 'isEmail' )
                    {
                    // InternalFormValidation.g:642:4: (lv_isEmail_1_0= 'isEmail' )
                    // InternalFormValidation.g:643:5: lv_isEmail_1_0= 'isEmail'
                    {
                    lv_isEmail_1_0=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(lv_isEmail_1_0, grammarAccess.getEmailAccess().getIsEmailIsEmailKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEmailRule());
                    					}
                    					setWithLastConsumed(current, "isEmail", true, "isEmail");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmailAccess().getEmailKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmail"


    // $ANTLR start "entryRuleMinLength"
    // InternalFormValidation.g:663:1: entryRuleMinLength returns [EObject current=null] : iv_ruleMinLength= ruleMinLength EOF ;
    public final EObject entryRuleMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinLength = null;


        try {
            // InternalFormValidation.g:663:50: (iv_ruleMinLength= ruleMinLength EOF )
            // InternalFormValidation.g:664:2: iv_ruleMinLength= ruleMinLength EOF
            {
             newCompositeNode(grammarAccess.getMinLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinLength=ruleMinLength();

            state._fsp--;

             current =iv_ruleMinLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinLength"


    // $ANTLR start "ruleMinLength"
    // InternalFormValidation.g:670:1: ruleMinLength returns [EObject current=null] : ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleInt0 ) )? ) ;
    public final EObject ruleMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:676:2: ( ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleInt0 ) )? ) )
            // InternalFormValidation.g:677:2: ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleInt0 ) )? )
            {
            // InternalFormValidation.g:677:2: ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleInt0 ) )? )
            // InternalFormValidation.g:678:3: () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleInt0 ) )?
            {
            // InternalFormValidation.g:678:3: ()
            // InternalFormValidation.g:679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinLengthAccess().getMinLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMinLengthAccess().getMinLengthKeyword_1());
            		
            // InternalFormValidation.g:689:3: ( (lv_value_2_0= ruleInt0 ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFormValidation.g:690:4: (lv_value_2_0= ruleInt0 )
                    {
                    // InternalFormValidation.g:690:4: (lv_value_2_0= ruleInt0 )
                    // InternalFormValidation.g:691:5: lv_value_2_0= ruleInt0
                    {

                    					newCompositeNode(grammarAccess.getMinLengthAccess().getValueInt0ParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleInt0();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinLengthRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.Int0");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinLength"


    // $ANTLR start "entryRuleMaxLength"
    // InternalFormValidation.g:712:1: entryRuleMaxLength returns [EObject current=null] : iv_ruleMaxLength= ruleMaxLength EOF ;
    public final EObject entryRuleMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLength = null;


        try {
            // InternalFormValidation.g:712:50: (iv_ruleMaxLength= ruleMaxLength EOF )
            // InternalFormValidation.g:713:2: iv_ruleMaxLength= ruleMaxLength EOF
            {
             newCompositeNode(grammarAccess.getMaxLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxLength=ruleMaxLength();

            state._fsp--;

             current =iv_ruleMaxLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxLength"


    // $ANTLR start "ruleMaxLength"
    // InternalFormValidation.g:719:1: ruleMaxLength returns [EObject current=null] : ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleInt0 ) )? ) ;
    public final EObject ruleMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:725:2: ( ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleInt0 ) )? ) )
            // InternalFormValidation.g:726:2: ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleInt0 ) )? )
            {
            // InternalFormValidation.g:726:2: ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleInt0 ) )? )
            // InternalFormValidation.g:727:3: () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleInt0 ) )?
            {
            // InternalFormValidation.g:727:3: ()
            // InternalFormValidation.g:728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxLengthAccess().getMaxLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxLengthAccess().getMaxLengthKeyword_1());
            		
            // InternalFormValidation.g:738:3: ( (lv_value_2_0= ruleInt0 ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFormValidation.g:739:4: (lv_value_2_0= ruleInt0 )
                    {
                    // InternalFormValidation.g:739:4: (lv_value_2_0= ruleInt0 )
                    // InternalFormValidation.g:740:5: lv_value_2_0= ruleInt0
                    {

                    					newCompositeNode(grammarAccess.getMaxLengthAccess().getValueInt0ParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleInt0();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxLengthRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.Int0");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxLength"


    // $ANTLR start "entryRuleLength"
    // InternalFormValidation.g:761:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalFormValidation.g:761:47: (iv_ruleLength= ruleLength EOF )
            // InternalFormValidation.g:762:2: iv_ruleLength= ruleLength EOF
            {
             newCompositeNode(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLength=ruleLength();

            state._fsp--;

             current =iv_ruleLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalFormValidation.g:768:1: ruleLength returns [EObject current=null] : ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:774:2: ( ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ) )
            // InternalFormValidation.g:775:2: ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? )
            {
            // InternalFormValidation.g:775:2: ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? )
            // InternalFormValidation.g:776:3: () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )?
            {
            // InternalFormValidation.g:776:3: ()
            // InternalFormValidation.g:777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLengthAccess().getLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getLengthKeyword_1());
            		
            // InternalFormValidation.g:787:3: ( (lv_value_2_0= ruleInt0 ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFormValidation.g:788:4: (lv_value_2_0= ruleInt0 )
                    {
                    // InternalFormValidation.g:788:4: (lv_value_2_0= ruleInt0 )
                    // InternalFormValidation.g:789:5: lv_value_2_0= ruleInt0
                    {

                    					newCompositeNode(grammarAccess.getLengthAccess().getValueInt0ParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleInt0();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLengthRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.Int0");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleMinNumber"
    // InternalFormValidation.g:810:1: entryRuleMinNumber returns [EObject current=null] : iv_ruleMinNumber= ruleMinNumber EOF ;
    public final EObject entryRuleMinNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinNumber = null;


        try {
            // InternalFormValidation.g:810:50: (iv_ruleMinNumber= ruleMinNumber EOF )
            // InternalFormValidation.g:811:2: iv_ruleMinNumber= ruleMinNumber EOF
            {
             newCompositeNode(grammarAccess.getMinNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinNumber=ruleMinNumber();

            state._fsp--;

             current =iv_ruleMinNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinNumber"


    // $ANTLR start "ruleMinNumber"
    // InternalFormValidation.g:817:1: ruleMinNumber returns [EObject current=null] : ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ) ;
    public final EObject ruleMinNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:823:2: ( ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ) )
            // InternalFormValidation.g:824:2: ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? )
            {
            // InternalFormValidation.g:824:2: ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? )
            // InternalFormValidation.g:825:3: () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )?
            {
            // InternalFormValidation.g:825:3: ()
            // InternalFormValidation.g:826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinNumberAccess().getMinNumberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMinNumberAccess().getMinNumberKeyword_1());
            		
            // InternalFormValidation.g:836:3: ( (lv_value_2_0= ruleFloat ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFormValidation.g:837:4: (lv_value_2_0= ruleFloat )
                    {
                    // InternalFormValidation.g:837:4: (lv_value_2_0= ruleFloat )
                    // InternalFormValidation.g:838:5: lv_value_2_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getMinNumberAccess().getValueFloatParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinNumberRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinNumber"


    // $ANTLR start "entryRuleMinDate"
    // InternalFormValidation.g:859:1: entryRuleMinDate returns [EObject current=null] : iv_ruleMinDate= ruleMinDate EOF ;
    public final EObject entryRuleMinDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinDate = null;


        try {
            // InternalFormValidation.g:859:48: (iv_ruleMinDate= ruleMinDate EOF )
            // InternalFormValidation.g:860:2: iv_ruleMinDate= ruleMinDate EOF
            {
             newCompositeNode(grammarAccess.getMinDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinDate=ruleMinDate();

            state._fsp--;

             current =iv_ruleMinDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinDate"


    // $ANTLR start "ruleMinDate"
    // InternalFormValidation.g:866:1: ruleMinDate returns [EObject current=null] : ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ) ;
    public final EObject ruleMinDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:872:2: ( ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ) )
            // InternalFormValidation.g:873:2: ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? )
            {
            // InternalFormValidation.g:873:2: ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? )
            // InternalFormValidation.g:874:3: () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )?
            {
            // InternalFormValidation.g:874:3: ()
            // InternalFormValidation.g:875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinDateAccess().getMinDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMinDateAccess().getMinDateKeyword_1());
            		
            // InternalFormValidation.g:885:3: ( (lv_value_2_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFormValidation.g:886:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalFormValidation.g:886:4: (lv_value_2_0= ruleEString )
                    // InternalFormValidation.g:887:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMinDateAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinDateRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinDate"


    // $ANTLR start "entryRuleMaxNumber"
    // InternalFormValidation.g:908:1: entryRuleMaxNumber returns [EObject current=null] : iv_ruleMaxNumber= ruleMaxNumber EOF ;
    public final EObject entryRuleMaxNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxNumber = null;


        try {
            // InternalFormValidation.g:908:50: (iv_ruleMaxNumber= ruleMaxNumber EOF )
            // InternalFormValidation.g:909:2: iv_ruleMaxNumber= ruleMaxNumber EOF
            {
             newCompositeNode(grammarAccess.getMaxNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxNumber=ruleMaxNumber();

            state._fsp--;

             current =iv_ruleMaxNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxNumber"


    // $ANTLR start "ruleMaxNumber"
    // InternalFormValidation.g:915:1: ruleMaxNumber returns [EObject current=null] : ( () otherlv_1= 'MaxNumber' ( (lv_value_2_0= ruleFloat ) )? ) ;
    public final EObject ruleMaxNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:921:2: ( ( () otherlv_1= 'MaxNumber' ( (lv_value_2_0= ruleFloat ) )? ) )
            // InternalFormValidation.g:922:2: ( () otherlv_1= 'MaxNumber' ( (lv_value_2_0= ruleFloat ) )? )
            {
            // InternalFormValidation.g:922:2: ( () otherlv_1= 'MaxNumber' ( (lv_value_2_0= ruleFloat ) )? )
            // InternalFormValidation.g:923:3: () otherlv_1= 'MaxNumber' ( (lv_value_2_0= ruleFloat ) )?
            {
            // InternalFormValidation.g:923:3: ()
            // InternalFormValidation.g:924:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxNumberAccess().getMaxNumberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxNumberAccess().getMaxNumberKeyword_1());
            		
            // InternalFormValidation.g:934:3: ( (lv_value_2_0= ruleFloat ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFormValidation.g:935:4: (lv_value_2_0= ruleFloat )
                    {
                    // InternalFormValidation.g:935:4: (lv_value_2_0= ruleFloat )
                    // InternalFormValidation.g:936:5: lv_value_2_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getMaxNumberAccess().getValueFloatParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxNumberRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxNumber"


    // $ANTLR start "entryRuleMaxDate"
    // InternalFormValidation.g:957:1: entryRuleMaxDate returns [EObject current=null] : iv_ruleMaxDate= ruleMaxDate EOF ;
    public final EObject entryRuleMaxDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxDate = null;


        try {
            // InternalFormValidation.g:957:48: (iv_ruleMaxDate= ruleMaxDate EOF )
            // InternalFormValidation.g:958:2: iv_ruleMaxDate= ruleMaxDate EOF
            {
             newCompositeNode(grammarAccess.getMaxDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxDate=ruleMaxDate();

            state._fsp--;

             current =iv_ruleMaxDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxDate"


    // $ANTLR start "ruleMaxDate"
    // InternalFormValidation.g:964:1: ruleMaxDate returns [EObject current=null] : ( () otherlv_1= 'MaxDate' ( (lv_value_2_0= ruleEString ) )? ) ;
    public final EObject ruleMaxDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:970:2: ( ( () otherlv_1= 'MaxDate' ( (lv_value_2_0= ruleEString ) )? ) )
            // InternalFormValidation.g:971:2: ( () otherlv_1= 'MaxDate' ( (lv_value_2_0= ruleEString ) )? )
            {
            // InternalFormValidation.g:971:2: ( () otherlv_1= 'MaxDate' ( (lv_value_2_0= ruleEString ) )? )
            // InternalFormValidation.g:972:3: () otherlv_1= 'MaxDate' ( (lv_value_2_0= ruleEString ) )?
            {
            // InternalFormValidation.g:972:3: ()
            // InternalFormValidation.g:973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxDateAccess().getMaxDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxDateAccess().getMaxDateKeyword_1());
            		
            // InternalFormValidation.g:983:3: ( (lv_value_2_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFormValidation.g:984:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalFormValidation.g:984:4: (lv_value_2_0= ruleEString )
                    // InternalFormValidation.g:985:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMaxDateAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxDateRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxDate"


    // $ANTLR start "entryRuleAcceptableValuesString"
    // InternalFormValidation.g:1006:1: entryRuleAcceptableValuesString returns [EObject current=null] : iv_ruleAcceptableValuesString= ruleAcceptableValuesString EOF ;
    public final EObject entryRuleAcceptableValuesString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableValuesString = null;


        try {
            // InternalFormValidation.g:1006:63: (iv_ruleAcceptableValuesString= ruleAcceptableValuesString EOF )
            // InternalFormValidation.g:1007:2: iv_ruleAcceptableValuesString= ruleAcceptableValuesString EOF
            {
             newCompositeNode(grammarAccess.getAcceptableValuesStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptableValuesString=ruleAcceptableValuesString();

            state._fsp--;

             current =iv_ruleAcceptableValuesString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptableValuesString"


    // $ANTLR start "ruleAcceptableValuesString"
    // InternalFormValidation.g:1013:1: ruleAcceptableValuesString returns [EObject current=null] : ( () otherlv_1= 'AcceptableValuesString' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleAcceptableValuesString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1019:2: ( ( () otherlv_1= 'AcceptableValuesString' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? ) )
            // InternalFormValidation.g:1020:2: ( () otherlv_1= 'AcceptableValuesString' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? )
            {
            // InternalFormValidation.g:1020:2: ( () otherlv_1= 'AcceptableValuesString' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? )
            // InternalFormValidation.g:1021:3: () otherlv_1= 'AcceptableValuesString' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )?
            {
            // InternalFormValidation.g:1021:3: ()
            // InternalFormValidation.g:1022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringKeyword_1());
            		
            // InternalFormValidation.g:1032:3: (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFormValidation.g:1033:4: otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getAcceptableValuesStringAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalFormValidation.g:1037:4: ( (lv_values_3_0= ruleEString ) )
                    // InternalFormValidation.g:1038:5: (lv_values_3_0= ruleEString )
                    {
                    // InternalFormValidation.g:1038:5: (lv_values_3_0= ruleEString )
                    // InternalFormValidation.g:1039:6: lv_values_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_values_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAcceptableValuesStringRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_3_0,
                    							"org.xtext.example.mydsl.FormValidation.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:1056:4: (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==26) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalFormValidation.g:1057:5: otherlv_4= ',' ( (lv_values_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_14); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAcceptableValuesStringAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalFormValidation.g:1061:5: ( (lv_values_5_0= ruleEString ) )
                    	    // InternalFormValidation.g:1062:6: (lv_values_5_0= ruleEString )
                    	    {
                    	    // InternalFormValidation.g:1062:6: (lv_values_5_0= ruleEString )
                    	    // InternalFormValidation.g:1063:7: lv_values_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_values_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAcceptableValuesStringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_5_0,
                    	    								"org.xtext.example.mydsl.FormValidation.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAcceptableValuesStringAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptableValuesString"


    // $ANTLR start "entryRuleAcceptableValuesDate"
    // InternalFormValidation.g:1090:1: entryRuleAcceptableValuesDate returns [EObject current=null] : iv_ruleAcceptableValuesDate= ruleAcceptableValuesDate EOF ;
    public final EObject entryRuleAcceptableValuesDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableValuesDate = null;


        try {
            // InternalFormValidation.g:1090:61: (iv_ruleAcceptableValuesDate= ruleAcceptableValuesDate EOF )
            // InternalFormValidation.g:1091:2: iv_ruleAcceptableValuesDate= ruleAcceptableValuesDate EOF
            {
             newCompositeNode(grammarAccess.getAcceptableValuesDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAcceptableValuesDate=ruleAcceptableValuesDate();

            state._fsp--;

             current =iv_ruleAcceptableValuesDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptableValuesDate"


    // $ANTLR start "ruleAcceptableValuesDate"
    // InternalFormValidation.g:1097:1: ruleAcceptableValuesDate returns [EObject current=null] : ( () otherlv_1= 'AcceptableValuesDate' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleAcceptableValuesDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1103:2: ( ( () otherlv_1= 'AcceptableValuesDate' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? ) )
            // InternalFormValidation.g:1104:2: ( () otherlv_1= 'AcceptableValuesDate' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? )
            {
            // InternalFormValidation.g:1104:2: ( () otherlv_1= 'AcceptableValuesDate' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )? )
            // InternalFormValidation.g:1105:3: () otherlv_1= 'AcceptableValuesDate' (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )?
            {
            // InternalFormValidation.g:1105:3: ()
            // InternalFormValidation.g:1106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateKeyword_1());
            		
            // InternalFormValidation.g:1116:3: (otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==11) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFormValidation.g:1117:4: otherlv_2= '{' ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getAcceptableValuesDateAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalFormValidation.g:1121:4: ( (lv_values_3_0= ruleEString ) )
                    // InternalFormValidation.g:1122:5: (lv_values_3_0= ruleEString )
                    {
                    // InternalFormValidation.g:1122:5: (lv_values_3_0= ruleEString )
                    // InternalFormValidation.g:1123:6: lv_values_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_values_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAcceptableValuesDateRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_3_0,
                    							"org.xtext.example.mydsl.FormValidation.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:1140:4: (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalFormValidation.g:1141:5: otherlv_4= ',' ( (lv_values_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_14); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAcceptableValuesDateAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalFormValidation.g:1145:5: ( (lv_values_5_0= ruleEString ) )
                    	    // InternalFormValidation.g:1146:6: (lv_values_5_0= ruleEString )
                    	    {
                    	    // InternalFormValidation.g:1146:6: (lv_values_5_0= ruleEString )
                    	    // InternalFormValidation.g:1147:7: lv_values_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_values_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAcceptableValuesDateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_5_0,
                    	    								"org.xtext.example.mydsl.FormValidation.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getAcceptableValuesDateAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptableValuesDate"


    // $ANTLR start "entryRuleStringPattern"
    // InternalFormValidation.g:1174:1: entryRuleStringPattern returns [EObject current=null] : iv_ruleStringPattern= ruleStringPattern EOF ;
    public final EObject entryRuleStringPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPattern = null;


        try {
            // InternalFormValidation.g:1174:54: (iv_ruleStringPattern= ruleStringPattern EOF )
            // InternalFormValidation.g:1175:2: iv_ruleStringPattern= ruleStringPattern EOF
            {
             newCompositeNode(grammarAccess.getStringPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringPattern=ruleStringPattern();

            state._fsp--;

             current =iv_ruleStringPattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringPattern"


    // $ANTLR start "ruleStringPattern"
    // InternalFormValidation.g:1181:1: ruleStringPattern returns [EObject current=null] : ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ) ;
    public final EObject ruleStringPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1187:2: ( ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ) )
            // InternalFormValidation.g:1188:2: ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? )
            {
            // InternalFormValidation.g:1188:2: ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? )
            // InternalFormValidation.g:1189:3: () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )?
            {
            // InternalFormValidation.g:1189:3: ()
            // InternalFormValidation.g:1190:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringPatternAccess().getStringPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPatternAccess().getStringPatternKeyword_1());
            		
            // InternalFormValidation.g:1200:3: ( (lv_value_2_0= ruleEString ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFormValidation.g:1201:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalFormValidation.g:1201:4: (lv_value_2_0= ruleEString )
                    // InternalFormValidation.g:1202:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getStringPatternAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringPatternRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringPattern"


    // $ANTLR start "entryRuleDatePattern"
    // InternalFormValidation.g:1223:1: entryRuleDatePattern returns [EObject current=null] : iv_ruleDatePattern= ruleDatePattern EOF ;
    public final EObject entryRuleDatePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatePattern = null;


        try {
            // InternalFormValidation.g:1223:52: (iv_ruleDatePattern= ruleDatePattern EOF )
            // InternalFormValidation.g:1224:2: iv_ruleDatePattern= ruleDatePattern EOF
            {
             newCompositeNode(grammarAccess.getDatePatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatePattern=ruleDatePattern();

            state._fsp--;

             current =iv_ruleDatePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatePattern"


    // $ANTLR start "ruleDatePattern"
    // InternalFormValidation.g:1230:1: ruleDatePattern returns [EObject current=null] : ( () otherlv_1= 'DatePattern' ( (lv_value_2_0= ruleEString ) )? ) ;
    public final EObject ruleDatePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1236:2: ( ( () otherlv_1= 'DatePattern' ( (lv_value_2_0= ruleEString ) )? ) )
            // InternalFormValidation.g:1237:2: ( () otherlv_1= 'DatePattern' ( (lv_value_2_0= ruleEString ) )? )
            {
            // InternalFormValidation.g:1237:2: ( () otherlv_1= 'DatePattern' ( (lv_value_2_0= ruleEString ) )? )
            // InternalFormValidation.g:1238:3: () otherlv_1= 'DatePattern' ( (lv_value_2_0= ruleEString ) )?
            {
            // InternalFormValidation.g:1238:3: ()
            // InternalFormValidation.g:1239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatePatternAccess().getDatePatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDatePatternAccess().getDatePatternKeyword_1());
            		
            // InternalFormValidation.g:1249:3: ( (lv_value_2_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFormValidation.g:1250:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalFormValidation.g:1250:4: (lv_value_2_0= ruleEString )
                    // InternalFormValidation.g:1251:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getDatePatternAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatePatternRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValidation.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatePattern"


    // $ANTLR start "entryRuleInt0"
    // InternalFormValidation.g:1272:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalFormValidation.g:1272:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalFormValidation.g:1273:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalFormValidation.g:1279:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalFormValidation.g:1285:2: (this_INT_0= RULE_INT )
            // InternalFormValidation.g:1286:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getInt0Access().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleFloat"
    // InternalFormValidation.g:1296:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalFormValidation.g:1296:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalFormValidation.g:1297:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalFormValidation.g:1303:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalFormValidation.g:1309:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) )
            // InternalFormValidation.g:1310:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            {
            // InternalFormValidation.g:1310:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==30) ) {
                    alt25=1;
                }
                else if ( (LA25_1==EOF||LA25_1==12||(LA25_1>=14 && LA25_1<=25)||(LA25_1>=27 && LA25_1<=29)) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalFormValidation.g:1311:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalFormValidation.g:1311:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalFormValidation.g:1312:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,30,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:1333:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_3);
                    		

                    			newLeafNode(this_INT_3, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleNotEquals"
    // InternalFormValidation.g:1344:1: entryRuleNotEquals returns [EObject current=null] : iv_ruleNotEquals= ruleNotEquals EOF ;
    public final EObject entryRuleNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEquals = null;


        try {
            // InternalFormValidation.g:1344:50: (iv_ruleNotEquals= ruleNotEquals EOF )
            // InternalFormValidation.g:1345:2: iv_ruleNotEquals= ruleNotEquals EOF
            {
             newCompositeNode(grammarAccess.getNotEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotEquals=ruleNotEquals();

            state._fsp--;

             current =iv_ruleNotEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotEquals"


    // $ANTLR start "ruleNotEquals"
    // InternalFormValidation.g:1351:1: ruleNotEquals returns [EObject current=null] : ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleNotEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributearray_4_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1357:2: ( ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' ) )
            // InternalFormValidation.g:1358:2: ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' )
            {
            // InternalFormValidation.g:1358:2: ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' )
            // InternalFormValidation.g:1359:3: () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}'
            {
            // InternalFormValidation.g:1359:3: ()
            // InternalFormValidation.g:1360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotEqualsAccess().getNotEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNotEqualsAccess().getNotEqualsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNotEqualsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValidation.g:1374:3: (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFormValidation.g:1375:4: otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getNotEqualsAccess().getAttributearrayKeyword_3_0());
                    			
                    // InternalFormValidation.g:1379:4: ( (lv_attributearray_4_0= ruleAttributeArray ) )
                    // InternalFormValidation.g:1380:5: (lv_attributearray_4_0= ruleAttributeArray )
                    {
                    // InternalFormValidation.g:1380:5: (lv_attributearray_4_0= ruleAttributeArray )
                    // InternalFormValidation.g:1381:6: lv_attributearray_4_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getNotEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_attributearray_4_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotEqualsRule());
                    						}
                    						set(
                    							current,
                    							"attributearray",
                    							lv_attributearray_4_0,
                    							"org.xtext.example.mydsl.FormValidation.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNotEqualsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotEquals"


    // $ANTLR start "entryRuleGreaterThan"
    // InternalFormValidation.g:1407:1: entryRuleGreaterThan returns [EObject current=null] : iv_ruleGreaterThan= ruleGreaterThan EOF ;
    public final EObject entryRuleGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThan = null;


        try {
            // InternalFormValidation.g:1407:52: (iv_ruleGreaterThan= ruleGreaterThan EOF )
            // InternalFormValidation.g:1408:2: iv_ruleGreaterThan= ruleGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterThan=ruleGreaterThan();

            state._fsp--;

             current =iv_ruleGreaterThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterThan"


    // $ANTLR start "ruleGreaterThan"
    // InternalFormValidation.g:1414:1: ruleGreaterThan returns [EObject current=null] : ( () otherlv_1= 'GreaterThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_attributearray_6_0 = null;

        EObject lv_attributearray_8_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1420:2: ( ( () otherlv_1= 'GreaterThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* )? otherlv_9= '}' ) )
            // InternalFormValidation.g:1421:2: ( () otherlv_1= 'GreaterThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* )? otherlv_9= '}' )
            {
            // InternalFormValidation.g:1421:2: ( () otherlv_1= 'GreaterThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* )? otherlv_9= '}' )
            // InternalFormValidation.g:1422:3: () otherlv_1= 'GreaterThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* )? otherlv_9= '}'
            {
            // InternalFormValidation.g:1422:3: ()
            // InternalFormValidation.g:1423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGreaterThanAccess().getGreaterThanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValidation.g:1437:3: (otherlv_3= 'classattribute' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFormValidation.g:1438:4: otherlv_3= 'classattribute' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getGreaterThanAccess().getClassattributeKeyword_3_0());
                    			
                    // InternalFormValidation.g:1442:4: ( ( ruleEString ) )
                    // InternalFormValidation.g:1443:5: ( ruleEString )
                    {
                    // InternalFormValidation.g:1443:5: ( ruleEString )
                    // InternalFormValidation.g:1444:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGreaterThanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGreaterThanAccess().getClassattributeClassAttributeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValidation.g:1459:3: (otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFormValidation.g:1460:4: otherlv_5= 'attributearray' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )*
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getGreaterThanAccess().getAttributearrayKeyword_4_0());
                    			
                    // InternalFormValidation.g:1464:4: ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    // InternalFormValidation.g:1465:5: (lv_attributearray_6_0= ruleAttributeArray )
                    {
                    // InternalFormValidation.g:1465:5: (lv_attributearray_6_0= ruleAttributeArray )
                    // InternalFormValidation.g:1466:6: lv_attributearray_6_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_attributearray_6_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGreaterThanRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_6_0,
                    							"org.xtext.example.mydsl.FormValidation.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:1483:4: (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==26) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalFormValidation.g:1484:5: otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) )
                    	    {
                    	    otherlv_7=(Token)match(input,26,FOLLOW_22); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getGreaterThanAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalFormValidation.g:1488:5: ( (lv_attributearray_8_0= ruleAttributeArray ) )
                    	    // InternalFormValidation.g:1489:6: (lv_attributearray_8_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValidation.g:1489:6: (lv_attributearray_8_0= ruleAttributeArray )
                    	    // InternalFormValidation.g:1490:7: lv_attributearray_8_0= ruleAttributeArray
                    	    {

                    	    							newCompositeNode(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_attributearray_8_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGreaterThanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributearray",
                    	    								lv_attributearray_8_0,
                    	    								"org.xtext.example.mydsl.FormValidation.AttributeArray");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterThan"


    // $ANTLR start "entryRuleEquals"
    // InternalFormValidation.g:1517:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalFormValidation.g:1517:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalFormValidation.g:1518:2: iv_ruleEquals= ruleEquals EOF
            {
             newCompositeNode(grammarAccess.getEqualsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquals=ruleEquals();

            state._fsp--;

             current =iv_ruleEquals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalFormValidation.g:1524:1: ruleEquals returns [EObject current=null] : ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attributearray_4_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1530:2: ( ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' ) )
            // InternalFormValidation.g:1531:2: ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' )
            {
            // InternalFormValidation.g:1531:2: ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}' )
            // InternalFormValidation.g:1532:3: () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )? otherlv_5= '}'
            {
            // InternalFormValidation.g:1532:3: ()
            // InternalFormValidation.g:1533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEqualsAccess().getEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualsAccess().getEqualsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEqualsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValidation.g:1547:3: (otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFormValidation.g:1548:4: otherlv_3= 'attributearray' ( (lv_attributearray_4_0= ruleAttributeArray ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getEqualsAccess().getAttributearrayKeyword_3_0());
                    			
                    // InternalFormValidation.g:1552:4: ( (lv_attributearray_4_0= ruleAttributeArray ) )
                    // InternalFormValidation.g:1553:5: (lv_attributearray_4_0= ruleAttributeArray )
                    {
                    // InternalFormValidation.g:1553:5: (lv_attributearray_4_0= ruleAttributeArray )
                    // InternalFormValidation.g:1554:6: lv_attributearray_4_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_attributearray_4_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsRule());
                    						}
                    						set(
                    							current,
                    							"attributearray",
                    							lv_attributearray_4_0,
                    							"org.xtext.example.mydsl.FormValidation.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEqualsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleLessThan"
    // InternalFormValidation.g:1580:1: entryRuleLessThan returns [EObject current=null] : iv_ruleLessThan= ruleLessThan EOF ;
    public final EObject entryRuleLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThan = null;


        try {
            // InternalFormValidation.g:1580:49: (iv_ruleLessThan= ruleLessThan EOF )
            // InternalFormValidation.g:1581:2: iv_ruleLessThan= ruleLessThan EOF
            {
             newCompositeNode(grammarAccess.getLessThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessThan=ruleLessThan();

            state._fsp--;

             current =iv_ruleLessThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLessThan"


    // $ANTLR start "ruleLessThan"
    // InternalFormValidation.g:1587:1: ruleLessThan returns [EObject current=null] : ( () otherlv_1= 'LessThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleLessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_attributearray_7_0 = null;

        EObject lv_attributearray_9_0 = null;



        	enterRule();

        try {
            // InternalFormValidation.g:1593:2: ( ( () otherlv_1= 'LessThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalFormValidation.g:1594:2: ( () otherlv_1= 'LessThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalFormValidation.g:1594:2: ( () otherlv_1= 'LessThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalFormValidation.g:1595:3: () otherlv_1= 'LessThan' otherlv_2= '{' (otherlv_3= 'classattribute' ( ( ruleEString ) ) )? (otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalFormValidation.g:1595:3: ()
            // InternalFormValidation.g:1596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLessThanAccess().getLessThanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLessThanAccess().getLessThanKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValidation.g:1610:3: (otherlv_3= 'classattribute' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFormValidation.g:1611:4: otherlv_3= 'classattribute' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getLessThanAccess().getClassattributeKeyword_3_0());
                    			
                    // InternalFormValidation.g:1615:4: ( ( ruleEString ) )
                    // InternalFormValidation.g:1616:5: ( ruleEString )
                    {
                    // InternalFormValidation.g:1616:5: ( ruleEString )
                    // InternalFormValidation.g:1617:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLessThanRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLessThanAccess().getClassattributeClassAttributeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValidation.g:1632:3: (otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFormValidation.g:1633:4: otherlv_5= 'attributearray' otherlv_6= '{' ( (lv_attributearray_7_0= ruleAttributeArray ) ) (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLessThanAccess().getAttributearrayKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,11,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalFormValidation.g:1641:4: ( (lv_attributearray_7_0= ruleAttributeArray ) )
                    // InternalFormValidation.g:1642:5: (lv_attributearray_7_0= ruleAttributeArray )
                    {
                    // InternalFormValidation.g:1642:5: (lv_attributearray_7_0= ruleAttributeArray )
                    // InternalFormValidation.g:1643:6: lv_attributearray_7_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_attributearray_7_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLessThanRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_7_0,
                    							"org.xtext.example.mydsl.FormValidation.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:1660:4: (otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==26) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalFormValidation.g:1661:5: otherlv_8= ',' ( (lv_attributearray_9_0= ruleAttributeArray ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_22); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLessThanAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalFormValidation.g:1665:5: ( (lv_attributearray_9_0= ruleAttributeArray ) )
                    	    // InternalFormValidation.g:1666:6: (lv_attributearray_9_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValidation.g:1666:6: (lv_attributearray_9_0= ruleAttributeArray )
                    	    // InternalFormValidation.g:1667:7: lv_attributearray_9_0= ruleAttributeArray
                    	    {

                    	    							newCompositeNode(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_attributearray_9_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLessThanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributearray",
                    	    								lv_attributearray_9_0,
                    	    								"org.xtext.example.mydsl.FormValidation.AttributeArray");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLessThan"


    // $ANTLR start "entryRuleAttributeArray"
    // InternalFormValidation.g:1698:1: entryRuleAttributeArray returns [EObject current=null] : iv_ruleAttributeArray= ruleAttributeArray EOF ;
    public final EObject entryRuleAttributeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeArray = null;


        try {
            // InternalFormValidation.g:1698:55: (iv_ruleAttributeArray= ruleAttributeArray EOF )
            // InternalFormValidation.g:1699:2: iv_ruleAttributeArray= ruleAttributeArray EOF
            {
             newCompositeNode(grammarAccess.getAttributeArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeArray=ruleAttributeArray();

            state._fsp--;

             current =iv_ruleAttributeArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeArray"


    // $ANTLR start "ruleAttributeArray"
    // InternalFormValidation.g:1705:1: ruleAttributeArray returns [EObject current=null] : ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleAttributeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFormValidation.g:1711:2: ( ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? ) )
            // InternalFormValidation.g:1712:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? )
            {
            // InternalFormValidation.g:1712:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )? )
            // InternalFormValidation.g:1713:3: () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )?
            {
            // InternalFormValidation.g:1713:3: ()
            // InternalFormValidation.g:1714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeArrayAccess().getAttributeArrayAction_0(),
            					current);
            			

            }

            // InternalFormValidation.g:1720:3: (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFormValidation.g:1721:4: otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeArrayAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalFormValidation.g:1725:4: ( ( ruleEString ) )
                    // InternalFormValidation.g:1726:5: ( ruleEString )
                    {
                    // InternalFormValidation.g:1726:5: ( ruleEString )
                    // InternalFormValidation.g:1727:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeArrayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValidation.g:1741:4: (otherlv_3= ',' ( ( ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==26) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalFormValidation.g:1742:5: otherlv_3= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_14); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getAttributeArrayAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalFormValidation.g:1746:5: ( ( ruleEString ) )
                    	    // InternalFormValidation.g:1747:6: ( ruleEString )
                    	    {
                    	    // InternalFormValidation.g:1747:6: ( ruleEString )
                    	    // InternalFormValidation.g:1748:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAttributeArrayRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeArrayAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeArray"


    // $ANTLR start "ruleEVrsta"
    // InternalFormValidation.g:1772:1: ruleEVrsta returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) ) ;
    public final Enumerator ruleEVrsta() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFormValidation.g:1778:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) ) )
            // InternalFormValidation.g:1779:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) )
            {
            // InternalFormValidation.g:1779:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt36=1;
                }
                break;
            case 40:
                {
                alt36=2;
                }
                break;
            case 41:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalFormValidation.g:1780:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFormValidation.g:1780:3: (enumLiteral_0= 'String' )
                    // InternalFormValidation.g:1781:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getEVrstaAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEVrstaAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:1788:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalFormValidation.g:1788:3: (enumLiteral_1= 'Number' )
                    // InternalFormValidation.g:1789:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getEVrstaAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEVrstaAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValidation.g:1796:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalFormValidation.g:1796:3: (enumLiteral_2= 'Date' )
                    // InternalFormValidation.g:1797:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getEVrstaAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEVrstaAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVrsta"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001A80001030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001A80001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003BFFD000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000500001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002004001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004004000000L});

}