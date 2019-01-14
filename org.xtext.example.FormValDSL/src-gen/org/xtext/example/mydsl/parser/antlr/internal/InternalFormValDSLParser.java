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
import org.xtext.example.mydsl.services.FormValDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormValDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'label'", "'description'", "'}'", "'Label'", "'Master'", "'ClassRepresenting'", "'OverviewSettings'", "'Data type'", "'true'", "'false'", "'NumericUIComponent'", "'Tooltip'", "'Note'", "'Default value'", "'Component type'", "'RadioButton'", "'Orientation'", "'DropDownList'", "'MultiSelectable'", "'CheckBox'", "'DateUIComponent'", "'Type'", "'TextInput'", "'Place holder'", "'TextArea'", "'Number of rows'", "'TelInput'", "'EmailInput'", "'Password'", "'Visible'", "'FileInput'", "'Button position'", "'RefEntity'", "'tooltip'", "'note'", "'isSingeValue'", "'isMultiSelect'", "'LoadValues'", "'AutocompleteComponent'", "'-'", "'.'", "'E'", "'e'", "'Collection'", "'Error message'", "'Required'", "'MinLength'", "'MaxLength'", "'Length'", "'MinNumber'", "'MinDate'", "'MaxNumber'", "'value'", "'MaxDate'", "'AcceptableValuesString'", "','", "'AcceptableValuesDate'", "'StringPattern'", "'DatePattern'", "'Int'", "'Float'", "'NotEquals'", "'attributes'", "'GreaterThan'", "'Equals'", "'LessThan'", "'('", "')'", "'FieldSet'", "'Legend'", "'Tab'", "'Grid'", "'row'", "'AttributeSettings'", "'Presentation'", "'LabelSettings'", "'Position'", "'ErrorMessageSettings'", "'Color'", "'Auto Complete'", "'FormSettings'", "'NoteSettings'", "'TableOverview'", "'Height'", "'Width'", "'Title'", "'Pagination'", "'Possible number of shown rows'", "'Default number of shown rows'", "'NumberScroller'", "'SimpleInput'", "'Vertical'", "'Horizontal'", "'OnlyDate'", "'OnlyTime'", "'DateTime'", "'Above'", "'Left'", "'Right'", "'Below'", "'String'", "'Number'", "'Date'", "'Blob'", "'Asterix'", "'Highlighting'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalFormValDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormValDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormValDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFormValDSL.g"; }



     	private FormValDSLGrammarAccess grammarAccess;

        public InternalFormValDSLParser(TokenStream input, FormValDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BusinessModel";
       	}

       	@Override
       	protected FormValDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBusinessModel"
    // InternalFormValDSL.g:65:1: entryRuleBusinessModel returns [EObject current=null] : iv_ruleBusinessModel= ruleBusinessModel EOF ;
    public final EObject entryRuleBusinessModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessModel = null;


        try {
            // InternalFormValDSL.g:65:54: (iv_ruleBusinessModel= ruleBusinessModel EOF )
            // InternalFormValDSL.g:66:2: iv_ruleBusinessModel= ruleBusinessModel EOF
            {
             newCompositeNode(grammarAccess.getBusinessModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBusinessModel=ruleBusinessModel();

            state._fsp--;

             current =iv_ruleBusinessModel; 
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
    // $ANTLR end "entryRuleBusinessModel"


    // $ANTLR start "ruleBusinessModel"
    // InternalFormValDSL.g:72:1: ruleBusinessModel returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) ) ) (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) ) ( ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleBusinessModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_label_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_validationclasses_6_0 = null;

        EObject lv_validationclasses_7_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:78:2: ( ( () otherlv_1= '{' (otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) ) ) (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) ) ( ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )* )? otherlv_8= '}' ) )
            // InternalFormValDSL.g:79:2: ( () otherlv_1= '{' (otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) ) ) (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) ) ( ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )* )? otherlv_8= '}' )
            {
            // InternalFormValDSL.g:79:2: ( () otherlv_1= '{' (otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) ) ) (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) ) ( ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )* )? otherlv_8= '}' )
            // InternalFormValDSL.g:80:3: () otherlv_1= '{' (otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) ) ) (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) ) ( ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )* )? otherlv_8= '}'
            {
            // InternalFormValDSL.g:80:3: ()
            // InternalFormValDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBusinessModelAccess().getBusinessModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBusinessModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFormValDSL.g:91:3: (otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) ) )
            // InternalFormValDSL.g:92:4: otherlv_2= 'label' ( (lv_label_3_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getBusinessModelAccess().getLabelKeyword_2_0());
            			
            // InternalFormValDSL.g:96:4: ( (lv_label_3_0= ruleEString ) )
            // InternalFormValDSL.g:97:5: (lv_label_3_0= ruleEString )
            {
            // InternalFormValDSL.g:97:5: (lv_label_3_0= ruleEString )
            // InternalFormValDSL.g:98:6: lv_label_3_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBusinessModelAccess().getLabelEStringParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_5);
            lv_label_3_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBusinessModelRule());
            						}
            						set(
            							current,
            							"label",
            							lv_label_3_0,
            							"org.xtext.example.mydsl.FormValDSL.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalFormValDSL.g:116:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )
            // InternalFormValDSL.g:117:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getBusinessModelAccess().getDescriptionKeyword_3_0());
            			
            // InternalFormValDSL.g:121:4: ( (lv_description_5_0= ruleEString ) )
            // InternalFormValDSL.g:122:5: (lv_description_5_0= ruleEString )
            {
            // InternalFormValDSL.g:122:5: (lv_description_5_0= ruleEString )
            // InternalFormValDSL.g:123:6: lv_description_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getBusinessModelAccess().getDescriptionEStringParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_6);
            lv_description_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBusinessModelRule());
            						}
            						set(
            							current,
            							"description",
            							lv_description_5_0,
            							"org.xtext.example.mydsl.FormValDSL.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalFormValDSL.g:141:3: ( ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFormValDSL.g:142:4: ( (lv_validationclasses_6_0= ruleValidationClass ) ) ( (lv_validationclasses_7_0= ruleValidationClass ) )*
                    {
                    // InternalFormValDSL.g:142:4: ( (lv_validationclasses_6_0= ruleValidationClass ) )
                    // InternalFormValDSL.g:143:5: (lv_validationclasses_6_0= ruleValidationClass )
                    {
                    // InternalFormValDSL.g:143:5: (lv_validationclasses_6_0= ruleValidationClass )
                    // InternalFormValDSL.g:144:6: lv_validationclasses_6_0= ruleValidationClass
                    {

                    						newCompositeNode(grammarAccess.getBusinessModelAccess().getValidationclassesValidationClassParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_validationclasses_6_0=ruleValidationClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBusinessModelRule());
                    						}
                    						add(
                    							current,
                    							"validationclasses",
                    							lv_validationclasses_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.ValidationClass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:161:4: ( (lv_validationclasses_7_0= ruleValidationClass ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalFormValDSL.g:162:5: (lv_validationclasses_7_0= ruleValidationClass )
                    	    {
                    	    // InternalFormValDSL.g:162:5: (lv_validationclasses_7_0= ruleValidationClass )
                    	    // InternalFormValDSL.g:163:6: lv_validationclasses_7_0= ruleValidationClass
                    	    {

                    	    						newCompositeNode(grammarAccess.getBusinessModelAccess().getValidationclassesValidationClassParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_validationclasses_7_0=ruleValidationClass();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBusinessModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"validationclasses",
                    	    							lv_validationclasses_7_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.ValidationClass");
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

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBusinessModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBusinessModel"


    // $ANTLR start "entryRuleClassRule"
    // InternalFormValDSL.g:189:1: entryRuleClassRule returns [EObject current=null] : iv_ruleClassRule= ruleClassRule EOF ;
    public final EObject entryRuleClassRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassRule = null;


        try {
            // InternalFormValDSL.g:189:50: (iv_ruleClassRule= ruleClassRule EOF )
            // InternalFormValDSL.g:190:2: iv_ruleClassRule= ruleClassRule EOF
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
    // InternalFormValDSL.g:196:1: ruleClassRule returns [EObject current=null] : (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan ) ;
    public final EObject ruleClassRule() throws RecognitionException {
        EObject current = null;

        EObject this_NotEquals_0 = null;

        EObject this_GreaterThan_1 = null;

        EObject this_Equals_2 = null;

        EObject this_LessThan_3 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:202:2: ( (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan ) )
            // InternalFormValDSL.g:203:2: (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan )
            {
            // InternalFormValDSL.g:203:2: (this_NotEquals_0= ruleNotEquals | this_GreaterThan_1= ruleGreaterThan | this_Equals_2= ruleEquals | this_LessThan_3= ruleLessThan )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt3=1;
                }
                break;
            case 75:
                {
                alt3=2;
                }
                break;
            case 76:
                {
                alt3=3;
                }
                break;
            case 77:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFormValDSL.g:204:3: this_NotEquals_0= ruleNotEquals
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
                    // InternalFormValDSL.g:213:3: this_GreaterThan_1= ruleGreaterThan
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
                    // InternalFormValDSL.g:222:3: this_Equals_2= ruleEquals
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
                    // InternalFormValDSL.g:231:3: this_LessThan_3= ruleLessThan
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


    // $ANTLR start "entryRuleFormLayout"
    // InternalFormValDSL.g:243:1: entryRuleFormLayout returns [EObject current=null] : iv_ruleFormLayout= ruleFormLayout EOF ;
    public final EObject entryRuleFormLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormLayout = null;


        try {
            // InternalFormValDSL.g:243:51: (iv_ruleFormLayout= ruleFormLayout EOF )
            // InternalFormValDSL.g:244:2: iv_ruleFormLayout= ruleFormLayout EOF
            {
             newCompositeNode(grammarAccess.getFormLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormLayout=ruleFormLayout();

            state._fsp--;

             current =iv_ruleFormLayout; 
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
    // $ANTLR end "entryRuleFormLayout"


    // $ANTLR start "ruleFormLayout"
    // InternalFormValDSL.g:250:1: ruleFormLayout returns [EObject current=null] : (this_FieldSet_0= ruleFieldSet | this_Tab_1= ruleTab | this_Grid_2= ruleGrid ) ;
    public final EObject ruleFormLayout() throws RecognitionException {
        EObject current = null;

        EObject this_FieldSet_0 = null;

        EObject this_Tab_1 = null;

        EObject this_Grid_2 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:256:2: ( (this_FieldSet_0= ruleFieldSet | this_Tab_1= ruleTab | this_Grid_2= ruleGrid ) )
            // InternalFormValDSL.g:257:2: (this_FieldSet_0= ruleFieldSet | this_Tab_1= ruleTab | this_Grid_2= ruleGrid )
            {
            // InternalFormValDSL.g:257:2: (this_FieldSet_0= ruleFieldSet | this_Tab_1= ruleTab | this_Grid_2= ruleGrid )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt4=1;
                }
                break;
            case 82:
                {
                alt4=2;
                }
                break;
            case 83:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFormValDSL.g:258:3: this_FieldSet_0= ruleFieldSet
                    {

                    			newCompositeNode(grammarAccess.getFormLayoutAccess().getFieldSetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSet_0=ruleFieldSet();

                    state._fsp--;


                    			current = this_FieldSet_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:267:3: this_Tab_1= ruleTab
                    {

                    			newCompositeNode(grammarAccess.getFormLayoutAccess().getTabParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tab_1=ruleTab();

                    state._fsp--;


                    			current = this_Tab_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:276:3: this_Grid_2= ruleGrid
                    {

                    			newCompositeNode(grammarAccess.getFormLayoutAccess().getGridParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Grid_2=ruleGrid();

                    state._fsp--;


                    			current = this_Grid_2;
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
    // $ANTLR end "ruleFormLayout"


    // $ANTLR start "entryRuleAdditionalSettings"
    // InternalFormValDSL.g:288:1: entryRuleAdditionalSettings returns [EObject current=null] : iv_ruleAdditionalSettings= ruleAdditionalSettings EOF ;
    public final EObject entryRuleAdditionalSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalSettings = null;


        try {
            // InternalFormValDSL.g:288:59: (iv_ruleAdditionalSettings= ruleAdditionalSettings EOF )
            // InternalFormValDSL.g:289:2: iv_ruleAdditionalSettings= ruleAdditionalSettings EOF
            {
             newCompositeNode(grammarAccess.getAdditionalSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditionalSettings=ruleAdditionalSettings();

            state._fsp--;

             current =iv_ruleAdditionalSettings; 
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
    // $ANTLR end "entryRuleAdditionalSettings"


    // $ANTLR start "ruleAdditionalSettings"
    // InternalFormValDSL.g:295:1: ruleAdditionalSettings returns [EObject current=null] : (this_AttributeSettings_0= ruleAttributeSettings | this_LabelSettings_1= ruleLabelSettings | this_ErrorMessageSettings_2= ruleErrorMessageSettings | this_FormSettings_3= ruleFormSettings | this_NoteSettings_4= ruleNoteSettings ) ;
    public final EObject ruleAdditionalSettings() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeSettings_0 = null;

        EObject this_LabelSettings_1 = null;

        EObject this_ErrorMessageSettings_2 = null;

        EObject this_FormSettings_3 = null;

        EObject this_NoteSettings_4 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:301:2: ( (this_AttributeSettings_0= ruleAttributeSettings | this_LabelSettings_1= ruleLabelSettings | this_ErrorMessageSettings_2= ruleErrorMessageSettings | this_FormSettings_3= ruleFormSettings | this_NoteSettings_4= ruleNoteSettings ) )
            // InternalFormValDSL.g:302:2: (this_AttributeSettings_0= ruleAttributeSettings | this_LabelSettings_1= ruleLabelSettings | this_ErrorMessageSettings_2= ruleErrorMessageSettings | this_FormSettings_3= ruleFormSettings | this_NoteSettings_4= ruleNoteSettings )
            {
            // InternalFormValDSL.g:302:2: (this_AttributeSettings_0= ruleAttributeSettings | this_LabelSettings_1= ruleLabelSettings | this_ErrorMessageSettings_2= ruleErrorMessageSettings | this_FormSettings_3= ruleFormSettings | this_NoteSettings_4= ruleNoteSettings )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt5=1;
                }
                break;
            case 87:
                {
                alt5=2;
                }
                break;
            case 89:
                {
                alt5=3;
                }
                break;
            case 91:
            case 92:
                {
                alt5=4;
                }
                break;
            case 93:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFormValDSL.g:303:3: this_AttributeSettings_0= ruleAttributeSettings
                    {

                    			newCompositeNode(grammarAccess.getAdditionalSettingsAccess().getAttributeSettingsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeSettings_0=ruleAttributeSettings();

                    state._fsp--;


                    			current = this_AttributeSettings_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:312:3: this_LabelSettings_1= ruleLabelSettings
                    {

                    			newCompositeNode(grammarAccess.getAdditionalSettingsAccess().getLabelSettingsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LabelSettings_1=ruleLabelSettings();

                    state._fsp--;


                    			current = this_LabelSettings_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:321:3: this_ErrorMessageSettings_2= ruleErrorMessageSettings
                    {

                    			newCompositeNode(grammarAccess.getAdditionalSettingsAccess().getErrorMessageSettingsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorMessageSettings_2=ruleErrorMessageSettings();

                    state._fsp--;


                    			current = this_ErrorMessageSettings_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFormValDSL.g:330:3: this_FormSettings_3= ruleFormSettings
                    {

                    			newCompositeNode(grammarAccess.getAdditionalSettingsAccess().getFormSettingsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormSettings_3=ruleFormSettings();

                    state._fsp--;


                    			current = this_FormSettings_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFormValDSL.g:339:3: this_NoteSettings_4= ruleNoteSettings
                    {

                    			newCompositeNode(grammarAccess.getAdditionalSettingsAccess().getNoteSettingsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoteSettings_4=ruleNoteSettings();

                    state._fsp--;


                    			current = this_NoteSettings_4;
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
    // $ANTLR end "ruleAdditionalSettings"


    // $ANTLR start "entryRuleAttributeRule"
    // InternalFormValDSL.g:351:1: entryRuleAttributeRule returns [EObject current=null] : iv_ruleAttributeRule= ruleAttributeRule EOF ;
    public final EObject entryRuleAttributeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeRule = null;


        try {
            // InternalFormValDSL.g:351:54: (iv_ruleAttributeRule= ruleAttributeRule EOF )
            // InternalFormValDSL.g:352:2: iv_ruleAttributeRule= ruleAttributeRule EOF
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
    // InternalFormValDSL.g:358:1: ruleAttributeRule returns [EObject current=null] : (this_Required_0= ruleRequired | this_MinLength_1= ruleMinLength | this_MaxLength_2= ruleMaxLength | this_Length_3= ruleLength | this_MinNumber_4= ruleMinNumber | this_MinDate_5= ruleMinDate | this_MaxNumber_6= ruleMaxNumber | this_MaxDate_7= ruleMaxDate | this_AcceptableValuesString_8= ruleAcceptableValuesString | this_AcceptableValuesDate_9= ruleAcceptableValuesDate | this_StringPattern_10= ruleStringPattern | this_DatePattern_11= ruleDatePattern ) ;
    public final EObject ruleAttributeRule() throws RecognitionException {
        EObject current = null;

        EObject this_Required_0 = null;

        EObject this_MinLength_1 = null;

        EObject this_MaxLength_2 = null;

        EObject this_Length_3 = null;

        EObject this_MinNumber_4 = null;

        EObject this_MinDate_5 = null;

        EObject this_MaxNumber_6 = null;

        EObject this_MaxDate_7 = null;

        EObject this_AcceptableValuesString_8 = null;

        EObject this_AcceptableValuesDate_9 = null;

        EObject this_StringPattern_10 = null;

        EObject this_DatePattern_11 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:364:2: ( (this_Required_0= ruleRequired | this_MinLength_1= ruleMinLength | this_MaxLength_2= ruleMaxLength | this_Length_3= ruleLength | this_MinNumber_4= ruleMinNumber | this_MinDate_5= ruleMinDate | this_MaxNumber_6= ruleMaxNumber | this_MaxDate_7= ruleMaxDate | this_AcceptableValuesString_8= ruleAcceptableValuesString | this_AcceptableValuesDate_9= ruleAcceptableValuesDate | this_StringPattern_10= ruleStringPattern | this_DatePattern_11= ruleDatePattern ) )
            // InternalFormValDSL.g:365:2: (this_Required_0= ruleRequired | this_MinLength_1= ruleMinLength | this_MaxLength_2= ruleMaxLength | this_Length_3= ruleLength | this_MinNumber_4= ruleMinNumber | this_MinDate_5= ruleMinDate | this_MaxNumber_6= ruleMaxNumber | this_MaxDate_7= ruleMaxDate | this_AcceptableValuesString_8= ruleAcceptableValuesString | this_AcceptableValuesDate_9= ruleAcceptableValuesDate | this_StringPattern_10= ruleStringPattern | this_DatePattern_11= ruleDatePattern )
            {
            // InternalFormValDSL.g:365:2: (this_Required_0= ruleRequired | this_MinLength_1= ruleMinLength | this_MaxLength_2= ruleMaxLength | this_Length_3= ruleLength | this_MinNumber_4= ruleMinNumber | this_MinDate_5= ruleMinDate | this_MaxNumber_6= ruleMaxNumber | this_MaxDate_7= ruleMaxDate | this_AcceptableValuesString_8= ruleAcceptableValuesString | this_AcceptableValuesDate_9= ruleAcceptableValuesDate | this_StringPattern_10= ruleStringPattern | this_DatePattern_11= ruleDatePattern )
            int alt6=12;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt6=1;
                }
                break;
            case 58:
                {
                alt6=2;
                }
                break;
            case 59:
                {
                alt6=3;
                }
                break;
            case 60:
                {
                alt6=4;
                }
                break;
            case 61:
                {
                alt6=5;
                }
                break;
            case 62:
                {
                alt6=6;
                }
                break;
            case 63:
                {
                alt6=7;
                }
                break;
            case 65:
                {
                alt6=8;
                }
                break;
            case 66:
                {
                alt6=9;
                }
                break;
            case 68:
                {
                alt6=10;
                }
                break;
            case 69:
                {
                alt6=11;
                }
                break;
            case 70:
                {
                alt6=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFormValDSL.g:366:3: this_Required_0= ruleRequired
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
                    // InternalFormValDSL.g:375:3: this_MinLength_1= ruleMinLength
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMinLengthParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinLength_1=ruleMinLength();

                    state._fsp--;


                    			current = this_MinLength_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:384:3: this_MaxLength_2= ruleMaxLength
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMaxLengthParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxLength_2=ruleMaxLength();

                    state._fsp--;


                    			current = this_MaxLength_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFormValDSL.g:393:3: this_Length_3= ruleLength
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getLengthParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Length_3=ruleLength();

                    state._fsp--;


                    			current = this_Length_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFormValDSL.g:402:3: this_MinNumber_4= ruleMinNumber
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMinNumberParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinNumber_4=ruleMinNumber();

                    state._fsp--;


                    			current = this_MinNumber_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFormValDSL.g:411:3: this_MinDate_5= ruleMinDate
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMinDateParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinDate_5=ruleMinDate();

                    state._fsp--;


                    			current = this_MinDate_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFormValDSL.g:420:3: this_MaxNumber_6= ruleMaxNumber
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMaxNumberParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxNumber_6=ruleMaxNumber();

                    state._fsp--;


                    			current = this_MaxNumber_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFormValDSL.g:429:3: this_MaxDate_7= ruleMaxDate
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getMaxDateParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxDate_7=ruleMaxDate();

                    state._fsp--;


                    			current = this_MaxDate_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFormValDSL.g:438:3: this_AcceptableValuesString_8= ruleAcceptableValuesString
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getAcceptableValuesStringParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptableValuesString_8=ruleAcceptableValuesString();

                    state._fsp--;


                    			current = this_AcceptableValuesString_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFormValDSL.g:447:3: this_AcceptableValuesDate_9= ruleAcceptableValuesDate
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getAcceptableValuesDateParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_AcceptableValuesDate_9=ruleAcceptableValuesDate();

                    state._fsp--;


                    			current = this_AcceptableValuesDate_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalFormValDSL.g:456:3: this_StringPattern_10= ruleStringPattern
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getStringPatternParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringPattern_10=ruleStringPattern();

                    state._fsp--;


                    			current = this_StringPattern_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalFormValDSL.g:465:3: this_DatePattern_11= ruleDatePattern
                    {

                    			newCompositeNode(grammarAccess.getAttributeRuleAccess().getDatePatternParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_DatePattern_11=ruleDatePattern();

                    state._fsp--;


                    			current = this_DatePattern_11;
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


    // $ANTLR start "entryRuleUIComponent"
    // InternalFormValDSL.g:477:1: entryRuleUIComponent returns [EObject current=null] : iv_ruleUIComponent= ruleUIComponent EOF ;
    public final EObject entryRuleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIComponent = null;


        try {
            // InternalFormValDSL.g:477:52: (iv_ruleUIComponent= ruleUIComponent EOF )
            // InternalFormValDSL.g:478:2: iv_ruleUIComponent= ruleUIComponent EOF
            {
             newCompositeNode(grammarAccess.getUIComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUIComponent=ruleUIComponent();

            state._fsp--;

             current =iv_ruleUIComponent; 
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
    // $ANTLR end "entryRuleUIComponent"


    // $ANTLR start "ruleUIComponent"
    // InternalFormValDSL.g:484:1: ruleUIComponent returns [EObject current=null] : (this_NumericUIComponent_0= ruleNumericUIComponent | this_RadioButton_1= ruleRadioButton | this_DropDownList_2= ruleDropDownList | this_CheckBox_3= ruleCheckBox | this_DateUIComponent_4= ruleDateUIComponent | this_TextInput_5= ruleTextInput | this_TextArea_6= ruleTextArea | this_TelInput_7= ruleTelInput | this_EmailInput_8= ruleEmailInput | this_Password_9= rulePassword | this_FileInput_10= ruleFileInput | this_RefEntity_11= ruleRefEntity | this_LoadValues_12= ruleLoadValues | this_AutocompleteComponent_13= ruleAutocompleteComponent ) ;
    public final EObject ruleUIComponent() throws RecognitionException {
        EObject current = null;

        EObject this_NumericUIComponent_0 = null;

        EObject this_RadioButton_1 = null;

        EObject this_DropDownList_2 = null;

        EObject this_CheckBox_3 = null;

        EObject this_DateUIComponent_4 = null;

        EObject this_TextInput_5 = null;

        EObject this_TextArea_6 = null;

        EObject this_TelInput_7 = null;

        EObject this_EmailInput_8 = null;

        EObject this_Password_9 = null;

        EObject this_FileInput_10 = null;

        EObject this_RefEntity_11 = null;

        EObject this_LoadValues_12 = null;

        EObject this_AutocompleteComponent_13 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:490:2: ( (this_NumericUIComponent_0= ruleNumericUIComponent | this_RadioButton_1= ruleRadioButton | this_DropDownList_2= ruleDropDownList | this_CheckBox_3= ruleCheckBox | this_DateUIComponent_4= ruleDateUIComponent | this_TextInput_5= ruleTextInput | this_TextArea_6= ruleTextArea | this_TelInput_7= ruleTelInput | this_EmailInput_8= ruleEmailInput | this_Password_9= rulePassword | this_FileInput_10= ruleFileInput | this_RefEntity_11= ruleRefEntity | this_LoadValues_12= ruleLoadValues | this_AutocompleteComponent_13= ruleAutocompleteComponent ) )
            // InternalFormValDSL.g:491:2: (this_NumericUIComponent_0= ruleNumericUIComponent | this_RadioButton_1= ruleRadioButton | this_DropDownList_2= ruleDropDownList | this_CheckBox_3= ruleCheckBox | this_DateUIComponent_4= ruleDateUIComponent | this_TextInput_5= ruleTextInput | this_TextArea_6= ruleTextArea | this_TelInput_7= ruleTelInput | this_EmailInput_8= ruleEmailInput | this_Password_9= rulePassword | this_FileInput_10= ruleFileInput | this_RefEntity_11= ruleRefEntity | this_LoadValues_12= ruleLoadValues | this_AutocompleteComponent_13= ruleAutocompleteComponent )
            {
            // InternalFormValDSL.g:491:2: (this_NumericUIComponent_0= ruleNumericUIComponent | this_RadioButton_1= ruleRadioButton | this_DropDownList_2= ruleDropDownList | this_CheckBox_3= ruleCheckBox | this_DateUIComponent_4= ruleDateUIComponent | this_TextInput_5= ruleTextInput | this_TextArea_6= ruleTextArea | this_TelInput_7= ruleTelInput | this_EmailInput_8= ruleEmailInput | this_Password_9= rulePassword | this_FileInput_10= ruleFileInput | this_RefEntity_11= ruleRefEntity | this_LoadValues_12= ruleLoadValues | this_AutocompleteComponent_13= ruleAutocompleteComponent )
            int alt7=14;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 31:
                {
                alt7=4;
                }
                break;
            case 32:
                {
                alt7=5;
                }
                break;
            case 34:
                {
                alt7=6;
                }
                break;
            case 36:
                {
                alt7=7;
                }
                break;
            case 38:
                {
                alt7=8;
                }
                break;
            case 39:
                {
                alt7=9;
                }
                break;
            case 40:
                {
                alt7=10;
                }
                break;
            case 42:
                {
                alt7=11;
                }
                break;
            case 44:
                {
                alt7=12;
                }
                break;
            case 48:
            case 49:
                {
                alt7=13;
                }
                break;
            case 50:
                {
                alt7=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFormValDSL.g:492:3: this_NumericUIComponent_0= ruleNumericUIComponent
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getNumericUIComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericUIComponent_0=ruleNumericUIComponent();

                    state._fsp--;


                    			current = this_NumericUIComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:501:3: this_RadioButton_1= ruleRadioButton
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getRadioButtonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadioButton_1=ruleRadioButton();

                    state._fsp--;


                    			current = this_RadioButton_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:510:3: this_DropDownList_2= ruleDropDownList
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getDropDownListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropDownList_2=ruleDropDownList();

                    state._fsp--;


                    			current = this_DropDownList_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFormValDSL.g:519:3: this_CheckBox_3= ruleCheckBox
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getCheckBoxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckBox_3=ruleCheckBox();

                    state._fsp--;


                    			current = this_CheckBox_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalFormValDSL.g:528:3: this_DateUIComponent_4= ruleDateUIComponent
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getDateUIComponentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateUIComponent_4=ruleDateUIComponent();

                    state._fsp--;


                    			current = this_DateUIComponent_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalFormValDSL.g:537:3: this_TextInput_5= ruleTextInput
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getTextInputParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextInput_5=ruleTextInput();

                    state._fsp--;


                    			current = this_TextInput_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalFormValDSL.g:546:3: this_TextArea_6= ruleTextArea
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getTextAreaParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextArea_6=ruleTextArea();

                    state._fsp--;


                    			current = this_TextArea_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalFormValDSL.g:555:3: this_TelInput_7= ruleTelInput
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getTelInputParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_TelInput_7=ruleTelInput();

                    state._fsp--;


                    			current = this_TelInput_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalFormValDSL.g:564:3: this_EmailInput_8= ruleEmailInput
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getEmailInputParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmailInput_8=ruleEmailInput();

                    state._fsp--;


                    			current = this_EmailInput_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalFormValDSL.g:573:3: this_Password_9= rulePassword
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getPasswordParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Password_9=rulePassword();

                    state._fsp--;


                    			current = this_Password_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalFormValDSL.g:582:3: this_FileInput_10= ruleFileInput
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getFileInputParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileInput_10=ruleFileInput();

                    state._fsp--;


                    			current = this_FileInput_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalFormValDSL.g:591:3: this_RefEntity_11= ruleRefEntity
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getRefEntityParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefEntity_11=ruleRefEntity();

                    state._fsp--;


                    			current = this_RefEntity_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalFormValDSL.g:600:3: this_LoadValues_12= ruleLoadValues
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getLoadValuesParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadValues_12=ruleLoadValues();

                    state._fsp--;


                    			current = this_LoadValues_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalFormValDSL.g:609:3: this_AutocompleteComponent_13= ruleAutocompleteComponent
                    {

                    			newCompositeNode(grammarAccess.getUIComponentAccess().getAutocompleteComponentParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutocompleteComponent_13=ruleAutocompleteComponent();

                    state._fsp--;


                    			current = this_AutocompleteComponent_13;
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
    // $ANTLR end "ruleUIComponent"


    // $ANTLR start "entryRuleAttributeDataType"
    // InternalFormValDSL.g:621:1: entryRuleAttributeDataType returns [EObject current=null] : iv_ruleAttributeDataType= ruleAttributeDataType EOF ;
    public final EObject entryRuleAttributeDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDataType = null;


        try {
            // InternalFormValDSL.g:621:58: (iv_ruleAttributeDataType= ruleAttributeDataType EOF )
            // InternalFormValDSL.g:622:2: iv_ruleAttributeDataType= ruleAttributeDataType EOF
            {
             newCompositeNode(grammarAccess.getAttributeDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDataType=ruleAttributeDataType();

            state._fsp--;

             current =iv_ruleAttributeDataType; 
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
    // $ANTLR end "entryRuleAttributeDataType"


    // $ANTLR start "ruleAttributeDataType"
    // InternalFormValDSL.g:628:1: ruleAttributeDataType returns [EObject current=null] : (this_PrimitiveDataType_0= rulePrimitiveDataType | this_NonPrimitiveDataType_1= ruleNonPrimitiveDataType ) ;
    public final EObject ruleAttributeDataType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveDataType_0 = null;

        EObject this_NonPrimitiveDataType_1 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:634:2: ( (this_PrimitiveDataType_0= rulePrimitiveDataType | this_NonPrimitiveDataType_1= ruleNonPrimitiveDataType ) )
            // InternalFormValDSL.g:635:2: (this_PrimitiveDataType_0= rulePrimitiveDataType | this_NonPrimitiveDataType_1= ruleNonPrimitiveDataType )
            {
            // InternalFormValDSL.g:635:2: (this_PrimitiveDataType_0= rulePrimitiveDataType | this_NonPrimitiveDataType_1= ruleNonPrimitiveDataType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==14||(LA8_0>=16 && LA8_0<=17)||LA8_0==22||LA8_0==27||LA8_0==29||(LA8_0>=31 && LA8_0<=32)||LA8_0==34||LA8_0==36||(LA8_0>=38 && LA8_0<=40)||LA8_0==42||LA8_0==44||(LA8_0>=48 && LA8_0<=50)||LA8_0==55||(LA8_0>=57 && LA8_0<=63)||(LA8_0>=65 && LA8_0<=66)||(LA8_0>=68 && LA8_0<=70)||(LA8_0>=112 && LA8_0<=115)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFormValDSL.g:636:3: this_PrimitiveDataType_0= rulePrimitiveDataType
                    {

                    			newCompositeNode(grammarAccess.getAttributeDataTypeAccess().getPrimitiveDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveDataType_0=rulePrimitiveDataType();

                    state._fsp--;


                    			current = this_PrimitiveDataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:645:3: this_NonPrimitiveDataType_1= ruleNonPrimitiveDataType
                    {

                    			newCompositeNode(grammarAccess.getAttributeDataTypeAccess().getNonPrimitiveDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonPrimitiveDataType_1=ruleNonPrimitiveDataType();

                    state._fsp--;


                    			current = this_NonPrimitiveDataType_1;
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
    // $ANTLR end "ruleAttributeDataType"


    // $ANTLR start "entryRuleValidationClass"
    // InternalFormValDSL.g:657:1: entryRuleValidationClass returns [EObject current=null] : iv_ruleValidationClass= ruleValidationClass EOF ;
    public final EObject entryRuleValidationClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationClass = null;


        try {
            // InternalFormValDSL.g:657:56: (iv_ruleValidationClass= ruleValidationClass EOF )
            // InternalFormValDSL.g:658:2: iv_ruleValidationClass= ruleValidationClass EOF
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
    // InternalFormValDSL.g:664:1: ruleValidationClass returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? ( ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )* )? ( ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )* )? ( ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )* )? ( (lv_overviewsettings_13_0= ruleOverviewSettings ) )? otherlv_14= '}' ) ;
    public final EObject ruleValidationClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_label_4_0 = null;

        EObject lv_classattribute_5_0 = null;

        EObject lv_classattribute_6_0 = null;

        EObject lv_classrule_7_0 = null;

        EObject lv_classrule_8_0 = null;

        EObject lv_formlayout_9_0 = null;

        EObject lv_formlayout_10_0 = null;

        EObject lv_additionalSettings_11_0 = null;

        EObject lv_additionalSettings_12_0 = null;

        EObject lv_overviewsettings_13_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:670:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? ( ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )* )? ( ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )* )? ( ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )* )? ( (lv_overviewsettings_13_0= ruleOverviewSettings ) )? otherlv_14= '}' ) )
            // InternalFormValDSL.g:671:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? ( ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )* )? ( ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )* )? ( ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )* )? ( (lv_overviewsettings_13_0= ruleOverviewSettings ) )? otherlv_14= '}' )
            {
            // InternalFormValDSL.g:671:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? ( ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )* )? ( ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )* )? ( ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )* )? ( (lv_overviewsettings_13_0= ruleOverviewSettings ) )? otherlv_14= '}' )
            // InternalFormValDSL.g:672:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? ( ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )* )? ( ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )* )? ( ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )* )? ( ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )* )? ( (lv_overviewsettings_13_0= ruleOverviewSettings ) )? otherlv_14= '}'
            {
            // InternalFormValDSL.g:672:3: ()
            // InternalFormValDSL.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getValidationClassAccess().getValidationClassAction_0(),
            					current);
            			

            }

            // InternalFormValDSL.g:679:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFormValDSL.g:680:4: (lv_name_1_0= ruleEString )
            {
            // InternalFormValDSL.g:680:4: (lv_name_1_0= ruleEString )
            // InternalFormValDSL.g:681:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getValidationClassAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValidationClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.FormValDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getValidationClassAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:702:3: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFormValDSL.g:703:4: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getValidationClassAccess().getLabelKeyword_3_0());
                    			
                    // InternalFormValDSL.g:707:4: ( (lv_label_4_0= ruleEString ) )
                    // InternalFormValDSL.g:708:5: (lv_label_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:708:5: (lv_label_4_0= ruleEString )
                    // InternalFormValDSL.g:709:6: lv_label_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getLabelEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:727:3: ( ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFormValDSL.g:728:4: ( (lv_classattribute_5_0= ruleClassAttribute ) ) ( (lv_classattribute_6_0= ruleClassAttribute ) )*
                    {
                    // InternalFormValDSL.g:728:4: ( (lv_classattribute_5_0= ruleClassAttribute ) )
                    // InternalFormValDSL.g:729:5: (lv_classattribute_5_0= ruleClassAttribute )
                    {
                    // InternalFormValDSL.g:729:5: (lv_classattribute_5_0= ruleClassAttribute )
                    // InternalFormValDSL.g:730:6: lv_classattribute_5_0= ruleClassAttribute
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_classattribute_5_0=ruleClassAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						add(
                    							current,
                    							"classattribute",
                    							lv_classattribute_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.ClassAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:747:4: ( (lv_classattribute_6_0= ruleClassAttribute ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalFormValDSL.g:748:5: (lv_classattribute_6_0= ruleClassAttribute )
                    	    {
                    	    // InternalFormValDSL.g:748:5: (lv_classattribute_6_0= ruleClassAttribute )
                    	    // InternalFormValDSL.g:749:6: lv_classattribute_6_0= ruleClassAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_classattribute_6_0=ruleClassAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"classattribute",
                    	    							lv_classattribute_6_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.ClassAttribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:767:3: ( ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==73||(LA13_0>=75 && LA13_0<=77)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFormValDSL.g:768:4: ( (lv_classrule_7_0= ruleClassRule ) ) ( (lv_classrule_8_0= ruleClassRule ) )*
                    {
                    // InternalFormValDSL.g:768:4: ( (lv_classrule_7_0= ruleClassRule ) )
                    // InternalFormValDSL.g:769:5: (lv_classrule_7_0= ruleClassRule )
                    {
                    // InternalFormValDSL.g:769:5: (lv_classrule_7_0= ruleClassRule )
                    // InternalFormValDSL.g:770:6: lv_classrule_7_0= ruleClassRule
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_classrule_7_0=ruleClassRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						add(
                    							current,
                    							"classrule",
                    							lv_classrule_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.ClassRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:787:4: ( (lv_classrule_8_0= ruleClassRule ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==73||(LA12_0>=75 && LA12_0<=77)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalFormValDSL.g:788:5: (lv_classrule_8_0= ruleClassRule )
                    	    {
                    	    // InternalFormValDSL.g:788:5: (lv_classrule_8_0= ruleClassRule )
                    	    // InternalFormValDSL.g:789:6: lv_classrule_8_0= ruleClassRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_classrule_8_0=ruleClassRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"classrule",
                    	    							lv_classrule_8_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.ClassRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:807:3: ( ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==80||(LA15_0>=82 && LA15_0<=83)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFormValDSL.g:808:4: ( (lv_formlayout_9_0= ruleFormLayout ) ) ( (lv_formlayout_10_0= ruleFormLayout ) )*
                    {
                    // InternalFormValDSL.g:808:4: ( (lv_formlayout_9_0= ruleFormLayout ) )
                    // InternalFormValDSL.g:809:5: (lv_formlayout_9_0= ruleFormLayout )
                    {
                    // InternalFormValDSL.g:809:5: (lv_formlayout_9_0= ruleFormLayout )
                    // InternalFormValDSL.g:810:6: lv_formlayout_9_0= ruleFormLayout
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getFormlayoutFormLayoutParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_formlayout_9_0=ruleFormLayout();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						add(
                    							current,
                    							"formlayout",
                    							lv_formlayout_9_0,
                    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:827:4: ( (lv_formlayout_10_0= ruleFormLayout ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==80||(LA14_0>=82 && LA14_0<=83)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFormValDSL.g:828:5: (lv_formlayout_10_0= ruleFormLayout )
                    	    {
                    	    // InternalFormValDSL.g:828:5: (lv_formlayout_10_0= ruleFormLayout )
                    	    // InternalFormValDSL.g:829:6: lv_formlayout_10_0= ruleFormLayout
                    	    {

                    	    						newCompositeNode(grammarAccess.getValidationClassAccess().getFormlayoutFormLayoutParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_formlayout_10_0=ruleFormLayout();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"formlayout",
                    	    							lv_formlayout_10_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:847:3: ( ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==85||LA17_0==87||LA17_0==89||(LA17_0>=91 && LA17_0<=93)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFormValDSL.g:848:4: ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) ) ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )*
                    {
                    // InternalFormValDSL.g:848:4: ( (lv_additionalSettings_11_0= ruleAdditionalSettings ) )
                    // InternalFormValDSL.g:849:5: (lv_additionalSettings_11_0= ruleAdditionalSettings )
                    {
                    // InternalFormValDSL.g:849:5: (lv_additionalSettings_11_0= ruleAdditionalSettings )
                    // InternalFormValDSL.g:850:6: lv_additionalSettings_11_0= ruleAdditionalSettings
                    {

                    						newCompositeNode(grammarAccess.getValidationClassAccess().getAdditionalSettingsAdditionalSettingsParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_additionalSettings_11_0=ruleAdditionalSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    						}
                    						add(
                    							current,
                    							"additionalSettings",
                    							lv_additionalSettings_11_0,
                    							"org.xtext.example.mydsl.FormValDSL.AdditionalSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:867:4: ( (lv_additionalSettings_12_0= ruleAdditionalSettings ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==85||LA16_0==87||LA16_0==89||(LA16_0>=91 && LA16_0<=93)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalFormValDSL.g:868:5: (lv_additionalSettings_12_0= ruleAdditionalSettings )
                    	    {
                    	    // InternalFormValDSL.g:868:5: (lv_additionalSettings_12_0= ruleAdditionalSettings )
                    	    // InternalFormValDSL.g:869:6: lv_additionalSettings_12_0= ruleAdditionalSettings
                    	    {

                    	    						newCompositeNode(grammarAccess.getValidationClassAccess().getAdditionalSettingsAdditionalSettingsParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_additionalSettings_12_0=ruleAdditionalSettings();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"additionalSettings",
                    	    							lv_additionalSettings_12_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.AdditionalSettings");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:887:3: ( (lv_overviewsettings_13_0= ruleOverviewSettings ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFormValDSL.g:888:4: (lv_overviewsettings_13_0= ruleOverviewSettings )
                    {
                    // InternalFormValDSL.g:888:4: (lv_overviewsettings_13_0= ruleOverviewSettings )
                    // InternalFormValDSL.g:889:5: lv_overviewsettings_13_0= ruleOverviewSettings
                    {

                    					newCompositeNode(grammarAccess.getValidationClassAccess().getOverviewsettingsOverviewSettingsParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_overviewsettings_13_0=ruleOverviewSettings();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValidationClassRule());
                    					}
                    					set(
                    						current,
                    						"overviewsettings",
                    						lv_overviewsettings_13_0,
                    						"org.xtext.example.mydsl.FormValDSL.OverviewSettings");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getValidationClassAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalFormValDSL.g:914:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFormValDSL.g:914:47: (iv_ruleEString= ruleEString EOF )
            // InternalFormValDSL.g:915:2: iv_ruleEString= ruleEString EOF
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
    // InternalFormValDSL.g:921:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:927:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFormValDSL.g:928:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFormValDSL.g:928:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalFormValDSL.g:929:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:937:3: this_ID_1= RULE_ID
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
    // InternalFormValDSL.g:948:1: entryRuleClassAttribute returns [EObject current=null] : iv_ruleClassAttribute= ruleClassAttribute EOF ;
    public final EObject entryRuleClassAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassAttribute = null;


        try {
            // InternalFormValDSL.g:948:55: (iv_ruleClassAttribute= ruleClassAttribute EOF )
            // InternalFormValDSL.g:949:2: iv_ruleClassAttribute= ruleClassAttribute EOF
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
    // InternalFormValDSL.g:955:1: ruleClassAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) ) )? ( (lv_attributetype_4_0= ruleAttributeType ) ) ( (lv_master_5_0= 'Master' ) )? ( (lv_isClassRepresenting_6_0= 'ClassRepresenting' ) )? ( ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleClassAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_master_5_0=null;
        Token lv_isClassRepresenting_6_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_label_3_0 = null;

        EObject lv_attributetype_4_0 = null;

        EObject lv_attributerule_7_0 = null;

        EObject lv_attributerule_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:961:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) ) )? ( (lv_attributetype_4_0= ruleAttributeType ) ) ( (lv_master_5_0= 'Master' ) )? ( (lv_isClassRepresenting_6_0= 'ClassRepresenting' ) )? ( ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )* )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:962:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) ) )? ( (lv_attributetype_4_0= ruleAttributeType ) ) ( (lv_master_5_0= 'Master' ) )? ( (lv_isClassRepresenting_6_0= 'ClassRepresenting' ) )? ( ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )* )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:962:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) ) )? ( (lv_attributetype_4_0= ruleAttributeType ) ) ( (lv_master_5_0= 'Master' ) )? ( (lv_isClassRepresenting_6_0= 'ClassRepresenting' ) )? ( ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )* )? otherlv_9= '}' )
            // InternalFormValDSL.g:963:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) ) )? ( (lv_attributetype_4_0= ruleAttributeType ) ) ( (lv_master_5_0= 'Master' ) )? ( (lv_isClassRepresenting_6_0= 'ClassRepresenting' ) )? ( ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )* )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:963:3: ( (lv_name_0_0= ruleEString ) )
            // InternalFormValDSL.g:964:4: (lv_name_0_0= ruleEString )
            {
            // InternalFormValDSL.g:964:4: (lv_name_0_0= ruleEString )
            // InternalFormValDSL.g:965:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAttributeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.FormValDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFormValDSL.g:986:3: (otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFormValDSL.g:987:4: otherlv_2= 'Label' ( (lv_label_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassAttributeAccess().getLabelKeyword_2_0());
                    			
                    // InternalFormValDSL.g:991:4: ( (lv_label_3_0= ruleEString ) )
                    // InternalFormValDSL.g:992:5: (lv_label_3_0= ruleEString )
                    {
                    // InternalFormValDSL.g:992:5: (lv_label_3_0= ruleEString )
                    // InternalFormValDSL.g:993:6: lv_label_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClassAttributeAccess().getLabelEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_label_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassAttributeRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_3_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1011:3: ( (lv_attributetype_4_0= ruleAttributeType ) )
            // InternalFormValDSL.g:1012:4: (lv_attributetype_4_0= ruleAttributeType )
            {
            // InternalFormValDSL.g:1012:4: (lv_attributetype_4_0= ruleAttributeType )
            // InternalFormValDSL.g:1013:5: lv_attributetype_4_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getClassAttributeAccess().getAttributetypeAttributeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_attributetype_4_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassAttributeRule());
            					}
            					set(
            						current,
            						"attributetype",
            						lv_attributetype_4_0,
            						"org.xtext.example.mydsl.FormValDSL.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormValDSL.g:1030:3: ( (lv_master_5_0= 'Master' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFormValDSL.g:1031:4: (lv_master_5_0= 'Master' )
                    {
                    // InternalFormValDSL.g:1031:4: (lv_master_5_0= 'Master' )
                    // InternalFormValDSL.g:1032:5: lv_master_5_0= 'Master'
                    {
                    lv_master_5_0=(Token)match(input,16,FOLLOW_16); 

                    					newLeafNode(lv_master_5_0, grammarAccess.getClassAttributeAccess().getMasterMasterKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassAttributeRule());
                    					}
                    					setWithLastConsumed(current, "master", true, "Master");
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1044:3: ( (lv_isClassRepresenting_6_0= 'ClassRepresenting' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFormValDSL.g:1045:4: (lv_isClassRepresenting_6_0= 'ClassRepresenting' )
                    {
                    // InternalFormValDSL.g:1045:4: (lv_isClassRepresenting_6_0= 'ClassRepresenting' )
                    // InternalFormValDSL.g:1046:5: lv_isClassRepresenting_6_0= 'ClassRepresenting'
                    {
                    lv_isClassRepresenting_6_0=(Token)match(input,17,FOLLOW_17); 

                    					newLeafNode(lv_isClassRepresenting_6_0, grammarAccess.getClassAttributeAccess().getIsClassRepresentingClassRepresentingKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isClassRepresenting", true, "ClassRepresenting");
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1058:3: ( ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=57 && LA24_0<=63)||(LA24_0>=65 && LA24_0<=66)||(LA24_0>=68 && LA24_0<=70)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalFormValDSL.g:1059:4: ( (lv_attributerule_7_0= ruleAttributeRule ) ) ( (lv_attributerule_8_0= ruleAttributeRule ) )*
                    {
                    // InternalFormValDSL.g:1059:4: ( (lv_attributerule_7_0= ruleAttributeRule ) )
                    // InternalFormValDSL.g:1060:5: (lv_attributerule_7_0= ruleAttributeRule )
                    {
                    // InternalFormValDSL.g:1060:5: (lv_attributerule_7_0= ruleAttributeRule )
                    // InternalFormValDSL.g:1061:6: lv_attributerule_7_0= ruleAttributeRule
                    {

                    						newCompositeNode(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_attributerule_7_0=ruleAttributeRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassAttributeRule());
                    						}
                    						add(
                    							current,
                    							"attributerule",
                    							lv_attributerule_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:1078:4: ( (lv_attributerule_8_0= ruleAttributeRule ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=57 && LA23_0<=63)||(LA23_0>=65 && LA23_0<=66)||(LA23_0>=68 && LA23_0<=70)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalFormValDSL.g:1079:5: (lv_attributerule_8_0= ruleAttributeRule )
                    	    {
                    	    // InternalFormValDSL.g:1079:5: (lv_attributerule_8_0= ruleAttributeRule )
                    	    // InternalFormValDSL.g:1080:6: lv_attributerule_8_0= ruleAttributeRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_attributerule_8_0=ruleAttributeRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassAttributeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributerule",
                    	    							lv_attributerule_8_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.AttributeRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClassAttributeAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleOverviewSettings"
    // InternalFormValDSL.g:1106:1: entryRuleOverviewSettings returns [EObject current=null] : iv_ruleOverviewSettings= ruleOverviewSettings EOF ;
    public final EObject entryRuleOverviewSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverviewSettings = null;


        try {
            // InternalFormValDSL.g:1106:57: (iv_ruleOverviewSettings= ruleOverviewSettings EOF )
            // InternalFormValDSL.g:1107:2: iv_ruleOverviewSettings= ruleOverviewSettings EOF
            {
             newCompositeNode(grammarAccess.getOverviewSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOverviewSettings=ruleOverviewSettings();

            state._fsp--;

             current =iv_ruleOverviewSettings; 
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
    // $ANTLR end "entryRuleOverviewSettings"


    // $ANTLR start "ruleOverviewSettings"
    // InternalFormValDSL.g:1113:1: ruleOverviewSettings returns [EObject current=null] : ( () otherlv_1= 'OverviewSettings' otherlv_2= '{' ( (lv_tableoverview_3_0= ruleTableOverview ) )? otherlv_4= '}' ) ;
    public final EObject ruleOverviewSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tableoverview_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1119:2: ( ( () otherlv_1= 'OverviewSettings' otherlv_2= '{' ( (lv_tableoverview_3_0= ruleTableOverview ) )? otherlv_4= '}' ) )
            // InternalFormValDSL.g:1120:2: ( () otherlv_1= 'OverviewSettings' otherlv_2= '{' ( (lv_tableoverview_3_0= ruleTableOverview ) )? otherlv_4= '}' )
            {
            // InternalFormValDSL.g:1120:2: ( () otherlv_1= 'OverviewSettings' otherlv_2= '{' ( (lv_tableoverview_3_0= ruleTableOverview ) )? otherlv_4= '}' )
            // InternalFormValDSL.g:1121:3: () otherlv_1= 'OverviewSettings' otherlv_2= '{' ( (lv_tableoverview_3_0= ruleTableOverview ) )? otherlv_4= '}'
            {
            // InternalFormValDSL.g:1121:3: ()
            // InternalFormValDSL.g:1122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOverviewSettingsAccess().getOverviewSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOverviewSettingsAccess().getOverviewSettingsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getOverviewSettingsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1136:3: ( (lv_tableoverview_3_0= ruleTableOverview ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==94) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFormValDSL.g:1137:4: (lv_tableoverview_3_0= ruleTableOverview )
                    {
                    // InternalFormValDSL.g:1137:4: (lv_tableoverview_3_0= ruleTableOverview )
                    // InternalFormValDSL.g:1138:5: lv_tableoverview_3_0= ruleTableOverview
                    {

                    					newCompositeNode(grammarAccess.getOverviewSettingsAccess().getTableoverviewTableOverviewParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_tableoverview_3_0=ruleTableOverview();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOverviewSettingsRule());
                    					}
                    					set(
                    						current,
                    						"tableoverview",
                    						lv_tableoverview_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.TableOverview");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOverviewSettingsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleOverviewSettings"


    // $ANTLR start "entryRuleAttributeType"
    // InternalFormValDSL.g:1163:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalFormValDSL.g:1163:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalFormValDSL.g:1164:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalFormValDSL.g:1170:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'Data type' ( (lv_attributeDataType_1_0= ruleAttributeDataType ) ) ( (lv_uiComponent_2_0= ruleUIComponent ) )? ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributeDataType_1_0 = null;

        EObject lv_uiComponent_2_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1176:2: ( (otherlv_0= 'Data type' ( (lv_attributeDataType_1_0= ruleAttributeDataType ) ) ( (lv_uiComponent_2_0= ruleUIComponent ) )? ) )
            // InternalFormValDSL.g:1177:2: (otherlv_0= 'Data type' ( (lv_attributeDataType_1_0= ruleAttributeDataType ) ) ( (lv_uiComponent_2_0= ruleUIComponent ) )? )
            {
            // InternalFormValDSL.g:1177:2: (otherlv_0= 'Data type' ( (lv_attributeDataType_1_0= ruleAttributeDataType ) ) ( (lv_uiComponent_2_0= ruleUIComponent ) )? )
            // InternalFormValDSL.g:1178:3: otherlv_0= 'Data type' ( (lv_attributeDataType_1_0= ruleAttributeDataType ) ) ( (lv_uiComponent_2_0= ruleUIComponent ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getDataTypeKeyword_0());
            		
            // InternalFormValDSL.g:1182:3: ( (lv_attributeDataType_1_0= ruleAttributeDataType ) )
            // InternalFormValDSL.g:1183:4: (lv_attributeDataType_1_0= ruleAttributeDataType )
            {
            // InternalFormValDSL.g:1183:4: (lv_attributeDataType_1_0= ruleAttributeDataType )
            // InternalFormValDSL.g:1184:5: lv_attributeDataType_1_0= ruleAttributeDataType
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getAttributeDataTypeAttributeDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_attributeDataType_1_0=ruleAttributeDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"attributeDataType",
            						lv_attributeDataType_1_0,
            						"org.xtext.example.mydsl.FormValDSL.AttributeDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormValDSL.g:1201:3: ( (lv_uiComponent_2_0= ruleUIComponent ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22||LA26_0==27||LA26_0==29||(LA26_0>=31 && LA26_0<=32)||LA26_0==34||LA26_0==36||(LA26_0>=38 && LA26_0<=40)||LA26_0==42||LA26_0==44||(LA26_0>=48 && LA26_0<=50)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFormValDSL.g:1202:4: (lv_uiComponent_2_0= ruleUIComponent )
                    {
                    // InternalFormValDSL.g:1202:4: (lv_uiComponent_2_0= ruleUIComponent )
                    // InternalFormValDSL.g:1203:5: lv_uiComponent_2_0= ruleUIComponent
                    {

                    					newCompositeNode(grammarAccess.getAttributeTypeAccess().getUiComponentUIComponentParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_uiComponent_2_0=ruleUIComponent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
                    					}
                    					set(
                    						current,
                    						"uiComponent",
                    						lv_uiComponent_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.UIComponent");
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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleEBoolean"
    // InternalFormValDSL.g:1224:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalFormValDSL.g:1224:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalFormValDSL.g:1225:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalFormValDSL.g:1231:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:1237:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalFormValDSL.g:1238:2: (kw= 'true' | kw= 'false' )
            {
            // InternalFormValDSL.g:1238:2: (kw= 'true' | kw= 'false' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            else if ( (LA27_0==21) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalFormValDSL.g:1239:3: kw= 'true'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:1245:3: kw= 'false'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleNumericUIComponent"
    // InternalFormValDSL.g:1254:1: entryRuleNumericUIComponent returns [EObject current=null] : iv_ruleNumericUIComponent= ruleNumericUIComponent EOF ;
    public final EObject entryRuleNumericUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericUIComponent = null;


        try {
            // InternalFormValDSL.g:1254:59: (iv_ruleNumericUIComponent= ruleNumericUIComponent EOF )
            // InternalFormValDSL.g:1255:2: iv_ruleNumericUIComponent= ruleNumericUIComponent EOF
            {
             newCompositeNode(grammarAccess.getNumericUIComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericUIComponent=ruleNumericUIComponent();

            state._fsp--;

             current =iv_ruleNumericUIComponent; 
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
    // $ANTLR end "entryRuleNumericUIComponent"


    // $ANTLR start "ruleNumericUIComponent"
    // InternalFormValDSL.g:1261:1: ruleNumericUIComponent returns [EObject current=null] : ( () otherlv_1= 'NumericUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) ) )? (otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleNumericUIComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_defaultValue_8_0 = null;

        Enumerator lv_componentType_10_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1267:2: ( ( () otherlv_1= 'NumericUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) ) )? (otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) ) )? otherlv_11= '}' ) )
            // InternalFormValDSL.g:1268:2: ( () otherlv_1= 'NumericUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) ) )? (otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) ) )? otherlv_11= '}' )
            {
            // InternalFormValDSL.g:1268:2: ( () otherlv_1= 'NumericUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) ) )? (otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) ) )? otherlv_11= '}' )
            // InternalFormValDSL.g:1269:3: () otherlv_1= 'NumericUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) ) )? (otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) ) )? otherlv_11= '}'
            {
            // InternalFormValDSL.g:1269:3: ()
            // InternalFormValDSL.g:1270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumericUIComponentAccess().getNumericUIComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericUIComponentAccess().getNumericUIComponentKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getNumericUIComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1284:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFormValDSL.g:1285:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNumericUIComponentAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:1289:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:1290:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1290:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:1291:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNumericUIComponentAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1309:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFormValDSL.g:1310:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getNumericUIComponentAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:1314:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:1315:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1315:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:1316:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNumericUIComponentAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1334:3: (otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalFormValDSL.g:1335:4: otherlv_7= 'Default value' ( (lv_defaultValue_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getNumericUIComponentAccess().getDefaultValueKeyword_5_0());
                    			
                    // InternalFormValDSL.g:1339:4: ( (lv_defaultValue_8_0= ruleEDouble ) )
                    // InternalFormValDSL.g:1340:5: (lv_defaultValue_8_0= ruleEDouble )
                    {
                    // InternalFormValDSL.g:1340:5: (lv_defaultValue_8_0= ruleEDouble )
                    // InternalFormValDSL.g:1341:6: lv_defaultValue_8_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getNumericUIComponentAccess().getDefaultValueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_defaultValue_8_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"defaultValue",
                    							lv_defaultValue_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1359:3: (otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFormValDSL.g:1360:4: otherlv_9= 'Component type' ( (lv_componentType_10_0= ruleEUINumberComponentType ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getNumericUIComponentAccess().getComponentTypeKeyword_6_0());
                    			
                    // InternalFormValDSL.g:1364:4: ( (lv_componentType_10_0= ruleEUINumberComponentType ) )
                    // InternalFormValDSL.g:1365:5: (lv_componentType_10_0= ruleEUINumberComponentType )
                    {
                    // InternalFormValDSL.g:1365:5: (lv_componentType_10_0= ruleEUINumberComponentType )
                    // InternalFormValDSL.g:1366:6: lv_componentType_10_0= ruleEUINumberComponentType
                    {

                    						newCompositeNode(grammarAccess.getNumericUIComponentAccess().getComponentTypeEUINumberComponentTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_componentType_10_0=ruleEUINumberComponentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumericUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"componentType",
                    							lv_componentType_10_0,
                    							"org.xtext.example.mydsl.FormValDSL.EUINumberComponentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getNumericUIComponentAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleNumericUIComponent"


    // $ANTLR start "entryRuleRadioButton"
    // InternalFormValDSL.g:1392:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // InternalFormValDSL.g:1392:52: (iv_ruleRadioButton= ruleRadioButton EOF )
            // InternalFormValDSL.g:1393:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // InternalFormValDSL.g:1399:1: ruleRadioButton returns [EObject current=null] : ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        Enumerator lv_orientation_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1405:2: ( ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:1406:2: ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:1406:2: ( () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:1407:3: () otherlv_1= 'RadioButton' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:1407:3: ()
            // InternalFormValDSL.g:1408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRadioButtonAccess().getRadioButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRadioButtonAccess().getRadioButtonKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRadioButtonAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1422:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFormValDSL.g:1423:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRadioButtonAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:1427:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:1428:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1428:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:1429:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadioButtonAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadioButtonRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1447:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFormValDSL.g:1448:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRadioButtonAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:1452:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:1453:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1453:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:1454:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRadioButtonAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadioButtonRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1472:3: (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalFormValDSL.g:1473:4: otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getRadioButtonAccess().getOrientationKeyword_5_0());
                    			
                    // InternalFormValDSL.g:1477:4: ( (lv_orientation_8_0= ruleEOrientation ) )
                    // InternalFormValDSL.g:1478:5: (lv_orientation_8_0= ruleEOrientation )
                    {
                    // InternalFormValDSL.g:1478:5: (lv_orientation_8_0= ruleEOrientation )
                    // InternalFormValDSL.g:1479:6: lv_orientation_8_0= ruleEOrientation
                    {

                    						newCompositeNode(grammarAccess.getRadioButtonAccess().getOrientationEOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_orientation_8_0=ruleEOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRadioButtonRule());
                    						}
                    						set(
                    							current,
                    							"orientation",
                    							lv_orientation_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EOrientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRadioButtonAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleDropDownList"
    // InternalFormValDSL.g:1505:1: entryRuleDropDownList returns [EObject current=null] : iv_ruleDropDownList= ruleDropDownList EOF ;
    public final EObject entryRuleDropDownList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropDownList = null;


        try {
            // InternalFormValDSL.g:1505:53: (iv_ruleDropDownList= ruleDropDownList EOF )
            // InternalFormValDSL.g:1506:2: iv_ruleDropDownList= ruleDropDownList EOF
            {
             newCompositeNode(grammarAccess.getDropDownListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropDownList=ruleDropDownList();

            state._fsp--;

             current =iv_ruleDropDownList; 
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
    // $ANTLR end "entryRuleDropDownList"


    // $ANTLR start "ruleDropDownList"
    // InternalFormValDSL.g:1512:1: ruleDropDownList returns [EObject current=null] : ( () otherlv_1= 'DropDownList' otherlv_2= '{' ( (lv_isMultiSelect_3_0= 'MultiSelectable' ) )? (otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleDropDownList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isMultiSelect_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tooltip_5_0 = null;

        AntlrDatatypeRuleToken lv_note_7_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1518:2: ( ( () otherlv_1= 'DropDownList' otherlv_2= '{' ( (lv_isMultiSelect_3_0= 'MultiSelectable' ) )? (otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalFormValDSL.g:1519:2: ( () otherlv_1= 'DropDownList' otherlv_2= '{' ( (lv_isMultiSelect_3_0= 'MultiSelectable' ) )? (otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalFormValDSL.g:1519:2: ( () otherlv_1= 'DropDownList' otherlv_2= '{' ( (lv_isMultiSelect_3_0= 'MultiSelectable' ) )? (otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalFormValDSL.g:1520:3: () otherlv_1= 'DropDownList' otherlv_2= '{' ( (lv_isMultiSelect_3_0= 'MultiSelectable' ) )? (otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalFormValDSL.g:1520:3: ()
            // InternalFormValDSL.g:1521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropDownListAccess().getDropDownListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDropDownListAccess().getDropDownListKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getDropDownListAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1535:3: ( (lv_isMultiSelect_3_0= 'MultiSelectable' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFormValDSL.g:1536:4: (lv_isMultiSelect_3_0= 'MultiSelectable' )
                    {
                    // InternalFormValDSL.g:1536:4: (lv_isMultiSelect_3_0= 'MultiSelectable' )
                    // InternalFormValDSL.g:1537:5: lv_isMultiSelect_3_0= 'MultiSelectable'
                    {
                    lv_isMultiSelect_3_0=(Token)match(input,30,FOLLOW_32); 

                    					newLeafNode(lv_isMultiSelect_3_0, grammarAccess.getDropDownListAccess().getIsMultiSelectMultiSelectableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDropDownListRule());
                    					}
                    					setWithLastConsumed(current, "isMultiSelect", true, "MultiSelectable");
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1549:3: (otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalFormValDSL.g:1550:4: otherlv_4= 'Tooltip' ( (lv_tooltip_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDropDownListAccess().getTooltipKeyword_4_0());
                    			
                    // InternalFormValDSL.g:1554:4: ( (lv_tooltip_5_0= ruleEString ) )
                    // InternalFormValDSL.g:1555:5: (lv_tooltip_5_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1555:5: (lv_tooltip_5_0= ruleEString )
                    // InternalFormValDSL.g:1556:6: lv_tooltip_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropDownListAccess().getTooltipEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_tooltip_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropDownListRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1574:3: (otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalFormValDSL.g:1575:4: otherlv_6= 'Note' ( (lv_note_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDropDownListAccess().getNoteKeyword_5_0());
                    			
                    // InternalFormValDSL.g:1579:4: ( (lv_note_7_0= ruleEString ) )
                    // InternalFormValDSL.g:1580:5: (lv_note_7_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1580:5: (lv_note_7_0= ruleEString )
                    // InternalFormValDSL.g:1581:6: lv_note_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDropDownListAccess().getNoteEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_note_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDropDownListRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDropDownListAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDropDownList"


    // $ANTLR start "entryRuleCheckBox"
    // InternalFormValDSL.g:1607:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalFormValDSL.g:1607:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalFormValDSL.g:1608:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalFormValDSL.g:1614:1: ruleCheckBox returns [EObject current=null] : ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        Enumerator lv_orientation_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1620:2: ( ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:1621:2: ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:1621:2: ( () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:1622:3: () otherlv_1= 'CheckBox' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:1622:3: ()
            // InternalFormValDSL.g:1623:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCheckBoxAccess().getCheckBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getCheckBoxAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1637:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalFormValDSL.g:1638:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCheckBoxAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:1642:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:1643:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1643:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:1644:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckBoxAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckBoxRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1662:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalFormValDSL.g:1663:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCheckBoxAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:1667:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:1668:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1668:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:1669:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCheckBoxAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckBoxRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1687:3: (otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalFormValDSL.g:1688:4: otherlv_7= 'Orientation' ( (lv_orientation_8_0= ruleEOrientation ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getCheckBoxAccess().getOrientationKeyword_5_0());
                    			
                    // InternalFormValDSL.g:1692:4: ( (lv_orientation_8_0= ruleEOrientation ) )
                    // InternalFormValDSL.g:1693:5: (lv_orientation_8_0= ruleEOrientation )
                    {
                    // InternalFormValDSL.g:1693:5: (lv_orientation_8_0= ruleEOrientation )
                    // InternalFormValDSL.g:1694:6: lv_orientation_8_0= ruleEOrientation
                    {

                    						newCompositeNode(grammarAccess.getCheckBoxAccess().getOrientationEOrientationEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_orientation_8_0=ruleEOrientation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckBoxRule());
                    						}
                    						set(
                    							current,
                    							"orientation",
                    							lv_orientation_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EOrientation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCheckBoxAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleDateUIComponent"
    // InternalFormValDSL.g:1720:1: entryRuleDateUIComponent returns [EObject current=null] : iv_ruleDateUIComponent= ruleDateUIComponent EOF ;
    public final EObject entryRuleDateUIComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateUIComponent = null;


        try {
            // InternalFormValDSL.g:1720:56: (iv_ruleDateUIComponent= ruleDateUIComponent EOF )
            // InternalFormValDSL.g:1721:2: iv_ruleDateUIComponent= ruleDateUIComponent EOF
            {
             newCompositeNode(grammarAccess.getDateUIComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateUIComponent=ruleDateUIComponent();

            state._fsp--;

             current =iv_ruleDateUIComponent; 
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
    // $ANTLR end "entryRuleDateUIComponent"


    // $ANTLR start "ruleDateUIComponent"
    // InternalFormValDSL.g:1727:1: ruleDateUIComponent returns [EObject current=null] : ( () otherlv_1= 'DateUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleDateUIComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1733:2: ( ( () otherlv_1= 'DateUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:1734:2: ( () otherlv_1= 'DateUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:1734:2: ( () otherlv_1= 'DateUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:1735:3: () otherlv_1= 'DateUIComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:1735:3: ()
            // InternalFormValDSL.g:1736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateUIComponentAccess().getDateUIComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDateUIComponentAccess().getDateUIComponentKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getDateUIComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1750:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==23) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalFormValDSL.g:1751:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateUIComponentAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:1755:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:1756:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1756:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:1757:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDateUIComponentAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1775:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalFormValDSL.g:1776:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getDateUIComponentAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:1780:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:1781:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1781:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:1782:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDateUIComponentAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1800:3: (otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalFormValDSL.g:1801:4: otherlv_7= 'Type' ( (lv_type_8_0= ruleEDateUIType ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_37); 

                    				newLeafNode(otherlv_7, grammarAccess.getDateUIComponentAccess().getTypeKeyword_5_0());
                    			
                    // InternalFormValDSL.g:1805:4: ( (lv_type_8_0= ruleEDateUIType ) )
                    // InternalFormValDSL.g:1806:5: (lv_type_8_0= ruleEDateUIType )
                    {
                    // InternalFormValDSL.g:1806:5: (lv_type_8_0= ruleEDateUIType )
                    // InternalFormValDSL.g:1807:6: lv_type_8_0= ruleEDateUIType
                    {

                    						newCompositeNode(grammarAccess.getDateUIComponentAccess().getTypeEDateUITypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_type_8_0=ruleEDateUIType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateUIComponentRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EDateUIType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDateUIComponentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDateUIComponent"


    // $ANTLR start "entryRuleTextInput"
    // InternalFormValDSL.g:1833:1: entryRuleTextInput returns [EObject current=null] : iv_ruleTextInput= ruleTextInput EOF ;
    public final EObject entryRuleTextInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextInput = null;


        try {
            // InternalFormValDSL.g:1833:50: (iv_ruleTextInput= ruleTextInput EOF )
            // InternalFormValDSL.g:1834:2: iv_ruleTextInput= ruleTextInput EOF
            {
             newCompositeNode(grammarAccess.getTextInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextInput=ruleTextInput();

            state._fsp--;

             current =iv_ruleTextInput; 
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
    // $ANTLR end "entryRuleTextInput"


    // $ANTLR start "ruleTextInput"
    // InternalFormValDSL.g:1840:1: ruleTextInput returns [EObject current=null] : ( () otherlv_1= 'TextInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTextInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_placeHolder_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1846:2: ( ( () otherlv_1= 'TextInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:1847:2: ( () otherlv_1= 'TextInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:1847:2: ( () otherlv_1= 'TextInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:1848:3: () otherlv_1= 'TextInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:1848:3: ()
            // InternalFormValDSL.g:1849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextInputAccess().getTextInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTextInputAccess().getTextInputKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getTextInputAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1863:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==23) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalFormValDSL.g:1864:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextInputAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:1868:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:1869:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1869:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:1870:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextInputAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextInputRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1888:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalFormValDSL.g:1889:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextInputAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:1893:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:1894:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1894:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:1895:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextInputAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextInputRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:1913:3: (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalFormValDSL.g:1914:4: otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextInputAccess().getPlaceHolderKeyword_5_0());
                    			
                    // InternalFormValDSL.g:1918:4: ( (lv_placeHolder_8_0= ruleEString ) )
                    // InternalFormValDSL.g:1919:5: (lv_placeHolder_8_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1919:5: (lv_placeHolder_8_0= ruleEString )
                    // InternalFormValDSL.g:1920:6: lv_placeHolder_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextInputAccess().getPlaceHolderEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_placeHolder_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextInputRule());
                    						}
                    						set(
                    							current,
                    							"placeHolder",
                    							lv_placeHolder_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTextInputAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTextInput"


    // $ANTLR start "entryRuleTextArea"
    // InternalFormValDSL.g:1946:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // InternalFormValDSL.g:1946:49: (iv_ruleTextArea= ruleTextArea EOF )
            // InternalFormValDSL.g:1947:2: iv_ruleTextArea= ruleTextArea EOF
            {
             newCompositeNode(grammarAccess.getTextAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;

             current =iv_ruleTextArea; 
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
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // InternalFormValDSL.g:1953:1: ruleTextArea returns [EObject current=null] : ( () otherlv_1= 'TextArea' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_placeHolder_8_0 = null;

        AntlrDatatypeRuleToken lv_numOfRows_10_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:1959:2: ( ( () otherlv_1= 'TextArea' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) ) )? otherlv_11= '}' ) )
            // InternalFormValDSL.g:1960:2: ( () otherlv_1= 'TextArea' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) ) )? otherlv_11= '}' )
            {
            // InternalFormValDSL.g:1960:2: ( () otherlv_1= 'TextArea' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) ) )? otherlv_11= '}' )
            // InternalFormValDSL.g:1961:3: () otherlv_1= 'TextArea' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) ) )? otherlv_11= '}'
            {
            // InternalFormValDSL.g:1961:3: ()
            // InternalFormValDSL.g:1962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextAreaAccess().getTextAreaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAreaAccess().getTextAreaKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAreaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:1976:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalFormValDSL.g:1977:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextAreaAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:1981:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:1982:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:1982:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:1983:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2001:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalFormValDSL.g:2002:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextAreaAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2006:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2007:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2007:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2008:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2026:3: (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalFormValDSL.g:2027:4: otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAreaAccess().getPlaceHolderKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2031:4: ( (lv_placeHolder_8_0= ruleEString ) )
                    // InternalFormValDSL.g:2032:5: (lv_placeHolder_8_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2032:5: (lv_placeHolder_8_0= ruleEString )
                    // InternalFormValDSL.g:2033:6: lv_placeHolder_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getPlaceHolderEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_placeHolder_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"placeHolder",
                    							lv_placeHolder_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2051:3: (otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalFormValDSL.g:2052:4: otherlv_9= 'Number of rows' ( (lv_numOfRows_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextAreaAccess().getNumberOfRowsKeyword_6_0());
                    			
                    // InternalFormValDSL.g:2056:4: ( (lv_numOfRows_10_0= ruleEInt ) )
                    // InternalFormValDSL.g:2057:5: (lv_numOfRows_10_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:2057:5: (lv_numOfRows_10_0= ruleEInt )
                    // InternalFormValDSL.g:2058:6: lv_numOfRows_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaAccess().getNumOfRowsEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_numOfRows_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    						}
                    						set(
                    							current,
                    							"numOfRows",
                    							lv_numOfRows_10_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTextAreaAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleTelInput"
    // InternalFormValDSL.g:2084:1: entryRuleTelInput returns [EObject current=null] : iv_ruleTelInput= ruleTelInput EOF ;
    public final EObject entryRuleTelInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTelInput = null;


        try {
            // InternalFormValDSL.g:2084:49: (iv_ruleTelInput= ruleTelInput EOF )
            // InternalFormValDSL.g:2085:2: iv_ruleTelInput= ruleTelInput EOF
            {
             newCompositeNode(grammarAccess.getTelInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTelInput=ruleTelInput();

            state._fsp--;

             current =iv_ruleTelInput; 
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
    // $ANTLR end "entryRuleTelInput"


    // $ANTLR start "ruleTelInput"
    // InternalFormValDSL.g:2091:1: ruleTelInput returns [EObject current=null] : ( () otherlv_1= 'TelInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleTelInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_placeHolder_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2097:2: ( ( () otherlv_1= 'TelInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:2098:2: ( () otherlv_1= 'TelInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:2098:2: ( () otherlv_1= 'TelInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:2099:3: () otherlv_1= 'TelInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:2099:3: ()
            // InternalFormValDSL.g:2100:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTelInputAccess().getTelInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTelInputAccess().getTelInputKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getTelInputAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:2114:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalFormValDSL.g:2115:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getTelInputAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:2119:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:2120:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2120:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:2121:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTelInputAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTelInputRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2139:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalFormValDSL.g:2140:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTelInputAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2144:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2145:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2145:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2146:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTelInputAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTelInputRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2164:3: (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==35) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalFormValDSL.g:2165:4: otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTelInputAccess().getPlaceHolderKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2169:4: ( (lv_placeHolder_8_0= ruleEString ) )
                    // InternalFormValDSL.g:2170:5: (lv_placeHolder_8_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2170:5: (lv_placeHolder_8_0= ruleEString )
                    // InternalFormValDSL.g:2171:6: lv_placeHolder_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTelInputAccess().getPlaceHolderEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_placeHolder_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTelInputRule());
                    						}
                    						set(
                    							current,
                    							"placeHolder",
                    							lv_placeHolder_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTelInputAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTelInput"


    // $ANTLR start "entryRuleEmailInput"
    // InternalFormValDSL.g:2197:1: entryRuleEmailInput returns [EObject current=null] : iv_ruleEmailInput= ruleEmailInput EOF ;
    public final EObject entryRuleEmailInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmailInput = null;


        try {
            // InternalFormValDSL.g:2197:51: (iv_ruleEmailInput= ruleEmailInput EOF )
            // InternalFormValDSL.g:2198:2: iv_ruleEmailInput= ruleEmailInput EOF
            {
             newCompositeNode(grammarAccess.getEmailInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmailInput=ruleEmailInput();

            state._fsp--;

             current =iv_ruleEmailInput; 
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
    // $ANTLR end "entryRuleEmailInput"


    // $ANTLR start "ruleEmailInput"
    // InternalFormValDSL.g:2204:1: ruleEmailInput returns [EObject current=null] : ( () otherlv_1= 'EmailInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEmailInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_placeHolder_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2210:2: ( ( () otherlv_1= 'EmailInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:2211:2: ( () otherlv_1= 'EmailInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:2211:2: ( () otherlv_1= 'EmailInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:2212:3: () otherlv_1= 'EmailInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:2212:3: ()
            // InternalFormValDSL.g:2213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmailInputAccess().getEmailInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEmailInputAccess().getEmailInputKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getEmailInputAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:2227:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalFormValDSL.g:2228:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmailInputAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:2232:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:2233:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2233:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:2234:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmailInputAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmailInputRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2252:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==24) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalFormValDSL.g:2253:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEmailInputAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2257:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2258:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2258:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2259:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmailInputAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmailInputRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2277:3: (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalFormValDSL.g:2278:4: otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getEmailInputAccess().getPlaceHolderKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2282:4: ( (lv_placeHolder_8_0= ruleEString ) )
                    // InternalFormValDSL.g:2283:5: (lv_placeHolder_8_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2283:5: (lv_placeHolder_8_0= ruleEString )
                    // InternalFormValDSL.g:2284:6: lv_placeHolder_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmailInputAccess().getPlaceHolderEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_placeHolder_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmailInputRule());
                    						}
                    						set(
                    							current,
                    							"placeHolder",
                    							lv_placeHolder_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEmailInputAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEmailInput"


    // $ANTLR start "entryRulePassword"
    // InternalFormValDSL.g:2310:1: entryRulePassword returns [EObject current=null] : iv_rulePassword= rulePassword EOF ;
    public final EObject entryRulePassword() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassword = null;


        try {
            // InternalFormValDSL.g:2310:49: (iv_rulePassword= rulePassword EOF )
            // InternalFormValDSL.g:2311:2: iv_rulePassword= rulePassword EOF
            {
             newCompositeNode(grammarAccess.getPasswordRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassword=rulePassword();

            state._fsp--;

             current =iv_rulePassword; 
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
    // $ANTLR end "entryRulePassword"


    // $ANTLR start "rulePassword"
    // InternalFormValDSL.g:2317:1: rulePassword returns [EObject current=null] : ( () otherlv_1= 'Password' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) ) )? otherlv_11= '}' ) ;
    public final EObject rulePassword() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_placeHolder_8_0 = null;

        AntlrDatatypeRuleToken lv_visible_10_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2323:2: ( ( () otherlv_1= 'Password' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) ) )? otherlv_11= '}' ) )
            // InternalFormValDSL.g:2324:2: ( () otherlv_1= 'Password' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) ) )? otherlv_11= '}' )
            {
            // InternalFormValDSL.g:2324:2: ( () otherlv_1= 'Password' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) ) )? otherlv_11= '}' )
            // InternalFormValDSL.g:2325:3: () otherlv_1= 'Password' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )? (otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) ) )? otherlv_11= '}'
            {
            // InternalFormValDSL.g:2325:3: ()
            // InternalFormValDSL.g:2326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPasswordAccess().getPasswordAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPasswordAccess().getPasswordKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPasswordAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:2340:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==23) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalFormValDSL.g:2341:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPasswordAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:2345:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:2346:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2346:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:2347:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPasswordAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPasswordRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2365:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==24) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalFormValDSL.g:2366:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getPasswordAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2370:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2371:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2371:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2372:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPasswordAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPasswordRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2390:3: (otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==35) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalFormValDSL.g:2391:4: otherlv_7= 'Place holder' ( (lv_placeHolder_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getPasswordAccess().getPlaceHolderKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2395:4: ( (lv_placeHolder_8_0= ruleEString ) )
                    // InternalFormValDSL.g:2396:5: (lv_placeHolder_8_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2396:5: (lv_placeHolder_8_0= ruleEString )
                    // InternalFormValDSL.g:2397:6: lv_placeHolder_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPasswordAccess().getPlaceHolderEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_placeHolder_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPasswordRule());
                    						}
                    						set(
                    							current,
                    							"placeHolder",
                    							lv_placeHolder_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2415:3: (otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==41) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalFormValDSL.g:2416:4: otherlv_9= 'Visible' ( (lv_visible_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getPasswordAccess().getVisibleKeyword_6_0());
                    			
                    // InternalFormValDSL.g:2420:4: ( (lv_visible_10_0= ruleEBoolean ) )
                    // InternalFormValDSL.g:2421:5: (lv_visible_10_0= ruleEBoolean )
                    {
                    // InternalFormValDSL.g:2421:5: (lv_visible_10_0= ruleEBoolean )
                    // InternalFormValDSL.g:2422:6: lv_visible_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPasswordAccess().getVisibleEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_visible_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPasswordRule());
                    						}
                    						set(
                    							current,
                    							"visible",
                    							lv_visible_10_0,
                    							"org.xtext.example.mydsl.FormValDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPasswordAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePassword"


    // $ANTLR start "entryRuleFileInput"
    // InternalFormValDSL.g:2448:1: entryRuleFileInput returns [EObject current=null] : iv_ruleFileInput= ruleFileInput EOF ;
    public final EObject entryRuleFileInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInput = null;


        try {
            // InternalFormValDSL.g:2448:50: (iv_ruleFileInput= ruleFileInput EOF )
            // InternalFormValDSL.g:2449:2: iv_ruleFileInput= ruleFileInput EOF
            {
             newCompositeNode(grammarAccess.getFileInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileInput=ruleFileInput();

            state._fsp--;

             current =iv_ruleFileInput; 
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
    // $ANTLR end "entryRuleFileInput"


    // $ANTLR start "ruleFileInput"
    // InternalFormValDSL.g:2455:1: ruleFileInput returns [EObject current=null] : ( () otherlv_1= 'FileInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFileInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        Enumerator lv_buttonPosition_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2461:2: ( ( () otherlv_1= 'FileInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:2462:2: ( () otherlv_1= 'FileInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:2462:2: ( () otherlv_1= 'FileInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:2463:3: () otherlv_1= 'FileInput' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:2463:3: ()
            // InternalFormValDSL.g:2464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileInputAccess().getFileInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInputAccess().getFileInputKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getFileInputAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:2478:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==23) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalFormValDSL.g:2479:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFileInputAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:2483:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:2484:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2484:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:2485:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileInputAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileInputRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2503:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==24) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalFormValDSL.g:2504:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getFileInputAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2508:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2509:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2509:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2510:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFileInputAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileInputRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2528:3: (otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==43) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalFormValDSL.g:2529:4: otherlv_7= 'Button position' ( (lv_buttonPosition_8_0= ruleEPosition ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getFileInputAccess().getButtonPositionKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2533:4: ( (lv_buttonPosition_8_0= ruleEPosition ) )
                    // InternalFormValDSL.g:2534:5: (lv_buttonPosition_8_0= ruleEPosition )
                    {
                    // InternalFormValDSL.g:2534:5: (lv_buttonPosition_8_0= ruleEPosition )
                    // InternalFormValDSL.g:2535:6: lv_buttonPosition_8_0= ruleEPosition
                    {

                    						newCompositeNode(grammarAccess.getFileInputAccess().getButtonPositionEPositionEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_buttonPosition_8_0=ruleEPosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFileInputRule());
                    						}
                    						set(
                    							current,
                    							"buttonPosition",
                    							lv_buttonPosition_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EPosition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFileInputAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFileInput"


    // $ANTLR start "entryRuleRefEntity"
    // InternalFormValDSL.g:2561:1: entryRuleRefEntity returns [EObject current=null] : iv_ruleRefEntity= ruleRefEntity EOF ;
    public final EObject entryRuleRefEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefEntity = null;


        try {
            // InternalFormValDSL.g:2561:50: (iv_ruleRefEntity= ruleRefEntity EOF )
            // InternalFormValDSL.g:2562:2: iv_ruleRefEntity= ruleRefEntity EOF
            {
             newCompositeNode(grammarAccess.getRefEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefEntity=ruleRefEntity();

            state._fsp--;

             current =iv_ruleRefEntity; 
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
    // $ANTLR end "entryRuleRefEntity"


    // $ANTLR start "ruleRefEntity"
    // InternalFormValDSL.g:2568:1: ruleRefEntity returns [EObject current=null] : ( () otherlv_1= 'RefEntity' otherlv_2= '{' (otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRefEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;

        AntlrDatatypeRuleToken lv_isSingeValue_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2574:2: ( ( () otherlv_1= 'RefEntity' otherlv_2= '{' (otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) ) )? otherlv_9= '}' ) )
            // InternalFormValDSL.g:2575:2: ( () otherlv_1= 'RefEntity' otherlv_2= '{' (otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) ) )? otherlv_9= '}' )
            {
            // InternalFormValDSL.g:2575:2: ( () otherlv_1= 'RefEntity' otherlv_2= '{' (otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) ) )? otherlv_9= '}' )
            // InternalFormValDSL.g:2576:3: () otherlv_1= 'RefEntity' otherlv_2= '{' (otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) ) )? (otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) ) )? otherlv_9= '}'
            {
            // InternalFormValDSL.g:2576:3: ()
            // InternalFormValDSL.g:2577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefEntityAccess().getRefEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRefEntityAccess().getRefEntityKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getRefEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:2591:3: (otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==45) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalFormValDSL.g:2592:4: otherlv_3= 'tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRefEntityAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:2596:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:2597:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2597:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:2598:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRefEntityAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefEntityRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2616:3: (otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalFormValDSL.g:2617:4: otherlv_5= 'note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getRefEntityAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2621:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2622:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2622:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2623:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRefEntityAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefEntityRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2641:3: (otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==47) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalFormValDSL.g:2642:4: otherlv_7= 'isSingeValue' ( (lv_isSingeValue_8_0= ruleEBoolean ) )
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_50); 

                    				newLeafNode(otherlv_7, grammarAccess.getRefEntityAccess().getIsSingeValueKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2646:4: ( (lv_isSingeValue_8_0= ruleEBoolean ) )
                    // InternalFormValDSL.g:2647:5: (lv_isSingeValue_8_0= ruleEBoolean )
                    {
                    // InternalFormValDSL.g:2647:5: (lv_isSingeValue_8_0= ruleEBoolean )
                    // InternalFormValDSL.g:2648:6: lv_isSingeValue_8_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getRefEntityAccess().getIsSingeValueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_isSingeValue_8_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRefEntityRule());
                    						}
                    						set(
                    							current,
                    							"isSingeValue",
                    							lv_isSingeValue_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRefEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRefEntity"


    // $ANTLR start "entryRuleLoadValues"
    // InternalFormValDSL.g:2674:1: entryRuleLoadValues returns [EObject current=null] : iv_ruleLoadValues= ruleLoadValues EOF ;
    public final EObject entryRuleLoadValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadValues = null;


        try {
            // InternalFormValDSL.g:2674:51: (iv_ruleLoadValues= ruleLoadValues EOF )
            // InternalFormValDSL.g:2675:2: iv_ruleLoadValues= ruleLoadValues EOF
            {
             newCompositeNode(grammarAccess.getLoadValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadValues=ruleLoadValues();

            state._fsp--;

             current =iv_ruleLoadValues; 
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
    // $ANTLR end "entryRuleLoadValues"


    // $ANTLR start "ruleLoadValues"
    // InternalFormValDSL.g:2681:1: ruleLoadValues returns [EObject current=null] : ( () ( (lv_isMultiSelect_1_0= 'isMultiSelect' ) )? otherlv_2= 'LoadValues' otherlv_3= '{' (otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleLoadValues() throws RecognitionException {
        EObject current = null;

        Token lv_isMultiSelect_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_tooltip_5_0 = null;

        AntlrDatatypeRuleToken lv_note_7_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2687:2: ( ( () ( (lv_isMultiSelect_1_0= 'isMultiSelect' ) )? otherlv_2= 'LoadValues' otherlv_3= '{' (otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalFormValDSL.g:2688:2: ( () ( (lv_isMultiSelect_1_0= 'isMultiSelect' ) )? otherlv_2= 'LoadValues' otherlv_3= '{' (otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalFormValDSL.g:2688:2: ( () ( (lv_isMultiSelect_1_0= 'isMultiSelect' ) )? otherlv_2= 'LoadValues' otherlv_3= '{' (otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalFormValDSL.g:2689:3: () ( (lv_isMultiSelect_1_0= 'isMultiSelect' ) )? otherlv_2= 'LoadValues' otherlv_3= '{' (otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )? (otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalFormValDSL.g:2689:3: ()
            // InternalFormValDSL.g:2690:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadValuesAccess().getLoadValuesAction_0(),
            					current);
            			

            }

            // InternalFormValDSL.g:2696:3: ( (lv_isMultiSelect_1_0= 'isMultiSelect' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==48) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalFormValDSL.g:2697:4: (lv_isMultiSelect_1_0= 'isMultiSelect' )
                    {
                    // InternalFormValDSL.g:2697:4: (lv_isMultiSelect_1_0= 'isMultiSelect' )
                    // InternalFormValDSL.g:2698:5: lv_isMultiSelect_1_0= 'isMultiSelect'
                    {
                    lv_isMultiSelect_1_0=(Token)match(input,48,FOLLOW_58); 

                    					newLeafNode(lv_isMultiSelect_1_0, grammarAccess.getLoadValuesAccess().getIsMultiSelectIsMultiSelectKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoadValuesRule());
                    					}
                    					setWithLastConsumed(current, "isMultiSelect", true, "isMultiSelect");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadValuesAccess().getLoadValuesKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadValuesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFormValDSL.g:2718:3: (otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==45) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalFormValDSL.g:2719:4: otherlv_4= 'tooltip' ( (lv_tooltip_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoadValuesAccess().getTooltipKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2723:4: ( (lv_tooltip_5_0= ruleEString ) )
                    // InternalFormValDSL.g:2724:5: (lv_tooltip_5_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2724:5: (lv_tooltip_5_0= ruleEString )
                    // InternalFormValDSL.g:2725:6: lv_tooltip_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoadValuesAccess().getTooltipEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_tooltip_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoadValuesRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2743:3: (otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==46) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalFormValDSL.g:2744:4: otherlv_6= 'note' ( (lv_note_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoadValuesAccess().getNoteKeyword_5_0());
                    			
                    // InternalFormValDSL.g:2748:4: ( (lv_note_7_0= ruleEString ) )
                    // InternalFormValDSL.g:2749:5: (lv_note_7_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2749:5: (lv_note_7_0= ruleEString )
                    // InternalFormValDSL.g:2750:6: lv_note_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoadValuesAccess().getNoteEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_note_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoadValuesRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLoadValuesAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLoadValues"


    // $ANTLR start "entryRuleAutocompleteComponent"
    // InternalFormValDSL.g:2776:1: entryRuleAutocompleteComponent returns [EObject current=null] : iv_ruleAutocompleteComponent= ruleAutocompleteComponent EOF ;
    public final EObject entryRuleAutocompleteComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutocompleteComponent = null;


        try {
            // InternalFormValDSL.g:2776:62: (iv_ruleAutocompleteComponent= ruleAutocompleteComponent EOF )
            // InternalFormValDSL.g:2777:2: iv_ruleAutocompleteComponent= ruleAutocompleteComponent EOF
            {
             newCompositeNode(grammarAccess.getAutocompleteComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutocompleteComponent=ruleAutocompleteComponent();

            state._fsp--;

             current =iv_ruleAutocompleteComponent; 
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
    // $ANTLR end "entryRuleAutocompleteComponent"


    // $ANTLR start "ruleAutocompleteComponent"
    // InternalFormValDSL.g:2783:1: ruleAutocompleteComponent returns [EObject current=null] : ( () otherlv_1= 'AutocompleteComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAutocompleteComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_tooltip_4_0 = null;

        AntlrDatatypeRuleToken lv_note_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2789:2: ( ( () otherlv_1= 'AutocompleteComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalFormValDSL.g:2790:2: ( () otherlv_1= 'AutocompleteComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalFormValDSL.g:2790:2: ( () otherlv_1= 'AutocompleteComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalFormValDSL.g:2791:3: () otherlv_1= 'AutocompleteComponent' otherlv_2= '{' (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )? (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalFormValDSL.g:2791:3: ()
            // InternalFormValDSL.g:2792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutocompleteComponentAccess().getAutocompleteComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAutocompleteComponentAccess().getAutocompleteComponentKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getAutocompleteComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:2806:3: (otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==23) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalFormValDSL.g:2807:4: otherlv_3= 'Tooltip' ( (lv_tooltip_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutocompleteComponentAccess().getTooltipKeyword_3_0());
                    			
                    // InternalFormValDSL.g:2811:4: ( (lv_tooltip_4_0= ruleEString ) )
                    // InternalFormValDSL.g:2812:5: (lv_tooltip_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2812:5: (lv_tooltip_4_0= ruleEString )
                    // InternalFormValDSL.g:2813:6: lv_tooltip_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteComponentAccess().getTooltipEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_tooltip_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutocompleteComponentRule());
                    						}
                    						set(
                    							current,
                    							"tooltip",
                    							lv_tooltip_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:2831:3: (otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==24) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalFormValDSL.g:2832:4: otherlv_5= 'Note' ( (lv_note_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutocompleteComponentAccess().getNoteKeyword_4_0());
                    			
                    // InternalFormValDSL.g:2836:4: ( (lv_note_6_0= ruleEString ) )
                    // InternalFormValDSL.g:2837:5: (lv_note_6_0= ruleEString )
                    {
                    // InternalFormValDSL.g:2837:5: (lv_note_6_0= ruleEString )
                    // InternalFormValDSL.g:2838:6: lv_note_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutocompleteComponentAccess().getNoteEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_note_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutocompleteComponentRule());
                    						}
                    						set(
                    							current,
                    							"note",
                    							lv_note_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutocompleteComponentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAutocompleteComponent"


    // $ANTLR start "entryRuleEDouble"
    // InternalFormValDSL.g:2864:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalFormValDSL.g:2864:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalFormValDSL.g:2865:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalFormValDSL.g:2871:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:2877:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalFormValDSL.g:2878:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalFormValDSL.g:2878:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalFormValDSL.g:2879:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalFormValDSL.g:2879:3: (kw= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==51) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalFormValDSL.g:2880:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_61); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalFormValDSL.g:2886:3: (this_INT_1= RULE_INT )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalFormValDSL.g:2887:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_62); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,52,FOLLOW_63); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_64); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalFormValDSL.g:2907:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=53 && LA76_0<=54)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalFormValDSL.g:2908:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalFormValDSL.g:2908:4: (kw= 'E' | kw= 'e' )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==53) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==54) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalFormValDSL.g:2909:5: kw= 'E'
                            {
                            kw=(Token)match(input,53,FOLLOW_45); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalFormValDSL.g:2915:5: kw= 'e'
                            {
                            kw=(Token)match(input,54,FOLLOW_45); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalFormValDSL.g:2921:4: (kw= '-' )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==51) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalFormValDSL.g:2922:5: kw= '-'
                            {
                            kw=(Token)match(input,51,FOLLOW_63); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalFormValDSL.g:2940:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalFormValDSL.g:2940:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalFormValDSL.g:2941:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalFormValDSL.g:2947:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:2953:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalFormValDSL.g:2954:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalFormValDSL.g:2954:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalFormValDSL.g:2955:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalFormValDSL.g:2955:3: (kw= '-' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==51) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalFormValDSL.g:2956:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_63); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePrimitiveDataType"
    // InternalFormValDSL.g:2973:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // InternalFormValDSL.g:2973:58: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // InternalFormValDSL.g:2974:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
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
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // InternalFormValDSL.g:2980:1: rulePrimitiveDataType returns [EObject current=null] : ( () ( (lv_type_1_0= ruleEDataType ) )? ( (lv_isCollection_2_0= 'Collection' ) )? ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token lv_isCollection_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:2986:2: ( ( () ( (lv_type_1_0= ruleEDataType ) )? ( (lv_isCollection_2_0= 'Collection' ) )? ) )
            // InternalFormValDSL.g:2987:2: ( () ( (lv_type_1_0= ruleEDataType ) )? ( (lv_isCollection_2_0= 'Collection' ) )? )
            {
            // InternalFormValDSL.g:2987:2: ( () ( (lv_type_1_0= ruleEDataType ) )? ( (lv_isCollection_2_0= 'Collection' ) )? )
            // InternalFormValDSL.g:2988:3: () ( (lv_type_1_0= ruleEDataType ) )? ( (lv_isCollection_2_0= 'Collection' ) )?
            {
            // InternalFormValDSL.g:2988:3: ()
            // InternalFormValDSL.g:2989:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeAction_0(),
            					current);
            			

            }

            // InternalFormValDSL.g:2995:3: ( (lv_type_1_0= ruleEDataType ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=112 && LA78_0<=115)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalFormValDSL.g:2996:4: (lv_type_1_0= ruleEDataType )
                    {
                    // InternalFormValDSL.g:2996:4: (lv_type_1_0= ruleEDataType )
                    // InternalFormValDSL.g:2997:5: lv_type_1_0= ruleEDataType
                    {

                    					newCompositeNode(grammarAccess.getPrimitiveDataTypeAccess().getTypeEDataTypeEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_65);
                    lv_type_1_0=ruleEDataType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"org.xtext.example.mydsl.FormValDSL.EDataType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3014:3: ( (lv_isCollection_2_0= 'Collection' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==55) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalFormValDSL.g:3015:4: (lv_isCollection_2_0= 'Collection' )
                    {
                    // InternalFormValDSL.g:3015:4: (lv_isCollection_2_0= 'Collection' )
                    // InternalFormValDSL.g:3016:5: lv_isCollection_2_0= 'Collection'
                    {
                    lv_isCollection_2_0=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_isCollection_2_0, grammarAccess.getPrimitiveDataTypeAccess().getIsCollectionCollectionKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "isCollection", true, "Collection");
                    				

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
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleNonPrimitiveDataType"
    // InternalFormValDSL.g:3032:1: entryRuleNonPrimitiveDataType returns [EObject current=null] : iv_ruleNonPrimitiveDataType= ruleNonPrimitiveDataType EOF ;
    public final EObject entryRuleNonPrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonPrimitiveDataType = null;


        try {
            // InternalFormValDSL.g:3032:61: (iv_ruleNonPrimitiveDataType= ruleNonPrimitiveDataType EOF )
            // InternalFormValDSL.g:3033:2: iv_ruleNonPrimitiveDataType= ruleNonPrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getNonPrimitiveDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonPrimitiveDataType=ruleNonPrimitiveDataType();

            state._fsp--;

             current =iv_ruleNonPrimitiveDataType; 
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
    // $ANTLR end "entryRuleNonPrimitiveDataType"


    // $ANTLR start "ruleNonPrimitiveDataType"
    // InternalFormValDSL.g:3039:1: ruleNonPrimitiveDataType returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_isCollection_1_0= 'Collection' ) )? ) ;
    public final EObject ruleNonPrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token lv_isCollection_1_0=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:3045:2: ( ( ( ( ruleEString ) ) ( (lv_isCollection_1_0= 'Collection' ) )? ) )
            // InternalFormValDSL.g:3046:2: ( ( ( ruleEString ) ) ( (lv_isCollection_1_0= 'Collection' ) )? )
            {
            // InternalFormValDSL.g:3046:2: ( ( ( ruleEString ) ) ( (lv_isCollection_1_0= 'Collection' ) )? )
            // InternalFormValDSL.g:3047:3: ( ( ruleEString ) ) ( (lv_isCollection_1_0= 'Collection' ) )?
            {
            // InternalFormValDSL.g:3047:3: ( ( ruleEString ) )
            // InternalFormValDSL.g:3048:4: ( ruleEString )
            {
            // InternalFormValDSL.g:3048:4: ( ruleEString )
            // InternalFormValDSL.g:3049:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonPrimitiveDataTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNonPrimitiveDataTypeAccess().getTypeValidationClassCrossReference_0_0());
            				
            pushFollow(FOLLOW_65);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFormValDSL.g:3063:3: ( (lv_isCollection_1_0= 'Collection' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==55) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalFormValDSL.g:3064:4: (lv_isCollection_1_0= 'Collection' )
                    {
                    // InternalFormValDSL.g:3064:4: (lv_isCollection_1_0= 'Collection' )
                    // InternalFormValDSL.g:3065:5: lv_isCollection_1_0= 'Collection'
                    {
                    lv_isCollection_1_0=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_isCollection_1_0, grammarAccess.getNonPrimitiveDataTypeAccess().getIsCollectionCollectionKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNonPrimitiveDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "isCollection", true, "Collection");
                    				

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
    // $ANTLR end "ruleNonPrimitiveDataType"


    // $ANTLR start "entryRuleErrorMessage"
    // InternalFormValDSL.g:3081:1: entryRuleErrorMessage returns [EObject current=null] : iv_ruleErrorMessage= ruleErrorMessage EOF ;
    public final EObject entryRuleErrorMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorMessage = null;


        try {
            // InternalFormValDSL.g:3081:53: (iv_ruleErrorMessage= ruleErrorMessage EOF )
            // InternalFormValDSL.g:3082:2: iv_ruleErrorMessage= ruleErrorMessage EOF
            {
             newCompositeNode(grammarAccess.getErrorMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorMessage=ruleErrorMessage();

            state._fsp--;

             current =iv_ruleErrorMessage; 
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
    // $ANTLR end "entryRuleErrorMessage"


    // $ANTLR start "ruleErrorMessage"
    // InternalFormValDSL.g:3088:1: ruleErrorMessage returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) ) )? otherlv_4= '}' ) ;
    public final EObject ruleErrorMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3094:2: ( ( () otherlv_1= '{' (otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) ) )? otherlv_4= '}' ) )
            // InternalFormValDSL.g:3095:2: ( () otherlv_1= '{' (otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) ) )? otherlv_4= '}' )
            {
            // InternalFormValDSL.g:3095:2: ( () otherlv_1= '{' (otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) ) )? otherlv_4= '}' )
            // InternalFormValDSL.g:3096:3: () otherlv_1= '{' (otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) ) )? otherlv_4= '}'
            {
            // InternalFormValDSL.g:3096:3: ()
            // InternalFormValDSL.g:3097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getErrorMessageAccess().getErrorMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorMessageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalFormValDSL.g:3107:3: (otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==56) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalFormValDSL.g:3108:4: otherlv_2= 'Error message' ( (lv_message_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getErrorMessageAccess().getErrorMessageKeyword_2_0());
                    			
                    // InternalFormValDSL.g:3112:4: ( (lv_message_3_0= ruleEString ) )
                    // InternalFormValDSL.g:3113:5: (lv_message_3_0= ruleEString )
                    {
                    // InternalFormValDSL.g:3113:5: (lv_message_3_0= ruleEString )
                    // InternalFormValDSL.g:3114:6: lv_message_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getErrorMessageAccess().getMessageEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_message_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getErrorMessageRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_3_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getErrorMessageAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleErrorMessage"


    // $ANTLR start "entryRuleRequired"
    // InternalFormValDSL.g:3140:1: entryRuleRequired returns [EObject current=null] : iv_ruleRequired= ruleRequired EOF ;
    public final EObject entryRuleRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequired = null;


        try {
            // InternalFormValDSL.g:3140:49: (iv_ruleRequired= ruleRequired EOF )
            // InternalFormValDSL.g:3141:2: iv_ruleRequired= ruleRequired EOF
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
    // InternalFormValDSL.g:3147:1: ruleRequired returns [EObject current=null] : ( () otherlv_1= 'Required' ( (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attributeRuleErrorMessage_2_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3153:2: ( ( () otherlv_1= 'Required' ( (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3154:2: ( () otherlv_1= 'Required' ( (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3154:2: ( () otherlv_1= 'Required' ( (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3155:3: () otherlv_1= 'Required' ( (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3155:3: ()
            // InternalFormValDSL.g:3156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequiredAccess().getRequiredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredAccess().getRequiredKeyword_1());
            		
            // InternalFormValDSL.g:3166:3: ( (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==11) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalFormValDSL.g:3167:4: (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3167:4: (lv_attributeRuleErrorMessage_2_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3168:5: lv_attributeRuleErrorMessage_2_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getRequiredAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_2_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequiredRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleMinLength"
    // InternalFormValDSL.g:3189:1: entryRuleMinLength returns [EObject current=null] : iv_ruleMinLength= ruleMinLength EOF ;
    public final EObject entryRuleMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinLength = null;


        try {
            // InternalFormValDSL.g:3189:50: (iv_ruleMinLength= ruleMinLength EOF )
            // InternalFormValDSL.g:3190:2: iv_ruleMinLength= ruleMinLength EOF
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
    // InternalFormValDSL.g:3196:1: ruleMinLength returns [EObject current=null] : ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributeRuleErrorMessage_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3202:2: ( ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3203:2: ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3203:2: ( () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3204:3: () otherlv_1= 'MinLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3204:3: ()
            // InternalFormValDSL.g:3205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinLengthAccess().getMinLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getMinLengthAccess().getMinLengthKeyword_1());
            		
            // InternalFormValDSL.g:3215:3: ( (lv_value_2_0= ruleEInt ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_INT||LA83_0==51) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalFormValDSL.g:3216:4: (lv_value_2_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:3216:4: (lv_value_2_0= ruleEInt )
                    // InternalFormValDSL.g:3217:5: lv_value_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getMinLengthAccess().getValueEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinLengthRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3234:3: ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==11) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalFormValDSL.g:3235:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3235:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3236:5: lv_attributeRuleErrorMessage_3_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getMinLengthAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_3_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinLengthRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // InternalFormValDSL.g:3257:1: entryRuleMaxLength returns [EObject current=null] : iv_ruleMaxLength= ruleMaxLength EOF ;
    public final EObject entryRuleMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxLength = null;


        try {
            // InternalFormValDSL.g:3257:50: (iv_ruleMaxLength= ruleMaxLength EOF )
            // InternalFormValDSL.g:3258:2: iv_ruleMaxLength= ruleMaxLength EOF
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
    // InternalFormValDSL.g:3264:1: ruleMaxLength returns [EObject current=null] : ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributeRuleErrorMessage_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3270:2: ( ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3271:2: ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3271:2: ( () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3272:3: () otherlv_1= 'MaxLength' ( (lv_value_2_0= ruleEInt ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3272:3: ()
            // InternalFormValDSL.g:3273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxLengthAccess().getMaxLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_68); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxLengthAccess().getMaxLengthKeyword_1());
            		
            // InternalFormValDSL.g:3283:3: ( (lv_value_2_0= ruleEInt ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_INT||LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalFormValDSL.g:3284:4: (lv_value_2_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:3284:4: (lv_value_2_0= ruleEInt )
                    // InternalFormValDSL.g:3285:5: lv_value_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getMaxLengthAccess().getValueEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_value_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxLengthRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3302:3: ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==11) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalFormValDSL.g:3303:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3303:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3304:5: lv_attributeRuleErrorMessage_3_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getMaxLengthAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_3_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxLengthRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // InternalFormValDSL.g:3325:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // InternalFormValDSL.g:3325:47: (iv_ruleLength= ruleLength EOF )
            // InternalFormValDSL.g:3326:2: iv_ruleLength= ruleLength EOF
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
    // InternalFormValDSL.g:3332:1: ruleLength returns [EObject current=null] : ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributeRuleErrorMessage_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3338:2: ( ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3339:2: ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3339:2: ( () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3340:3: () otherlv_1= 'Length' ( (lv_value_2_0= ruleInt0 ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3340:3: ()
            // InternalFormValDSL.g:3341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLengthAccess().getLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getLengthKeyword_1());
            		
            // InternalFormValDSL.g:3351:3: ( (lv_value_2_0= ruleInt0 ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==71) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalFormValDSL.g:3352:4: (lv_value_2_0= ruleInt0 )
                    {
                    // InternalFormValDSL.g:3352:4: (lv_value_2_0= ruleInt0 )
                    // InternalFormValDSL.g:3353:5: lv_value_2_0= ruleInt0
                    {

                    					newCompositeNode(grammarAccess.getLengthAccess().getValueInt0ParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_value_2_0=ruleInt0();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLengthRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.Int0");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3370:3: ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==11) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalFormValDSL.g:3371:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3371:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3372:5: lv_attributeRuleErrorMessage_3_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getLengthAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_3_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLengthRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // InternalFormValDSL.g:3393:1: entryRuleMinNumber returns [EObject current=null] : iv_ruleMinNumber= ruleMinNumber EOF ;
    public final EObject entryRuleMinNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinNumber = null;


        try {
            // InternalFormValDSL.g:3393:50: (iv_ruleMinNumber= ruleMinNumber EOF )
            // InternalFormValDSL.g:3394:2: iv_ruleMinNumber= ruleMinNumber EOF
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
    // InternalFormValDSL.g:3400:1: ruleMinNumber returns [EObject current=null] : ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleMinNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributeRuleErrorMessage_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3406:2: ( ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3407:2: ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3407:2: ( () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3408:3: () otherlv_1= 'MinNumber' ( (lv_value_2_0= ruleFloat ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3408:3: ()
            // InternalFormValDSL.g:3409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinNumberAccess().getMinNumberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_70); 

            			newLeafNode(otherlv_1, grammarAccess.getMinNumberAccess().getMinNumberKeyword_1());
            		
            // InternalFormValDSL.g:3419:3: ( (lv_value_2_0= ruleFloat ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==72) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalFormValDSL.g:3420:4: (lv_value_2_0= ruleFloat )
                    {
                    // InternalFormValDSL.g:3420:4: (lv_value_2_0= ruleFloat )
                    // InternalFormValDSL.g:3421:5: lv_value_2_0= ruleFloat
                    {

                    					newCompositeNode(grammarAccess.getMinNumberAccess().getValueFloatParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_value_2_0=ruleFloat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinNumberRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.Float");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3438:3: ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==11) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalFormValDSL.g:3439:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3439:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3440:5: lv_attributeRuleErrorMessage_3_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getMinNumberAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_3_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinNumberRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // InternalFormValDSL.g:3461:1: entryRuleMinDate returns [EObject current=null] : iv_ruleMinDate= ruleMinDate EOF ;
    public final EObject entryRuleMinDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinDate = null;


        try {
            // InternalFormValDSL.g:3461:48: (iv_ruleMinDate= ruleMinDate EOF )
            // InternalFormValDSL.g:3462:2: iv_ruleMinDate= ruleMinDate EOF
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
    // InternalFormValDSL.g:3468:1: ruleMinDate returns [EObject current=null] : ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleMinDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributeRuleErrorMessage_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3474:2: ( ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3475:2: ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3475:2: ( () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3476:3: () otherlv_1= 'MinDate' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3476:3: ()
            // InternalFormValDSL.g:3477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMinDateAccess().getMinDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getMinDateAccess().getMinDateKeyword_1());
            		
            // InternalFormValDSL.g:3487:3: ( (lv_value_2_0= ruleEString ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( ((LA91_0>=RULE_STRING && LA91_0<=RULE_ID)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalFormValDSL.g:3488:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalFormValDSL.g:3488:4: (lv_value_2_0= ruleEString )
                    // InternalFormValDSL.g:3489:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMinDateAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinDateRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3506:3: ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==11) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalFormValDSL.g:3507:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3507:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3508:5: lv_attributeRuleErrorMessage_3_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getMinDateAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_3_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMinDateRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // InternalFormValDSL.g:3529:1: entryRuleMaxNumber returns [EObject current=null] : iv_ruleMaxNumber= ruleMaxNumber EOF ;
    public final EObject entryRuleMaxNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxNumber = null;


        try {
            // InternalFormValDSL.g:3529:50: (iv_ruleMaxNumber= ruleMaxNumber EOF )
            // InternalFormValDSL.g:3530:2: iv_ruleMaxNumber= ruleMaxNumber EOF
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
    // InternalFormValDSL.g:3536:1: ruleMaxNumber returns [EObject current=null] : ( () otherlv_1= 'MaxNumber' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' ) ;
    public final EObject ruleMaxNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_attributeRuleErrorMessage_5_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3542:2: ( ( () otherlv_1= 'MaxNumber' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' ) )
            // InternalFormValDSL.g:3543:2: ( () otherlv_1= 'MaxNumber' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' )
            {
            // InternalFormValDSL.g:3543:2: ( () otherlv_1= 'MaxNumber' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' )
            // InternalFormValDSL.g:3544:3: () otherlv_1= 'MaxNumber' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}'
            {
            // InternalFormValDSL.g:3544:3: ()
            // InternalFormValDSL.g:3545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxNumberAccess().getMaxNumberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxNumberAccess().getMaxNumberKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxNumberAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:3559:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==64) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalFormValDSL.g:3560:4: otherlv_3= 'value' ( (lv_value_4_0= ruleFloat ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_73); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaxNumberAccess().getValueKeyword_3_0());
                    			
                    // InternalFormValDSL.g:3564:4: ( (lv_value_4_0= ruleFloat ) )
                    // InternalFormValDSL.g:3565:5: (lv_value_4_0= ruleFloat )
                    {
                    // InternalFormValDSL.g:3565:5: (lv_value_4_0= ruleFloat )
                    // InternalFormValDSL.g:3566:6: lv_value_4_0= ruleFloat
                    {

                    						newCompositeNode(grammarAccess.getMaxNumberAccess().getValueFloatParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_value_4_0=ruleFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaxNumberRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.Float");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3584:3: ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==11) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalFormValDSL.g:3585:4: (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3585:4: (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3586:5: lv_attributeRuleErrorMessage_5_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getMaxNumberAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_attributeRuleErrorMessage_5_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxNumberRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_5_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMaxNumberAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:3611:1: entryRuleMaxDate returns [EObject current=null] : iv_ruleMaxDate= ruleMaxDate EOF ;
    public final EObject entryRuleMaxDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxDate = null;


        try {
            // InternalFormValDSL.g:3611:48: (iv_ruleMaxDate= ruleMaxDate EOF )
            // InternalFormValDSL.g:3612:2: iv_ruleMaxDate= ruleMaxDate EOF
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
    // InternalFormValDSL.g:3618:1: ruleMaxDate returns [EObject current=null] : ( () otherlv_1= 'MaxDate' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' ) ;
    public final EObject ruleMaxDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_attributeRuleErrorMessage_5_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3624:2: ( ( () otherlv_1= 'MaxDate' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' ) )
            // InternalFormValDSL.g:3625:2: ( () otherlv_1= 'MaxDate' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' )
            {
            // InternalFormValDSL.g:3625:2: ( () otherlv_1= 'MaxDate' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' )
            // InternalFormValDSL.g:3626:3: () otherlv_1= 'MaxDate' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}'
            {
            // InternalFormValDSL.g:3626:3: ()
            // InternalFormValDSL.g:3627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaxDateAccess().getMaxDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxDateAccess().getMaxDateKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxDateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:3641:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==64) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalFormValDSL.g:3642:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getMaxDateAccess().getValueKeyword_3_0());
                    			
                    // InternalFormValDSL.g:3646:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalFormValDSL.g:3647:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:3647:5: (lv_value_4_0= ruleEString )
                    // InternalFormValDSL.g:3648:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMaxDateAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMaxDateRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3666:3: ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==11) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalFormValDSL.g:3667:4: (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3667:4: (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3668:5: lv_attributeRuleErrorMessage_5_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getMaxDateAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_attributeRuleErrorMessage_5_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMaxDateRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_5_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMaxDateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:3693:1: entryRuleAcceptableValuesString returns [EObject current=null] : iv_ruleAcceptableValuesString= ruleAcceptableValuesString EOF ;
    public final EObject entryRuleAcceptableValuesString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableValuesString = null;


        try {
            // InternalFormValDSL.g:3693:63: (iv_ruleAcceptableValuesString= ruleAcceptableValuesString EOF )
            // InternalFormValDSL.g:3694:2: iv_ruleAcceptableValuesString= ruleAcceptableValuesString EOF
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
    // InternalFormValDSL.g:3700:1: ruleAcceptableValuesString returns [EObject current=null] : ( () otherlv_1= 'AcceptableValuesString' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' ) ;
    public final EObject ruleAcceptableValuesString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        EObject lv_attributeRuleErrorMessage_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3706:2: ( ( () otherlv_1= 'AcceptableValuesString' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' ) )
            // InternalFormValDSL.g:3707:2: ( () otherlv_1= 'AcceptableValuesString' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' )
            {
            // InternalFormValDSL.g:3707:2: ( () otherlv_1= 'AcceptableValuesString' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' )
            // InternalFormValDSL.g:3708:3: () otherlv_1= 'AcceptableValuesString' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}'
            {
            // InternalFormValDSL.g:3708:3: ()
            // InternalFormValDSL.g:3709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getAcceptableValuesStringAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:3723:3: ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=RULE_STRING && LA98_0<=RULE_ID)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalFormValDSL.g:3724:4: ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )*
                    {
                    // InternalFormValDSL.g:3724:4: ( (lv_values_3_0= ruleEString ) )
                    // InternalFormValDSL.g:3725:5: (lv_values_3_0= ruleEString )
                    {
                    // InternalFormValDSL.g:3725:5: (lv_values_3_0= ruleEString )
                    // InternalFormValDSL.g:3726:6: lv_values_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_values_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAcceptableValuesStringRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_3_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:3743:4: (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==67) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalFormValDSL.g:3744:5: otherlv_4= ',' ( (lv_values_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,67,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAcceptableValuesStringAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFormValDSL.g:3748:5: ( (lv_values_5_0= ruleEString ) )
                    	    // InternalFormValDSL.g:3749:6: (lv_values_5_0= ruleEString )
                    	    {
                    	    // InternalFormValDSL.g:3749:6: (lv_values_5_0= ruleEString )
                    	    // InternalFormValDSL.g:3750:7: lv_values_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_76);
                    	    lv_values_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAcceptableValuesStringRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_5_0,
                    	    								"org.xtext.example.mydsl.FormValDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:3769:3: ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==11) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalFormValDSL.g:3770:4: (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3770:4: (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3771:5: lv_attributeRuleErrorMessage_6_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getAcceptableValuesStringAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_attributeRuleErrorMessage_6_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAcceptableValuesStringRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_6_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAcceptableValuesStringAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:3796:1: entryRuleAcceptableValuesDate returns [EObject current=null] : iv_ruleAcceptableValuesDate= ruleAcceptableValuesDate EOF ;
    public final EObject entryRuleAcceptableValuesDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableValuesDate = null;


        try {
            // InternalFormValDSL.g:3796:61: (iv_ruleAcceptableValuesDate= ruleAcceptableValuesDate EOF )
            // InternalFormValDSL.g:3797:2: iv_ruleAcceptableValuesDate= ruleAcceptableValuesDate EOF
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
    // InternalFormValDSL.g:3803:1: ruleAcceptableValuesDate returns [EObject current=null] : ( () otherlv_1= 'AcceptableValuesDate' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' ) ;
    public final EObject ruleAcceptableValuesDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_values_3_0 = null;

        AntlrDatatypeRuleToken lv_values_5_0 = null;

        EObject lv_attributeRuleErrorMessage_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3809:2: ( ( () otherlv_1= 'AcceptableValuesDate' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' ) )
            // InternalFormValDSL.g:3810:2: ( () otherlv_1= 'AcceptableValuesDate' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' )
            {
            // InternalFormValDSL.g:3810:2: ( () otherlv_1= 'AcceptableValuesDate' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}' )
            // InternalFormValDSL.g:3811:3: () otherlv_1= 'AcceptableValuesDate' otherlv_2= '{' ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )? ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )? otherlv_7= '}'
            {
            // InternalFormValDSL.g:3811:3: ()
            // InternalFormValDSL.g:3812:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getAcceptableValuesDateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:3826:3: ( ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )* )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=RULE_STRING && LA101_0<=RULE_ID)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalFormValDSL.g:3827:4: ( (lv_values_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )*
                    {
                    // InternalFormValDSL.g:3827:4: ( (lv_values_3_0= ruleEString ) )
                    // InternalFormValDSL.g:3828:5: (lv_values_3_0= ruleEString )
                    {
                    // InternalFormValDSL.g:3828:5: (lv_values_3_0= ruleEString )
                    // InternalFormValDSL.g:3829:6: lv_values_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_values_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAcceptableValuesDateRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_3_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:3846:4: (otherlv_4= ',' ( (lv_values_5_0= ruleEString ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==67) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalFormValDSL.g:3847:5: otherlv_4= ',' ( (lv_values_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,67,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAcceptableValuesDateAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFormValDSL.g:3851:5: ( (lv_values_5_0= ruleEString ) )
                    	    // InternalFormValDSL.g:3852:6: (lv_values_5_0= ruleEString )
                    	    {
                    	    // InternalFormValDSL.g:3852:6: (lv_values_5_0= ruleEString )
                    	    // InternalFormValDSL.g:3853:7: lv_values_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_76);
                    	    lv_values_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAcceptableValuesDateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_5_0,
                    	    								"org.xtext.example.mydsl.FormValDSL.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:3872:3: ( (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==11) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalFormValDSL.g:3873:4: (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3873:4: (lv_attributeRuleErrorMessage_6_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3874:5: lv_attributeRuleErrorMessage_6_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getAcceptableValuesDateAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_attributeRuleErrorMessage_6_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAcceptableValuesDateRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_6_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAcceptableValuesDateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:3899:1: entryRuleStringPattern returns [EObject current=null] : iv_ruleStringPattern= ruleStringPattern EOF ;
    public final EObject entryRuleStringPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringPattern = null;


        try {
            // InternalFormValDSL.g:3899:54: (iv_ruleStringPattern= ruleStringPattern EOF )
            // InternalFormValDSL.g:3900:2: iv_ruleStringPattern= ruleStringPattern EOF
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
    // InternalFormValDSL.g:3906:1: ruleStringPattern returns [EObject current=null] : ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) ;
    public final EObject ruleStringPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_attributeRuleErrorMessage_3_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3912:2: ( ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? ) )
            // InternalFormValDSL.g:3913:2: ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            {
            // InternalFormValDSL.g:3913:2: ( () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )? )
            // InternalFormValDSL.g:3914:3: () otherlv_1= 'StringPattern' ( (lv_value_2_0= ruleEString ) )? ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            {
            // InternalFormValDSL.g:3914:3: ()
            // InternalFormValDSL.g:3915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringPatternAccess().getStringPatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getStringPatternAccess().getStringPatternKeyword_1());
            		
            // InternalFormValDSL.g:3925:3: ( (lv_value_2_0= ruleEString ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=RULE_STRING && LA103_0<=RULE_ID)) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalFormValDSL.g:3926:4: (lv_value_2_0= ruleEString )
                    {
                    // InternalFormValDSL.g:3926:4: (lv_value_2_0= ruleEString )
                    // InternalFormValDSL.g:3927:5: lv_value_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getStringPatternAccess().getValueEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_67);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringPatternRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.mydsl.FormValDSL.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:3944:3: ( (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==11) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalFormValDSL.g:3945:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:3945:4: (lv_attributeRuleErrorMessage_3_0= ruleErrorMessage )
                    // InternalFormValDSL.g:3946:5: lv_attributeRuleErrorMessage_3_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getStringPatternAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeRuleErrorMessage_3_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStringPatternRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_3_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
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
    // InternalFormValDSL.g:3967:1: entryRuleDatePattern returns [EObject current=null] : iv_ruleDatePattern= ruleDatePattern EOF ;
    public final EObject entryRuleDatePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatePattern = null;


        try {
            // InternalFormValDSL.g:3967:52: (iv_ruleDatePattern= ruleDatePattern EOF )
            // InternalFormValDSL.g:3968:2: iv_ruleDatePattern= ruleDatePattern EOF
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
    // InternalFormValDSL.g:3974:1: ruleDatePattern returns [EObject current=null] : ( () otherlv_1= 'DatePattern' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' ) ;
    public final EObject ruleDatePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_attributeRuleErrorMessage_5_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:3980:2: ( ( () otherlv_1= 'DatePattern' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' ) )
            // InternalFormValDSL.g:3981:2: ( () otherlv_1= 'DatePattern' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' )
            {
            // InternalFormValDSL.g:3981:2: ( () otherlv_1= 'DatePattern' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}' )
            // InternalFormValDSL.g:3982:3: () otherlv_1= 'DatePattern' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )? otherlv_6= '}'
            {
            // InternalFormValDSL.g:3982:3: ()
            // InternalFormValDSL.g:3983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDatePatternAccess().getDatePatternAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getDatePatternAccess().getDatePatternKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getDatePatternAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:3997:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==64) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalFormValDSL.g:3998:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDatePatternAccess().getValueKeyword_3_0());
                    			
                    // InternalFormValDSL.g:4002:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalFormValDSL.g:4003:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalFormValDSL.g:4003:5: (lv_value_4_0= ruleEString )
                    // InternalFormValDSL.g:4004:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDatePatternAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDatePatternRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4022:3: ( (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==11) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalFormValDSL.g:4023:4: (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:4023:4: (lv_attributeRuleErrorMessage_5_0= ruleErrorMessage )
                    // InternalFormValDSL.g:4024:5: lv_attributeRuleErrorMessage_5_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getDatePatternAccess().getAttributeRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_attributeRuleErrorMessage_5_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDatePatternRule());
                    					}
                    					set(
                    						current,
                    						"attributeRuleErrorMessage",
                    						lv_attributeRuleErrorMessage_5_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDatePatternAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:4049:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalFormValDSL.g:4049:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalFormValDSL.g:4050:2: iv_ruleInt0= ruleInt0 EOF
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
    // InternalFormValDSL.g:4056:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:4062:2: (kw= 'Int' )
            // InternalFormValDSL.g:4063:2: kw= 'Int'
            {
            kw=(Token)match(input,71,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInt0Access().getIntKeyword());
            	

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
    // InternalFormValDSL.g:4071:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalFormValDSL.g:4071:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalFormValDSL.g:4072:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalFormValDSL.g:4078:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Float' ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:4084:2: (kw= 'Float' )
            // InternalFormValDSL.g:4085:2: kw= 'Float'
            {
            kw=(Token)match(input,72,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFloatAccess().getFloatKeyword());
            	

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
    // InternalFormValDSL.g:4093:1: entryRuleNotEquals returns [EObject current=null] : iv_ruleNotEquals= ruleNotEquals EOF ;
    public final EObject entryRuleNotEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEquals = null;


        try {
            // InternalFormValDSL.g:4093:50: (iv_ruleNotEquals= ruleNotEquals EOF )
            // InternalFormValDSL.g:4094:2: iv_ruleNotEquals= ruleNotEquals EOF
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
    // InternalFormValDSL.g:4100:1: ruleNotEquals returns [EObject current=null] : ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleNotEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_classRuleErrorMessage_4_0 = null;

        EObject lv_attributearray_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4106:2: ( ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' ) )
            // InternalFormValDSL.g:4107:2: ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' )
            {
            // InternalFormValDSL.g:4107:2: ( () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' )
            // InternalFormValDSL.g:4108:3: () otherlv_1= 'NotEquals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}'
            {
            // InternalFormValDSL.g:4108:3: ()
            // InternalFormValDSL.g:4109:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNotEqualsAccess().getNotEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNotEqualsAccess().getNotEqualsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getNotEqualsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:4123:3: (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==56) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalFormValDSL.g:4124:4: otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getNotEqualsAccess().getErrorMessageKeyword_3_0());
                    			
                    // InternalFormValDSL.g:4128:4: ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )
                    // InternalFormValDSL.g:4129:5: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:4129:5: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    // InternalFormValDSL.g:4130:6: lv_classRuleErrorMessage_4_0= ruleErrorMessage
                    {

                    						newCompositeNode(grammarAccess.getNotEqualsAccess().getClassRuleErrorMessageErrorMessageParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_classRuleErrorMessage_4_0=ruleErrorMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotEqualsRule());
                    						}
                    						set(
                    							current,
                    							"classRuleErrorMessage",
                    							lv_classRuleErrorMessage_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4148:3: (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==74) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalFormValDSL.g:4149:4: otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getNotEqualsAccess().getAttributesKeyword_4_0());
                    			
                    // InternalFormValDSL.g:4153:4: ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4154:5: (lv_attributearray_6_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4154:5: (lv_attributearray_6_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4155:6: lv_attributearray_6_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getNotEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attributearray_6_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotEqualsRule());
                    						}
                    						set(
                    							current,
                    							"attributearray",
                    							lv_attributearray_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNotEqualsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:4181:1: entryRuleGreaterThan returns [EObject current=null] : iv_ruleGreaterThan= ruleGreaterThan EOF ;
    public final EObject entryRuleGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThan = null;


        try {
            // InternalFormValDSL.g:4181:52: (iv_ruleGreaterThan= ruleGreaterThan EOF )
            // InternalFormValDSL.g:4182:2: iv_ruleGreaterThan= ruleGreaterThan EOF
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
    // InternalFormValDSL.g:4188:1: ruleGreaterThan returns [EObject current=null] : ( () otherlv_1= 'GreaterThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_classRuleErrorMessage_4_0 = null;

        EObject lv_attributearray_6_0 = null;

        EObject lv_attributearray_7_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4194:2: ( ( () otherlv_1= 'GreaterThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )* )? otherlv_8= '}' ) )
            // InternalFormValDSL.g:4195:2: ( () otherlv_1= 'GreaterThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )* )? otherlv_8= '}' )
            {
            // InternalFormValDSL.g:4195:2: ( () otherlv_1= 'GreaterThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )* )? otherlv_8= '}' )
            // InternalFormValDSL.g:4196:3: () otherlv_1= 'GreaterThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )* )? otherlv_8= '}'
            {
            // InternalFormValDSL.g:4196:3: ()
            // InternalFormValDSL.g:4197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGreaterThanAccess().getGreaterThanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:4211:3: ( ( ruleEString ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( ((LA109_0>=RULE_STRING && LA109_0<=RULE_ID)) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalFormValDSL.g:4212:4: ( ruleEString )
                    {
                    // InternalFormValDSL.g:4212:4: ( ruleEString )
                    // InternalFormValDSL.g:4213:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGreaterThanRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getGreaterThanAccess().getClassattributeClassAttributeCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4227:3: ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==11) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalFormValDSL.g:4228:4: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:4228:4: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    // InternalFormValDSL.g:4229:5: lv_classRuleErrorMessage_4_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getGreaterThanAccess().getClassRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_78);
                    lv_classRuleErrorMessage_4_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGreaterThanRule());
                    					}
                    					set(
                    						current,
                    						"classRuleErrorMessage",
                    						lv_classRuleErrorMessage_4_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4246:3: (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )* )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==74) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalFormValDSL.g:4247:4: otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) ( (lv_attributearray_7_0= ruleAttributeArray ) )*
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getGreaterThanAccess().getAttributesKeyword_5_0());
                    			
                    // InternalFormValDSL.g:4251:4: ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4252:5: (lv_attributearray_6_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4252:5: (lv_attributearray_6_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4253:6: lv_attributearray_6_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_attributearray_6_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGreaterThanRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:4270:4: ( (lv_attributearray_7_0= ruleAttributeArray ) )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==78) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalFormValDSL.g:4271:5: (lv_attributearray_7_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValDSL.g:4271:5: (lv_attributearray_7_0= ruleAttributeArray )
                    	    // InternalFormValDSL.g:4272:6: lv_attributearray_7_0= ruleAttributeArray
                    	    {

                    	    						newCompositeNode(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_82);
                    	    lv_attributearray_7_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGreaterThanRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributearray",
                    	    							lv_attributearray_7_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalFormValDSL.g:4298:1: entryRuleEquals returns [EObject current=null] : iv_ruleEquals= ruleEquals EOF ;
    public final EObject entryRuleEquals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquals = null;


        try {
            // InternalFormValDSL.g:4298:47: (iv_ruleEquals= ruleEquals EOF )
            // InternalFormValDSL.g:4299:2: iv_ruleEquals= ruleEquals EOF
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
    // InternalFormValDSL.g:4305:1: ruleEquals returns [EObject current=null] : ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEquals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_classRuleErrorMessage_4_0 = null;

        EObject lv_attributearray_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4311:2: ( ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' ) )
            // InternalFormValDSL.g:4312:2: ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' )
            {
            // InternalFormValDSL.g:4312:2: ( () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}' )
            // InternalFormValDSL.g:4313:3: () otherlv_1= 'Equals' otherlv_2= '{' (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )? (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )? otherlv_7= '}'
            {
            // InternalFormValDSL.g:4313:3: ()
            // InternalFormValDSL.g:4314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEqualsAccess().getEqualsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualsAccess().getEqualsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_77); 

            			newLeafNode(otherlv_2, grammarAccess.getEqualsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:4328:3: (otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==56) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalFormValDSL.g:4329:4: otherlv_3= 'Error message' ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getEqualsAccess().getErrorMessageKeyword_3_0());
                    			
                    // InternalFormValDSL.g:4333:4: ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )
                    // InternalFormValDSL.g:4334:5: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:4334:5: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    // InternalFormValDSL.g:4335:6: lv_classRuleErrorMessage_4_0= ruleErrorMessage
                    {

                    						newCompositeNode(grammarAccess.getEqualsAccess().getClassRuleErrorMessageErrorMessageParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_classRuleErrorMessage_4_0=ruleErrorMessage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsRule());
                    						}
                    						set(
                    							current,
                    							"classRuleErrorMessage",
                    							lv_classRuleErrorMessage_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4353:3: (otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==74) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalFormValDSL.g:4354:4: otherlv_5= 'attributes' ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getEqualsAccess().getAttributesKeyword_4_0());
                    			
                    // InternalFormValDSL.g:4358:4: ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4359:5: (lv_attributearray_6_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4359:5: (lv_attributearray_6_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4360:6: lv_attributearray_6_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attributearray_6_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEqualsRule());
                    						}
                    						set(
                    							current,
                    							"attributearray",
                    							lv_attributearray_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEqualsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalFormValDSL.g:4386:1: entryRuleLessThan returns [EObject current=null] : iv_ruleLessThan= ruleLessThan EOF ;
    public final EObject entryRuleLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThan = null;


        try {
            // InternalFormValDSL.g:4386:49: (iv_ruleLessThan= ruleLessThan EOF )
            // InternalFormValDSL.g:4387:2: iv_ruleLessThan= ruleLessThan EOF
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
    // InternalFormValDSL.g:4393:1: ruleLessThan returns [EObject current=null] : ( () otherlv_1= 'LessThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleLessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_classRuleErrorMessage_4_0 = null;

        EObject lv_attributearray_6_0 = null;

        EObject lv_attributearray_8_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4399:2: ( ( () otherlv_1= 'LessThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalFormValDSL.g:4400:2: ( () otherlv_1= 'LessThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalFormValDSL.g:4400:2: ( () otherlv_1= 'LessThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalFormValDSL.g:4401:3: () otherlv_1= 'LessThan' otherlv_2= '{' ( ( ruleEString ) )? ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )? (otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalFormValDSL.g:4401:3: ()
            // InternalFormValDSL.g:4402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLessThanAccess().getLessThanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLessThanAccess().getLessThanKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_75); 

            			newLeafNode(otherlv_2, grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:4416:3: ( ( ruleEString ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=RULE_STRING && LA115_0<=RULE_ID)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalFormValDSL.g:4417:4: ( ruleEString )
                    {
                    // InternalFormValDSL.g:4417:4: ( ruleEString )
                    // InternalFormValDSL.g:4418:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLessThanRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLessThanAccess().getClassattributeClassAttributeCrossReference_3_0());
                    				
                    pushFollow(FOLLOW_74);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4432:3: ( (lv_classRuleErrorMessage_4_0= ruleErrorMessage ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==11) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==14||LA116_1==56) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // InternalFormValDSL.g:4433:4: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    {
                    // InternalFormValDSL.g:4433:4: (lv_classRuleErrorMessage_4_0= ruleErrorMessage )
                    // InternalFormValDSL.g:4434:5: lv_classRuleErrorMessage_4_0= ruleErrorMessage
                    {

                    					newCompositeNode(grammarAccess.getLessThanAccess().getClassRuleErrorMessageErrorMessageParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_74);
                    lv_classRuleErrorMessage_4_0=ruleErrorMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLessThanRule());
                    					}
                    					set(
                    						current,
                    						"classRuleErrorMessage",
                    						lv_classRuleErrorMessage_4_0,
                    						"org.xtext.example.mydsl.FormValDSL.ErrorMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4451:3: (otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==11) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalFormValDSL.g:4452:4: otherlv_5= '{' ( (lv_attributearray_6_0= ruleAttributeArray ) ) (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,11,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalFormValDSL.g:4456:4: ( (lv_attributearray_6_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4457:5: (lv_attributearray_6_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4457:5: (lv_attributearray_6_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4458:6: lv_attributearray_6_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_attributearray_6_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLessThanRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:4475:4: (otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==67) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalFormValDSL.g:4476:5: otherlv_7= ',' ( (lv_attributearray_8_0= ruleAttributeArray ) )
                    	    {
                    	    otherlv_7=(Token)match(input,67,FOLLOW_79); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getLessThanAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalFormValDSL.g:4480:5: ( (lv_attributearray_8_0= ruleAttributeArray ) )
                    	    // InternalFormValDSL.g:4481:6: (lv_attributearray_8_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValDSL.g:4481:6: (lv_attributearray_8_0= ruleAttributeArray )
                    	    // InternalFormValDSL.g:4482:7: lv_attributearray_8_0= ruleAttributeArray
                    	    {

                    	    							newCompositeNode(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
                    	    lv_attributearray_8_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLessThanRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributearray",
                    	    								lv_attributearray_8_0,
                    	    								"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalFormValDSL.g:4513:1: entryRuleAttributeArray returns [EObject current=null] : iv_ruleAttributeArray= ruleAttributeArray EOF ;
    public final EObject entryRuleAttributeArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeArray = null;


        try {
            // InternalFormValDSL.g:4513:55: (iv_ruleAttributeArray= ruleAttributeArray EOF )
            // InternalFormValDSL.g:4514:2: iv_ruleAttributeArray= ruleAttributeArray EOF
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
    // InternalFormValDSL.g:4520:1: ruleAttributeArray returns [EObject current=null] : ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleAttributeArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:4526:2: ( ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ) )
            // InternalFormValDSL.g:4527:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            {
            // InternalFormValDSL.g:4527:2: ( () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // InternalFormValDSL.g:4528:3: () (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // InternalFormValDSL.g:4528:3: ()
            // InternalFormValDSL.g:4529:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeArrayAccess().getAttributeArrayAction_0(),
            					current);
            			

            }

            // InternalFormValDSL.g:4535:3: (otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // InternalFormValDSL.g:4536:4: otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,78,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getAttributeArrayAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalFormValDSL.g:4540:4: ( ( ruleEString ) )
            // InternalFormValDSL.g:4541:5: ( ruleEString )
            {
            // InternalFormValDSL.g:4541:5: ( ruleEString )
            // InternalFormValDSL.g:4542:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAttributeArrayRule());
            						}
            					

            						newCompositeNode(grammarAccess.getAttributeArrayAccess().getAttributesClassAttributeCrossReference_1_1_0());
            					
            pushFollow(FOLLOW_84);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalFormValDSL.g:4556:4: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==67) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalFormValDSL.g:4557:5: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,67,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getAttributeArrayAccess().getCommaKeyword_1_2_0());
            	    				
            	    // InternalFormValDSL.g:4561:5: ( ( ruleEString ) )
            	    // InternalFormValDSL.g:4562:6: ( ruleEString )
            	    {
            	    // InternalFormValDSL.g:4562:6: ( ruleEString )
            	    // InternalFormValDSL.g:4563:7: ruleEString
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getAttributeArrayRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getAttributeArrayAccess().getAttributesClassAttributeCrossReference_1_2_1_0());
            	    						
            	    pushFollow(FOLLOW_84);
            	    ruleEString();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            otherlv_5=(Token)match(input,79,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getAttributeArrayAccess().getRightParenthesisKeyword_1_3());
            			

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


    // $ANTLR start "entryRuleFieldSet"
    // InternalFormValDSL.g:4587:1: entryRuleFieldSet returns [EObject current=null] : iv_ruleFieldSet= ruleFieldSet EOF ;
    public final EObject entryRuleFieldSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSet = null;


        try {
            // InternalFormValDSL.g:4587:49: (iv_ruleFieldSet= ruleFieldSet EOF )
            // InternalFormValDSL.g:4588:2: iv_ruleFieldSet= ruleFieldSet EOF
            {
             newCompositeNode(grammarAccess.getFieldSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSet=ruleFieldSet();

            state._fsp--;

             current =iv_ruleFieldSet; 
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
    // $ANTLR end "entryRuleFieldSet"


    // $ANTLR start "ruleFieldSet"
    // InternalFormValDSL.g:4594:1: ruleFieldSet returns [EObject current=null] : ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? ( ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )* )? otherlv_11= '}' ) ;
    public final EObject ruleFieldSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_legend_5_0 = null;

        EObject lv_attributearray_7_0 = null;

        EObject lv_attributearray_8_0 = null;

        EObject lv_layouts_9_0 = null;

        EObject lv_layouts_10_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4600:2: ( ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? ( ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )* )? otherlv_11= '}' ) )
            // InternalFormValDSL.g:4601:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? ( ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )* )? otherlv_11= '}' )
            {
            // InternalFormValDSL.g:4601:2: ( () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? ( ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )* )? otherlv_11= '}' )
            // InternalFormValDSL.g:4602:3: () otherlv_1= 'FieldSet' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? ( ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )* )? otherlv_11= '}'
            {
            // InternalFormValDSL.g:4602:3: ()
            // InternalFormValDSL.g:4603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldSetAccess().getFieldSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSetAccess().getFieldSetKeyword_1());
            		
            // InternalFormValDSL.g:4613:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFormValDSL.g:4614:4: (lv_name_2_0= ruleEString )
            {
            // InternalFormValDSL.g:4614:4: (lv_name_2_0= ruleEString )
            // InternalFormValDSL.g:4615:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldSetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.FormValDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_85); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFormValDSL.g:4636:3: (otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==81) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalFormValDSL.g:4637:4: otherlv_4= 'Legend' ( (lv_legend_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,81,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldSetAccess().getLegendKeyword_4_0());
                    			
                    // InternalFormValDSL.g:4641:4: ( (lv_legend_5_0= ruleEString ) )
                    // InternalFormValDSL.g:4642:5: (lv_legend_5_0= ruleEString )
                    {
                    // InternalFormValDSL.g:4642:5: (lv_legend_5_0= ruleEString )
                    // InternalFormValDSL.g:4643:6: lv_legend_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldSetAccess().getLegendEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_legend_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    						}
                    						set(
                    							current,
                    							"legend",
                    							lv_legend_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4661:3: (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==74) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalFormValDSL.g:4662:4: otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )*
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_79); 

                    				newLeafNode(otherlv_6, grammarAccess.getFieldSetAccess().getAttributesKeyword_5_0());
                    			
                    // InternalFormValDSL.g:4666:4: ( (lv_attributearray_7_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4667:5: (lv_attributearray_7_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4667:5: (lv_attributearray_7_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4668:6: lv_attributearray_7_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getFieldSetAccess().getAttributearrayAttributeArrayParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    lv_attributearray_7_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:4685:4: ( (lv_attributearray_8_0= ruleAttributeArray ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==78) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // InternalFormValDSL.g:4686:5: (lv_attributearray_8_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValDSL.g:4686:5: (lv_attributearray_8_0= ruleAttributeArray )
                    	    // InternalFormValDSL.g:4687:6: lv_attributearray_8_0= ruleAttributeArray
                    	    {

                    	    						newCompositeNode(grammarAccess.getFieldSetAccess().getAttributearrayAttributeArrayParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_87);
                    	    lv_attributearray_8_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributearray",
                    	    							lv_attributearray_8_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:4705:3: ( ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )* )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==80||(LA124_0>=82 && LA124_0<=83)) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalFormValDSL.g:4706:4: ( (lv_layouts_9_0= ruleFormLayout ) ) ( (lv_layouts_10_0= ruleFormLayout ) )*
                    {
                    // InternalFormValDSL.g:4706:4: ( (lv_layouts_9_0= ruleFormLayout ) )
                    // InternalFormValDSL.g:4707:5: (lv_layouts_9_0= ruleFormLayout )
                    {
                    // InternalFormValDSL.g:4707:5: (lv_layouts_9_0= ruleFormLayout )
                    // InternalFormValDSL.g:4708:6: lv_layouts_9_0= ruleFormLayout
                    {

                    						newCompositeNode(grammarAccess.getFieldSetAccess().getLayoutsFormLayoutParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_88);
                    lv_layouts_9_0=ruleFormLayout();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    						}
                    						add(
                    							current,
                    							"layouts",
                    							lv_layouts_9_0,
                    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:4725:4: ( (lv_layouts_10_0= ruleFormLayout ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==80||(LA123_0>=82 && LA123_0<=83)) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // InternalFormValDSL.g:4726:5: (lv_layouts_10_0= ruleFormLayout )
                    	    {
                    	    // InternalFormValDSL.g:4726:5: (lv_layouts_10_0= ruleFormLayout )
                    	    // InternalFormValDSL.g:4727:6: lv_layouts_10_0= ruleFormLayout
                    	    {

                    	    						newCompositeNode(grammarAccess.getFieldSetAccess().getLayoutsFormLayoutParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_88);
                    	    lv_layouts_10_0=ruleFormLayout();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFieldSetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"layouts",
                    	    							lv_layouts_10_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFieldSetAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFieldSet"


    // $ANTLR start "entryRuleTab"
    // InternalFormValDSL.g:4753:1: entryRuleTab returns [EObject current=null] : iv_ruleTab= ruleTab EOF ;
    public final EObject entryRuleTab() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTab = null;


        try {
            // InternalFormValDSL.g:4753:44: (iv_ruleTab= ruleTab EOF )
            // InternalFormValDSL.g:4754:2: iv_ruleTab= ruleTab EOF
            {
             newCompositeNode(grammarAccess.getTabRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTab=ruleTab();

            state._fsp--;

             current =iv_ruleTab; 
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
    // $ANTLR end "entryRuleTab"


    // $ANTLR start "ruleTab"
    // InternalFormValDSL.g:4760:1: ruleTab returns [EObject current=null] : ( () otherlv_1= 'Tab' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? (otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleTab() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_label_5_0 = null;

        EObject lv_attributearray_7_0 = null;

        EObject lv_attributearray_8_0 = null;

        EObject lv_layouts_10_0 = null;

        EObject lv_layouts_12_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4766:2: ( ( () otherlv_1= 'Tab' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? (otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalFormValDSL.g:4767:2: ( () otherlv_1= 'Tab' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? (otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalFormValDSL.g:4767:2: ( () otherlv_1= 'Tab' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? (otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalFormValDSL.g:4768:3: () otherlv_1= 'Tab' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) ) )? (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )? (otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalFormValDSL.g:4768:3: ()
            // InternalFormValDSL.g:4769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTabAccess().getTabAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTabAccess().getTabKeyword_1());
            		
            // InternalFormValDSL.g:4779:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFormValDSL.g:4780:4: (lv_name_2_0= ruleEString )
            {
            // InternalFormValDSL.g:4780:4: (lv_name_2_0= ruleEString )
            // InternalFormValDSL.g:4781:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTabAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTabRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.FormValDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_89); 

            			newLeafNode(otherlv_3, grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFormValDSL.g:4802:3: (otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==15) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalFormValDSL.g:4803:4: otherlv_4= 'Label' ( (lv_label_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getTabAccess().getLabelKeyword_4_0());
                    			
                    // InternalFormValDSL.g:4807:4: ( (lv_label_5_0= ruleEString ) )
                    // InternalFormValDSL.g:4808:5: (lv_label_5_0= ruleEString )
                    {
                    // InternalFormValDSL.g:4808:5: (lv_label_5_0= ruleEString )
                    // InternalFormValDSL.g:4809:6: lv_label_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTabAccess().getLabelEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_label_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTabRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:4827:3: (otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==74) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalFormValDSL.g:4828:4: otherlv_6= 'attributes' ( (lv_attributearray_7_0= ruleAttributeArray ) ) ( (lv_attributearray_8_0= ruleAttributeArray ) )*
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_79); 

                    				newLeafNode(otherlv_6, grammarAccess.getTabAccess().getAttributesKeyword_5_0());
                    			
                    // InternalFormValDSL.g:4832:4: ( (lv_attributearray_7_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4833:5: (lv_attributearray_7_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4833:5: (lv_attributearray_7_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4834:6: lv_attributearray_7_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getTabAccess().getAttributearrayAttributeArrayParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_attributearray_7_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTabRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:4851:4: ( (lv_attributearray_8_0= ruleAttributeArray ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==78) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalFormValDSL.g:4852:5: (lv_attributearray_8_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValDSL.g:4852:5: (lv_attributearray_8_0= ruleAttributeArray )
                    	    // InternalFormValDSL.g:4853:6: lv_attributearray_8_0= ruleAttributeArray
                    	    {

                    	    						newCompositeNode(grammarAccess.getTabAccess().getAttributearrayAttributeArrayParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_90);
                    	    lv_attributearray_8_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTabRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributearray",
                    	    							lv_attributearray_8_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:4871:3: (otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==11) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalFormValDSL.g:4872:4: otherlv_9= '{' ( (lv_layouts_10_0= ruleFormLayout ) ) (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,11,FOLLOW_91); 

                    				newLeafNode(otherlv_9, grammarAccess.getTabAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalFormValDSL.g:4876:4: ( (lv_layouts_10_0= ruleFormLayout ) )
                    // InternalFormValDSL.g:4877:5: (lv_layouts_10_0= ruleFormLayout )
                    {
                    // InternalFormValDSL.g:4877:5: (lv_layouts_10_0= ruleFormLayout )
                    // InternalFormValDSL.g:4878:6: lv_layouts_10_0= ruleFormLayout
                    {

                    						newCompositeNode(grammarAccess.getTabAccess().getLayoutsFormLayoutParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_layouts_10_0=ruleFormLayout();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTabRule());
                    						}
                    						add(
                    							current,
                    							"layouts",
                    							lv_layouts_10_0,
                    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:4895:4: (otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==67) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalFormValDSL.g:4896:5: otherlv_11= ',' ( (lv_layouts_12_0= ruleFormLayout ) )
                    	    {
                    	    otherlv_11=(Token)match(input,67,FOLLOW_91); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTabAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalFormValDSL.g:4900:5: ( (lv_layouts_12_0= ruleFormLayout ) )
                    	    // InternalFormValDSL.g:4901:6: (lv_layouts_12_0= ruleFormLayout )
                    	    {
                    	    // InternalFormValDSL.g:4901:6: (lv_layouts_12_0= ruleFormLayout )
                    	    // InternalFormValDSL.g:4902:7: lv_layouts_12_0= ruleFormLayout
                    	    {

                    	    							newCompositeNode(grammarAccess.getTabAccess().getLayoutsFormLayoutParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
                    	    lv_layouts_12_0=ruleFormLayout();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTabRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"layouts",
                    	    								lv_layouts_12_0,
                    	    								"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getTabAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTabAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTab"


    // $ANTLR start "entryRuleGrid"
    // InternalFormValDSL.g:4933:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalFormValDSL.g:4933:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalFormValDSL.g:4934:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalFormValDSL.g:4940:1: ruleGrid returns [EObject current=null] : ( () otherlv_1= 'Grid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )* )? ( ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributearray_5_0 = null;

        EObject lv_attributearray_7_0 = null;

        EObject lv_layouts_8_0 = null;

        EObject lv_layouts_9_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:4946:2: ( ( () otherlv_1= 'Grid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )* )? ( ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )* )? otherlv_10= '}' ) )
            // InternalFormValDSL.g:4947:2: ( () otherlv_1= 'Grid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )* )? ( ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )* )? otherlv_10= '}' )
            {
            // InternalFormValDSL.g:4947:2: ( () otherlv_1= 'Grid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )* )? ( ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )* )? otherlv_10= '}' )
            // InternalFormValDSL.g:4948:3: () otherlv_1= 'Grid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )* )? ( ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )* )? otherlv_10= '}'
            {
            // InternalFormValDSL.g:4948:3: ()
            // InternalFormValDSL.g:4949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGridAccess().getGridAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGridAccess().getGridKeyword_1());
            		
            // InternalFormValDSL.g:4959:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFormValDSL.g:4960:4: (lv_name_2_0= ruleEString )
            {
            // InternalFormValDSL.g:4960:4: (lv_name_2_0= ruleEString )
            // InternalFormValDSL.g:4961:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGridAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGridRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.FormValDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_92); 

            			newLeafNode(otherlv_3, grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFormValDSL.g:4982:3: (otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )* )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==84) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalFormValDSL.g:4983:4: otherlv_4= 'row' ( (lv_attributearray_5_0= ruleAttributeArray ) ) (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )*
                    {
                    otherlv_4=(Token)match(input,84,FOLLOW_79); 

                    				newLeafNode(otherlv_4, grammarAccess.getGridAccess().getRowKeyword_4_0());
                    			
                    // InternalFormValDSL.g:4987:4: ( (lv_attributearray_5_0= ruleAttributeArray ) )
                    // InternalFormValDSL.g:4988:5: (lv_attributearray_5_0= ruleAttributeArray )
                    {
                    // InternalFormValDSL.g:4988:5: (lv_attributearray_5_0= ruleAttributeArray )
                    // InternalFormValDSL.g:4989:6: lv_attributearray_5_0= ruleAttributeArray
                    {

                    						newCompositeNode(grammarAccess.getGridAccess().getAttributearrayAttributeArrayParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_attributearray_5_0=ruleAttributeArray();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGridRule());
                    						}
                    						add(
                    							current,
                    							"attributearray",
                    							lv_attributearray_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:5006:4: (otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) ) )*
                    loop130:
                    do {
                        int alt130=2;
                        int LA130_0 = input.LA(1);

                        if ( (LA130_0==84) ) {
                            alt130=1;
                        }


                        switch (alt130) {
                    	case 1 :
                    	    // InternalFormValDSL.g:5007:5: otherlv_6= 'row' ( (lv_attributearray_7_0= ruleAttributeArray ) )
                    	    {
                    	    otherlv_6=(Token)match(input,84,FOLLOW_79); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGridAccess().getRowKeyword_4_2_0());
                    	    				
                    	    // InternalFormValDSL.g:5011:5: ( (lv_attributearray_7_0= ruleAttributeArray ) )
                    	    // InternalFormValDSL.g:5012:6: (lv_attributearray_7_0= ruleAttributeArray )
                    	    {
                    	    // InternalFormValDSL.g:5012:6: (lv_attributearray_7_0= ruleAttributeArray )
                    	    // InternalFormValDSL.g:5013:7: lv_attributearray_7_0= ruleAttributeArray
                    	    {

                    	    							newCompositeNode(grammarAccess.getGridAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_92);
                    	    lv_attributearray_7_0=ruleAttributeArray();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGridRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributearray",
                    	    								lv_attributearray_7_0,
                    	    								"org.xtext.example.mydsl.FormValDSL.AttributeArray");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop130;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalFormValDSL.g:5032:3: ( ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )* )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==80||(LA133_0>=82 && LA133_0<=83)) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalFormValDSL.g:5033:4: ( (lv_layouts_8_0= ruleFormLayout ) ) ( (lv_layouts_9_0= ruleFormLayout ) )*
                    {
                    // InternalFormValDSL.g:5033:4: ( (lv_layouts_8_0= ruleFormLayout ) )
                    // InternalFormValDSL.g:5034:5: (lv_layouts_8_0= ruleFormLayout )
                    {
                    // InternalFormValDSL.g:5034:5: (lv_layouts_8_0= ruleFormLayout )
                    // InternalFormValDSL.g:5035:6: lv_layouts_8_0= ruleFormLayout
                    {

                    						newCompositeNode(grammarAccess.getGridAccess().getLayoutsFormLayoutParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_88);
                    lv_layouts_8_0=ruleFormLayout();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGridRule());
                    						}
                    						add(
                    							current,
                    							"layouts",
                    							lv_layouts_8_0,
                    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:5052:4: ( (lv_layouts_9_0= ruleFormLayout ) )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==80||(LA132_0>=82 && LA132_0<=83)) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // InternalFormValDSL.g:5053:5: (lv_layouts_9_0= ruleFormLayout )
                    	    {
                    	    // InternalFormValDSL.g:5053:5: (lv_layouts_9_0= ruleFormLayout )
                    	    // InternalFormValDSL.g:5054:6: lv_layouts_9_0= ruleFormLayout
                    	    {

                    	    						newCompositeNode(grammarAccess.getGridAccess().getLayoutsFormLayoutParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_88);
                    	    lv_layouts_9_0=ruleFormLayout();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getGridRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"layouts",
                    	    							lv_layouts_9_0,
                    	    							"org.xtext.example.mydsl.FormValDSL.FormLayout");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getGridAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleAttributeSettings"
    // InternalFormValDSL.g:5080:1: entryRuleAttributeSettings returns [EObject current=null] : iv_ruleAttributeSettings= ruleAttributeSettings EOF ;
    public final EObject entryRuleAttributeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeSettings = null;


        try {
            // InternalFormValDSL.g:5080:58: (iv_ruleAttributeSettings= ruleAttributeSettings EOF )
            // InternalFormValDSL.g:5081:2: iv_ruleAttributeSettings= ruleAttributeSettings EOF
            {
             newCompositeNode(grammarAccess.getAttributeSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeSettings=ruleAttributeSettings();

            state._fsp--;

             current =iv_ruleAttributeSettings; 
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
    // $ANTLR end "entryRuleAttributeSettings"


    // $ANTLR start "ruleAttributeSettings"
    // InternalFormValDSL.g:5087:1: ruleAttributeSettings returns [EObject current=null] : ( () otherlv_1= 'AttributeSettings' otherlv_2= '{' (otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAttributeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_presentation_4_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5093:2: ( ( () otherlv_1= 'AttributeSettings' otherlv_2= '{' (otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) ) )? otherlv_5= '}' ) )
            // InternalFormValDSL.g:5094:2: ( () otherlv_1= 'AttributeSettings' otherlv_2= '{' (otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) ) )? otherlv_5= '}' )
            {
            // InternalFormValDSL.g:5094:2: ( () otherlv_1= 'AttributeSettings' otherlv_2= '{' (otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) ) )? otherlv_5= '}' )
            // InternalFormValDSL.g:5095:3: () otherlv_1= 'AttributeSettings' otherlv_2= '{' (otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) ) )? otherlv_5= '}'
            {
            // InternalFormValDSL.g:5095:3: ()
            // InternalFormValDSL.g:5096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeSettingsAccess().getAttributeSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeSettingsAccess().getAttributeSettingsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeSettingsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:5110:3: (otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==86) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalFormValDSL.g:5111:4: otherlv_3= 'Presentation' ( (lv_presentation_4_0= ruleERequiredField ) )
                    {
                    otherlv_3=(Token)match(input,86,FOLLOW_94); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeSettingsAccess().getPresentationKeyword_3_0());
                    			
                    // InternalFormValDSL.g:5115:4: ( (lv_presentation_4_0= ruleERequiredField ) )
                    // InternalFormValDSL.g:5116:5: (lv_presentation_4_0= ruleERequiredField )
                    {
                    // InternalFormValDSL.g:5116:5: (lv_presentation_4_0= ruleERequiredField )
                    // InternalFormValDSL.g:5117:6: lv_presentation_4_0= ruleERequiredField
                    {

                    						newCompositeNode(grammarAccess.getAttributeSettingsAccess().getPresentationERequiredFieldEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_presentation_4_0=ruleERequiredField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeSettingsRule());
                    						}
                    						set(
                    							current,
                    							"presentation",
                    							lv_presentation_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.ERequiredField");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeSettingsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAttributeSettings"


    // $ANTLR start "entryRuleLabelSettings"
    // InternalFormValDSL.g:5143:1: entryRuleLabelSettings returns [EObject current=null] : iv_ruleLabelSettings= ruleLabelSettings EOF ;
    public final EObject entryRuleLabelSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelSettings = null;


        try {
            // InternalFormValDSL.g:5143:54: (iv_ruleLabelSettings= ruleLabelSettings EOF )
            // InternalFormValDSL.g:5144:2: iv_ruleLabelSettings= ruleLabelSettings EOF
            {
             newCompositeNode(grammarAccess.getLabelSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelSettings=ruleLabelSettings();

            state._fsp--;

             current =iv_ruleLabelSettings; 
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
    // $ANTLR end "entryRuleLabelSettings"


    // $ANTLR start "ruleLabelSettings"
    // InternalFormValDSL.g:5150:1: ruleLabelSettings returns [EObject current=null] : ( () otherlv_1= 'LabelSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLabelSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_position_4_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5156:2: ( ( () otherlv_1= 'LabelSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' ) )
            // InternalFormValDSL.g:5157:2: ( () otherlv_1= 'LabelSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' )
            {
            // InternalFormValDSL.g:5157:2: ( () otherlv_1= 'LabelSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' )
            // InternalFormValDSL.g:5158:3: () otherlv_1= 'LabelSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}'
            {
            // InternalFormValDSL.g:5158:3: ()
            // InternalFormValDSL.g:5159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelSettingsAccess().getLabelSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelSettingsAccess().getLabelSettingsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_95); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelSettingsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:5173:3: (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==88) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalFormValDSL.g:5174:4: otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) )
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getLabelSettingsAccess().getPositionKeyword_3_0());
                    			
                    // InternalFormValDSL.g:5178:4: ( (lv_position_4_0= ruleEPosition ) )
                    // InternalFormValDSL.g:5179:5: (lv_position_4_0= ruleEPosition )
                    {
                    // InternalFormValDSL.g:5179:5: (lv_position_4_0= ruleEPosition )
                    // InternalFormValDSL.g:5180:6: lv_position_4_0= ruleEPosition
                    {

                    						newCompositeNode(grammarAccess.getLabelSettingsAccess().getPositionEPositionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_position_4_0=ruleEPosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelSettingsRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EPosition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLabelSettingsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLabelSettings"


    // $ANTLR start "entryRuleErrorMessageSettings"
    // InternalFormValDSL.g:5206:1: entryRuleErrorMessageSettings returns [EObject current=null] : iv_ruleErrorMessageSettings= ruleErrorMessageSettings EOF ;
    public final EObject entryRuleErrorMessageSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorMessageSettings = null;


        try {
            // InternalFormValDSL.g:5206:61: (iv_ruleErrorMessageSettings= ruleErrorMessageSettings EOF )
            // InternalFormValDSL.g:5207:2: iv_ruleErrorMessageSettings= ruleErrorMessageSettings EOF
            {
             newCompositeNode(grammarAccess.getErrorMessageSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorMessageSettings=ruleErrorMessageSettings();

            state._fsp--;

             current =iv_ruleErrorMessageSettings; 
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
    // $ANTLR end "entryRuleErrorMessageSettings"


    // $ANTLR start "ruleErrorMessageSettings"
    // InternalFormValDSL.g:5213:1: ruleErrorMessageSettings returns [EObject current=null] : ( () otherlv_1= 'ErrorMessageSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? (otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleErrorMessageSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_position_4_0 = null;

        EObject lv_color_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5219:2: ( ( () otherlv_1= 'ErrorMessageSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? (otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) ) )? otherlv_7= '}' ) )
            // InternalFormValDSL.g:5220:2: ( () otherlv_1= 'ErrorMessageSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? (otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) ) )? otherlv_7= '}' )
            {
            // InternalFormValDSL.g:5220:2: ( () otherlv_1= 'ErrorMessageSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? (otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) ) )? otherlv_7= '}' )
            // InternalFormValDSL.g:5221:3: () otherlv_1= 'ErrorMessageSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? (otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) ) )? otherlv_7= '}'
            {
            // InternalFormValDSL.g:5221:3: ()
            // InternalFormValDSL.g:5222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getErrorMessageSettingsAccess().getErrorMessageSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorMessageSettingsAccess().getErrorMessageSettingsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_96); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorMessageSettingsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:5236:3: (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==88) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalFormValDSL.g:5237:4: otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) )
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getErrorMessageSettingsAccess().getPositionKeyword_3_0());
                    			
                    // InternalFormValDSL.g:5241:4: ( (lv_position_4_0= ruleEPosition ) )
                    // InternalFormValDSL.g:5242:5: (lv_position_4_0= ruleEPosition )
                    {
                    // InternalFormValDSL.g:5242:5: (lv_position_4_0= ruleEPosition )
                    // InternalFormValDSL.g:5243:6: lv_position_4_0= ruleEPosition
                    {

                    						newCompositeNode(grammarAccess.getErrorMessageSettingsAccess().getPositionEPositionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    lv_position_4_0=ruleEPosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getErrorMessageSettingsRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EPosition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:5261:3: (otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==90) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalFormValDSL.g:5262:4: otherlv_5= 'Color' ( (lv_color_6_0= ruleColor ) )
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_79); 

                    				newLeafNode(otherlv_5, grammarAccess.getErrorMessageSettingsAccess().getColorKeyword_4_0());
                    			
                    // InternalFormValDSL.g:5266:4: ( (lv_color_6_0= ruleColor ) )
                    // InternalFormValDSL.g:5267:5: (lv_color_6_0= ruleColor )
                    {
                    // InternalFormValDSL.g:5267:5: (lv_color_6_0= ruleColor )
                    // InternalFormValDSL.g:5268:6: lv_color_6_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getErrorMessageSettingsAccess().getColorColorParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_color_6_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getErrorMessageSettingsRule());
                    						}
                    						set(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"org.xtext.example.mydsl.FormValDSL.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getErrorMessageSettingsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleErrorMessageSettings"


    // $ANTLR start "entryRuleFormSettings"
    // InternalFormValDSL.g:5294:1: entryRuleFormSettings returns [EObject current=null] : iv_ruleFormSettings= ruleFormSettings EOF ;
    public final EObject entryRuleFormSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormSettings = null;


        try {
            // InternalFormValDSL.g:5294:53: (iv_ruleFormSettings= ruleFormSettings EOF )
            // InternalFormValDSL.g:5295:2: iv_ruleFormSettings= ruleFormSettings EOF
            {
             newCompositeNode(grammarAccess.getFormSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormSettings=ruleFormSettings();

            state._fsp--;

             current =iv_ruleFormSettings; 
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
    // $ANTLR end "entryRuleFormSettings"


    // $ANTLR start "ruleFormSettings"
    // InternalFormValDSL.g:5301:1: ruleFormSettings returns [EObject current=null] : ( () ( (lv_autoComplete_1_0= 'Auto Complete' ) )? otherlv_2= 'FormSettings' ) ;
    public final EObject ruleFormSettings() throws RecognitionException {
        EObject current = null;

        Token lv_autoComplete_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5307:2: ( ( () ( (lv_autoComplete_1_0= 'Auto Complete' ) )? otherlv_2= 'FormSettings' ) )
            // InternalFormValDSL.g:5308:2: ( () ( (lv_autoComplete_1_0= 'Auto Complete' ) )? otherlv_2= 'FormSettings' )
            {
            // InternalFormValDSL.g:5308:2: ( () ( (lv_autoComplete_1_0= 'Auto Complete' ) )? otherlv_2= 'FormSettings' )
            // InternalFormValDSL.g:5309:3: () ( (lv_autoComplete_1_0= 'Auto Complete' ) )? otherlv_2= 'FormSettings'
            {
            // InternalFormValDSL.g:5309:3: ()
            // InternalFormValDSL.g:5310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFormSettingsAccess().getFormSettingsAction_0(),
            					current);
            			

            }

            // InternalFormValDSL.g:5316:3: ( (lv_autoComplete_1_0= 'Auto Complete' ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==91) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalFormValDSL.g:5317:4: (lv_autoComplete_1_0= 'Auto Complete' )
                    {
                    // InternalFormValDSL.g:5317:4: (lv_autoComplete_1_0= 'Auto Complete' )
                    // InternalFormValDSL.g:5318:5: lv_autoComplete_1_0= 'Auto Complete'
                    {
                    lv_autoComplete_1_0=(Token)match(input,91,FOLLOW_98); 

                    					newLeafNode(lv_autoComplete_1_0, grammarAccess.getFormSettingsAccess().getAutoCompleteAutoCompleteKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFormSettingsRule());
                    					}
                    					setWithLastConsumed(current, "autoComplete", true, "Auto Complete");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,92,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFormSettingsAccess().getFormSettingsKeyword_2());
            		

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
    // $ANTLR end "ruleFormSettings"


    // $ANTLR start "entryRuleNoteSettings"
    // InternalFormValDSL.g:5338:1: entryRuleNoteSettings returns [EObject current=null] : iv_ruleNoteSettings= ruleNoteSettings EOF ;
    public final EObject entryRuleNoteSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteSettings = null;


        try {
            // InternalFormValDSL.g:5338:53: (iv_ruleNoteSettings= ruleNoteSettings EOF )
            // InternalFormValDSL.g:5339:2: iv_ruleNoteSettings= ruleNoteSettings EOF
            {
             newCompositeNode(grammarAccess.getNoteSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoteSettings=ruleNoteSettings();

            state._fsp--;

             current =iv_ruleNoteSettings; 
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
    // $ANTLR end "entryRuleNoteSettings"


    // $ANTLR start "ruleNoteSettings"
    // InternalFormValDSL.g:5345:1: ruleNoteSettings returns [EObject current=null] : ( () otherlv_1= 'NoteSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleNoteSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_position_4_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5351:2: ( ( () otherlv_1= 'NoteSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' ) )
            // InternalFormValDSL.g:5352:2: ( () otherlv_1= 'NoteSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' )
            {
            // InternalFormValDSL.g:5352:2: ( () otherlv_1= 'NoteSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}' )
            // InternalFormValDSL.g:5353:3: () otherlv_1= 'NoteSettings' otherlv_2= '{' (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )? otherlv_5= '}'
            {
            // InternalFormValDSL.g:5353:3: ()
            // InternalFormValDSL.g:5354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoteSettingsAccess().getNoteSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNoteSettingsAccess().getNoteSettingsKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_95); 

            			newLeafNode(otherlv_2, grammarAccess.getNoteSettingsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:5368:3: (otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==88) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalFormValDSL.g:5369:4: otherlv_3= 'Position' ( (lv_position_4_0= ruleEPosition ) )
                    {
                    otherlv_3=(Token)match(input,88,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getNoteSettingsAccess().getPositionKeyword_3_0());
                    			
                    // InternalFormValDSL.g:5373:4: ( (lv_position_4_0= ruleEPosition ) )
                    // InternalFormValDSL.g:5374:5: (lv_position_4_0= ruleEPosition )
                    {
                    // InternalFormValDSL.g:5374:5: (lv_position_4_0= ruleEPosition )
                    // InternalFormValDSL.g:5375:6: lv_position_4_0= ruleEPosition
                    {

                    						newCompositeNode(grammarAccess.getNoteSettingsAccess().getPositionEPositionEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_position_4_0=ruleEPosition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNoteSettingsRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EPosition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNoteSettingsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNoteSettings"


    // $ANTLR start "entryRuleColor"
    // InternalFormValDSL.g:5401:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalFormValDSL.g:5401:46: (iv_ruleColor= ruleColor EOF )
            // InternalFormValDSL.g:5402:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalFormValDSL.g:5408:1: ruleColor returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ',' )? ( ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ',' )? ( (lv_blue_6_0= ruleEInt ) )? otherlv_7= ')' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_red_2_0 = null;

        AntlrDatatypeRuleToken lv_green_4_0 = null;

        AntlrDatatypeRuleToken lv_blue_6_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5414:2: ( ( () otherlv_1= '(' ( ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ',' )? ( ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ',' )? ( (lv_blue_6_0= ruleEInt ) )? otherlv_7= ')' ) )
            // InternalFormValDSL.g:5415:2: ( () otherlv_1= '(' ( ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ',' )? ( ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ',' )? ( (lv_blue_6_0= ruleEInt ) )? otherlv_7= ')' )
            {
            // InternalFormValDSL.g:5415:2: ( () otherlv_1= '(' ( ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ',' )? ( ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ',' )? ( (lv_blue_6_0= ruleEInt ) )? otherlv_7= ')' )
            // InternalFormValDSL.g:5416:3: () otherlv_1= '(' ( ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ',' )? ( ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ',' )? ( (lv_blue_6_0= ruleEInt ) )? otherlv_7= ')'
            {
            // InternalFormValDSL.g:5416:3: ()
            // InternalFormValDSL.g:5417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_99); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFormValDSL.g:5427:3: ( ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ',' )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==51) ) {
                int LA140_1 = input.LA(2);

                if ( (LA140_1==RULE_INT) ) {
                    int LA140_2 = input.LA(3);

                    if ( (LA140_2==67) ) {
                        alt140=1;
                    }
                }
            }
            else if ( (LA140_0==RULE_INT) ) {
                int LA140_2 = input.LA(2);

                if ( (LA140_2==67) ) {
                    alt140=1;
                }
            }
            switch (alt140) {
                case 1 :
                    // InternalFormValDSL.g:5428:4: ( (lv_red_2_0= ruleEInt ) ) otherlv_3= ','
                    {
                    // InternalFormValDSL.g:5428:4: ( (lv_red_2_0= ruleEInt ) )
                    // InternalFormValDSL.g:5429:5: (lv_red_2_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5429:5: (lv_red_2_0= ruleEInt )
                    // InternalFormValDSL.g:5430:6: lv_red_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRedEIntParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_100);
                    lv_red_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"red",
                    							lv_red_2_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_99); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorAccess().getCommaKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalFormValDSL.g:5452:3: ( ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ',' )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==51) ) {
                int LA141_1 = input.LA(2);

                if ( (LA141_1==RULE_INT) ) {
                    int LA141_2 = input.LA(3);

                    if ( (LA141_2==67) ) {
                        alt141=1;
                    }
                }
            }
            else if ( (LA141_0==RULE_INT) ) {
                int LA141_2 = input.LA(2);

                if ( (LA141_2==67) ) {
                    alt141=1;
                }
            }
            switch (alt141) {
                case 1 :
                    // InternalFormValDSL.g:5453:4: ( (lv_green_4_0= ruleEInt ) ) otherlv_5= ','
                    {
                    // InternalFormValDSL.g:5453:4: ( (lv_green_4_0= ruleEInt ) )
                    // InternalFormValDSL.g:5454:5: (lv_green_4_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5454:5: (lv_green_4_0= ruleEInt )
                    // InternalFormValDSL.g:5455:6: lv_green_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getGreenEIntParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_100);
                    lv_green_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"green",
                    							lv_green_4_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,67,FOLLOW_99); 

                    				newLeafNode(otherlv_5, grammarAccess.getColorAccess().getCommaKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalFormValDSL.g:5477:3: ( (lv_blue_6_0= ruleEInt ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==RULE_INT||LA142_0==51) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalFormValDSL.g:5478:4: (lv_blue_6_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5478:4: (lv_blue_6_0= ruleEInt )
                    // InternalFormValDSL.g:5479:5: lv_blue_6_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getColorAccess().getBlueEIntParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_101);
                    lv_blue_6_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColorRule());
                    					}
                    					set(
                    						current,
                    						"blue",
                    						lv_blue_6_0,
                    						"org.xtext.example.mydsl.FormValDSL.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,79,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getColorAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTableOverview"
    // InternalFormValDSL.g:5504:1: entryRuleTableOverview returns [EObject current=null] : iv_ruleTableOverview= ruleTableOverview EOF ;
    public final EObject entryRuleTableOverview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableOverview = null;


        try {
            // InternalFormValDSL.g:5504:54: (iv_ruleTableOverview= ruleTableOverview EOF )
            // InternalFormValDSL.g:5505:2: iv_ruleTableOverview= ruleTableOverview EOF
            {
             newCompositeNode(grammarAccess.getTableOverviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTableOverview=ruleTableOverview();

            state._fsp--;

             current =iv_ruleTableOverview; 
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
    // $ANTLR end "entryRuleTableOverview"


    // $ANTLR start "ruleTableOverview"
    // InternalFormValDSL.g:5511:1: ruleTableOverview returns [EObject current=null] : ( () otherlv_1= 'TableOverview' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) ) )? (otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) ) )? (otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) ) )? ( (lv_paging_10_0= rulePagination ) )? otherlv_11= '}' ) ;
    public final EObject ruleTableOverview() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_height_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;

        AntlrDatatypeRuleToken lv_title_9_0 = null;

        EObject lv_paging_10_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5517:2: ( ( () otherlv_1= 'TableOverview' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) ) )? (otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) ) )? (otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) ) )? ( (lv_paging_10_0= rulePagination ) )? otherlv_11= '}' ) )
            // InternalFormValDSL.g:5518:2: ( () otherlv_1= 'TableOverview' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) ) )? (otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) ) )? (otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) ) )? ( (lv_paging_10_0= rulePagination ) )? otherlv_11= '}' )
            {
            // InternalFormValDSL.g:5518:2: ( () otherlv_1= 'TableOverview' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) ) )? (otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) ) )? (otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) ) )? ( (lv_paging_10_0= rulePagination ) )? otherlv_11= '}' )
            // InternalFormValDSL.g:5519:3: () otherlv_1= 'TableOverview' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) ) )? (otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) ) )? (otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) ) )? ( (lv_paging_10_0= rulePagination ) )? otherlv_11= '}'
            {
            // InternalFormValDSL.g:5519:3: ()
            // InternalFormValDSL.g:5520:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableOverviewAccess().getTableOverviewAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTableOverviewAccess().getTableOverviewKeyword_1());
            		
            // InternalFormValDSL.g:5530:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFormValDSL.g:5531:4: (lv_name_2_0= ruleEString )
            {
            // InternalFormValDSL.g:5531:4: (lv_name_2_0= ruleEString )
            // InternalFormValDSL.g:5532:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableOverviewAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableOverviewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.FormValDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_102); 

            			newLeafNode(otherlv_3, grammarAccess.getTableOverviewAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFormValDSL.g:5553:3: (otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==95) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalFormValDSL.g:5554:4: otherlv_4= 'Height' ( (lv_height_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,95,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableOverviewAccess().getHeightKeyword_4_0());
                    			
                    // InternalFormValDSL.g:5558:4: ( (lv_height_5_0= ruleEInt ) )
                    // InternalFormValDSL.g:5559:5: (lv_height_5_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5559:5: (lv_height_5_0= ruleEInt )
                    // InternalFormValDSL.g:5560:6: lv_height_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableOverviewAccess().getHeightEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_height_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableOverviewRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:5578:3: (otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==96) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalFormValDSL.g:5579:4: otherlv_6= 'Width' ( (lv_width_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,96,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getTableOverviewAccess().getWidthKeyword_5_0());
                    			
                    // InternalFormValDSL.g:5583:4: ( (lv_width_7_0= ruleEInt ) )
                    // InternalFormValDSL.g:5584:5: (lv_width_7_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5584:5: (lv_width_7_0= ruleEInt )
                    // InternalFormValDSL.g:5585:6: lv_width_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTableOverviewAccess().getWidthEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_width_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableOverviewRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:5603:3: (otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==97) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalFormValDSL.g:5604:4: otherlv_8= 'Title' ( (lv_title_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,97,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getTableOverviewAccess().getTitleKeyword_6_0());
                    			
                    // InternalFormValDSL.g:5608:4: ( (lv_title_9_0= ruleEString ) )
                    // InternalFormValDSL.g:5609:5: (lv_title_9_0= ruleEString )
                    {
                    // InternalFormValDSL.g:5609:5: (lv_title_9_0= ruleEString )
                    // InternalFormValDSL.g:5610:6: lv_title_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableOverviewAccess().getTitleEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_title_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableOverviewRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_9_0,
                    							"org.xtext.example.mydsl.FormValDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFormValDSL.g:5628:3: ( (lv_paging_10_0= rulePagination ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==98) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalFormValDSL.g:5629:4: (lv_paging_10_0= rulePagination )
                    {
                    // InternalFormValDSL.g:5629:4: (lv_paging_10_0= rulePagination )
                    // InternalFormValDSL.g:5630:5: lv_paging_10_0= rulePagination
                    {

                    					newCompositeNode(grammarAccess.getTableOverviewAccess().getPagingPaginationParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_paging_10_0=rulePagination();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableOverviewRule());
                    					}
                    					set(
                    						current,
                    						"paging",
                    						lv_paging_10_0,
                    						"org.xtext.example.mydsl.FormValDSL.Pagination");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTableOverviewAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleTableOverview"


    // $ANTLR start "entryRulePagination"
    // InternalFormValDSL.g:5655:1: entryRulePagination returns [EObject current=null] : iv_rulePagination= rulePagination EOF ;
    public final EObject entryRulePagination() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagination = null;


        try {
            // InternalFormValDSL.g:5655:51: (iv_rulePagination= rulePagination EOF )
            // InternalFormValDSL.g:5656:2: iv_rulePagination= rulePagination EOF
            {
             newCompositeNode(grammarAccess.getPaginationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePagination=rulePagination();

            state._fsp--;

             current =iv_rulePagination; 
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
    // $ANTLR end "entryRulePagination"


    // $ANTLR start "rulePagination"
    // InternalFormValDSL.g:5662:1: rulePagination returns [EObject current=null] : ( () otherlv_1= 'Pagination' otherlv_2= '{' (otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}' )? (otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) ) )? otherlv_11= '}' ) ;
    public final EObject rulePagination() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_possibleNumberOfShownRows_5_0 = null;

        AntlrDatatypeRuleToken lv_possibleNumberOfShownRows_7_0 = null;

        AntlrDatatypeRuleToken lv_defaultNumOfShownRows_10_0 = null;



        	enterRule();

        try {
            // InternalFormValDSL.g:5668:2: ( ( () otherlv_1= 'Pagination' otherlv_2= '{' (otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}' )? (otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) ) )? otherlv_11= '}' ) )
            // InternalFormValDSL.g:5669:2: ( () otherlv_1= 'Pagination' otherlv_2= '{' (otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}' )? (otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) ) )? otherlv_11= '}' )
            {
            // InternalFormValDSL.g:5669:2: ( () otherlv_1= 'Pagination' otherlv_2= '{' (otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}' )? (otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) ) )? otherlv_11= '}' )
            // InternalFormValDSL.g:5670:3: () otherlv_1= 'Pagination' otherlv_2= '{' (otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}' )? (otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) ) )? otherlv_11= '}'
            {
            // InternalFormValDSL.g:5670:3: ()
            // InternalFormValDSL.g:5671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaginationAccess().getPaginationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPaginationAccess().getPaginationKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_106); 

            			newLeafNode(otherlv_2, grammarAccess.getPaginationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFormValDSL.g:5685:3: (otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}' )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==99) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalFormValDSL.g:5686:4: otherlv_3= 'Possible number of shown rows' otherlv_4= '{' ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,99,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPaginationAccess().getPossibleNumberOfShownRowsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,11,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getPaginationAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalFormValDSL.g:5694:4: ( (lv_possibleNumberOfShownRows_5_0= ruleEInt ) )
                    // InternalFormValDSL.g:5695:5: (lv_possibleNumberOfShownRows_5_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5695:5: (lv_possibleNumberOfShownRows_5_0= ruleEInt )
                    // InternalFormValDSL.g:5696:6: lv_possibleNumberOfShownRows_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPaginationAccess().getPossibleNumberOfShownRowsEIntParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_possibleNumberOfShownRows_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaginationRule());
                    						}
                    						add(
                    							current,
                    							"possibleNumberOfShownRows",
                    							lv_possibleNumberOfShownRows_5_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFormValDSL.g:5713:4: (otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) ) )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==67) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalFormValDSL.g:5714:5: otherlv_6= ',' ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) )
                    	    {
                    	    otherlv_6=(Token)match(input,67,FOLLOW_45); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPaginationAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalFormValDSL.g:5718:5: ( (lv_possibleNumberOfShownRows_7_0= ruleEInt ) )
                    	    // InternalFormValDSL.g:5719:6: (lv_possibleNumberOfShownRows_7_0= ruleEInt )
                    	    {
                    	    // InternalFormValDSL.g:5719:6: (lv_possibleNumberOfShownRows_7_0= ruleEInt )
                    	    // InternalFormValDSL.g:5720:7: lv_possibleNumberOfShownRows_7_0= ruleEInt
                    	    {

                    	    							newCompositeNode(grammarAccess.getPaginationAccess().getPossibleNumberOfShownRowsEIntParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_83);
                    	    lv_possibleNumberOfShownRows_7_0=ruleEInt();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPaginationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"possibleNumberOfShownRows",
                    	    								lv_possibleNumberOfShownRows_7_0,
                    	    								"org.xtext.example.mydsl.FormValDSL.EInt");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_107); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaginationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalFormValDSL.g:5743:3: (otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==100) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalFormValDSL.g:5744:4: otherlv_9= 'Default number of shown rows' ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,100,FOLLOW_45); 

                    				newLeafNode(otherlv_9, grammarAccess.getPaginationAccess().getDefaultNumberOfShownRowsKeyword_4_0());
                    			
                    // InternalFormValDSL.g:5748:4: ( (lv_defaultNumOfShownRows_10_0= ruleEInt ) )
                    // InternalFormValDSL.g:5749:5: (lv_defaultNumOfShownRows_10_0= ruleEInt )
                    {
                    // InternalFormValDSL.g:5749:5: (lv_defaultNumOfShownRows_10_0= ruleEInt )
                    // InternalFormValDSL.g:5750:6: lv_defaultNumOfShownRows_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPaginationAccess().getDefaultNumOfShownRowsEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_defaultNumOfShownRows_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaginationRule());
                    						}
                    						set(
                    							current,
                    							"defaultNumOfShownRows",
                    							lv_defaultNumOfShownRows_10_0,
                    							"org.xtext.example.mydsl.FormValDSL.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPaginationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePagination"


    // $ANTLR start "ruleEUINumberComponentType"
    // InternalFormValDSL.g:5776:1: ruleEUINumberComponentType returns [Enumerator current=null] : ( (enumLiteral_0= 'NumberScroller' ) | (enumLiteral_1= 'SimpleInput' ) ) ;
    public final Enumerator ruleEUINumberComponentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5782:2: ( ( (enumLiteral_0= 'NumberScroller' ) | (enumLiteral_1= 'SimpleInput' ) ) )
            // InternalFormValDSL.g:5783:2: ( (enumLiteral_0= 'NumberScroller' ) | (enumLiteral_1= 'SimpleInput' ) )
            {
            // InternalFormValDSL.g:5783:2: ( (enumLiteral_0= 'NumberScroller' ) | (enumLiteral_1= 'SimpleInput' ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==101) ) {
                alt150=1;
            }
            else if ( (LA150_0==102) ) {
                alt150=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // InternalFormValDSL.g:5784:3: (enumLiteral_0= 'NumberScroller' )
                    {
                    // InternalFormValDSL.g:5784:3: (enumLiteral_0= 'NumberScroller' )
                    // InternalFormValDSL.g:5785:4: enumLiteral_0= 'NumberScroller'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getEUINumberComponentTypeAccess().getNumberScrollerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEUINumberComponentTypeAccess().getNumberScrollerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:5792:3: (enumLiteral_1= 'SimpleInput' )
                    {
                    // InternalFormValDSL.g:5792:3: (enumLiteral_1= 'SimpleInput' )
                    // InternalFormValDSL.g:5793:4: enumLiteral_1= 'SimpleInput'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getEUINumberComponentTypeAccess().getSimpleInputEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEUINumberComponentTypeAccess().getSimpleInputEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEUINumberComponentType"


    // $ANTLR start "ruleEOrientation"
    // InternalFormValDSL.g:5803:1: ruleEOrientation returns [Enumerator current=null] : ( (enumLiteral_0= 'Vertical' ) | (enumLiteral_1= 'Horizontal' ) ) ;
    public final Enumerator ruleEOrientation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5809:2: ( ( (enumLiteral_0= 'Vertical' ) | (enumLiteral_1= 'Horizontal' ) ) )
            // InternalFormValDSL.g:5810:2: ( (enumLiteral_0= 'Vertical' ) | (enumLiteral_1= 'Horizontal' ) )
            {
            // InternalFormValDSL.g:5810:2: ( (enumLiteral_0= 'Vertical' ) | (enumLiteral_1= 'Horizontal' ) )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==103) ) {
                alt151=1;
            }
            else if ( (LA151_0==104) ) {
                alt151=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // InternalFormValDSL.g:5811:3: (enumLiteral_0= 'Vertical' )
                    {
                    // InternalFormValDSL.g:5811:3: (enumLiteral_0= 'Vertical' )
                    // InternalFormValDSL.g:5812:4: enumLiteral_0= 'Vertical'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getEOrientationAccess().getVerticalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEOrientationAccess().getVerticalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:5819:3: (enumLiteral_1= 'Horizontal' )
                    {
                    // InternalFormValDSL.g:5819:3: (enumLiteral_1= 'Horizontal' )
                    // InternalFormValDSL.g:5820:4: enumLiteral_1= 'Horizontal'
                    {
                    enumLiteral_1=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getEOrientationAccess().getHorizontalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEOrientationAccess().getHorizontalEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEOrientation"


    // $ANTLR start "ruleEDateUIType"
    // InternalFormValDSL.g:5830:1: ruleEDateUIType returns [Enumerator current=null] : ( (enumLiteral_0= 'OnlyDate' ) | (enumLiteral_1= 'OnlyTime' ) | (enumLiteral_2= 'DateTime' ) ) ;
    public final Enumerator ruleEDateUIType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5836:2: ( ( (enumLiteral_0= 'OnlyDate' ) | (enumLiteral_1= 'OnlyTime' ) | (enumLiteral_2= 'DateTime' ) ) )
            // InternalFormValDSL.g:5837:2: ( (enumLiteral_0= 'OnlyDate' ) | (enumLiteral_1= 'OnlyTime' ) | (enumLiteral_2= 'DateTime' ) )
            {
            // InternalFormValDSL.g:5837:2: ( (enumLiteral_0= 'OnlyDate' ) | (enumLiteral_1= 'OnlyTime' ) | (enumLiteral_2= 'DateTime' ) )
            int alt152=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt152=1;
                }
                break;
            case 106:
                {
                alt152=2;
                }
                break;
            case 107:
                {
                alt152=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }

            switch (alt152) {
                case 1 :
                    // InternalFormValDSL.g:5838:3: (enumLiteral_0= 'OnlyDate' )
                    {
                    // InternalFormValDSL.g:5838:3: (enumLiteral_0= 'OnlyDate' )
                    // InternalFormValDSL.g:5839:4: enumLiteral_0= 'OnlyDate'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getEDateUITypeAccess().getOnlyDateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDateUITypeAccess().getOnlyDateEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:5846:3: (enumLiteral_1= 'OnlyTime' )
                    {
                    // InternalFormValDSL.g:5846:3: (enumLiteral_1= 'OnlyTime' )
                    // InternalFormValDSL.g:5847:4: enumLiteral_1= 'OnlyTime'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getEDateUITypeAccess().getOnlyTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDateUITypeAccess().getOnlyTimeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:5854:3: (enumLiteral_2= 'DateTime' )
                    {
                    // InternalFormValDSL.g:5854:3: (enumLiteral_2= 'DateTime' )
                    // InternalFormValDSL.g:5855:4: enumLiteral_2= 'DateTime'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getEDateUITypeAccess().getDateTimeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEDateUITypeAccess().getDateTimeEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEDateUIType"


    // $ANTLR start "ruleEPosition"
    // InternalFormValDSL.g:5865:1: ruleEPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'Above' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Below' ) ) ;
    public final Enumerator ruleEPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5871:2: ( ( (enumLiteral_0= 'Above' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Below' ) ) )
            // InternalFormValDSL.g:5872:2: ( (enumLiteral_0= 'Above' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Below' ) )
            {
            // InternalFormValDSL.g:5872:2: ( (enumLiteral_0= 'Above' ) | (enumLiteral_1= 'Left' ) | (enumLiteral_2= 'Right' ) | (enumLiteral_3= 'Below' ) )
            int alt153=4;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt153=1;
                }
                break;
            case 109:
                {
                alt153=2;
                }
                break;
            case 110:
                {
                alt153=3;
                }
                break;
            case 111:
                {
                alt153=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalFormValDSL.g:5873:3: (enumLiteral_0= 'Above' )
                    {
                    // InternalFormValDSL.g:5873:3: (enumLiteral_0= 'Above' )
                    // InternalFormValDSL.g:5874:4: enumLiteral_0= 'Above'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getEPositionAccess().getAboveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEPositionAccess().getAboveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:5881:3: (enumLiteral_1= 'Left' )
                    {
                    // InternalFormValDSL.g:5881:3: (enumLiteral_1= 'Left' )
                    // InternalFormValDSL.g:5882:4: enumLiteral_1= 'Left'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getEPositionAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEPositionAccess().getLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:5889:3: (enumLiteral_2= 'Right' )
                    {
                    // InternalFormValDSL.g:5889:3: (enumLiteral_2= 'Right' )
                    // InternalFormValDSL.g:5890:4: enumLiteral_2= 'Right'
                    {
                    enumLiteral_2=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getEPositionAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEPositionAccess().getRightEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFormValDSL.g:5897:3: (enumLiteral_3= 'Below' )
                    {
                    // InternalFormValDSL.g:5897:3: (enumLiteral_3= 'Below' )
                    // InternalFormValDSL.g:5898:4: enumLiteral_3= 'Below'
                    {
                    enumLiteral_3=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getEPositionAccess().getBelowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEPositionAccess().getBelowEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleEPosition"


    // $ANTLR start "ruleEDataType"
    // InternalFormValDSL.g:5908:1: ruleEDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Blob' ) ) ;
    public final Enumerator ruleEDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5914:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Blob' ) ) )
            // InternalFormValDSL.g:5915:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Blob' ) )
            {
            // InternalFormValDSL.g:5915:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Number' ) | (enumLiteral_2= 'Date' ) | (enumLiteral_3= 'Blob' ) )
            int alt154=4;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt154=1;
                }
                break;
            case 113:
                {
                alt154=2;
                }
                break;
            case 114:
                {
                alt154=3;
                }
                break;
            case 115:
                {
                alt154=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // InternalFormValDSL.g:5916:3: (enumLiteral_0= 'String' )
                    {
                    // InternalFormValDSL.g:5916:3: (enumLiteral_0= 'String' )
                    // InternalFormValDSL.g:5917:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getEDataTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEDataTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:5924:3: (enumLiteral_1= 'Number' )
                    {
                    // InternalFormValDSL.g:5924:3: (enumLiteral_1= 'Number' )
                    // InternalFormValDSL.g:5925:4: enumLiteral_1= 'Number'
                    {
                    enumLiteral_1=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getEDataTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEDataTypeAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValDSL.g:5932:3: (enumLiteral_2= 'Date' )
                    {
                    // InternalFormValDSL.g:5932:3: (enumLiteral_2= 'Date' )
                    // InternalFormValDSL.g:5933:4: enumLiteral_2= 'Date'
                    {
                    enumLiteral_2=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getEDataTypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEDataTypeAccess().getDateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalFormValDSL.g:5940:3: (enumLiteral_3= 'Blob' )
                    {
                    // InternalFormValDSL.g:5940:3: (enumLiteral_3= 'Blob' )
                    // InternalFormValDSL.g:5941:4: enumLiteral_3= 'Blob'
                    {
                    enumLiteral_3=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getEDataTypeAccess().getBlobEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEDataTypeAccess().getBlobEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleEDataType"


    // $ANTLR start "ruleERequiredField"
    // InternalFormValDSL.g:5951:1: ruleERequiredField returns [Enumerator current=null] : ( (enumLiteral_0= 'Asterix' ) | (enumLiteral_1= 'Highlighting' ) ) ;
    public final Enumerator ruleERequiredField() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFormValDSL.g:5957:2: ( ( (enumLiteral_0= 'Asterix' ) | (enumLiteral_1= 'Highlighting' ) ) )
            // InternalFormValDSL.g:5958:2: ( (enumLiteral_0= 'Asterix' ) | (enumLiteral_1= 'Highlighting' ) )
            {
            // InternalFormValDSL.g:5958:2: ( (enumLiteral_0= 'Asterix' ) | (enumLiteral_1= 'Highlighting' ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==116) ) {
                alt155=1;
            }
            else if ( (LA155_0==117) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalFormValDSL.g:5959:3: (enumLiteral_0= 'Asterix' )
                    {
                    // InternalFormValDSL.g:5959:3: (enumLiteral_0= 'Asterix' )
                    // InternalFormValDSL.g:5960:4: enumLiteral_0= 'Asterix'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getERequiredFieldAccess().getAsterixEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getERequiredFieldAccess().getAsterixEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValDSL.g:5967:3: (enumLiteral_1= 'Highlighting' )
                    {
                    // InternalFormValDSL.g:5967:3: (enumLiteral_1= 'Highlighting' )
                    // InternalFormValDSL.g:5968:4: enumLiteral_1= 'Highlighting'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getERequiredFieldAccess().getHighlightingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getERequiredFieldAccess().getHighlightingEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleERequiredField"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000045030L,0x000000003AAD3A00L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000044030L,0x000000003AAD3A00L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L,0x000000003AAD3A00L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L,0x000000003AAD0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000044000L,0x000000003AA00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFE00000000034000L,0x0000000000000076L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xFE00000000024000L,0x0000000000000076L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xFE00000000004000L,0x0000000000000076L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L,0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000030L,0x000F000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000715D5A8400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007804000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0018000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000011804000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000011004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000018000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000041804000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000201804000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000201004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000801804000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000801004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002801804000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002801004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002800004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020801804000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000020801004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000020800004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080001804000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000080001004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000E00000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000C00000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000600000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0100000000004000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0008000000000842L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000080L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000802L,0x0000000000000100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000004800L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000004830L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004800L,0x0000000000000008L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0100000000004000L,0x0000000000000400L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000400L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000004830L,0x0000000000000400L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000004800L,0x0000000000000400L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008008L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000004000L,0x00000000000F0400L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000004000L,0x00000000000D0400L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000004000L,0x00000000000D4000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000004000L,0x00000000000D0000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x000000000000C800L,0x0000000000000400L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000004800L,0x0000000000004000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x00000000000D0000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000004000L,0x00000000001D0000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000004000L,0x0000000000400000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000004000L,0x0000000001000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000004000L,0x0000000005000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0008000000000040L,0x0000000000008000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000004000L,0x0000000780000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000004000L,0x0000000700000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000004000L,0x0000000600000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000004000L,0x0000000400000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000004000L,0x0000001800000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000004000L,0x0000001000000000L});

}