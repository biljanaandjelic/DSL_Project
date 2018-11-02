package org.xtext.example.domij.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.domij.services.ErDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'domains'", "','", "'}'", "'entities'", "'gerunds'", "'relationships'", "'attributeSet'", "'keySet'", "'primaryKey'", "'('", "')'", "'default'", "'extends'", "'entitiesInRelationship'", "'ISA'", "'supertype'", "'subtypes'", "'classificationAttribute'", "'Categorisation'", "'categorisedEntity'", "'categorisationEntities'", "'isPartial'", "'IdentificationDependency'", "'weakEntity'", "'regularEntity'", "'zero'", "'one'", "'many'", "'integer'", "'string'", "'real'", "'boolean'", "'date'", "'time'", "'true'", "'false'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalErDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalErDsl.g"; }



     	private ErDslGrammarAccess grammarAccess;
     	
        public InternalErDslParser(TokenStream input, ErDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ERModel";	
       	}
       	
       	@Override
       	protected ErDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleERModel"
    // InternalErDsl.g:67:1: entryRuleERModel returns [EObject current=null] : iv_ruleERModel= ruleERModel EOF ;
    public final EObject entryRuleERModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERModel = null;


        try {
            // InternalErDsl.g:68:2: (iv_ruleERModel= ruleERModel EOF )
            // InternalErDsl.g:69:2: iv_ruleERModel= ruleERModel EOF
            {
             newCompositeNode(grammarAccess.getERModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleERModel=ruleERModel();

            state._fsp--;

             current =iv_ruleERModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleERModel"


    // $ANTLR start "ruleERModel"
    // InternalErDsl.g:76:1: ruleERModel returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}' )? (otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}' )? (otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}' )? (otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleERModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_domains_4_0 = null;

        EObject lv_domains_6_0 = null;

        EObject lv_entities_10_0 = null;

        EObject lv_entities_12_0 = null;

        EObject lv_gerunds_16_0 = null;

        EObject lv_gerunds_18_0 = null;

        EObject lv_relationships_22_0 = null;

        EObject lv_relationships_24_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:79:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}' )? (otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}' )? (otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}' )? (otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalErDsl.g:80:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}' )? (otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}' )? (otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}' )? (otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalErDsl.g:80:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}' )? (otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}' )? (otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}' )? (otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalErDsl.g:80:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}' )? (otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}' )? (otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}' )? (otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalErDsl.g:80:2: ( (lv_name_0_0= ruleEString ) )
            // InternalErDsl.g:81:1: (lv_name_0_0= ruleEString )
            {
            // InternalErDsl.g:81:1: (lv_name_0_0= ruleEString )
            // InternalErDsl.g:82:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getERModelAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getERModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalErDsl.g:102:1: (otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalErDsl.g:102:3: otherlv_2= 'domains' otherlv_3= '{' ( (lv_domains_4_0= ruleDomain ) ) (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getERModelAccess().getDomainsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // InternalErDsl.g:110:1: ( (lv_domains_4_0= ruleDomain ) )
                    // InternalErDsl.g:111:1: (lv_domains_4_0= ruleDomain )
                    {
                    // InternalErDsl.g:111:1: (lv_domains_4_0= ruleDomain )
                    // InternalErDsl.g:112:3: lv_domains_4_0= ruleDomain
                    {
                     
                    	        newCompositeNode(grammarAccess.getERModelAccess().getDomainsDomainParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_domains_4_0=ruleDomain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	        }
                           		add(
                           			current, 
                           			"domains",
                            		lv_domains_4_0, 
                            		"org.xtext.example.domij.ErDsl.Domain");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:128:2: (otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalErDsl.g:128:4: otherlv_5= ',' ( (lv_domains_6_0= ruleDomain ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getERModelAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // InternalErDsl.g:132:1: ( (lv_domains_6_0= ruleDomain ) )
                    	    // InternalErDsl.g:133:1: (lv_domains_6_0= ruleDomain )
                    	    {
                    	    // InternalErDsl.g:133:1: (lv_domains_6_0= ruleDomain )
                    	    // InternalErDsl.g:134:3: lv_domains_6_0= ruleDomain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getERModelAccess().getDomainsDomainParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_domains_6_0=ruleDomain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"domains",
                    	            		lv_domains_6_0, 
                    	            		"org.xtext.example.domij.ErDsl.Domain");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_7); 

                        	newLeafNode(otherlv_7, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // InternalErDsl.g:154:3: (otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalErDsl.g:154:5: otherlv_8= 'entities' otherlv_9= '{' ( (lv_entities_10_0= ruleEntity ) ) (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getERModelAccess().getEntitiesKeyword_3_0());
                        
                    otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalErDsl.g:162:1: ( (lv_entities_10_0= ruleEntity ) )
                    // InternalErDsl.g:163:1: (lv_entities_10_0= ruleEntity )
                    {
                    // InternalErDsl.g:163:1: (lv_entities_10_0= ruleEntity )
                    // InternalErDsl.g:164:3: lv_entities_10_0= ruleEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_entities_10_0=ruleEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	        }
                           		add(
                           			current, 
                           			"entities",
                            		lv_entities_10_0, 
                            		"org.xtext.example.domij.ErDsl.Entity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:180:2: (otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalErDsl.g:180:4: otherlv_11= ',' ( (lv_entities_12_0= ruleEntity ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getERModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalErDsl.g:184:1: ( (lv_entities_12_0= ruleEntity ) )
                    	    // InternalErDsl.g:185:1: (lv_entities_12_0= ruleEntity )
                    	    {
                    	    // InternalErDsl.g:185:1: (lv_entities_12_0= ruleEntity )
                    	    // InternalErDsl.g:186:3: lv_entities_12_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_entities_12_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entities",
                    	            		lv_entities_12_0, 
                    	            		"org.xtext.example.domij.ErDsl.Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_13, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalErDsl.g:206:3: (otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl.g:206:5: otherlv_14= 'gerunds' otherlv_15= '{' ( (lv_gerunds_16_0= ruleGerund ) ) (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getERModelAccess().getGerundsKeyword_4_0());
                        
                    otherlv_15=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_15, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // InternalErDsl.g:214:1: ( (lv_gerunds_16_0= ruleGerund ) )
                    // InternalErDsl.g:215:1: (lv_gerunds_16_0= ruleGerund )
                    {
                    // InternalErDsl.g:215:1: (lv_gerunds_16_0= ruleGerund )
                    // InternalErDsl.g:216:3: lv_gerunds_16_0= ruleGerund
                    {
                     
                    	        newCompositeNode(grammarAccess.getERModelAccess().getGerundsGerundParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_gerunds_16_0=ruleGerund();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	        }
                           		add(
                           			current, 
                           			"gerunds",
                            		lv_gerunds_16_0, 
                            		"org.xtext.example.domij.ErDsl.Gerund");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:232:2: (otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalErDsl.g:232:4: otherlv_17= ',' ( (lv_gerunds_18_0= ruleGerund ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getERModelAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalErDsl.g:236:1: ( (lv_gerunds_18_0= ruleGerund ) )
                    	    // InternalErDsl.g:237:1: (lv_gerunds_18_0= ruleGerund )
                    	    {
                    	    // InternalErDsl.g:237:1: (lv_gerunds_18_0= ruleGerund )
                    	    // InternalErDsl.g:238:3: lv_gerunds_18_0= ruleGerund
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getERModelAccess().getGerundsGerundParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_gerunds_18_0=ruleGerund();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"gerunds",
                    	            		lv_gerunds_18_0, 
                    	            		"org.xtext.example.domij.ErDsl.Gerund");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_9); 

                        	newLeafNode(otherlv_19, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // InternalErDsl.g:258:3: (otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDsl.g:258:5: otherlv_20= 'relationships' otherlv_21= '{' ( (lv_relationships_22_0= ruleRelationshipConcept ) ) (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_20, grammarAccess.getERModelAccess().getRelationshipsKeyword_5_0());
                        
                    otherlv_21=(Token)match(input,11,FollowSets000.FOLLOW_10); 

                        	newLeafNode(otherlv_21, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // InternalErDsl.g:266:1: ( (lv_relationships_22_0= ruleRelationshipConcept ) )
                    // InternalErDsl.g:267:1: (lv_relationships_22_0= ruleRelationshipConcept )
                    {
                    // InternalErDsl.g:267:1: (lv_relationships_22_0= ruleRelationshipConcept )
                    // InternalErDsl.g:268:3: lv_relationships_22_0= ruleRelationshipConcept
                    {
                     
                    	        newCompositeNode(grammarAccess.getERModelAccess().getRelationshipsRelationshipConceptParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_relationships_22_0=ruleRelationshipConcept();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	        }
                           		add(
                           			current, 
                           			"relationships",
                            		lv_relationships_22_0, 
                            		"org.xtext.example.domij.ErDsl.RelationshipConcept");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:284:2: (otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalErDsl.g:284:4: otherlv_23= ',' ( (lv_relationships_24_0= ruleRelationshipConcept ) )
                    	    {
                    	    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_10); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getERModelAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // InternalErDsl.g:288:1: ( (lv_relationships_24_0= ruleRelationshipConcept ) )
                    	    // InternalErDsl.g:289:1: (lv_relationships_24_0= ruleRelationshipConcept )
                    	    {
                    	    // InternalErDsl.g:289:1: (lv_relationships_24_0= ruleRelationshipConcept )
                    	    // InternalErDsl.g:290:3: lv_relationships_24_0= ruleRelationshipConcept
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getERModelAccess().getRelationshipsRelationshipConceptParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_relationships_24_0=ruleRelationshipConcept();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getERModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationships",
                    	            		lv_relationships_24_0, 
                    	            		"org.xtext.example.domij.ErDsl.RelationshipConcept");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_11); 

                        	newLeafNode(otherlv_25, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_26, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleERModel"


    // $ANTLR start "entryRuleRelationshipConcept"
    // InternalErDsl.g:322:1: entryRuleRelationshipConcept returns [EObject current=null] : iv_ruleRelationshipConcept= ruleRelationshipConcept EOF ;
    public final EObject entryRuleRelationshipConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipConcept = null;


        try {
            // InternalErDsl.g:323:2: (iv_ruleRelationshipConcept= ruleRelationshipConcept EOF )
            // InternalErDsl.g:324:2: iv_ruleRelationshipConcept= ruleRelationshipConcept EOF
            {
             newCompositeNode(grammarAccess.getRelationshipConceptRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationshipConcept=ruleRelationshipConcept();

            state._fsp--;

             current =iv_ruleRelationshipConcept; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationshipConcept"


    // $ANTLR start "ruleRelationshipConcept"
    // InternalErDsl.g:331:1: ruleRelationshipConcept returns [EObject current=null] : (this_Relationship_0= ruleRelationship | this_ISA_1= ruleISA | this_Categorisation_2= ruleCategorisation | this_IdentificationDependency_3= ruleIdentificationDependency ) ;
    public final EObject ruleRelationshipConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_0 = null;

        EObject this_ISA_1 = null;

        EObject this_Categorisation_2 = null;

        EObject this_IdentificationDependency_3 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:334:28: ( (this_Relationship_0= ruleRelationship | this_ISA_1= ruleISA | this_Categorisation_2= ruleCategorisation | this_IdentificationDependency_3= ruleIdentificationDependency ) )
            // InternalErDsl.g:335:1: (this_Relationship_0= ruleRelationship | this_ISA_1= ruleISA | this_Categorisation_2= ruleCategorisation | this_IdentificationDependency_3= ruleIdentificationDependency )
            {
            // InternalErDsl.g:335:1: (this_Relationship_0= ruleRelationship | this_ISA_1= ruleISA | this_Categorisation_2= ruleCategorisation | this_IdentificationDependency_3= ruleIdentificationDependency )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 30:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalErDsl.g:336:5: this_Relationship_0= ruleRelationship
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipConceptAccess().getRelationshipParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Relationship_0=ruleRelationship();

                    state._fsp--;

                     
                            current = this_Relationship_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalErDsl.g:346:5: this_ISA_1= ruleISA
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipConceptAccess().getISAParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ISA_1=ruleISA();

                    state._fsp--;

                     
                            current = this_ISA_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalErDsl.g:356:5: this_Categorisation_2= ruleCategorisation
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipConceptAccess().getCategorisationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Categorisation_2=ruleCategorisation();

                    state._fsp--;

                     
                            current = this_Categorisation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalErDsl.g:366:5: this_IdentificationDependency_3= ruleIdentificationDependency
                    {
                     
                            newCompositeNode(grammarAccess.getRelationshipConceptAccess().getIdentificationDependencyParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IdentificationDependency_3=ruleIdentificationDependency();

                    state._fsp--;

                     
                            current = this_IdentificationDependency_3; 
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
    // $ANTLR end "ruleRelationshipConcept"


    // $ANTLR start "entryRuleEString"
    // InternalErDsl.g:384:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalErDsl.g:385:2: (iv_ruleEString= ruleEString EOF )
            // InternalErDsl.g:386:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalErDsl.g:393:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalErDsl.g:396:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalErDsl.g:397:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalErDsl.g:397:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalErDsl.g:397:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalErDsl.g:405:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleEntity"
    // InternalErDsl.g:420:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalErDsl.g:421:2: (iv_ruleEntity= ruleEntity EOF )
            // InternalErDsl.g:422:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalErDsl.g:429:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? (otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}' )? (otherlv_14= 'primaryKey' ( ( ruleEString ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_entityAttributes_4_0 = null;

        EObject lv_entityAttributes_6_0 = null;

        EObject lv_keySet_10_0 = null;

        EObject lv_keySet_12_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:432:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? (otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}' )? (otherlv_14= 'primaryKey' ( ( ruleEString ) ) )? otherlv_16= '}' ) )
            // InternalErDsl.g:433:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? (otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}' )? (otherlv_14= 'primaryKey' ( ( ruleEString ) ) )? otherlv_16= '}' )
            {
            // InternalErDsl.g:433:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? (otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}' )? (otherlv_14= 'primaryKey' ( ( ruleEString ) ) )? otherlv_16= '}' )
            // InternalErDsl.g:433:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' (otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? (otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}' )? (otherlv_14= 'primaryKey' ( ( ruleEString ) ) )? otherlv_16= '}'
            {
            // InternalErDsl.g:433:2: ( (lv_name_0_0= ruleEString ) )
            // InternalErDsl.g:434:1: (lv_name_0_0= ruleEString )
            {
            // InternalErDsl.g:434:1: (lv_name_0_0= ruleEString )
            // InternalErDsl.g:435:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_12); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalErDsl.g:455:1: (otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErDsl.g:455:3: otherlv_2= 'attributeSet' otherlv_3= '{' ( (lv_entityAttributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getAttributeSetKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // InternalErDsl.g:463:1: ( (lv_entityAttributes_4_0= ruleAttribute ) )
                    // InternalErDsl.g:464:1: (lv_entityAttributes_4_0= ruleAttribute )
                    {
                    // InternalErDsl.g:464:1: (lv_entityAttributes_4_0= ruleAttribute )
                    // InternalErDsl.g:465:3: lv_entityAttributes_4_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getEntityAttributesAttributeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_entityAttributes_4_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"entityAttributes",
                            		lv_entityAttributes_4_0, 
                            		"org.xtext.example.domij.ErDsl.Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:481:2: (otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalErDsl.g:481:4: otherlv_5= ',' ( (lv_entityAttributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // InternalErDsl.g:485:1: ( (lv_entityAttributes_6_0= ruleAttribute ) )
                    	    // InternalErDsl.g:486:1: (lv_entityAttributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalErDsl.g:486:1: (lv_entityAttributes_6_0= ruleAttribute )
                    	    // InternalErDsl.g:487:3: lv_entityAttributes_6_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getEntityAttributesAttributeParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_entityAttributes_6_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entityAttributes",
                    	            		lv_entityAttributes_6_0, 
                    	            		"org.xtext.example.domij.ErDsl.Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // InternalErDsl.g:507:3: (otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalErDsl.g:507:5: otherlv_8= 'keySet' otherlv_9= '{' ( (lv_keySet_10_0= ruleKey ) ) (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getKeySetKeyword_3_0());
                        
                    otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // InternalErDsl.g:515:1: ( (lv_keySet_10_0= ruleKey ) )
                    // InternalErDsl.g:516:1: (lv_keySet_10_0= ruleKey )
                    {
                    // InternalErDsl.g:516:1: (lv_keySet_10_0= ruleKey )
                    // InternalErDsl.g:517:3: lv_keySet_10_0= ruleKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getKeySetKeyParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_keySet_10_0=ruleKey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"keySet",
                            		lv_keySet_10_0, 
                            		"org.xtext.example.domij.ErDsl.Key");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:533:2: (otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalErDsl.g:533:4: otherlv_11= ',' ( (lv_keySet_12_0= ruleKey ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // InternalErDsl.g:537:1: ( (lv_keySet_12_0= ruleKey ) )
                    	    // InternalErDsl.g:538:1: (lv_keySet_12_0= ruleKey )
                    	    {
                    	    // InternalErDsl.g:538:1: (lv_keySet_12_0= ruleKey )
                    	    // InternalErDsl.g:539:3: lv_keySet_12_0= ruleKey
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getKeySetKeyParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_keySet_12_0=ruleKey();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"keySet",
                    	            		lv_keySet_12_0, 
                    	            		"org.xtext.example.domij.ErDsl.Key");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14); 

                        	newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // InternalErDsl.g:559:3: (otherlv_14= 'primaryKey' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalErDsl.g:559:5: otherlv_14= 'primaryKey' ( ( ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getPrimaryKeyKeyword_4_0());
                        
                    // InternalErDsl.g:563:1: ( ( ruleEString ) )
                    // InternalErDsl.g:564:1: ( ruleEString )
                    {
                    // InternalErDsl.g:564:1: ( ruleEString )
                    // InternalErDsl.g:565:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getPrimaryKeyKeyCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_11);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleGerund"
    // InternalErDsl.g:590:1: entryRuleGerund returns [EObject current=null] : iv_ruleGerund= ruleGerund EOF ;
    public final EObject entryRuleGerund() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGerund = null;


        try {
            // InternalErDsl.g:591:2: (iv_ruleGerund= ruleGerund EOF )
            // InternalErDsl.g:592:2: iv_ruleGerund= ruleGerund EOF
            {
             newCompositeNode(grammarAccess.getGerundRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGerund=ruleGerund();

            state._fsp--;

             current =iv_ruleGerund; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleGerund"


    // $ANTLR start "ruleGerund"
    // InternalErDsl.g:599:1: ruleGerund returns [EObject current=null] : ( (lv_relationship_0_0= ruleRelationship ) ) ;
    public final EObject ruleGerund() throws RecognitionException {
        EObject current = null;

        EObject lv_relationship_0_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:602:28: ( ( (lv_relationship_0_0= ruleRelationship ) ) )
            // InternalErDsl.g:603:1: ( (lv_relationship_0_0= ruleRelationship ) )
            {
            // InternalErDsl.g:603:1: ( (lv_relationship_0_0= ruleRelationship ) )
            // InternalErDsl.g:604:1: (lv_relationship_0_0= ruleRelationship )
            {
            // InternalErDsl.g:604:1: (lv_relationship_0_0= ruleRelationship )
            // InternalErDsl.g:605:3: lv_relationship_0_0= ruleRelationship
            {
             
            	        newCompositeNode(grammarAccess.getGerundAccess().getRelationshipRelationshipParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_relationship_0_0=ruleRelationship();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGerundRule());
            	        }
                   		set(
                   			current, 
                   			"relationship",
                    		lv_relationship_0_0, 
                    		"org.xtext.example.domij.ErDsl.Relationship");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleGerund"


    // $ANTLR start "entryRuleAttribute"
    // InternalErDsl.g:629:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalErDsl.g:630:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalErDsl.g:631:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalErDsl.g:638:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributeDomain_2_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:641:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )? ) )
            // InternalErDsl.g:642:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )? )
            {
            // InternalErDsl.g:642:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )? )
            // InternalErDsl.g:642:2: () ( (lv_name_1_0= ruleEString ) ) ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )?
            {
            // InternalErDsl.g:642:2: ()
            // InternalErDsl.g:643:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeAccess().getAttributeAction_0(),
                        current);
                

            }

            // InternalErDsl.g:648:2: ( (lv_name_1_0= ruleEString ) )
            // InternalErDsl.g:649:1: (lv_name_1_0= ruleEString )
            {
            // InternalErDsl.g:649:1: (lv_name_1_0= ruleEString )
            // InternalErDsl.g:650:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalErDsl.g:666:2: ( (lv_attributeDomain_2_0= ruleAttributeDomain ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalErDsl.g:667:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
                    {
                    // InternalErDsl.g:667:1: (lv_attributeDomain_2_0= ruleAttributeDomain )
                    // InternalErDsl.g:668:3: lv_attributeDomain_2_0= ruleAttributeDomain
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAttributeDomainAttributeDomainParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_attributeDomain_2_0=ruleAttributeDomain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"attributeDomain",
                            		lv_attributeDomain_2_0, 
                            		"org.xtext.example.domij.ErDsl.AttributeDomain");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalErDsl.g:692:1: entryRuleAttributeDomain returns [EObject current=null] : iv_ruleAttributeDomain= ruleAttributeDomain EOF ;
    public final EObject entryRuleAttributeDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDomain = null;


        try {
            // InternalErDsl.g:693:2: (iv_ruleAttributeDomain= ruleAttributeDomain EOF )
            // InternalErDsl.g:694:2: iv_ruleAttributeDomain= ruleAttributeDomain EOF
            {
             newCompositeNode(grammarAccess.getAttributeDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeDomain=ruleAttributeDomain();

            state._fsp--;

             current =iv_ruleAttributeDomain; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeDomain"


    // $ANTLR start "ruleAttributeDomain"
    // InternalErDsl.g:701:1: ruleAttributeDomain returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')' )? (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleAttributeDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;

        AntlrDatatypeRuleToken lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:704:28: ( ( ( ( ruleEString ) ) (otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')' )? (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? ) )
            // InternalErDsl.g:705:1: ( ( ( ruleEString ) ) (otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')' )? (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? )
            {
            // InternalErDsl.g:705:1: ( ( ( ruleEString ) ) (otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')' )? (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )? )
            // InternalErDsl.g:705:2: ( ( ruleEString ) ) (otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')' )? (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )?
            {
            // InternalErDsl.g:705:2: ( ( ruleEString ) )
            // InternalErDsl.g:706:1: ( ruleEString )
            {
            // InternalErDsl.g:706:1: ( ruleEString )
            // InternalErDsl.g:707:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeDomainRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeDomainAccess().getDomainDomainCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalErDsl.g:720:2: (otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalErDsl.g:720:4: otherlv_1= '(' ( (lv_length_2_0= ruleEInt ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_17); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeDomainAccess().getLeftParenthesisKeyword_1_0());
                        
                    // InternalErDsl.g:724:1: ( (lv_length_2_0= ruleEInt ) )
                    // InternalErDsl.g:725:1: (lv_length_2_0= ruleEInt )
                    {
                    // InternalErDsl.g:725:1: (lv_length_2_0= ruleEInt )
                    // InternalErDsl.g:726:3: lv_length_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeDomainAccess().getLengthEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_length_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeDomainRule());
                    	        }
                           		set(
                           			current, 
                           			"length",
                            		lv_length_2_0, 
                            		"org.xtext.example.domij.ErDsl.EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_19); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeDomainAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            // InternalErDsl.g:746:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalErDsl.g:746:5: otherlv_4= 'default' ( (lv_default_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeDomainAccess().getDefaultKeyword_2_0());
                        
                    // InternalErDsl.g:750:1: ( (lv_default_5_0= ruleEString ) )
                    // InternalErDsl.g:751:1: (lv_default_5_0= ruleEString )
                    {
                    // InternalErDsl.g:751:1: (lv_default_5_0= ruleEString )
                    // InternalErDsl.g:752:3: lv_default_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeDomainAccess().getDefaultEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_default_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeDomainRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_5_0, 
                            		"org.xtext.example.domij.ErDsl.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleAttributeDomain"


    // $ANTLR start "entryRuleKey"
    // InternalErDsl.g:776:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // InternalErDsl.g:777:2: (iv_ruleKey= ruleKey EOF )
            // InternalErDsl.g:778:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalErDsl.g:785:1: ruleKey returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:788:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' ) )
            // InternalErDsl.g:789:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            {
            // InternalErDsl.g:789:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')' )
            // InternalErDsl.g:789:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) (otherlv_3= ',' ( ( ruleEString ) ) )* otherlv_5= ')'
            {
            // InternalErDsl.g:789:2: ( (lv_name_0_0= ruleEString ) )
            // InternalErDsl.g:790:1: (lv_name_0_0= ruleEString )
            {
            // InternalErDsl.g:790:1: (lv_name_0_0= ruleEString )
            // InternalErDsl.g:791:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getKeyAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKeyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getKeyAccess().getLeftParenthesisKeyword_1());
                
            // InternalErDsl.g:811:1: ( ( ruleEString ) )
            // InternalErDsl.g:812:1: ( ruleEString )
            {
            // InternalErDsl.g:812:1: ( ruleEString )
            // InternalErDsl.g:813:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getKeyAccess().getKeyAttributesAttributeCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalErDsl.g:826:2: (otherlv_3= ',' ( ( ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalErDsl.g:826:4: otherlv_3= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_3, grammarAccess.getKeyAccess().getCommaKeyword_3_0());
            	        
            	    // InternalErDsl.g:830:1: ( ( ruleEString ) )
            	    // InternalErDsl.g:831:1: ( ruleEString )
            	    {
            	    // InternalErDsl.g:831:1: ( ruleEString )
            	    // InternalErDsl.g:832:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKeyRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getKeyAccess().getKeyAttributesAttributeCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getKeyAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleDomain"
    // InternalErDsl.g:857:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalErDsl.g:858:2: (iv_ruleDomain= ruleDomain EOF )
            // InternalErDsl.g:859:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalErDsl.g:866:1: ruleDomain returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'extends' ( (lv_primitiveDomain_3_0= rulePrimitiveDomain ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_primitiveDomain_3_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:869:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'extends' ( (lv_primitiveDomain_3_0= rulePrimitiveDomain ) ) ) )
            // InternalErDsl.g:870:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'extends' ( (lv_primitiveDomain_3_0= rulePrimitiveDomain ) ) )
            {
            // InternalErDsl.g:870:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'extends' ( (lv_primitiveDomain_3_0= rulePrimitiveDomain ) ) )
            // InternalErDsl.g:870:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'extends' ( (lv_primitiveDomain_3_0= rulePrimitiveDomain ) )
            {
            // InternalErDsl.g:870:2: ()
            // InternalErDsl.g:871:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDomainAccess().getDomainAction_0(),
                        current);
                

            }

            // InternalErDsl.g:876:2: ( (lv_name_1_0= ruleEString ) )
            // InternalErDsl.g:877:1: (lv_name_1_0= ruleEString )
            {
            // InternalErDsl.g:877:1: (lv_name_1_0= ruleEString )
            // InternalErDsl.g:878:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDomainAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_22);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_23); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getExtendsKeyword_2());
                
            // InternalErDsl.g:898:1: ( (lv_primitiveDomain_3_0= rulePrimitiveDomain ) )
            // InternalErDsl.g:899:1: (lv_primitiveDomain_3_0= rulePrimitiveDomain )
            {
            // InternalErDsl.g:899:1: (lv_primitiveDomain_3_0= rulePrimitiveDomain )
            // InternalErDsl.g:900:3: lv_primitiveDomain_3_0= rulePrimitiveDomain
            {
             
            	        newCompositeNode(grammarAccess.getDomainAccess().getPrimitiveDomainPrimitiveDomainParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_primitiveDomain_3_0=rulePrimitiveDomain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	        }
                   		set(
                   			current, 
                   			"primitiveDomain",
                    		lv_primitiveDomain_3_0, 
                    		"org.xtext.example.domij.ErDsl.PrimitiveDomain");
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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleRelationship"
    // InternalErDsl.g:924:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalErDsl.g:925:2: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalErDsl.g:926:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalErDsl.g:933:1: ruleRelationship returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'entitiesInRelationship' otherlv_3= '{' ( (lv_entities_4_0= ruleRegularEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) ) )* otherlv_7= '}' (otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_entities_6_0 = null;

        EObject lv_relationshipAttributes_10_0 = null;

        EObject lv_relationshipAttributes_12_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:936:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'entitiesInRelationship' otherlv_3= '{' ( (lv_entities_4_0= ruleRegularEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) ) )* otherlv_7= '}' (otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalErDsl.g:937:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'entitiesInRelationship' otherlv_3= '{' ( (lv_entities_4_0= ruleRegularEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) ) )* otherlv_7= '}' (otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalErDsl.g:937:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'entitiesInRelationship' otherlv_3= '{' ( (lv_entities_4_0= ruleRegularEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) ) )* otherlv_7= '}' (otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalErDsl.g:937:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'entitiesInRelationship' otherlv_3= '{' ( (lv_entities_4_0= ruleRegularEntity ) ) (otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) ) )* otherlv_7= '}' (otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalErDsl.g:937:2: ( (lv_name_0_0= ruleEString ) )
            // InternalErDsl.g:938:1: (lv_name_0_0= ruleEString )
            {
            // InternalErDsl.g:938:1: (lv_name_0_0= ruleEString )
            // InternalErDsl.g:939:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_24); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getEntitiesInRelationshipKeyword_2());
                
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalErDsl.g:967:1: ( (lv_entities_4_0= ruleRegularEntity ) )
            // InternalErDsl.g:968:1: (lv_entities_4_0= ruleRegularEntity )
            {
            // InternalErDsl.g:968:1: (lv_entities_4_0= ruleRegularEntity )
            // InternalErDsl.g:969:3: lv_entities_4_0= ruleRegularEntity
            {
             
            	        newCompositeNode(grammarAccess.getRelationshipAccess().getEntitiesRegularEntityParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_6);
            lv_entities_4_0=ruleRegularEntity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	        }
                   		add(
                   			current, 
                   			"entities",
                    		lv_entities_4_0, 
                    		"org.xtext.example.domij.ErDsl.RegularEntity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalErDsl.g:985:2: (otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalErDsl.g:985:4: otherlv_5= ',' ( (lv_entities_6_0= ruleRegularEntity ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRelationshipAccess().getCommaKeyword_5_0());
            	        
            	    // InternalErDsl.g:989:1: ( (lv_entities_6_0= ruleRegularEntity ) )
            	    // InternalErDsl.g:990:1: (lv_entities_6_0= ruleRegularEntity )
            	    {
            	    // InternalErDsl.g:990:1: (lv_entities_6_0= ruleRegularEntity )
            	    // InternalErDsl.g:991:3: lv_entities_6_0= ruleRegularEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationshipAccess().getEntitiesRegularEntityParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_entities_6_0=ruleRegularEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_6_0, 
            	            		"org.xtext.example.domij.ErDsl.RegularEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_25); 

                	newLeafNode(otherlv_7, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6());
                
            // InternalErDsl.g:1011:1: (otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalErDsl.g:1011:3: otherlv_8= 'attributeSet' otherlv_9= '{' ( (lv_relationshipAttributes_10_0= ruleAttribute ) ) (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getAttributeSetKeyword_7_0());
                        
                    otherlv_9=(Token)match(input,11,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // InternalErDsl.g:1019:1: ( (lv_relationshipAttributes_10_0= ruleAttribute ) )
                    // InternalErDsl.g:1020:1: (lv_relationshipAttributes_10_0= ruleAttribute )
                    {
                    // InternalErDsl.g:1020:1: (lv_relationshipAttributes_10_0= ruleAttribute )
                    // InternalErDsl.g:1021:3: lv_relationshipAttributes_10_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationshipAccess().getRelationshipAttributesAttributeParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_relationshipAttributes_10_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	        }
                           		add(
                           			current, 
                           			"relationshipAttributes",
                            		lv_relationshipAttributes_10_0, 
                            		"org.xtext.example.domij.ErDsl.Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalErDsl.g:1037:2: (otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==13) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalErDsl.g:1037:4: otherlv_11= ',' ( (lv_relationshipAttributes_12_0= ruleAttribute ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // InternalErDsl.g:1041:1: ( (lv_relationshipAttributes_12_0= ruleAttribute ) )
                    	    // InternalErDsl.g:1042:1: (lv_relationshipAttributes_12_0= ruleAttribute )
                    	    {
                    	    // InternalErDsl.g:1042:1: (lv_relationshipAttributes_12_0= ruleAttribute )
                    	    // InternalErDsl.g:1043:3: lv_relationshipAttributes_12_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationshipAccess().getRelationshipAttributesAttributeParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_6);
                    	    lv_relationshipAttributes_12_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"relationshipAttributes",
                    	            		lv_relationshipAttributes_12_0, 
                    	            		"org.xtext.example.domij.ErDsl.Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_11); 

                        	newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_14, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleISA"
    // InternalErDsl.g:1075:1: entryRuleISA returns [EObject current=null] : iv_ruleISA= ruleISA EOF ;
    public final EObject entryRuleISA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleISA = null;


        try {
            // InternalErDsl.g:1076:2: (iv_ruleISA= ruleISA EOF )
            // InternalErDsl.g:1077:2: iv_ruleISA= ruleISA EOF
            {
             newCompositeNode(grammarAccess.getISARule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleISA=ruleISA();

            state._fsp--;

             current =iv_ruleISA; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleISA"


    // $ANTLR start "ruleISA"
    // InternalErDsl.g:1084:1: ruleISA returns [EObject current=null] : (otherlv_0= 'ISA' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' ( (lv_supertype_4_0= ruleRegularEntity ) ) otherlv_5= 'subtypes' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= 'classificationAttribute' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleISA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_supertype_4_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:1087:28: ( (otherlv_0= 'ISA' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' ( (lv_supertype_4_0= ruleRegularEntity ) ) otherlv_5= 'subtypes' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= 'classificationAttribute' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // InternalErDsl.g:1088:1: (otherlv_0= 'ISA' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' ( (lv_supertype_4_0= ruleRegularEntity ) ) otherlv_5= 'subtypes' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= 'classificationAttribute' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // InternalErDsl.g:1088:1: (otherlv_0= 'ISA' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' ( (lv_supertype_4_0= ruleRegularEntity ) ) otherlv_5= 'subtypes' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= 'classificationAttribute' ( ( ruleEString ) ) otherlv_13= '}' )
            // InternalErDsl.g:1088:3: otherlv_0= 'ISA' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' ( (lv_supertype_4_0= ruleRegularEntity ) ) otherlv_5= 'subtypes' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' otherlv_11= 'classificationAttribute' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getISAAccess().getISAKeyword_0());
                
            // InternalErDsl.g:1092:1: ( (lv_name_1_0= ruleEString ) )
            // InternalErDsl.g:1093:1: (lv_name_1_0= ruleEString )
            {
            // InternalErDsl.g:1093:1: (lv_name_1_0= ruleEString )
            // InternalErDsl.g:1094:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getISAAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getISARule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_26); 

                	newLeafNode(otherlv_2, grammarAccess.getISAAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getISAAccess().getSupertypeKeyword_3());
                
            // InternalErDsl.g:1118:1: ( (lv_supertype_4_0= ruleRegularEntity ) )
            // InternalErDsl.g:1119:1: (lv_supertype_4_0= ruleRegularEntity )
            {
            // InternalErDsl.g:1119:1: (lv_supertype_4_0= ruleRegularEntity )
            // InternalErDsl.g:1120:3: lv_supertype_4_0= ruleRegularEntity
            {
             
            	        newCompositeNode(grammarAccess.getISAAccess().getSupertypeRegularEntityParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_27);
            lv_supertype_4_0=ruleRegularEntity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getISARule());
            	        }
                   		set(
                   			current, 
                   			"supertype",
                    		lv_supertype_4_0, 
                    		"org.xtext.example.domij.ErDsl.RegularEntity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_5, grammarAccess.getISAAccess().getSubtypesKeyword_5());
                
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_6, grammarAccess.getISAAccess().getLeftParenthesisKeyword_6());
                
            // InternalErDsl.g:1144:1: ( ( ruleEString ) )
            // InternalErDsl.g:1145:1: ( ruleEString )
            {
            // InternalErDsl.g:1145:1: ( ruleEString )
            // InternalErDsl.g:1146:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getISARule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getISAAccess().getSubtypesEntityCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalErDsl.g:1159:2: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalErDsl.g:1159:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_8, grammarAccess.getISAAccess().getCommaKeyword_8_0());
            	        
            	    // InternalErDsl.g:1163:1: ( ( ruleEString ) )
            	    // InternalErDsl.g:1164:1: ( ruleEString )
            	    {
            	    // InternalErDsl.g:1164:1: ( ruleEString )
            	    // InternalErDsl.g:1165:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getISARule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getISAAccess().getSubtypesEntityCrossReference_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_28); 

                	newLeafNode(otherlv_10, grammarAccess.getISAAccess().getRightParenthesisKeyword_9());
                
            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_11, grammarAccess.getISAAccess().getClassificationAttributeKeyword_10());
                
            // InternalErDsl.g:1186:1: ( ( ruleEString ) )
            // InternalErDsl.g:1187:1: ( ruleEString )
            {
            // InternalErDsl.g:1187:1: ( ruleEString )
            // InternalErDsl.g:1188:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getISARule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getISAAccess().getClassificationAttributeAttributeCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_13, grammarAccess.getISAAccess().getRightCurlyBracketKeyword_12());
                

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
    // $ANTLR end "ruleISA"


    // $ANTLR start "entryRuleCategorisation"
    // InternalErDsl.g:1213:1: entryRuleCategorisation returns [EObject current=null] : iv_ruleCategorisation= ruleCategorisation EOF ;
    public final EObject entryRuleCategorisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategorisation = null;


        try {
            // InternalErDsl.g:1214:2: (iv_ruleCategorisation= ruleCategorisation EOF )
            // InternalErDsl.g:1215:2: iv_ruleCategorisation= ruleCategorisation EOF
            {
             newCompositeNode(grammarAccess.getCategorisationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCategorisation=ruleCategorisation();

            state._fsp--;

             current =iv_ruleCategorisation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCategorisation"


    // $ANTLR start "ruleCategorisation"
    // InternalErDsl.g:1222:1: ruleCategorisation returns [EObject current=null] : (otherlv_0= 'Categorisation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'categorisedEntity' ( ( ruleEString ) ) otherlv_5= 'categorisationEntities' ( (lv_categorisationEntities_6_0= ruleCategories ) ) otherlv_7= 'isPartial' ( (lv_isPartial_8_0= ruleEBoolean ) ) otherlv_9= '}' ) ;
    public final EObject ruleCategorisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_categorisationEntities_6_0 = null;

        AntlrDatatypeRuleToken lv_isPartial_8_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:1225:28: ( (otherlv_0= 'Categorisation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'categorisedEntity' ( ( ruleEString ) ) otherlv_5= 'categorisationEntities' ( (lv_categorisationEntities_6_0= ruleCategories ) ) otherlv_7= 'isPartial' ( (lv_isPartial_8_0= ruleEBoolean ) ) otherlv_9= '}' ) )
            // InternalErDsl.g:1226:1: (otherlv_0= 'Categorisation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'categorisedEntity' ( ( ruleEString ) ) otherlv_5= 'categorisationEntities' ( (lv_categorisationEntities_6_0= ruleCategories ) ) otherlv_7= 'isPartial' ( (lv_isPartial_8_0= ruleEBoolean ) ) otherlv_9= '}' )
            {
            // InternalErDsl.g:1226:1: (otherlv_0= 'Categorisation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'categorisedEntity' ( ( ruleEString ) ) otherlv_5= 'categorisationEntities' ( (lv_categorisationEntities_6_0= ruleCategories ) ) otherlv_7= 'isPartial' ( (lv_isPartial_8_0= ruleEBoolean ) ) otherlv_9= '}' )
            // InternalErDsl.g:1226:3: otherlv_0= 'Categorisation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'categorisedEntity' ( ( ruleEString ) ) otherlv_5= 'categorisationEntities' ( (lv_categorisationEntities_6_0= ruleCategories ) ) otherlv_7= 'isPartial' ( (lv_isPartial_8_0= ruleEBoolean ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getCategorisationAccess().getCategorisationKeyword_0());
                
            // InternalErDsl.g:1230:1: ( (lv_name_1_0= ruleEString ) )
            // InternalErDsl.g:1231:1: (lv_name_1_0= ruleEString )
            {
            // InternalErDsl.g:1231:1: (lv_name_1_0= ruleEString )
            // InternalErDsl.g:1232:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCategorisationAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategorisationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_29); 

                	newLeafNode(otherlv_2, grammarAccess.getCategorisationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getCategorisationAccess().getCategorisedEntityKeyword_3());
                
            // InternalErDsl.g:1256:1: ( ( ruleEString ) )
            // InternalErDsl.g:1257:1: ( ruleEString )
            {
            // InternalErDsl.g:1257:1: ( ruleEString )
            // InternalErDsl.g:1258:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCategorisationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCategorisationAccess().getCategorisedEntityEntityConceptCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_30);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_5, grammarAccess.getCategorisationAccess().getCategorisationEntitiesKeyword_5());
                
            // InternalErDsl.g:1275:1: ( (lv_categorisationEntities_6_0= ruleCategories ) )
            // InternalErDsl.g:1276:1: (lv_categorisationEntities_6_0= ruleCategories )
            {
            // InternalErDsl.g:1276:1: (lv_categorisationEntities_6_0= ruleCategories )
            // InternalErDsl.g:1277:3: lv_categorisationEntities_6_0= ruleCategories
            {
             
            	        newCompositeNode(grammarAccess.getCategorisationAccess().getCategorisationEntitiesCategoriesParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_31);
            lv_categorisationEntities_6_0=ruleCategories();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategorisationRule());
            	        }
                   		set(
                   			current, 
                   			"categorisationEntities",
                    		lv_categorisationEntities_6_0, 
                    		"org.xtext.example.domij.ErDsl.Categories");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,33,FollowSets000.FOLLOW_32); 

                	newLeafNode(otherlv_7, grammarAccess.getCategorisationAccess().getIsPartialKeyword_7());
                
            // InternalErDsl.g:1297:1: ( (lv_isPartial_8_0= ruleEBoolean ) )
            // InternalErDsl.g:1298:1: (lv_isPartial_8_0= ruleEBoolean )
            {
            // InternalErDsl.g:1298:1: (lv_isPartial_8_0= ruleEBoolean )
            // InternalErDsl.g:1299:3: lv_isPartial_8_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getCategorisationAccess().getIsPartialEBooleanParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            lv_isPartial_8_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategorisationRule());
            	        }
                   		set(
                   			current, 
                   			"isPartial",
                    		true, 
                    		"org.xtext.example.domij.ErDsl.EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getCategorisationAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleCategorisation"


    // $ANTLR start "entryRuleIdentificationDependency"
    // InternalErDsl.g:1327:1: entryRuleIdentificationDependency returns [EObject current=null] : iv_ruleIdentificationDependency= ruleIdentificationDependency EOF ;
    public final EObject entryRuleIdentificationDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentificationDependency = null;


        try {
            // InternalErDsl.g:1328:2: (iv_ruleIdentificationDependency= ruleIdentificationDependency EOF )
            // InternalErDsl.g:1329:2: iv_ruleIdentificationDependency= ruleIdentificationDependency EOF
            {
             newCompositeNode(grammarAccess.getIdentificationDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentificationDependency=ruleIdentificationDependency();

            state._fsp--;

             current =iv_ruleIdentificationDependency; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdentificationDependency"


    // $ANTLR start "ruleIdentificationDependency"
    // InternalErDsl.g:1336:1: ruleIdentificationDependency returns [EObject current=null] : (otherlv_0= 'IdentificationDependency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'weakEntity' ( ( ruleEString ) ) otherlv_5= 'regularEntity' ( (lv_regularEntity_6_0= ruleRegularEntity ) ) otherlv_7= '}' ) ;
    public final EObject ruleIdentificationDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_regularEntity_6_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:1339:28: ( (otherlv_0= 'IdentificationDependency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'weakEntity' ( ( ruleEString ) ) otherlv_5= 'regularEntity' ( (lv_regularEntity_6_0= ruleRegularEntity ) ) otherlv_7= '}' ) )
            // InternalErDsl.g:1340:1: (otherlv_0= 'IdentificationDependency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'weakEntity' ( ( ruleEString ) ) otherlv_5= 'regularEntity' ( (lv_regularEntity_6_0= ruleRegularEntity ) ) otherlv_7= '}' )
            {
            // InternalErDsl.g:1340:1: (otherlv_0= 'IdentificationDependency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'weakEntity' ( ( ruleEString ) ) otherlv_5= 'regularEntity' ( (lv_regularEntity_6_0= ruleRegularEntity ) ) otherlv_7= '}' )
            // InternalErDsl.g:1340:3: otherlv_0= 'IdentificationDependency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'weakEntity' ( ( ruleEString ) ) otherlv_5= 'regularEntity' ( (lv_regularEntity_6_0= ruleRegularEntity ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getIdentificationDependencyAccess().getIdentificationDependencyKeyword_0());
                
            // InternalErDsl.g:1344:1: ( (lv_name_1_0= ruleEString ) )
            // InternalErDsl.g:1345:1: (lv_name_1_0= ruleEString )
            {
            // InternalErDsl.g:1345:1: (lv_name_1_0= ruleEString )
            // InternalErDsl.g:1346:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIdentificationDependencyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIdentificationDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.xtext.example.domij.ErDsl.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_33); 

                	newLeafNode(otherlv_2, grammarAccess.getIdentificationDependencyAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getIdentificationDependencyAccess().getWeakEntityKeyword_3());
                
            // InternalErDsl.g:1370:1: ( ( ruleEString ) )
            // InternalErDsl.g:1371:1: ( ruleEString )
            {
            // InternalErDsl.g:1371:1: ( ruleEString )
            // InternalErDsl.g:1372:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentificationDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIdentificationDependencyAccess().getWeakEntityEntityCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_5, grammarAccess.getIdentificationDependencyAccess().getRegularEntityKeyword_5());
                
            // InternalErDsl.g:1389:1: ( (lv_regularEntity_6_0= ruleRegularEntity ) )
            // InternalErDsl.g:1390:1: (lv_regularEntity_6_0= ruleRegularEntity )
            {
            // InternalErDsl.g:1390:1: (lv_regularEntity_6_0= ruleRegularEntity )
            // InternalErDsl.g:1391:3: lv_regularEntity_6_0= ruleRegularEntity
            {
             
            	        newCompositeNode(grammarAccess.getIdentificationDependencyAccess().getRegularEntityRegularEntityParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_11);
            lv_regularEntity_6_0=ruleRegularEntity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIdentificationDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"regularEntity",
                    		lv_regularEntity_6_0, 
                    		"org.xtext.example.domij.ErDsl.RegularEntity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getIdentificationDependencyAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleIdentificationDependency"


    // $ANTLR start "entryRuleRegularEntity"
    // InternalErDsl.g:1419:1: entryRuleRegularEntity returns [EObject current=null] : iv_ruleRegularEntity= ruleRegularEntity EOF ;
    public final EObject entryRuleRegularEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularEntity = null;


        try {
            // InternalErDsl.g:1420:2: (iv_ruleRegularEntity= ruleRegularEntity EOF )
            // InternalErDsl.g:1421:2: iv_ruleRegularEntity= ruleRegularEntity EOF
            {
             newCompositeNode(grammarAccess.getRegularEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRegularEntity=ruleRegularEntity();

            state._fsp--;

             current =iv_ruleRegularEntity; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleRegularEntity"


    // $ANTLR start "ruleRegularEntity"
    // InternalErDsl.g:1428:1: ruleRegularEntity returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_min_2_0= ruleMinCardinality ) ) otherlv_3= ',' ( (lv_max_4_0= ruleMaxCardinality ) ) otherlv_5= ')' ( (lv_role_6_0= ruleEString ) )? ) ;
    public final EObject ruleRegularEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_min_2_0 = null;

        AntlrDatatypeRuleToken lv_max_4_0 = null;

        AntlrDatatypeRuleToken lv_role_6_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:1431:28: ( ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_min_2_0= ruleMinCardinality ) ) otherlv_3= ',' ( (lv_max_4_0= ruleMaxCardinality ) ) otherlv_5= ')' ( (lv_role_6_0= ruleEString ) )? ) )
            // InternalErDsl.g:1432:1: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_min_2_0= ruleMinCardinality ) ) otherlv_3= ',' ( (lv_max_4_0= ruleMaxCardinality ) ) otherlv_5= ')' ( (lv_role_6_0= ruleEString ) )? )
            {
            // InternalErDsl.g:1432:1: ( ( ( ruleEString ) ) otherlv_1= '(' ( (lv_min_2_0= ruleMinCardinality ) ) otherlv_3= ',' ( (lv_max_4_0= ruleMaxCardinality ) ) otherlv_5= ')' ( (lv_role_6_0= ruleEString ) )? )
            // InternalErDsl.g:1432:2: ( ( ruleEString ) ) otherlv_1= '(' ( (lv_min_2_0= ruleMinCardinality ) ) otherlv_3= ',' ( (lv_max_4_0= ruleMaxCardinality ) ) otherlv_5= ')' ( (lv_role_6_0= ruleEString ) )?
            {
            // InternalErDsl.g:1432:2: ( ( ruleEString ) )
            // InternalErDsl.g:1433:1: ( ruleEString )
            {
            // InternalErDsl.g:1433:1: ( ruleEString )
            // InternalErDsl.g:1434:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegularEntityRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRegularEntityAccess().getEntityEntityConceptCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_35); 

                	newLeafNode(otherlv_1, grammarAccess.getRegularEntityAccess().getLeftParenthesisKeyword_1());
                
            // InternalErDsl.g:1451:1: ( (lv_min_2_0= ruleMinCardinality ) )
            // InternalErDsl.g:1452:1: (lv_min_2_0= ruleMinCardinality )
            {
            // InternalErDsl.g:1452:1: (lv_min_2_0= ruleMinCardinality )
            // InternalErDsl.g:1453:3: lv_min_2_0= ruleMinCardinality
            {
             
            	        newCompositeNode(grammarAccess.getRegularEntityAccess().getMinMinCardinalityParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_36);
            lv_min_2_0=ruleMinCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegularEntityRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_2_0, 
                    		"org.xtext.example.domij.ErDsl.MinCardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_37); 

                	newLeafNode(otherlv_3, grammarAccess.getRegularEntityAccess().getCommaKeyword_3());
                
            // InternalErDsl.g:1473:1: ( (lv_max_4_0= ruleMaxCardinality ) )
            // InternalErDsl.g:1474:1: (lv_max_4_0= ruleMaxCardinality )
            {
            // InternalErDsl.g:1474:1: (lv_max_4_0= ruleMaxCardinality )
            // InternalErDsl.g:1475:3: lv_max_4_0= ruleMaxCardinality
            {
             
            	        newCompositeNode(grammarAccess.getRegularEntityAccess().getMaxMaxCardinalityParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_max_4_0=ruleMaxCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegularEntityRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_4_0, 
                    		"org.xtext.example.domij.ErDsl.MaxCardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_5, grammarAccess.getRegularEntityAccess().getRightParenthesisKeyword_5());
                
            // InternalErDsl.g:1495:1: ( (lv_role_6_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalErDsl.g:1496:1: (lv_role_6_0= ruleEString )
                    {
                    // InternalErDsl.g:1496:1: (lv_role_6_0= ruleEString )
                    // InternalErDsl.g:1497:3: lv_role_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRegularEntityAccess().getRoleEStringParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_role_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRegularEntityRule());
                    	        }
                           		set(
                           			current, 
                           			"role",
                            		lv_role_6_0, 
                            		"org.xtext.example.domij.ErDsl.EString");
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
    // $ANTLR end "ruleRegularEntity"


    // $ANTLR start "entryRuleMinCardinality"
    // InternalErDsl.g:1521:1: entryRuleMinCardinality returns [String current=null] : iv_ruleMinCardinality= ruleMinCardinality EOF ;
    public final String entryRuleMinCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinCardinality = null;


        try {
            // InternalErDsl.g:1522:2: (iv_ruleMinCardinality= ruleMinCardinality EOF )
            // InternalErDsl.g:1523:2: iv_ruleMinCardinality= ruleMinCardinality EOF
            {
             newCompositeNode(grammarAccess.getMinCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMinCardinality=ruleMinCardinality();

            state._fsp--;

             current =iv_ruleMinCardinality.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMinCardinality"


    // $ANTLR start "ruleMinCardinality"
    // InternalErDsl.g:1530:1: ruleMinCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zero' | kw= 'one' ) ;
    public final AntlrDatatypeRuleToken ruleMinCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalErDsl.g:1533:28: ( (kw= 'zero' | kw= 'one' ) )
            // InternalErDsl.g:1534:1: (kw= 'zero' | kw= 'one' )
            {
            // InternalErDsl.g:1534:1: (kw= 'zero' | kw= 'one' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            else if ( (LA25_0==38) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalErDsl.g:1535:2: kw= 'zero'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMinCardinalityAccess().getZeroKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalErDsl.g:1542:2: kw= 'one'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMinCardinalityAccess().getOneKeyword_1()); 
                        

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
    // $ANTLR end "ruleMinCardinality"


    // $ANTLR start "entryRuleMaxCardinality"
    // InternalErDsl.g:1555:1: entryRuleMaxCardinality returns [String current=null] : iv_ruleMaxCardinality= ruleMaxCardinality EOF ;
    public final String entryRuleMaxCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxCardinality = null;


        try {
            // InternalErDsl.g:1556:2: (iv_ruleMaxCardinality= ruleMaxCardinality EOF )
            // InternalErDsl.g:1557:2: iv_ruleMaxCardinality= ruleMaxCardinality EOF
            {
             newCompositeNode(grammarAccess.getMaxCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaxCardinality=ruleMaxCardinality();

            state._fsp--;

             current =iv_ruleMaxCardinality.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaxCardinality"


    // $ANTLR start "ruleMaxCardinality"
    // InternalErDsl.g:1564:1: ruleMaxCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'one' | kw= 'many' ) ;
    public final AntlrDatatypeRuleToken ruleMaxCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalErDsl.g:1567:28: ( (kw= 'one' | kw= 'many' ) )
            // InternalErDsl.g:1568:1: (kw= 'one' | kw= 'many' )
            {
            // InternalErDsl.g:1568:1: (kw= 'one' | kw= 'many' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            else if ( (LA26_0==39) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalErDsl.g:1569:2: kw= 'one'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMaxCardinalityAccess().getOneKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalErDsl.g:1576:2: kw= 'many'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMaxCardinalityAccess().getManyKeyword_1()); 
                        

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
    // $ANTLR end "ruleMaxCardinality"


    // $ANTLR start "entryRuleCategories"
    // InternalErDsl.g:1589:1: entryRuleCategories returns [EObject current=null] : iv_ruleCategories= ruleCategories EOF ;
    public final EObject entryRuleCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategories = null;


        try {
            // InternalErDsl.g:1590:2: (iv_ruleCategories= ruleCategories EOF )
            // InternalErDsl.g:1591:2: iv_ruleCategories= ruleCategories EOF
            {
             newCompositeNode(grammarAccess.getCategoriesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCategories=ruleCategories();

            state._fsp--;

             current =iv_ruleCategories; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCategories"


    // $ANTLR start "ruleCategories"
    // InternalErDsl.g:1598:1: ruleCategories returns [EObject current=null] : (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ')' otherlv_5= '(' ( (lv_min_6_0= ruleMinCardinality ) ) otherlv_7= ',' ( (lv_max_8_0= ruleMaxCardinality ) ) otherlv_9= ')' ) ;
    public final EObject ruleCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_min_6_0 = null;

        AntlrDatatypeRuleToken lv_max_8_0 = null;


         enterRule(); 
            
        try {
            // InternalErDsl.g:1601:28: ( (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ')' otherlv_5= '(' ( (lv_min_6_0= ruleMinCardinality ) ) otherlv_7= ',' ( (lv_max_8_0= ruleMaxCardinality ) ) otherlv_9= ')' ) )
            // InternalErDsl.g:1602:1: (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ')' otherlv_5= '(' ( (lv_min_6_0= ruleMinCardinality ) ) otherlv_7= ',' ( (lv_max_8_0= ruleMaxCardinality ) ) otherlv_9= ')' )
            {
            // InternalErDsl.g:1602:1: (otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ')' otherlv_5= '(' ( (lv_min_6_0= ruleMinCardinality ) ) otherlv_7= ',' ( (lv_max_8_0= ruleMaxCardinality ) ) otherlv_9= ')' )
            // InternalErDsl.g:1602:3: otherlv_0= '(' ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* otherlv_4= ')' otherlv_5= '(' ( (lv_min_6_0= ruleMinCardinality ) ) otherlv_7= ',' ( (lv_max_8_0= ruleMaxCardinality ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoriesAccess().getLeftParenthesisKeyword_0());
                
            // InternalErDsl.g:1606:1: ( ( ruleEString ) )
            // InternalErDsl.g:1607:1: ( ruleEString )
            {
            // InternalErDsl.g:1607:1: ( ruleEString )
            // InternalErDsl.g:1608:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoriesRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_21);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalErDsl.g:1621:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==13) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalErDsl.g:1621:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCategoriesAccess().getCommaKeyword_2_0());
            	        
            	    // InternalErDsl.g:1625:1: ( ( ruleEString ) )
            	    // InternalErDsl.g:1626:1: ( ruleEString )
            	    {
            	    // InternalErDsl.g:1626:1: ( ruleEString )
            	    // InternalErDsl.g:1627:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCategoriesRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_20); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoriesAccess().getRightParenthesisKeyword_3());
                
            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_35); 

                	newLeafNode(otherlv_5, grammarAccess.getCategoriesAccess().getLeftParenthesisKeyword_4());
                
            // InternalErDsl.g:1648:1: ( (lv_min_6_0= ruleMinCardinality ) )
            // InternalErDsl.g:1649:1: (lv_min_6_0= ruleMinCardinality )
            {
            // InternalErDsl.g:1649:1: (lv_min_6_0= ruleMinCardinality )
            // InternalErDsl.g:1650:3: lv_min_6_0= ruleMinCardinality
            {
             
            	        newCompositeNode(grammarAccess.getCategoriesAccess().getMinMinCardinalityParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_36);
            lv_min_6_0=ruleMinCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoriesRule());
            	        }
                   		set(
                   			current, 
                   			"min",
                    		lv_min_6_0, 
                    		"org.xtext.example.domij.ErDsl.MinCardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_37); 

                	newLeafNode(otherlv_7, grammarAccess.getCategoriesAccess().getCommaKeyword_6());
                
            // InternalErDsl.g:1670:1: ( (lv_max_8_0= ruleMaxCardinality ) )
            // InternalErDsl.g:1671:1: (lv_max_8_0= ruleMaxCardinality )
            {
            // InternalErDsl.g:1671:1: (lv_max_8_0= ruleMaxCardinality )
            // InternalErDsl.g:1672:3: lv_max_8_0= ruleMaxCardinality
            {
             
            	        newCompositeNode(grammarAccess.getCategoriesAccess().getMaxMaxCardinalityParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_18);
            lv_max_8_0=ruleMaxCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoriesRule());
            	        }
                   		set(
                   			current, 
                   			"max",
                    		lv_max_8_0, 
                    		"org.xtext.example.domij.ErDsl.MaxCardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_9, grammarAccess.getCategoriesAccess().getRightParenthesisKeyword_8());
                

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
    // $ANTLR end "ruleCategories"


    // $ANTLR start "entryRulePrimitiveDomain"
    // InternalErDsl.g:1700:1: entryRulePrimitiveDomain returns [String current=null] : iv_rulePrimitiveDomain= rulePrimitiveDomain EOF ;
    public final String entryRulePrimitiveDomain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveDomain = null;


        try {
            // InternalErDsl.g:1701:2: (iv_rulePrimitiveDomain= rulePrimitiveDomain EOF )
            // InternalErDsl.g:1702:2: iv_rulePrimitiveDomain= rulePrimitiveDomain EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveDomain=rulePrimitiveDomain();

            state._fsp--;

             current =iv_rulePrimitiveDomain.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimitiveDomain"


    // $ANTLR start "rulePrimitiveDomain"
    // InternalErDsl.g:1709:1: rulePrimitiveDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'integer' | kw= 'string' | kw= 'real' | kw= 'boolean' | kw= 'date' | kw= 'time' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveDomain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalErDsl.g:1712:28: ( (kw= 'integer' | kw= 'string' | kw= 'real' | kw= 'boolean' | kw= 'date' | kw= 'time' ) )
            // InternalErDsl.g:1713:1: (kw= 'integer' | kw= 'string' | kw= 'real' | kw= 'boolean' | kw= 'date' | kw= 'time' )
            {
            // InternalErDsl.g:1713:1: (kw= 'integer' | kw= 'string' | kw= 'real' | kw= 'boolean' | kw= 'date' | kw= 'time' )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt28=1;
                }
                break;
            case 41:
                {
                alt28=2;
                }
                break;
            case 42:
                {
                alt28=3;
                }
                break;
            case 43:
                {
                alt28=4;
                }
                break;
            case 44:
                {
                alt28=5;
                }
                break;
            case 45:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalErDsl.g:1714:2: kw= 'integer'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveDomainAccess().getIntegerKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalErDsl.g:1721:2: kw= 'string'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveDomainAccess().getStringKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalErDsl.g:1728:2: kw= 'real'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveDomainAccess().getRealKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalErDsl.g:1735:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveDomainAccess().getBooleanKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalErDsl.g:1742:2: kw= 'date'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveDomainAccess().getDateKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // InternalErDsl.g:1749:2: kw= 'time'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveDomainAccess().getTimeKeyword_5()); 
                        

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
    // $ANTLR end "rulePrimitiveDomain"


    // $ANTLR start "entryRuleEBoolean"
    // InternalErDsl.g:1762:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalErDsl.g:1763:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalErDsl.g:1764:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalErDsl.g:1771:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalErDsl.g:1774:28: ( (kw= 'true' | kw= 'false' ) )
            // InternalErDsl.g:1775:1: (kw= 'true' | kw= 'false' )
            {
            // InternalErDsl.g:1775:1: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            else if ( (LA29_0==47) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalErDsl.g:1776:2: kw= 'true'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalErDsl.g:1783:2: kw= 'false'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalErDsl.g:1796:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalErDsl.g:1797:2: (iv_ruleEInt= ruleEInt EOF )
            // InternalErDsl.g:1798:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalErDsl.g:1805:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // InternalErDsl.g:1808:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalErDsl.g:1809:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalErDsl.g:1809:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalErDsl.g:1809:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalErDsl.g:1809:2: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalErDsl.g:1810:2: kw= '-'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_38); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003D000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000444000030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C4000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000184000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A00002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00003F0000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    }


}