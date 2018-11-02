package org.xtext.example.domij.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.domij.services.ErDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'zero'", "'one'", "'many'", "'integer'", "'string'", "'real'", "'boolean'", "'date'", "'time'", "'true'", "'false'", "'{'", "'}'", "'domains'", "','", "'entities'", "'gerunds'", "'relationships'", "'attributeSet'", "'keySet'", "'primaryKey'", "'('", "')'", "'default'", "'extends'", "'entitiesInRelationship'", "'ISA'", "'supertype'", "'subtypes'", "'classificationAttribute'", "'Categorisation'", "'categorisedEntity'", "'categorisationEntities'", "'isPartial'", "'IdentificationDependency'", "'weakEntity'", "'regularEntity'", "'-'"
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
     	
        public void setGrammarAccess(ErDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleERModel"
    // InternalErDsl.g:60:1: entryRuleERModel : ruleERModel EOF ;
    public final void entryRuleERModel() throws RecognitionException {
        try {
            // InternalErDsl.g:61:1: ( ruleERModel EOF )
            // InternalErDsl.g:62:1: ruleERModel EOF
            {
             before(grammarAccess.getERModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleERModel();

            state._fsp--;

             after(grammarAccess.getERModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleERModel"


    // $ANTLR start "ruleERModel"
    // InternalErDsl.g:69:1: ruleERModel : ( ( rule__ERModel__Group__0 ) ) ;
    public final void ruleERModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:73:2: ( ( ( rule__ERModel__Group__0 ) ) )
            // InternalErDsl.g:74:1: ( ( rule__ERModel__Group__0 ) )
            {
            // InternalErDsl.g:74:1: ( ( rule__ERModel__Group__0 ) )
            // InternalErDsl.g:75:1: ( rule__ERModel__Group__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup()); 
            // InternalErDsl.g:76:1: ( rule__ERModel__Group__0 )
            // InternalErDsl.g:76:2: rule__ERModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleERModel"


    // $ANTLR start "entryRuleRelationshipConcept"
    // InternalErDsl.g:88:1: entryRuleRelationshipConcept : ruleRelationshipConcept EOF ;
    public final void entryRuleRelationshipConcept() throws RecognitionException {
        try {
            // InternalErDsl.g:89:1: ( ruleRelationshipConcept EOF )
            // InternalErDsl.g:90:1: ruleRelationshipConcept EOF
            {
             before(grammarAccess.getRelationshipConceptRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRelationshipConcept();

            state._fsp--;

             after(grammarAccess.getRelationshipConceptRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationshipConcept"


    // $ANTLR start "ruleRelationshipConcept"
    // InternalErDsl.g:97:1: ruleRelationshipConcept : ( ( rule__RelationshipConcept__Alternatives ) ) ;
    public final void ruleRelationshipConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:101:2: ( ( ( rule__RelationshipConcept__Alternatives ) ) )
            // InternalErDsl.g:102:1: ( ( rule__RelationshipConcept__Alternatives ) )
            {
            // InternalErDsl.g:102:1: ( ( rule__RelationshipConcept__Alternatives ) )
            // InternalErDsl.g:103:1: ( rule__RelationshipConcept__Alternatives )
            {
             before(grammarAccess.getRelationshipConceptAccess().getAlternatives()); 
            // InternalErDsl.g:104:1: ( rule__RelationshipConcept__Alternatives )
            // InternalErDsl.g:104:2: rule__RelationshipConcept__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationshipConcept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipConceptAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipConcept"


    // $ANTLR start "entryRuleEString"
    // InternalErDsl.g:118:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalErDsl.g:119:1: ( ruleEString EOF )
            // InternalErDsl.g:120:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalErDsl.g:127:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:131:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalErDsl.g:132:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalErDsl.g:132:1: ( ( rule__EString__Alternatives ) )
            // InternalErDsl.g:133:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalErDsl.g:134:1: ( rule__EString__Alternatives )
            // InternalErDsl.g:134:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntity"
    // InternalErDsl.g:146:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalErDsl.g:147:1: ( ruleEntity EOF )
            // InternalErDsl.g:148:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalErDsl.g:155:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:159:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalErDsl.g:160:1: ( ( rule__Entity__Group__0 ) )
            {
            // InternalErDsl.g:160:1: ( ( rule__Entity__Group__0 ) )
            // InternalErDsl.g:161:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalErDsl.g:162:1: ( rule__Entity__Group__0 )
            // InternalErDsl.g:162:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleGerund"
    // InternalErDsl.g:174:1: entryRuleGerund : ruleGerund EOF ;
    public final void entryRuleGerund() throws RecognitionException {
        try {
            // InternalErDsl.g:175:1: ( ruleGerund EOF )
            // InternalErDsl.g:176:1: ruleGerund EOF
            {
             before(grammarAccess.getGerundRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGerund();

            state._fsp--;

             after(grammarAccess.getGerundRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGerund"


    // $ANTLR start "ruleGerund"
    // InternalErDsl.g:183:1: ruleGerund : ( ( rule__Gerund__RelationshipAssignment ) ) ;
    public final void ruleGerund() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:187:2: ( ( ( rule__Gerund__RelationshipAssignment ) ) )
            // InternalErDsl.g:188:1: ( ( rule__Gerund__RelationshipAssignment ) )
            {
            // InternalErDsl.g:188:1: ( ( rule__Gerund__RelationshipAssignment ) )
            // InternalErDsl.g:189:1: ( rule__Gerund__RelationshipAssignment )
            {
             before(grammarAccess.getGerundAccess().getRelationshipAssignment()); 
            // InternalErDsl.g:190:1: ( rule__Gerund__RelationshipAssignment )
            // InternalErDsl.g:190:2: rule__Gerund__RelationshipAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Gerund__RelationshipAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGerundAccess().getRelationshipAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGerund"


    // $ANTLR start "entryRuleAttribute"
    // InternalErDsl.g:202:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalErDsl.g:203:1: ( ruleAttribute EOF )
            // InternalErDsl.g:204:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalErDsl.g:211:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:215:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalErDsl.g:216:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalErDsl.g:216:1: ( ( rule__Attribute__Group__0 ) )
            // InternalErDsl.g:217:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalErDsl.g:218:1: ( rule__Attribute__Group__0 )
            // InternalErDsl.g:218:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeDomain"
    // InternalErDsl.g:230:1: entryRuleAttributeDomain : ruleAttributeDomain EOF ;
    public final void entryRuleAttributeDomain() throws RecognitionException {
        try {
            // InternalErDsl.g:231:1: ( ruleAttributeDomain EOF )
            // InternalErDsl.g:232:1: ruleAttributeDomain EOF
            {
             before(grammarAccess.getAttributeDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeDomain();

            state._fsp--;

             after(grammarAccess.getAttributeDomainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeDomain"


    // $ANTLR start "ruleAttributeDomain"
    // InternalErDsl.g:239:1: ruleAttributeDomain : ( ( rule__AttributeDomain__Group__0 ) ) ;
    public final void ruleAttributeDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:243:2: ( ( ( rule__AttributeDomain__Group__0 ) ) )
            // InternalErDsl.g:244:1: ( ( rule__AttributeDomain__Group__0 ) )
            {
            // InternalErDsl.g:244:1: ( ( rule__AttributeDomain__Group__0 ) )
            // InternalErDsl.g:245:1: ( rule__AttributeDomain__Group__0 )
            {
             before(grammarAccess.getAttributeDomainAccess().getGroup()); 
            // InternalErDsl.g:246:1: ( rule__AttributeDomain__Group__0 )
            // InternalErDsl.g:246:2: rule__AttributeDomain__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDomain"


    // $ANTLR start "entryRuleKey"
    // InternalErDsl.g:258:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // InternalErDsl.g:259:1: ( ruleKey EOF )
            // InternalErDsl.g:260:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // InternalErDsl.g:267:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:271:2: ( ( ( rule__Key__Group__0 ) ) )
            // InternalErDsl.g:272:1: ( ( rule__Key__Group__0 ) )
            {
            // InternalErDsl.g:272:1: ( ( rule__Key__Group__0 ) )
            // InternalErDsl.g:273:1: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // InternalErDsl.g:274:1: ( rule__Key__Group__0 )
            // InternalErDsl.g:274:2: rule__Key__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleDomain"
    // InternalErDsl.g:286:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalErDsl.g:287:1: ( ruleDomain EOF )
            // InternalErDsl.g:288:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalErDsl.g:295:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:299:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalErDsl.g:300:1: ( ( rule__Domain__Group__0 ) )
            {
            // InternalErDsl.g:300:1: ( ( rule__Domain__Group__0 ) )
            // InternalErDsl.g:301:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalErDsl.g:302:1: ( rule__Domain__Group__0 )
            // InternalErDsl.g:302:2: rule__Domain__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleRelationship"
    // InternalErDsl.g:314:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // InternalErDsl.g:315:1: ( ruleRelationship EOF )
            // InternalErDsl.g:316:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalErDsl.g:323:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:327:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // InternalErDsl.g:328:1: ( ( rule__Relationship__Group__0 ) )
            {
            // InternalErDsl.g:328:1: ( ( rule__Relationship__Group__0 ) )
            // InternalErDsl.g:329:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // InternalErDsl.g:330:1: ( rule__Relationship__Group__0 )
            // InternalErDsl.g:330:2: rule__Relationship__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleISA"
    // InternalErDsl.g:342:1: entryRuleISA : ruleISA EOF ;
    public final void entryRuleISA() throws RecognitionException {
        try {
            // InternalErDsl.g:343:1: ( ruleISA EOF )
            // InternalErDsl.g:344:1: ruleISA EOF
            {
             before(grammarAccess.getISARule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleISA();

            state._fsp--;

             after(grammarAccess.getISARule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleISA"


    // $ANTLR start "ruleISA"
    // InternalErDsl.g:351:1: ruleISA : ( ( rule__ISA__Group__0 ) ) ;
    public final void ruleISA() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:355:2: ( ( ( rule__ISA__Group__0 ) ) )
            // InternalErDsl.g:356:1: ( ( rule__ISA__Group__0 ) )
            {
            // InternalErDsl.g:356:1: ( ( rule__ISA__Group__0 ) )
            // InternalErDsl.g:357:1: ( rule__ISA__Group__0 )
            {
             before(grammarAccess.getISAAccess().getGroup()); 
            // InternalErDsl.g:358:1: ( rule__ISA__Group__0 )
            // InternalErDsl.g:358:2: rule__ISA__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getISAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleISA"


    // $ANTLR start "entryRuleCategorisation"
    // InternalErDsl.g:370:1: entryRuleCategorisation : ruleCategorisation EOF ;
    public final void entryRuleCategorisation() throws RecognitionException {
        try {
            // InternalErDsl.g:371:1: ( ruleCategorisation EOF )
            // InternalErDsl.g:372:1: ruleCategorisation EOF
            {
             before(grammarAccess.getCategorisationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCategorisation();

            state._fsp--;

             after(grammarAccess.getCategorisationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategorisation"


    // $ANTLR start "ruleCategorisation"
    // InternalErDsl.g:379:1: ruleCategorisation : ( ( rule__Categorisation__Group__0 ) ) ;
    public final void ruleCategorisation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:383:2: ( ( ( rule__Categorisation__Group__0 ) ) )
            // InternalErDsl.g:384:1: ( ( rule__Categorisation__Group__0 ) )
            {
            // InternalErDsl.g:384:1: ( ( rule__Categorisation__Group__0 ) )
            // InternalErDsl.g:385:1: ( rule__Categorisation__Group__0 )
            {
             before(grammarAccess.getCategorisationAccess().getGroup()); 
            // InternalErDsl.g:386:1: ( rule__Categorisation__Group__0 )
            // InternalErDsl.g:386:2: rule__Categorisation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategorisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategorisation"


    // $ANTLR start "entryRuleIdentificationDependency"
    // InternalErDsl.g:398:1: entryRuleIdentificationDependency : ruleIdentificationDependency EOF ;
    public final void entryRuleIdentificationDependency() throws RecognitionException {
        try {
            // InternalErDsl.g:399:1: ( ruleIdentificationDependency EOF )
            // InternalErDsl.g:400:1: ruleIdentificationDependency EOF
            {
             before(grammarAccess.getIdentificationDependencyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIdentificationDependency();

            state._fsp--;

             after(grammarAccess.getIdentificationDependencyRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentificationDependency"


    // $ANTLR start "ruleIdentificationDependency"
    // InternalErDsl.g:407:1: ruleIdentificationDependency : ( ( rule__IdentificationDependency__Group__0 ) ) ;
    public final void ruleIdentificationDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:411:2: ( ( ( rule__IdentificationDependency__Group__0 ) ) )
            // InternalErDsl.g:412:1: ( ( rule__IdentificationDependency__Group__0 ) )
            {
            // InternalErDsl.g:412:1: ( ( rule__IdentificationDependency__Group__0 ) )
            // InternalErDsl.g:413:1: ( rule__IdentificationDependency__Group__0 )
            {
             before(grammarAccess.getIdentificationDependencyAccess().getGroup()); 
            // InternalErDsl.g:414:1: ( rule__IdentificationDependency__Group__0 )
            // InternalErDsl.g:414:2: rule__IdentificationDependency__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentificationDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentificationDependency"


    // $ANTLR start "entryRuleRegularEntity"
    // InternalErDsl.g:426:1: entryRuleRegularEntity : ruleRegularEntity EOF ;
    public final void entryRuleRegularEntity() throws RecognitionException {
        try {
            // InternalErDsl.g:427:1: ( ruleRegularEntity EOF )
            // InternalErDsl.g:428:1: ruleRegularEntity EOF
            {
             before(grammarAccess.getRegularEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRegularEntity();

            state._fsp--;

             after(grammarAccess.getRegularEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularEntity"


    // $ANTLR start "ruleRegularEntity"
    // InternalErDsl.g:435:1: ruleRegularEntity : ( ( rule__RegularEntity__Group__0 ) ) ;
    public final void ruleRegularEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:439:2: ( ( ( rule__RegularEntity__Group__0 ) ) )
            // InternalErDsl.g:440:1: ( ( rule__RegularEntity__Group__0 ) )
            {
            // InternalErDsl.g:440:1: ( ( rule__RegularEntity__Group__0 ) )
            // InternalErDsl.g:441:1: ( rule__RegularEntity__Group__0 )
            {
             before(grammarAccess.getRegularEntityAccess().getGroup()); 
            // InternalErDsl.g:442:1: ( rule__RegularEntity__Group__0 )
            // InternalErDsl.g:442:2: rule__RegularEntity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularEntity"


    // $ANTLR start "entryRuleMinCardinality"
    // InternalErDsl.g:454:1: entryRuleMinCardinality : ruleMinCardinality EOF ;
    public final void entryRuleMinCardinality() throws RecognitionException {
        try {
            // InternalErDsl.g:455:1: ( ruleMinCardinality EOF )
            // InternalErDsl.g:456:1: ruleMinCardinality EOF
            {
             before(grammarAccess.getMinCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMinCardinality();

            state._fsp--;

             after(grammarAccess.getMinCardinalityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinCardinality"


    // $ANTLR start "ruleMinCardinality"
    // InternalErDsl.g:463:1: ruleMinCardinality : ( ( rule__MinCardinality__Alternatives ) ) ;
    public final void ruleMinCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:467:2: ( ( ( rule__MinCardinality__Alternatives ) ) )
            // InternalErDsl.g:468:1: ( ( rule__MinCardinality__Alternatives ) )
            {
            // InternalErDsl.g:468:1: ( ( rule__MinCardinality__Alternatives ) )
            // InternalErDsl.g:469:1: ( rule__MinCardinality__Alternatives )
            {
             before(grammarAccess.getMinCardinalityAccess().getAlternatives()); 
            // InternalErDsl.g:470:1: ( rule__MinCardinality__Alternatives )
            // InternalErDsl.g:470:2: rule__MinCardinality__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinCardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMinCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinCardinality"


    // $ANTLR start "entryRuleMaxCardinality"
    // InternalErDsl.g:482:1: entryRuleMaxCardinality : ruleMaxCardinality EOF ;
    public final void entryRuleMaxCardinality() throws RecognitionException {
        try {
            // InternalErDsl.g:483:1: ( ruleMaxCardinality EOF )
            // InternalErDsl.g:484:1: ruleMaxCardinality EOF
            {
             before(grammarAccess.getMaxCardinalityRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMaxCardinality();

            state._fsp--;

             after(grammarAccess.getMaxCardinalityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxCardinality"


    // $ANTLR start "ruleMaxCardinality"
    // InternalErDsl.g:491:1: ruleMaxCardinality : ( ( rule__MaxCardinality__Alternatives ) ) ;
    public final void ruleMaxCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:495:2: ( ( ( rule__MaxCardinality__Alternatives ) ) )
            // InternalErDsl.g:496:1: ( ( rule__MaxCardinality__Alternatives ) )
            {
            // InternalErDsl.g:496:1: ( ( rule__MaxCardinality__Alternatives ) )
            // InternalErDsl.g:497:1: ( rule__MaxCardinality__Alternatives )
            {
             before(grammarAccess.getMaxCardinalityAccess().getAlternatives()); 
            // InternalErDsl.g:498:1: ( rule__MaxCardinality__Alternatives )
            // InternalErDsl.g:498:2: rule__MaxCardinality__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MaxCardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaxCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxCardinality"


    // $ANTLR start "entryRuleCategories"
    // InternalErDsl.g:510:1: entryRuleCategories : ruleCategories EOF ;
    public final void entryRuleCategories() throws RecognitionException {
        try {
            // InternalErDsl.g:511:1: ( ruleCategories EOF )
            // InternalErDsl.g:512:1: ruleCategories EOF
            {
             before(grammarAccess.getCategoriesRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCategories();

            state._fsp--;

             after(grammarAccess.getCategoriesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategories"


    // $ANTLR start "ruleCategories"
    // InternalErDsl.g:519:1: ruleCategories : ( ( rule__Categories__Group__0 ) ) ;
    public final void ruleCategories() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:523:2: ( ( ( rule__Categories__Group__0 ) ) )
            // InternalErDsl.g:524:1: ( ( rule__Categories__Group__0 ) )
            {
            // InternalErDsl.g:524:1: ( ( rule__Categories__Group__0 ) )
            // InternalErDsl.g:525:1: ( rule__Categories__Group__0 )
            {
             before(grammarAccess.getCategoriesAccess().getGroup()); 
            // InternalErDsl.g:526:1: ( rule__Categories__Group__0 )
            // InternalErDsl.g:526:2: rule__Categories__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoriesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategories"


    // $ANTLR start "entryRulePrimitiveDomain"
    // InternalErDsl.g:538:1: entryRulePrimitiveDomain : rulePrimitiveDomain EOF ;
    public final void entryRulePrimitiveDomain() throws RecognitionException {
        try {
            // InternalErDsl.g:539:1: ( rulePrimitiveDomain EOF )
            // InternalErDsl.g:540:1: rulePrimitiveDomain EOF
            {
             before(grammarAccess.getPrimitiveDomainRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimitiveDomain();

            state._fsp--;

             after(grammarAccess.getPrimitiveDomainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveDomain"


    // $ANTLR start "rulePrimitiveDomain"
    // InternalErDsl.g:547:1: rulePrimitiveDomain : ( ( rule__PrimitiveDomain__Alternatives ) ) ;
    public final void rulePrimitiveDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:551:2: ( ( ( rule__PrimitiveDomain__Alternatives ) ) )
            // InternalErDsl.g:552:1: ( ( rule__PrimitiveDomain__Alternatives ) )
            {
            // InternalErDsl.g:552:1: ( ( rule__PrimitiveDomain__Alternatives ) )
            // InternalErDsl.g:553:1: ( rule__PrimitiveDomain__Alternatives )
            {
             before(grammarAccess.getPrimitiveDomainAccess().getAlternatives()); 
            // InternalErDsl.g:554:1: ( rule__PrimitiveDomain__Alternatives )
            // InternalErDsl.g:554:2: rule__PrimitiveDomain__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveDomain__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveDomainAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveDomain"


    // $ANTLR start "entryRuleEBoolean"
    // InternalErDsl.g:566:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalErDsl.g:567:1: ( ruleEBoolean EOF )
            // InternalErDsl.g:568:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalErDsl.g:575:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:579:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalErDsl.g:580:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalErDsl.g:580:1: ( ( rule__EBoolean__Alternatives ) )
            // InternalErDsl.g:581:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalErDsl.g:582:1: ( rule__EBoolean__Alternatives )
            // InternalErDsl.g:582:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalErDsl.g:594:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalErDsl.g:595:1: ( ruleEInt EOF )
            // InternalErDsl.g:596:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalErDsl.g:603:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:607:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalErDsl.g:608:1: ( ( rule__EInt__Group__0 ) )
            {
            // InternalErDsl.g:608:1: ( ( rule__EInt__Group__0 ) )
            // InternalErDsl.g:609:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalErDsl.g:610:1: ( rule__EInt__Group__0 )
            // InternalErDsl.g:610:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__RelationshipConcept__Alternatives"
    // InternalErDsl.g:622:1: rule__RelationshipConcept__Alternatives : ( ( ruleRelationship ) | ( ruleISA ) | ( ruleCategorisation ) | ( ruleIdentificationDependency ) );
    public final void rule__RelationshipConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:626:1: ( ( ruleRelationship ) | ( ruleISA ) | ( ruleCategorisation ) | ( ruleIdentificationDependency ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 41:
                {
                alt1=3;
                }
                break;
            case 45:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalErDsl.g:627:1: ( ruleRelationship )
                    {
                    // InternalErDsl.g:627:1: ( ruleRelationship )
                    // InternalErDsl.g:628:1: ruleRelationship
                    {
                     before(grammarAccess.getRelationshipConceptAccess().getRelationshipParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRelationship();

                    state._fsp--;

                     after(grammarAccess.getRelationshipConceptAccess().getRelationshipParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:633:6: ( ruleISA )
                    {
                    // InternalErDsl.g:633:6: ( ruleISA )
                    // InternalErDsl.g:634:1: ruleISA
                    {
                     before(grammarAccess.getRelationshipConceptAccess().getISAParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleISA();

                    state._fsp--;

                     after(grammarAccess.getRelationshipConceptAccess().getISAParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:639:6: ( ruleCategorisation )
                    {
                    // InternalErDsl.g:639:6: ( ruleCategorisation )
                    // InternalErDsl.g:640:1: ruleCategorisation
                    {
                     before(grammarAccess.getRelationshipConceptAccess().getCategorisationParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCategorisation();

                    state._fsp--;

                     after(grammarAccess.getRelationshipConceptAccess().getCategorisationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:645:6: ( ruleIdentificationDependency )
                    {
                    // InternalErDsl.g:645:6: ( ruleIdentificationDependency )
                    // InternalErDsl.g:646:1: ruleIdentificationDependency
                    {
                     before(grammarAccess.getRelationshipConceptAccess().getIdentificationDependencyParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIdentificationDependency();

                    state._fsp--;

                     after(grammarAccess.getRelationshipConceptAccess().getIdentificationDependencyParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipConcept__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalErDsl.g:657:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:661:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalErDsl.g:662:1: ( RULE_STRING )
                    {
                    // InternalErDsl.g:662:1: ( RULE_STRING )
                    // InternalErDsl.g:663:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:668:6: ( RULE_ID )
                    {
                    // InternalErDsl.g:668:6: ( RULE_ID )
                    // InternalErDsl.g:669:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__MinCardinality__Alternatives"
    // InternalErDsl.g:679:1: rule__MinCardinality__Alternatives : ( ( 'zero' ) | ( 'one' ) );
    public final void rule__MinCardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:683:1: ( ( 'zero' ) | ( 'one' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalErDsl.g:684:1: ( 'zero' )
                    {
                    // InternalErDsl.g:684:1: ( 'zero' )
                    // InternalErDsl.g:685:1: 'zero'
                    {
                     before(grammarAccess.getMinCardinalityAccess().getZeroKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getMinCardinalityAccess().getZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:692:6: ( 'one' )
                    {
                    // InternalErDsl.g:692:6: ( 'one' )
                    // InternalErDsl.g:693:1: 'one'
                    {
                     before(grammarAccess.getMinCardinalityAccess().getOneKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getMinCardinalityAccess().getOneKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinCardinality__Alternatives"


    // $ANTLR start "rule__MaxCardinality__Alternatives"
    // InternalErDsl.g:705:1: rule__MaxCardinality__Alternatives : ( ( 'one' ) | ( 'many' ) );
    public final void rule__MaxCardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:709:1: ( ( 'one' ) | ( 'many' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalErDsl.g:710:1: ( 'one' )
                    {
                    // InternalErDsl.g:710:1: ( 'one' )
                    // InternalErDsl.g:711:1: 'one'
                    {
                     before(grammarAccess.getMaxCardinalityAccess().getOneKeyword_0()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getMaxCardinalityAccess().getOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:718:6: ( 'many' )
                    {
                    // InternalErDsl.g:718:6: ( 'many' )
                    // InternalErDsl.g:719:1: 'many'
                    {
                     before(grammarAccess.getMaxCardinalityAccess().getManyKeyword_1()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getMaxCardinalityAccess().getManyKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxCardinality__Alternatives"


    // $ANTLR start "rule__PrimitiveDomain__Alternatives"
    // InternalErDsl.g:731:1: rule__PrimitiveDomain__Alternatives : ( ( 'integer' ) | ( 'string' ) | ( 'real' ) | ( 'boolean' ) | ( 'date' ) | ( 'time' ) );
    public final void rule__PrimitiveDomain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:735:1: ( ( 'integer' ) | ( 'string' ) | ( 'real' ) | ( 'boolean' ) | ( 'date' ) | ( 'time' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalErDsl.g:736:1: ( 'integer' )
                    {
                    // InternalErDsl.g:736:1: ( 'integer' )
                    // InternalErDsl.g:737:1: 'integer'
                    {
                     before(grammarAccess.getPrimitiveDomainAccess().getIntegerKeyword_0()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getPrimitiveDomainAccess().getIntegerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:744:6: ( 'string' )
                    {
                    // InternalErDsl.g:744:6: ( 'string' )
                    // InternalErDsl.g:745:1: 'string'
                    {
                     before(grammarAccess.getPrimitiveDomainAccess().getStringKeyword_1()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getPrimitiveDomainAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:752:6: ( 'real' )
                    {
                    // InternalErDsl.g:752:6: ( 'real' )
                    // InternalErDsl.g:753:1: 'real'
                    {
                     before(grammarAccess.getPrimitiveDomainAccess().getRealKeyword_2()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getPrimitiveDomainAccess().getRealKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:760:6: ( 'boolean' )
                    {
                    // InternalErDsl.g:760:6: ( 'boolean' )
                    // InternalErDsl.g:761:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveDomainAccess().getBooleanKeyword_3()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getPrimitiveDomainAccess().getBooleanKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl.g:768:6: ( 'date' )
                    {
                    // InternalErDsl.g:768:6: ( 'date' )
                    // InternalErDsl.g:769:1: 'date'
                    {
                     before(grammarAccess.getPrimitiveDomainAccess().getDateKeyword_4()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getPrimitiveDomainAccess().getDateKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl.g:776:6: ( 'time' )
                    {
                    // InternalErDsl.g:776:6: ( 'time' )
                    // InternalErDsl.g:777:1: 'time'
                    {
                     before(grammarAccess.getPrimitiveDomainAccess().getTimeKeyword_5()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getPrimitiveDomainAccess().getTimeKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveDomain__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalErDsl.g:789:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:793:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl.g:794:1: ( 'true' )
                    {
                    // InternalErDsl.g:794:1: ( 'true' )
                    // InternalErDsl.g:795:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:802:6: ( 'false' )
                    {
                    // InternalErDsl.g:802:6: ( 'false' )
                    // InternalErDsl.g:803:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__ERModel__Group__0"
    // InternalErDsl.g:817:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:821:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl.g:822:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ERModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__0"


    // $ANTLR start "rule__ERModel__Group__0__Impl"
    // InternalErDsl.g:829:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__NameAssignment_0 ) ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:833:1: ( ( ( rule__ERModel__NameAssignment_0 ) ) )
            // InternalErDsl.g:834:1: ( ( rule__ERModel__NameAssignment_0 ) )
            {
            // InternalErDsl.g:834:1: ( ( rule__ERModel__NameAssignment_0 ) )
            // InternalErDsl.g:835:1: ( rule__ERModel__NameAssignment_0 )
            {
             before(grammarAccess.getERModelAccess().getNameAssignment_0()); 
            // InternalErDsl.g:836:1: ( rule__ERModel__NameAssignment_0 )
            // InternalErDsl.g:836:2: rule__ERModel__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__0__Impl"


    // $ANTLR start "rule__ERModel__Group__1"
    // InternalErDsl.g:846:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:850:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl.g:851:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ERModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__1"


    // $ANTLR start "rule__ERModel__Group__1__Impl"
    // InternalErDsl.g:858:1: rule__ERModel__Group__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:862:1: ( ( '{' ) )
            // InternalErDsl.g:863:1: ( '{' )
            {
            // InternalErDsl.g:863:1: ( '{' )
            // InternalErDsl.g:864:1: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__1__Impl"


    // $ANTLR start "rule__ERModel__Group__2"
    // InternalErDsl.g:877:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:881:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl.g:882:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ERModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__2"


    // $ANTLR start "rule__ERModel__Group__2__Impl"
    // InternalErDsl.g:889:1: rule__ERModel__Group__2__Impl : ( ( rule__ERModel__Group_2__0 )? ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:893:1: ( ( ( rule__ERModel__Group_2__0 )? ) )
            // InternalErDsl.g:894:1: ( ( rule__ERModel__Group_2__0 )? )
            {
            // InternalErDsl.g:894:1: ( ( rule__ERModel__Group_2__0 )? )
            // InternalErDsl.g:895:1: ( rule__ERModel__Group_2__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_2()); 
            // InternalErDsl.g:896:1: ( rule__ERModel__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl.g:896:2: rule__ERModel__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ERModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__2__Impl"


    // $ANTLR start "rule__ERModel__Group__3"
    // InternalErDsl.g:906:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:910:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl.g:911:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ERModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__3"


    // $ANTLR start "rule__ERModel__Group__3__Impl"
    // InternalErDsl.g:918:1: rule__ERModel__Group__3__Impl : ( ( rule__ERModel__Group_3__0 )? ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:922:1: ( ( ( rule__ERModel__Group_3__0 )? ) )
            // InternalErDsl.g:923:1: ( ( rule__ERModel__Group_3__0 )? )
            {
            // InternalErDsl.g:923:1: ( ( rule__ERModel__Group_3__0 )? )
            // InternalErDsl.g:924:1: ( rule__ERModel__Group_3__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_3()); 
            // InternalErDsl.g:925:1: ( rule__ERModel__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDsl.g:925:2: rule__ERModel__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ERModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__3__Impl"


    // $ANTLR start "rule__ERModel__Group__4"
    // InternalErDsl.g:935:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:939:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl.g:940:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ERModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__4"


    // $ANTLR start "rule__ERModel__Group__4__Impl"
    // InternalErDsl.g:947:1: rule__ERModel__Group__4__Impl : ( ( rule__ERModel__Group_4__0 )? ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:951:1: ( ( ( rule__ERModel__Group_4__0 )? ) )
            // InternalErDsl.g:952:1: ( ( rule__ERModel__Group_4__0 )? )
            {
            // InternalErDsl.g:952:1: ( ( rule__ERModel__Group_4__0 )? )
            // InternalErDsl.g:953:1: ( rule__ERModel__Group_4__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_4()); 
            // InternalErDsl.g:954:1: ( rule__ERModel__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalErDsl.g:954:2: rule__ERModel__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ERModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__4__Impl"


    // $ANTLR start "rule__ERModel__Group__5"
    // InternalErDsl.g:964:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:968:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl.g:969:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__ERModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__5"


    // $ANTLR start "rule__ERModel__Group__5__Impl"
    // InternalErDsl.g:976:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__Group_5__0 )? ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:980:1: ( ( ( rule__ERModel__Group_5__0 )? ) )
            // InternalErDsl.g:981:1: ( ( rule__ERModel__Group_5__0 )? )
            {
            // InternalErDsl.g:981:1: ( ( rule__ERModel__Group_5__0 )? )
            // InternalErDsl.g:982:1: ( rule__ERModel__Group_5__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_5()); 
            // InternalErDsl.g:983:1: ( rule__ERModel__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalErDsl.g:983:2: rule__ERModel__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ERModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__5__Impl"


    // $ANTLR start "rule__ERModel__Group__6"
    // InternalErDsl.g:993:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:997:1: ( rule__ERModel__Group__6__Impl )
            // InternalErDsl.g:998:2: rule__ERModel__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__6"


    // $ANTLR start "rule__ERModel__Group__6__Impl"
    // InternalErDsl.g:1004:1: rule__ERModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1008:1: ( ( '}' ) )
            // InternalErDsl.g:1009:1: ( '}' )
            {
            // InternalErDsl.g:1009:1: ( '}' )
            // InternalErDsl.g:1010:1: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__6__Impl"


    // $ANTLR start "rule__ERModel__Group_2__0"
    // InternalErDsl.g:1037:1: rule__ERModel__Group_2__0 : rule__ERModel__Group_2__0__Impl rule__ERModel__Group_2__1 ;
    public final void rule__ERModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1041:1: ( rule__ERModel__Group_2__0__Impl rule__ERModel__Group_2__1 )
            // InternalErDsl.g:1042:2: rule__ERModel__Group_2__0__Impl rule__ERModel__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ERModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__0"


    // $ANTLR start "rule__ERModel__Group_2__0__Impl"
    // InternalErDsl.g:1049:1: rule__ERModel__Group_2__0__Impl : ( 'domains' ) ;
    public final void rule__ERModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1053:1: ( ( 'domains' ) )
            // InternalErDsl.g:1054:1: ( 'domains' )
            {
            // InternalErDsl.g:1054:1: ( 'domains' )
            // InternalErDsl.g:1055:1: 'domains'
            {
             before(grammarAccess.getERModelAccess().getDomainsKeyword_2_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getDomainsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__0__Impl"


    // $ANTLR start "rule__ERModel__Group_2__1"
    // InternalErDsl.g:1068:1: rule__ERModel__Group_2__1 : rule__ERModel__Group_2__1__Impl rule__ERModel__Group_2__2 ;
    public final void rule__ERModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1072:1: ( rule__ERModel__Group_2__1__Impl rule__ERModel__Group_2__2 )
            // InternalErDsl.g:1073:2: rule__ERModel__Group_2__1__Impl rule__ERModel__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ERModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__1"


    // $ANTLR start "rule__ERModel__Group_2__1__Impl"
    // InternalErDsl.g:1080:1: rule__ERModel__Group_2__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1084:1: ( ( '{' ) )
            // InternalErDsl.g:1085:1: ( '{' )
            {
            // InternalErDsl.g:1085:1: ( '{' )
            // InternalErDsl.g:1086:1: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__1__Impl"


    // $ANTLR start "rule__ERModel__Group_2__2"
    // InternalErDsl.g:1099:1: rule__ERModel__Group_2__2 : rule__ERModel__Group_2__2__Impl rule__ERModel__Group_2__3 ;
    public final void rule__ERModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1103:1: ( rule__ERModel__Group_2__2__Impl rule__ERModel__Group_2__3 )
            // InternalErDsl.g:1104:2: rule__ERModel__Group_2__2__Impl rule__ERModel__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__2"


    // $ANTLR start "rule__ERModel__Group_2__2__Impl"
    // InternalErDsl.g:1111:1: rule__ERModel__Group_2__2__Impl : ( ( rule__ERModel__DomainsAssignment_2_2 ) ) ;
    public final void rule__ERModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1115:1: ( ( ( rule__ERModel__DomainsAssignment_2_2 ) ) )
            // InternalErDsl.g:1116:1: ( ( rule__ERModel__DomainsAssignment_2_2 ) )
            {
            // InternalErDsl.g:1116:1: ( ( rule__ERModel__DomainsAssignment_2_2 ) )
            // InternalErDsl.g:1117:1: ( rule__ERModel__DomainsAssignment_2_2 )
            {
             before(grammarAccess.getERModelAccess().getDomainsAssignment_2_2()); 
            // InternalErDsl.g:1118:1: ( rule__ERModel__DomainsAssignment_2_2 )
            // InternalErDsl.g:1118:2: rule__ERModel__DomainsAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__DomainsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getDomainsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__2__Impl"


    // $ANTLR start "rule__ERModel__Group_2__3"
    // InternalErDsl.g:1128:1: rule__ERModel__Group_2__3 : rule__ERModel__Group_2__3__Impl rule__ERModel__Group_2__4 ;
    public final void rule__ERModel__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1132:1: ( rule__ERModel__Group_2__3__Impl rule__ERModel__Group_2__4 )
            // InternalErDsl.g:1133:2: rule__ERModel__Group_2__3__Impl rule__ERModel__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__3"


    // $ANTLR start "rule__ERModel__Group_2__3__Impl"
    // InternalErDsl.g:1140:1: rule__ERModel__Group_2__3__Impl : ( ( rule__ERModel__Group_2_3__0 )* ) ;
    public final void rule__ERModel__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1144:1: ( ( ( rule__ERModel__Group_2_3__0 )* ) )
            // InternalErDsl.g:1145:1: ( ( rule__ERModel__Group_2_3__0 )* )
            {
            // InternalErDsl.g:1145:1: ( ( rule__ERModel__Group_2_3__0 )* )
            // InternalErDsl.g:1146:1: ( rule__ERModel__Group_2_3__0 )*
            {
             before(grammarAccess.getERModelAccess().getGroup_2_3()); 
            // InternalErDsl.g:1147:1: ( rule__ERModel__Group_2_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErDsl.g:1147:2: rule__ERModel__Group_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__ERModel__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__3__Impl"


    // $ANTLR start "rule__ERModel__Group_2__4"
    // InternalErDsl.g:1157:1: rule__ERModel__Group_2__4 : rule__ERModel__Group_2__4__Impl ;
    public final void rule__ERModel__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1161:1: ( rule__ERModel__Group_2__4__Impl )
            // InternalErDsl.g:1162:2: rule__ERModel__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__4"


    // $ANTLR start "rule__ERModel__Group_2__4__Impl"
    // InternalErDsl.g:1168:1: rule__ERModel__Group_2__4__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1172:1: ( ( '}' ) )
            // InternalErDsl.g:1173:1: ( '}' )
            {
            // InternalErDsl.g:1173:1: ( '}' )
            // InternalErDsl.g:1174:1: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__4__Impl"


    // $ANTLR start "rule__ERModel__Group_2_3__0"
    // InternalErDsl.g:1197:1: rule__ERModel__Group_2_3__0 : rule__ERModel__Group_2_3__0__Impl rule__ERModel__Group_2_3__1 ;
    public final void rule__ERModel__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1201:1: ( rule__ERModel__Group_2_3__0__Impl rule__ERModel__Group_2_3__1 )
            // InternalErDsl.g:1202:2: rule__ERModel__Group_2_3__0__Impl rule__ERModel__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ERModel__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2_3__0"


    // $ANTLR start "rule__ERModel__Group_2_3__0__Impl"
    // InternalErDsl.g:1209:1: rule__ERModel__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__ERModel__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1213:1: ( ( ',' ) )
            // InternalErDsl.g:1214:1: ( ',' )
            {
            // InternalErDsl.g:1214:1: ( ',' )
            // InternalErDsl.g:1215:1: ','
            {
             before(grammarAccess.getERModelAccess().getCommaKeyword_2_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2_3__0__Impl"


    // $ANTLR start "rule__ERModel__Group_2_3__1"
    // InternalErDsl.g:1228:1: rule__ERModel__Group_2_3__1 : rule__ERModel__Group_2_3__1__Impl ;
    public final void rule__ERModel__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1232:1: ( rule__ERModel__Group_2_3__1__Impl )
            // InternalErDsl.g:1233:2: rule__ERModel__Group_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2_3__1"


    // $ANTLR start "rule__ERModel__Group_2_3__1__Impl"
    // InternalErDsl.g:1239:1: rule__ERModel__Group_2_3__1__Impl : ( ( rule__ERModel__DomainsAssignment_2_3_1 ) ) ;
    public final void rule__ERModel__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1243:1: ( ( ( rule__ERModel__DomainsAssignment_2_3_1 ) ) )
            // InternalErDsl.g:1244:1: ( ( rule__ERModel__DomainsAssignment_2_3_1 ) )
            {
            // InternalErDsl.g:1244:1: ( ( rule__ERModel__DomainsAssignment_2_3_1 ) )
            // InternalErDsl.g:1245:1: ( rule__ERModel__DomainsAssignment_2_3_1 )
            {
             before(grammarAccess.getERModelAccess().getDomainsAssignment_2_3_1()); 
            // InternalErDsl.g:1246:1: ( rule__ERModel__DomainsAssignment_2_3_1 )
            // InternalErDsl.g:1246:2: rule__ERModel__DomainsAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__DomainsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getDomainsAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2_3__1__Impl"


    // $ANTLR start "rule__ERModel__Group_3__0"
    // InternalErDsl.g:1260:1: rule__ERModel__Group_3__0 : rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 ;
    public final void rule__ERModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1264:1: ( rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 )
            // InternalErDsl.g:1265:2: rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ERModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__0"


    // $ANTLR start "rule__ERModel__Group_3__0__Impl"
    // InternalErDsl.g:1272:1: rule__ERModel__Group_3__0__Impl : ( 'entities' ) ;
    public final void rule__ERModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1276:1: ( ( 'entities' ) )
            // InternalErDsl.g:1277:1: ( 'entities' )
            {
            // InternalErDsl.g:1277:1: ( 'entities' )
            // InternalErDsl.g:1278:1: 'entities'
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getEntitiesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__0__Impl"


    // $ANTLR start "rule__ERModel__Group_3__1"
    // InternalErDsl.g:1291:1: rule__ERModel__Group_3__1 : rule__ERModel__Group_3__1__Impl rule__ERModel__Group_3__2 ;
    public final void rule__ERModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1295:1: ( rule__ERModel__Group_3__1__Impl rule__ERModel__Group_3__2 )
            // InternalErDsl.g:1296:2: rule__ERModel__Group_3__1__Impl rule__ERModel__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ERModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__1"


    // $ANTLR start "rule__ERModel__Group_3__1__Impl"
    // InternalErDsl.g:1303:1: rule__ERModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1307:1: ( ( '{' ) )
            // InternalErDsl.g:1308:1: ( '{' )
            {
            // InternalErDsl.g:1308:1: ( '{' )
            // InternalErDsl.g:1309:1: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__1__Impl"


    // $ANTLR start "rule__ERModel__Group_3__2"
    // InternalErDsl.g:1322:1: rule__ERModel__Group_3__2 : rule__ERModel__Group_3__2__Impl rule__ERModel__Group_3__3 ;
    public final void rule__ERModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1326:1: ( rule__ERModel__Group_3__2__Impl rule__ERModel__Group_3__3 )
            // InternalErDsl.g:1327:2: rule__ERModel__Group_3__2__Impl rule__ERModel__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__2"


    // $ANTLR start "rule__ERModel__Group_3__2__Impl"
    // InternalErDsl.g:1334:1: rule__ERModel__Group_3__2__Impl : ( ( rule__ERModel__EntitiesAssignment_3_2 ) ) ;
    public final void rule__ERModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1338:1: ( ( ( rule__ERModel__EntitiesAssignment_3_2 ) ) )
            // InternalErDsl.g:1339:1: ( ( rule__ERModel__EntitiesAssignment_3_2 ) )
            {
            // InternalErDsl.g:1339:1: ( ( rule__ERModel__EntitiesAssignment_3_2 ) )
            // InternalErDsl.g:1340:1: ( rule__ERModel__EntitiesAssignment_3_2 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3_2()); 
            // InternalErDsl.g:1341:1: ( rule__ERModel__EntitiesAssignment_3_2 )
            // InternalErDsl.g:1341:2: rule__ERModel__EntitiesAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__EntitiesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__2__Impl"


    // $ANTLR start "rule__ERModel__Group_3__3"
    // InternalErDsl.g:1351:1: rule__ERModel__Group_3__3 : rule__ERModel__Group_3__3__Impl rule__ERModel__Group_3__4 ;
    public final void rule__ERModel__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1355:1: ( rule__ERModel__Group_3__3__Impl rule__ERModel__Group_3__4 )
            // InternalErDsl.g:1356:2: rule__ERModel__Group_3__3__Impl rule__ERModel__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__3"


    // $ANTLR start "rule__ERModel__Group_3__3__Impl"
    // InternalErDsl.g:1363:1: rule__ERModel__Group_3__3__Impl : ( ( rule__ERModel__Group_3_3__0 )* ) ;
    public final void rule__ERModel__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1367:1: ( ( ( rule__ERModel__Group_3_3__0 )* ) )
            // InternalErDsl.g:1368:1: ( ( rule__ERModel__Group_3_3__0 )* )
            {
            // InternalErDsl.g:1368:1: ( ( rule__ERModel__Group_3_3__0 )* )
            // InternalErDsl.g:1369:1: ( rule__ERModel__Group_3_3__0 )*
            {
             before(grammarAccess.getERModelAccess().getGroup_3_3()); 
            // InternalErDsl.g:1370:1: ( rule__ERModel__Group_3_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalErDsl.g:1370:2: rule__ERModel__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__ERModel__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__3__Impl"


    // $ANTLR start "rule__ERModel__Group_3__4"
    // InternalErDsl.g:1380:1: rule__ERModel__Group_3__4 : rule__ERModel__Group_3__4__Impl ;
    public final void rule__ERModel__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1384:1: ( rule__ERModel__Group_3__4__Impl )
            // InternalErDsl.g:1385:2: rule__ERModel__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__4"


    // $ANTLR start "rule__ERModel__Group_3__4__Impl"
    // InternalErDsl.g:1391:1: rule__ERModel__Group_3__4__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1395:1: ( ( '}' ) )
            // InternalErDsl.g:1396:1: ( '}' )
            {
            // InternalErDsl.g:1396:1: ( '}' )
            // InternalErDsl.g:1397:1: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__4__Impl"


    // $ANTLR start "rule__ERModel__Group_3_3__0"
    // InternalErDsl.g:1420:1: rule__ERModel__Group_3_3__0 : rule__ERModel__Group_3_3__0__Impl rule__ERModel__Group_3_3__1 ;
    public final void rule__ERModel__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1424:1: ( rule__ERModel__Group_3_3__0__Impl rule__ERModel__Group_3_3__1 )
            // InternalErDsl.g:1425:2: rule__ERModel__Group_3_3__0__Impl rule__ERModel__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ERModel__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3_3__0"


    // $ANTLR start "rule__ERModel__Group_3_3__0__Impl"
    // InternalErDsl.g:1432:1: rule__ERModel__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ERModel__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1436:1: ( ( ',' ) )
            // InternalErDsl.g:1437:1: ( ',' )
            {
            // InternalErDsl.g:1437:1: ( ',' )
            // InternalErDsl.g:1438:1: ','
            {
             before(grammarAccess.getERModelAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3_3__0__Impl"


    // $ANTLR start "rule__ERModel__Group_3_3__1"
    // InternalErDsl.g:1451:1: rule__ERModel__Group_3_3__1 : rule__ERModel__Group_3_3__1__Impl ;
    public final void rule__ERModel__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1455:1: ( rule__ERModel__Group_3_3__1__Impl )
            // InternalErDsl.g:1456:2: rule__ERModel__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3_3__1"


    // $ANTLR start "rule__ERModel__Group_3_3__1__Impl"
    // InternalErDsl.g:1462:1: rule__ERModel__Group_3_3__1__Impl : ( ( rule__ERModel__EntitiesAssignment_3_3_1 ) ) ;
    public final void rule__ERModel__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1466:1: ( ( ( rule__ERModel__EntitiesAssignment_3_3_1 ) ) )
            // InternalErDsl.g:1467:1: ( ( rule__ERModel__EntitiesAssignment_3_3_1 ) )
            {
            // InternalErDsl.g:1467:1: ( ( rule__ERModel__EntitiesAssignment_3_3_1 ) )
            // InternalErDsl.g:1468:1: ( rule__ERModel__EntitiesAssignment_3_3_1 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3_3_1()); 
            // InternalErDsl.g:1469:1: ( rule__ERModel__EntitiesAssignment_3_3_1 )
            // InternalErDsl.g:1469:2: rule__ERModel__EntitiesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__EntitiesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3_3__1__Impl"


    // $ANTLR start "rule__ERModel__Group_4__0"
    // InternalErDsl.g:1483:1: rule__ERModel__Group_4__0 : rule__ERModel__Group_4__0__Impl rule__ERModel__Group_4__1 ;
    public final void rule__ERModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1487:1: ( rule__ERModel__Group_4__0__Impl rule__ERModel__Group_4__1 )
            // InternalErDsl.g:1488:2: rule__ERModel__Group_4__0__Impl rule__ERModel__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ERModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__0"


    // $ANTLR start "rule__ERModel__Group_4__0__Impl"
    // InternalErDsl.g:1495:1: rule__ERModel__Group_4__0__Impl : ( 'gerunds' ) ;
    public final void rule__ERModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1499:1: ( ( 'gerunds' ) )
            // InternalErDsl.g:1500:1: ( 'gerunds' )
            {
            // InternalErDsl.g:1500:1: ( 'gerunds' )
            // InternalErDsl.g:1501:1: 'gerunds'
            {
             before(grammarAccess.getERModelAccess().getGerundsKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getGerundsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__0__Impl"


    // $ANTLR start "rule__ERModel__Group_4__1"
    // InternalErDsl.g:1514:1: rule__ERModel__Group_4__1 : rule__ERModel__Group_4__1__Impl rule__ERModel__Group_4__2 ;
    public final void rule__ERModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1518:1: ( rule__ERModel__Group_4__1__Impl rule__ERModel__Group_4__2 )
            // InternalErDsl.g:1519:2: rule__ERModel__Group_4__1__Impl rule__ERModel__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ERModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__1"


    // $ANTLR start "rule__ERModel__Group_4__1__Impl"
    // InternalErDsl.g:1526:1: rule__ERModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1530:1: ( ( '{' ) )
            // InternalErDsl.g:1531:1: ( '{' )
            {
            // InternalErDsl.g:1531:1: ( '{' )
            // InternalErDsl.g:1532:1: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__1__Impl"


    // $ANTLR start "rule__ERModel__Group_4__2"
    // InternalErDsl.g:1545:1: rule__ERModel__Group_4__2 : rule__ERModel__Group_4__2__Impl rule__ERModel__Group_4__3 ;
    public final void rule__ERModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1549:1: ( rule__ERModel__Group_4__2__Impl rule__ERModel__Group_4__3 )
            // InternalErDsl.g:1550:2: rule__ERModel__Group_4__2__Impl rule__ERModel__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__2"


    // $ANTLR start "rule__ERModel__Group_4__2__Impl"
    // InternalErDsl.g:1557:1: rule__ERModel__Group_4__2__Impl : ( ( rule__ERModel__GerundsAssignment_4_2 ) ) ;
    public final void rule__ERModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1561:1: ( ( ( rule__ERModel__GerundsAssignment_4_2 ) ) )
            // InternalErDsl.g:1562:1: ( ( rule__ERModel__GerundsAssignment_4_2 ) )
            {
            // InternalErDsl.g:1562:1: ( ( rule__ERModel__GerundsAssignment_4_2 ) )
            // InternalErDsl.g:1563:1: ( rule__ERModel__GerundsAssignment_4_2 )
            {
             before(grammarAccess.getERModelAccess().getGerundsAssignment_4_2()); 
            // InternalErDsl.g:1564:1: ( rule__ERModel__GerundsAssignment_4_2 )
            // InternalErDsl.g:1564:2: rule__ERModel__GerundsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__GerundsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGerundsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__2__Impl"


    // $ANTLR start "rule__ERModel__Group_4__3"
    // InternalErDsl.g:1574:1: rule__ERModel__Group_4__3 : rule__ERModel__Group_4__3__Impl rule__ERModel__Group_4__4 ;
    public final void rule__ERModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1578:1: ( rule__ERModel__Group_4__3__Impl rule__ERModel__Group_4__4 )
            // InternalErDsl.g:1579:2: rule__ERModel__Group_4__3__Impl rule__ERModel__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__3"


    // $ANTLR start "rule__ERModel__Group_4__3__Impl"
    // InternalErDsl.g:1586:1: rule__ERModel__Group_4__3__Impl : ( ( rule__ERModel__Group_4_3__0 )* ) ;
    public final void rule__ERModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1590:1: ( ( ( rule__ERModel__Group_4_3__0 )* ) )
            // InternalErDsl.g:1591:1: ( ( rule__ERModel__Group_4_3__0 )* )
            {
            // InternalErDsl.g:1591:1: ( ( rule__ERModel__Group_4_3__0 )* )
            // InternalErDsl.g:1592:1: ( rule__ERModel__Group_4_3__0 )*
            {
             before(grammarAccess.getERModelAccess().getGroup_4_3()); 
            // InternalErDsl.g:1593:1: ( rule__ERModel__Group_4_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalErDsl.g:1593:2: rule__ERModel__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__ERModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__3__Impl"


    // $ANTLR start "rule__ERModel__Group_4__4"
    // InternalErDsl.g:1603:1: rule__ERModel__Group_4__4 : rule__ERModel__Group_4__4__Impl ;
    public final void rule__ERModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1607:1: ( rule__ERModel__Group_4__4__Impl )
            // InternalErDsl.g:1608:2: rule__ERModel__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__4"


    // $ANTLR start "rule__ERModel__Group_4__4__Impl"
    // InternalErDsl.g:1614:1: rule__ERModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1618:1: ( ( '}' ) )
            // InternalErDsl.g:1619:1: ( '}' )
            {
            // InternalErDsl.g:1619:1: ( '}' )
            // InternalErDsl.g:1620:1: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__4__Impl"


    // $ANTLR start "rule__ERModel__Group_4_3__0"
    // InternalErDsl.g:1643:1: rule__ERModel__Group_4_3__0 : rule__ERModel__Group_4_3__0__Impl rule__ERModel__Group_4_3__1 ;
    public final void rule__ERModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1647:1: ( rule__ERModel__Group_4_3__0__Impl rule__ERModel__Group_4_3__1 )
            // InternalErDsl.g:1648:2: rule__ERModel__Group_4_3__0__Impl rule__ERModel__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ERModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4_3__0"


    // $ANTLR start "rule__ERModel__Group_4_3__0__Impl"
    // InternalErDsl.g:1655:1: rule__ERModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ERModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1659:1: ( ( ',' ) )
            // InternalErDsl.g:1660:1: ( ',' )
            {
            // InternalErDsl.g:1660:1: ( ',' )
            // InternalErDsl.g:1661:1: ','
            {
             before(grammarAccess.getERModelAccess().getCommaKeyword_4_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__ERModel__Group_4_3__1"
    // InternalErDsl.g:1674:1: rule__ERModel__Group_4_3__1 : rule__ERModel__Group_4_3__1__Impl ;
    public final void rule__ERModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1678:1: ( rule__ERModel__Group_4_3__1__Impl )
            // InternalErDsl.g:1679:2: rule__ERModel__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4_3__1"


    // $ANTLR start "rule__ERModel__Group_4_3__1__Impl"
    // InternalErDsl.g:1685:1: rule__ERModel__Group_4_3__1__Impl : ( ( rule__ERModel__GerundsAssignment_4_3_1 ) ) ;
    public final void rule__ERModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1689:1: ( ( ( rule__ERModel__GerundsAssignment_4_3_1 ) ) )
            // InternalErDsl.g:1690:1: ( ( rule__ERModel__GerundsAssignment_4_3_1 ) )
            {
            // InternalErDsl.g:1690:1: ( ( rule__ERModel__GerundsAssignment_4_3_1 ) )
            // InternalErDsl.g:1691:1: ( rule__ERModel__GerundsAssignment_4_3_1 )
            {
             before(grammarAccess.getERModelAccess().getGerundsAssignment_4_3_1()); 
            // InternalErDsl.g:1692:1: ( rule__ERModel__GerundsAssignment_4_3_1 )
            // InternalErDsl.g:1692:2: rule__ERModel__GerundsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__GerundsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGerundsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__ERModel__Group_5__0"
    // InternalErDsl.g:1706:1: rule__ERModel__Group_5__0 : rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 ;
    public final void rule__ERModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1710:1: ( rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 )
            // InternalErDsl.g:1711:2: rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ERModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__0"


    // $ANTLR start "rule__ERModel__Group_5__0__Impl"
    // InternalErDsl.g:1718:1: rule__ERModel__Group_5__0__Impl : ( 'relationships' ) ;
    public final void rule__ERModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1722:1: ( ( 'relationships' ) )
            // InternalErDsl.g:1723:1: ( 'relationships' )
            {
            // InternalErDsl.g:1723:1: ( 'relationships' )
            // InternalErDsl.g:1724:1: 'relationships'
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRelationshipsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__0__Impl"


    // $ANTLR start "rule__ERModel__Group_5__1"
    // InternalErDsl.g:1737:1: rule__ERModel__Group_5__1 : rule__ERModel__Group_5__1__Impl rule__ERModel__Group_5__2 ;
    public final void rule__ERModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1741:1: ( rule__ERModel__Group_5__1__Impl rule__ERModel__Group_5__2 )
            // InternalErDsl.g:1742:2: rule__ERModel__Group_5__1__Impl rule__ERModel__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ERModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__1"


    // $ANTLR start "rule__ERModel__Group_5__1__Impl"
    // InternalErDsl.g:1749:1: rule__ERModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1753:1: ( ( '{' ) )
            // InternalErDsl.g:1754:1: ( '{' )
            {
            // InternalErDsl.g:1754:1: ( '{' )
            // InternalErDsl.g:1755:1: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__1__Impl"


    // $ANTLR start "rule__ERModel__Group_5__2"
    // InternalErDsl.g:1768:1: rule__ERModel__Group_5__2 : rule__ERModel__Group_5__2__Impl rule__ERModel__Group_5__3 ;
    public final void rule__ERModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1772:1: ( rule__ERModel__Group_5__2__Impl rule__ERModel__Group_5__3 )
            // InternalErDsl.g:1773:2: rule__ERModel__Group_5__2__Impl rule__ERModel__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__2"


    // $ANTLR start "rule__ERModel__Group_5__2__Impl"
    // InternalErDsl.g:1780:1: rule__ERModel__Group_5__2__Impl : ( ( rule__ERModel__RelationshipsAssignment_5_2 ) ) ;
    public final void rule__ERModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1784:1: ( ( ( rule__ERModel__RelationshipsAssignment_5_2 ) ) )
            // InternalErDsl.g:1785:1: ( ( rule__ERModel__RelationshipsAssignment_5_2 ) )
            {
            // InternalErDsl.g:1785:1: ( ( rule__ERModel__RelationshipsAssignment_5_2 ) )
            // InternalErDsl.g:1786:1: ( rule__ERModel__RelationshipsAssignment_5_2 )
            {
             before(grammarAccess.getERModelAccess().getRelationshipsAssignment_5_2()); 
            // InternalErDsl.g:1787:1: ( rule__ERModel__RelationshipsAssignment_5_2 )
            // InternalErDsl.g:1787:2: rule__ERModel__RelationshipsAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__RelationshipsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getRelationshipsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__2__Impl"


    // $ANTLR start "rule__ERModel__Group_5__3"
    // InternalErDsl.g:1797:1: rule__ERModel__Group_5__3 : rule__ERModel__Group_5__3__Impl rule__ERModel__Group_5__4 ;
    public final void rule__ERModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1801:1: ( rule__ERModel__Group_5__3__Impl rule__ERModel__Group_5__4 )
            // InternalErDsl.g:1802:2: rule__ERModel__Group_5__3__Impl rule__ERModel__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ERModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__3"


    // $ANTLR start "rule__ERModel__Group_5__3__Impl"
    // InternalErDsl.g:1809:1: rule__ERModel__Group_5__3__Impl : ( ( rule__ERModel__Group_5_3__0 )* ) ;
    public final void rule__ERModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1813:1: ( ( ( rule__ERModel__Group_5_3__0 )* ) )
            // InternalErDsl.g:1814:1: ( ( rule__ERModel__Group_5_3__0 )* )
            {
            // InternalErDsl.g:1814:1: ( ( rule__ERModel__Group_5_3__0 )* )
            // InternalErDsl.g:1815:1: ( rule__ERModel__Group_5_3__0 )*
            {
             before(grammarAccess.getERModelAccess().getGroup_5_3()); 
            // InternalErDsl.g:1816:1: ( rule__ERModel__Group_5_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalErDsl.g:1816:2: rule__ERModel__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__ERModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__3__Impl"


    // $ANTLR start "rule__ERModel__Group_5__4"
    // InternalErDsl.g:1826:1: rule__ERModel__Group_5__4 : rule__ERModel__Group_5__4__Impl ;
    public final void rule__ERModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1830:1: ( rule__ERModel__Group_5__4__Impl )
            // InternalErDsl.g:1831:2: rule__ERModel__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__4"


    // $ANTLR start "rule__ERModel__Group_5__4__Impl"
    // InternalErDsl.g:1837:1: rule__ERModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1841:1: ( ( '}' ) )
            // InternalErDsl.g:1842:1: ( '}' )
            {
            // InternalErDsl.g:1842:1: ( '}' )
            // InternalErDsl.g:1843:1: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__4__Impl"


    // $ANTLR start "rule__ERModel__Group_5_3__0"
    // InternalErDsl.g:1866:1: rule__ERModel__Group_5_3__0 : rule__ERModel__Group_5_3__0__Impl rule__ERModel__Group_5_3__1 ;
    public final void rule__ERModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1870:1: ( rule__ERModel__Group_5_3__0__Impl rule__ERModel__Group_5_3__1 )
            // InternalErDsl.g:1871:2: rule__ERModel__Group_5_3__0__Impl rule__ERModel__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ERModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5_3__0"


    // $ANTLR start "rule__ERModel__Group_5_3__0__Impl"
    // InternalErDsl.g:1878:1: rule__ERModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ERModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1882:1: ( ( ',' ) )
            // InternalErDsl.g:1883:1: ( ',' )
            {
            // InternalErDsl.g:1883:1: ( ',' )
            // InternalErDsl.g:1884:1: ','
            {
             before(grammarAccess.getERModelAccess().getCommaKeyword_5_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__ERModel__Group_5_3__1"
    // InternalErDsl.g:1897:1: rule__ERModel__Group_5_3__1 : rule__ERModel__Group_5_3__1__Impl ;
    public final void rule__ERModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1901:1: ( rule__ERModel__Group_5_3__1__Impl )
            // InternalErDsl.g:1902:2: rule__ERModel__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5_3__1"


    // $ANTLR start "rule__ERModel__Group_5_3__1__Impl"
    // InternalErDsl.g:1908:1: rule__ERModel__Group_5_3__1__Impl : ( ( rule__ERModel__RelationshipsAssignment_5_3_1 ) ) ;
    public final void rule__ERModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1912:1: ( ( ( rule__ERModel__RelationshipsAssignment_5_3_1 ) ) )
            // InternalErDsl.g:1913:1: ( ( rule__ERModel__RelationshipsAssignment_5_3_1 ) )
            {
            // InternalErDsl.g:1913:1: ( ( rule__ERModel__RelationshipsAssignment_5_3_1 ) )
            // InternalErDsl.g:1914:1: ( rule__ERModel__RelationshipsAssignment_5_3_1 )
            {
             before(grammarAccess.getERModelAccess().getRelationshipsAssignment_5_3_1()); 
            // InternalErDsl.g:1915:1: ( rule__ERModel__RelationshipsAssignment_5_3_1 )
            // InternalErDsl.g:1915:2: rule__ERModel__RelationshipsAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ERModel__RelationshipsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getRelationshipsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalErDsl.g:1929:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1933:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl.g:1934:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalErDsl.g:1941:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1945:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl.g:1946:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl.g:1946:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl.g:1947:1: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1948:1: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl.g:1948:2: rule__Entity__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalErDsl.g:1958:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1962:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl.g:1963:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalErDsl.g:1970:1: rule__Entity__Group__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1974:1: ( ( '{' ) )
            // InternalErDsl.g:1975:1: ( '{' )
            {
            // InternalErDsl.g:1975:1: ( '{' )
            // InternalErDsl.g:1976:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalErDsl.g:1989:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:1993:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalErDsl.g:1994:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalErDsl.g:2001:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2005:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl.g:2006:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl.g:2006:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl.g:2007:1: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl.g:2008:1: ( rule__Entity__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalErDsl.g:2008:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalErDsl.g:2018:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2022:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalErDsl.g:2023:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalErDsl.g:2030:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2034:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalErDsl.g:2035:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalErDsl.g:2035:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalErDsl.g:2036:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalErDsl.g:2037:1: ( rule__Entity__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalErDsl.g:2037:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalErDsl.g:2047:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2051:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalErDsl.g:2052:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalErDsl.g:2059:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2063:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalErDsl.g:2064:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalErDsl.g:2064:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalErDsl.g:2065:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalErDsl.g:2066:1: ( rule__Entity__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalErDsl.g:2066:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalErDsl.g:2076:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2080:1: ( rule__Entity__Group__5__Impl )
            // InternalErDsl.g:2081:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalErDsl.g:2087:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2091:1: ( ( '}' ) )
            // InternalErDsl.g:2092:1: ( '}' )
            {
            // InternalErDsl.g:2092:1: ( '}' )
            // InternalErDsl.g:2093:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalErDsl.g:2118:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2122:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl.g:2123:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalErDsl.g:2130:1: rule__Entity__Group_2__0__Impl : ( 'attributeSet' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2134:1: ( ( 'attributeSet' ) )
            // InternalErDsl.g:2135:1: ( 'attributeSet' )
            {
            // InternalErDsl.g:2135:1: ( 'attributeSet' )
            // InternalErDsl.g:2136:1: 'attributeSet'
            {
             before(grammarAccess.getEntityAccess().getAttributeSetKeyword_2_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getAttributeSetKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalErDsl.g:2149:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2153:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl.g:2154:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalErDsl.g:2161:1: rule__Entity__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2165:1: ( ( '{' ) )
            // InternalErDsl.g:2166:1: ( '{' )
            {
            // InternalErDsl.g:2166:1: ( '{' )
            // InternalErDsl.g:2167:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__2"
    // InternalErDsl.g:2180:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2184:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl.g:2185:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Entity__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // InternalErDsl.g:2192:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__EntityAttributesAssignment_2_2 ) ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2196:1: ( ( ( rule__Entity__EntityAttributesAssignment_2_2 ) ) )
            // InternalErDsl.g:2197:1: ( ( rule__Entity__EntityAttributesAssignment_2_2 ) )
            {
            // InternalErDsl.g:2197:1: ( ( rule__Entity__EntityAttributesAssignment_2_2 ) )
            // InternalErDsl.g:2198:1: ( rule__Entity__EntityAttributesAssignment_2_2 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_2_2()); 
            // InternalErDsl.g:2199:1: ( rule__Entity__EntityAttributesAssignment_2_2 )
            // InternalErDsl.g:2199:2: rule__Entity__EntityAttributesAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__EntityAttributesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEntityAttributesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Entity__Group_2__3"
    // InternalErDsl.g:2209:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2213:1: ( rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4 )
            // InternalErDsl.g:2214:2: rule__Entity__Group_2__3__Impl rule__Entity__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Entity__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__3"


    // $ANTLR start "rule__Entity__Group_2__3__Impl"
    // InternalErDsl.g:2221:1: rule__Entity__Group_2__3__Impl : ( ( rule__Entity__Group_2_3__0 )* ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2225:1: ( ( ( rule__Entity__Group_2_3__0 )* ) )
            // InternalErDsl.g:2226:1: ( ( rule__Entity__Group_2_3__0 )* )
            {
            // InternalErDsl.g:2226:1: ( ( rule__Entity__Group_2_3__0 )* )
            // InternalErDsl.g:2227:1: ( rule__Entity__Group_2_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_3()); 
            // InternalErDsl.g:2228:1: ( rule__Entity__Group_2_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalErDsl.g:2228:2: rule__Entity__Group_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Entity__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__3__Impl"


    // $ANTLR start "rule__Entity__Group_2__4"
    // InternalErDsl.g:2238:1: rule__Entity__Group_2__4 : rule__Entity__Group_2__4__Impl ;
    public final void rule__Entity__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2242:1: ( rule__Entity__Group_2__4__Impl )
            // InternalErDsl.g:2243:2: rule__Entity__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__4"


    // $ANTLR start "rule__Entity__Group_2__4__Impl"
    // InternalErDsl.g:2249:1: rule__Entity__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2253:1: ( ( '}' ) )
            // InternalErDsl.g:2254:1: ( '}' )
            {
            // InternalErDsl.g:2254:1: ( '}' )
            // InternalErDsl.g:2255:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__4__Impl"


    // $ANTLR start "rule__Entity__Group_2_3__0"
    // InternalErDsl.g:2278:1: rule__Entity__Group_2_3__0 : rule__Entity__Group_2_3__0__Impl rule__Entity__Group_2_3__1 ;
    public final void rule__Entity__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2282:1: ( rule__Entity__Group_2_3__0__Impl rule__Entity__Group_2_3__1 )
            // InternalErDsl.g:2283:2: rule__Entity__Group_2_3__0__Impl rule__Entity__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Entity__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_3__0"


    // $ANTLR start "rule__Entity__Group_2_3__0__Impl"
    // InternalErDsl.g:2290:1: rule__Entity__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2294:1: ( ( ',' ) )
            // InternalErDsl.g:2295:1: ( ',' )
            {
            // InternalErDsl.g:2295:1: ( ',' )
            // InternalErDsl.g:2296:1: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_2_3__1"
    // InternalErDsl.g:2309:1: rule__Entity__Group_2_3__1 : rule__Entity__Group_2_3__1__Impl ;
    public final void rule__Entity__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2313:1: ( rule__Entity__Group_2_3__1__Impl )
            // InternalErDsl.g:2314:2: rule__Entity__Group_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_3__1"


    // $ANTLR start "rule__Entity__Group_2_3__1__Impl"
    // InternalErDsl.g:2320:1: rule__Entity__Group_2_3__1__Impl : ( ( rule__Entity__EntityAttributesAssignment_2_3_1 ) ) ;
    public final void rule__Entity__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2324:1: ( ( ( rule__Entity__EntityAttributesAssignment_2_3_1 ) ) )
            // InternalErDsl.g:2325:1: ( ( rule__Entity__EntityAttributesAssignment_2_3_1 ) )
            {
            // InternalErDsl.g:2325:1: ( ( rule__Entity__EntityAttributesAssignment_2_3_1 ) )
            // InternalErDsl.g:2326:1: ( rule__Entity__EntityAttributesAssignment_2_3_1 )
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAssignment_2_3_1()); 
            // InternalErDsl.g:2327:1: ( rule__Entity__EntityAttributesAssignment_2_3_1 )
            // InternalErDsl.g:2327:2: rule__Entity__EntityAttributesAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__EntityAttributesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEntityAttributesAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalErDsl.g:2341:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2345:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalErDsl.g:2346:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalErDsl.g:2353:1: rule__Entity__Group_3__0__Impl : ( 'keySet' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2357:1: ( ( 'keySet' ) )
            // InternalErDsl.g:2358:1: ( 'keySet' )
            {
            // InternalErDsl.g:2358:1: ( 'keySet' )
            // InternalErDsl.g:2359:1: 'keySet'
            {
             before(grammarAccess.getEntityAccess().getKeySetKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getKeySetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalErDsl.g:2372:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2376:1: ( rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2 )
            // InternalErDsl.g:2377:2: rule__Entity__Group_3__1__Impl rule__Entity__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalErDsl.g:2384:1: rule__Entity__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2388:1: ( ( '{' ) )
            // InternalErDsl.g:2389:1: ( '{' )
            {
            // InternalErDsl.g:2389:1: ( '{' )
            // InternalErDsl.g:2390:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_3__2"
    // InternalErDsl.g:2403:1: rule__Entity__Group_3__2 : rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 ;
    public final void rule__Entity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2407:1: ( rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3 )
            // InternalErDsl.g:2408:2: rule__Entity__Group_3__2__Impl rule__Entity__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Entity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2"


    // $ANTLR start "rule__Entity__Group_3__2__Impl"
    // InternalErDsl.g:2415:1: rule__Entity__Group_3__2__Impl : ( ( rule__Entity__KeySetAssignment_3_2 ) ) ;
    public final void rule__Entity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2419:1: ( ( ( rule__Entity__KeySetAssignment_3_2 ) ) )
            // InternalErDsl.g:2420:1: ( ( rule__Entity__KeySetAssignment_3_2 ) )
            {
            // InternalErDsl.g:2420:1: ( ( rule__Entity__KeySetAssignment_3_2 ) )
            // InternalErDsl.g:2421:1: ( rule__Entity__KeySetAssignment_3_2 )
            {
             before(grammarAccess.getEntityAccess().getKeySetAssignment_3_2()); 
            // InternalErDsl.g:2422:1: ( rule__Entity__KeySetAssignment_3_2 )
            // InternalErDsl.g:2422:2: rule__Entity__KeySetAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__KeySetAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getKeySetAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__2__Impl"


    // $ANTLR start "rule__Entity__Group_3__3"
    // InternalErDsl.g:2432:1: rule__Entity__Group_3__3 : rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 ;
    public final void rule__Entity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2436:1: ( rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4 )
            // InternalErDsl.g:2437:2: rule__Entity__Group_3__3__Impl rule__Entity__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Entity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__3"


    // $ANTLR start "rule__Entity__Group_3__3__Impl"
    // InternalErDsl.g:2444:1: rule__Entity__Group_3__3__Impl : ( ( rule__Entity__Group_3_3__0 )* ) ;
    public final void rule__Entity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2448:1: ( ( ( rule__Entity__Group_3_3__0 )* ) )
            // InternalErDsl.g:2449:1: ( ( rule__Entity__Group_3_3__0 )* )
            {
            // InternalErDsl.g:2449:1: ( ( rule__Entity__Group_3_3__0 )* )
            // InternalErDsl.g:2450:1: ( rule__Entity__Group_3_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_3_3()); 
            // InternalErDsl.g:2451:1: ( rule__Entity__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalErDsl.g:2451:2: rule__Entity__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Entity__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__3__Impl"


    // $ANTLR start "rule__Entity__Group_3__4"
    // InternalErDsl.g:2461:1: rule__Entity__Group_3__4 : rule__Entity__Group_3__4__Impl ;
    public final void rule__Entity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2465:1: ( rule__Entity__Group_3__4__Impl )
            // InternalErDsl.g:2466:2: rule__Entity__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__4"


    // $ANTLR start "rule__Entity__Group_3__4__Impl"
    // InternalErDsl.g:2472:1: rule__Entity__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2476:1: ( ( '}' ) )
            // InternalErDsl.g:2477:1: ( '}' )
            {
            // InternalErDsl.g:2477:1: ( '}' )
            // InternalErDsl.g:2478:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__4__Impl"


    // $ANTLR start "rule__Entity__Group_3_3__0"
    // InternalErDsl.g:2501:1: rule__Entity__Group_3_3__0 : rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1 ;
    public final void rule__Entity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2505:1: ( rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1 )
            // InternalErDsl.g:2506:2: rule__Entity__Group_3_3__0__Impl rule__Entity__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Entity__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_3__0"


    // $ANTLR start "rule__Entity__Group_3_3__0__Impl"
    // InternalErDsl.g:2513:1: rule__Entity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2517:1: ( ( ',' ) )
            // InternalErDsl.g:2518:1: ( ',' )
            {
            // InternalErDsl.g:2518:1: ( ',' )
            // InternalErDsl.g:2519:1: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_3_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3_3__1"
    // InternalErDsl.g:2532:1: rule__Entity__Group_3_3__1 : rule__Entity__Group_3_3__1__Impl ;
    public final void rule__Entity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2536:1: ( rule__Entity__Group_3_3__1__Impl )
            // InternalErDsl.g:2537:2: rule__Entity__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_3__1"


    // $ANTLR start "rule__Entity__Group_3_3__1__Impl"
    // InternalErDsl.g:2543:1: rule__Entity__Group_3_3__1__Impl : ( ( rule__Entity__KeySetAssignment_3_3_1 ) ) ;
    public final void rule__Entity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2547:1: ( ( ( rule__Entity__KeySetAssignment_3_3_1 ) ) )
            // InternalErDsl.g:2548:1: ( ( rule__Entity__KeySetAssignment_3_3_1 ) )
            {
            // InternalErDsl.g:2548:1: ( ( rule__Entity__KeySetAssignment_3_3_1 ) )
            // InternalErDsl.g:2549:1: ( rule__Entity__KeySetAssignment_3_3_1 )
            {
             before(grammarAccess.getEntityAccess().getKeySetAssignment_3_3_1()); 
            // InternalErDsl.g:2550:1: ( rule__Entity__KeySetAssignment_3_3_1 )
            // InternalErDsl.g:2550:2: rule__Entity__KeySetAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__KeySetAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getKeySetAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalErDsl.g:2564:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2568:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalErDsl.g:2569:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalErDsl.g:2576:1: rule__Entity__Group_4__0__Impl : ( 'primaryKey' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2580:1: ( ( 'primaryKey' ) )
            // InternalErDsl.g:2581:1: ( 'primaryKey' )
            {
            // InternalErDsl.g:2581:1: ( 'primaryKey' )
            // InternalErDsl.g:2582:1: 'primaryKey'
            {
             before(grammarAccess.getEntityAccess().getPrimaryKeyKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getPrimaryKeyKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalErDsl.g:2595:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2599:1: ( rule__Entity__Group_4__1__Impl )
            // InternalErDsl.g:2600:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalErDsl.g:2606:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__PrimaryKeyAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2610:1: ( ( ( rule__Entity__PrimaryKeyAssignment_4_1 ) ) )
            // InternalErDsl.g:2611:1: ( ( rule__Entity__PrimaryKeyAssignment_4_1 ) )
            {
            // InternalErDsl.g:2611:1: ( ( rule__Entity__PrimaryKeyAssignment_4_1 ) )
            // InternalErDsl.g:2612:1: ( rule__Entity__PrimaryKeyAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getPrimaryKeyAssignment_4_1()); 
            // InternalErDsl.g:2613:1: ( rule__Entity__PrimaryKeyAssignment_4_1 )
            // InternalErDsl.g:2613:2: rule__Entity__PrimaryKeyAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entity__PrimaryKeyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getPrimaryKeyAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalErDsl.g:2627:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2631:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl.g:2632:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalErDsl.g:2639:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2643:1: ( ( () ) )
            // InternalErDsl.g:2644:1: ( () )
            {
            // InternalErDsl.g:2644:1: ( () )
            // InternalErDsl.g:2645:1: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalErDsl.g:2646:1: ()
            // InternalErDsl.g:2648:1: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalErDsl.g:2658:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2662:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDsl.g:2663:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalErDsl.g:2670:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2674:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalErDsl.g:2675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalErDsl.g:2675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalErDsl.g:2676:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalErDsl.g:2677:1: ( rule__Attribute__NameAssignment_1 )
            // InternalErDsl.g:2677:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalErDsl.g:2687:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2691:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDsl.g:2692:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalErDsl.g:2698:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AttributeDomainAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2702:1: ( ( ( rule__Attribute__AttributeDomainAssignment_2 )? ) )
            // InternalErDsl.g:2703:1: ( ( rule__Attribute__AttributeDomainAssignment_2 )? )
            {
            // InternalErDsl.g:2703:1: ( ( rule__Attribute__AttributeDomainAssignment_2 )? )
            // InternalErDsl.g:2704:1: ( rule__Attribute__AttributeDomainAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeDomainAssignment_2()); 
            // InternalErDsl.g:2705:1: ( rule__Attribute__AttributeDomainAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalErDsl.g:2705:2: rule__Attribute__AttributeDomainAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Attribute__AttributeDomainAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAttributeDomainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__AttributeDomain__Group__0"
    // InternalErDsl.g:2721:1: rule__AttributeDomain__Group__0 : rule__AttributeDomain__Group__0__Impl rule__AttributeDomain__Group__1 ;
    public final void rule__AttributeDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2725:1: ( rule__AttributeDomain__Group__0__Impl rule__AttributeDomain__Group__1 )
            // InternalErDsl.g:2726:2: rule__AttributeDomain__Group__0__Impl rule__AttributeDomain__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__AttributeDomain__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group__0"


    // $ANTLR start "rule__AttributeDomain__Group__0__Impl"
    // InternalErDsl.g:2733:1: rule__AttributeDomain__Group__0__Impl : ( ( rule__AttributeDomain__DomainAssignment_0 ) ) ;
    public final void rule__AttributeDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2737:1: ( ( ( rule__AttributeDomain__DomainAssignment_0 ) ) )
            // InternalErDsl.g:2738:1: ( ( rule__AttributeDomain__DomainAssignment_0 ) )
            {
            // InternalErDsl.g:2738:1: ( ( rule__AttributeDomain__DomainAssignment_0 ) )
            // InternalErDsl.g:2739:1: ( rule__AttributeDomain__DomainAssignment_0 )
            {
             before(grammarAccess.getAttributeDomainAccess().getDomainAssignment_0()); 
            // InternalErDsl.g:2740:1: ( rule__AttributeDomain__DomainAssignment_0 )
            // InternalErDsl.g:2740:2: rule__AttributeDomain__DomainAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDomainAccess().getDomainAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group__0__Impl"


    // $ANTLR start "rule__AttributeDomain__Group__1"
    // InternalErDsl.g:2750:1: rule__AttributeDomain__Group__1 : rule__AttributeDomain__Group__1__Impl rule__AttributeDomain__Group__2 ;
    public final void rule__AttributeDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2754:1: ( rule__AttributeDomain__Group__1__Impl rule__AttributeDomain__Group__2 )
            // InternalErDsl.g:2755:2: rule__AttributeDomain__Group__1__Impl rule__AttributeDomain__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__AttributeDomain__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group__1"


    // $ANTLR start "rule__AttributeDomain__Group__1__Impl"
    // InternalErDsl.g:2762:1: rule__AttributeDomain__Group__1__Impl : ( ( rule__AttributeDomain__Group_1__0 )? ) ;
    public final void rule__AttributeDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2766:1: ( ( ( rule__AttributeDomain__Group_1__0 )? ) )
            // InternalErDsl.g:2767:1: ( ( rule__AttributeDomain__Group_1__0 )? )
            {
            // InternalErDsl.g:2767:1: ( ( rule__AttributeDomain__Group_1__0 )? )
            // InternalErDsl.g:2768:1: ( rule__AttributeDomain__Group_1__0 )?
            {
             before(grammarAccess.getAttributeDomainAccess().getGroup_1()); 
            // InternalErDsl.g:2769:1: ( rule__AttributeDomain__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalErDsl.g:2769:2: rule__AttributeDomain__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeDomain__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDomainAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group__1__Impl"


    // $ANTLR start "rule__AttributeDomain__Group__2"
    // InternalErDsl.g:2779:1: rule__AttributeDomain__Group__2 : rule__AttributeDomain__Group__2__Impl ;
    public final void rule__AttributeDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2783:1: ( rule__AttributeDomain__Group__2__Impl )
            // InternalErDsl.g:2784:2: rule__AttributeDomain__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group__2"


    // $ANTLR start "rule__AttributeDomain__Group__2__Impl"
    // InternalErDsl.g:2790:1: rule__AttributeDomain__Group__2__Impl : ( ( rule__AttributeDomain__Group_2__0 )? ) ;
    public final void rule__AttributeDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2794:1: ( ( ( rule__AttributeDomain__Group_2__0 )? ) )
            // InternalErDsl.g:2795:1: ( ( rule__AttributeDomain__Group_2__0 )? )
            {
            // InternalErDsl.g:2795:1: ( ( rule__AttributeDomain__Group_2__0 )? )
            // InternalErDsl.g:2796:1: ( rule__AttributeDomain__Group_2__0 )?
            {
             before(grammarAccess.getAttributeDomainAccess().getGroup_2()); 
            // InternalErDsl.g:2797:1: ( rule__AttributeDomain__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalErDsl.g:2797:2: rule__AttributeDomain__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeDomain__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDomainAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group__2__Impl"


    // $ANTLR start "rule__AttributeDomain__Group_1__0"
    // InternalErDsl.g:2813:1: rule__AttributeDomain__Group_1__0 : rule__AttributeDomain__Group_1__0__Impl rule__AttributeDomain__Group_1__1 ;
    public final void rule__AttributeDomain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2817:1: ( rule__AttributeDomain__Group_1__0__Impl rule__AttributeDomain__Group_1__1 )
            // InternalErDsl.g:2818:2: rule__AttributeDomain__Group_1__0__Impl rule__AttributeDomain__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__AttributeDomain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_1__0"


    // $ANTLR start "rule__AttributeDomain__Group_1__0__Impl"
    // InternalErDsl.g:2825:1: rule__AttributeDomain__Group_1__0__Impl : ( '(' ) ;
    public final void rule__AttributeDomain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2829:1: ( ( '(' ) )
            // InternalErDsl.g:2830:1: ( '(' )
            {
            // InternalErDsl.g:2830:1: ( '(' )
            // InternalErDsl.g:2831:1: '('
            {
             before(grammarAccess.getAttributeDomainAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeDomainAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeDomain__Group_1__1"
    // InternalErDsl.g:2844:1: rule__AttributeDomain__Group_1__1 : rule__AttributeDomain__Group_1__1__Impl rule__AttributeDomain__Group_1__2 ;
    public final void rule__AttributeDomain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2848:1: ( rule__AttributeDomain__Group_1__1__Impl rule__AttributeDomain__Group_1__2 )
            // InternalErDsl.g:2849:2: rule__AttributeDomain__Group_1__1__Impl rule__AttributeDomain__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__AttributeDomain__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_1__1"


    // $ANTLR start "rule__AttributeDomain__Group_1__1__Impl"
    // InternalErDsl.g:2856:1: rule__AttributeDomain__Group_1__1__Impl : ( ( rule__AttributeDomain__LengthAssignment_1_1 ) ) ;
    public final void rule__AttributeDomain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2860:1: ( ( ( rule__AttributeDomain__LengthAssignment_1_1 ) ) )
            // InternalErDsl.g:2861:1: ( ( rule__AttributeDomain__LengthAssignment_1_1 ) )
            {
            // InternalErDsl.g:2861:1: ( ( rule__AttributeDomain__LengthAssignment_1_1 ) )
            // InternalErDsl.g:2862:1: ( rule__AttributeDomain__LengthAssignment_1_1 )
            {
             before(grammarAccess.getAttributeDomainAccess().getLengthAssignment_1_1()); 
            // InternalErDsl.g:2863:1: ( rule__AttributeDomain__LengthAssignment_1_1 )
            // InternalErDsl.g:2863:2: rule__AttributeDomain__LengthAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__LengthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDomainAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeDomain__Group_1__2"
    // InternalErDsl.g:2873:1: rule__AttributeDomain__Group_1__2 : rule__AttributeDomain__Group_1__2__Impl ;
    public final void rule__AttributeDomain__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2877:1: ( rule__AttributeDomain__Group_1__2__Impl )
            // InternalErDsl.g:2878:2: rule__AttributeDomain__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_1__2"


    // $ANTLR start "rule__AttributeDomain__Group_1__2__Impl"
    // InternalErDsl.g:2884:1: rule__AttributeDomain__Group_1__2__Impl : ( ')' ) ;
    public final void rule__AttributeDomain__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2888:1: ( ( ')' ) )
            // InternalErDsl.g:2889:1: ( ')' )
            {
            // InternalErDsl.g:2889:1: ( ')' )
            // InternalErDsl.g:2890:1: ')'
            {
             before(grammarAccess.getAttributeDomainAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeDomainAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeDomain__Group_2__0"
    // InternalErDsl.g:2909:1: rule__AttributeDomain__Group_2__0 : rule__AttributeDomain__Group_2__0__Impl rule__AttributeDomain__Group_2__1 ;
    public final void rule__AttributeDomain__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2913:1: ( rule__AttributeDomain__Group_2__0__Impl rule__AttributeDomain__Group_2__1 )
            // InternalErDsl.g:2914:2: rule__AttributeDomain__Group_2__0__Impl rule__AttributeDomain__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__AttributeDomain__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_2__0"


    // $ANTLR start "rule__AttributeDomain__Group_2__0__Impl"
    // InternalErDsl.g:2921:1: rule__AttributeDomain__Group_2__0__Impl : ( 'default' ) ;
    public final void rule__AttributeDomain__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2925:1: ( ( 'default' ) )
            // InternalErDsl.g:2926:1: ( 'default' )
            {
            // InternalErDsl.g:2926:1: ( 'default' )
            // InternalErDsl.g:2927:1: 'default'
            {
             before(grammarAccess.getAttributeDomainAccess().getDefaultKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeDomainAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeDomain__Group_2__1"
    // InternalErDsl.g:2940:1: rule__AttributeDomain__Group_2__1 : rule__AttributeDomain__Group_2__1__Impl ;
    public final void rule__AttributeDomain__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2944:1: ( rule__AttributeDomain__Group_2__1__Impl )
            // InternalErDsl.g:2945:2: rule__AttributeDomain__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_2__1"


    // $ANTLR start "rule__AttributeDomain__Group_2__1__Impl"
    // InternalErDsl.g:2951:1: rule__AttributeDomain__Group_2__1__Impl : ( ( rule__AttributeDomain__DefaultAssignment_2_1 ) ) ;
    public final void rule__AttributeDomain__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2955:1: ( ( ( rule__AttributeDomain__DefaultAssignment_2_1 ) ) )
            // InternalErDsl.g:2956:1: ( ( rule__AttributeDomain__DefaultAssignment_2_1 ) )
            {
            // InternalErDsl.g:2956:1: ( ( rule__AttributeDomain__DefaultAssignment_2_1 ) )
            // InternalErDsl.g:2957:1: ( rule__AttributeDomain__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getAttributeDomainAccess().getDefaultAssignment_2_1()); 
            // InternalErDsl.g:2958:1: ( rule__AttributeDomain__DefaultAssignment_2_1 )
            // InternalErDsl.g:2958:2: rule__AttributeDomain__DefaultAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeDomain__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDomainAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__Group_2__1__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // InternalErDsl.g:2972:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2976:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // InternalErDsl.g:2977:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // InternalErDsl.g:2984:1: rule__Key__Group__0__Impl : ( ( rule__Key__NameAssignment_0 ) ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:2988:1: ( ( ( rule__Key__NameAssignment_0 ) ) )
            // InternalErDsl.g:2989:1: ( ( rule__Key__NameAssignment_0 ) )
            {
            // InternalErDsl.g:2989:1: ( ( rule__Key__NameAssignment_0 ) )
            // InternalErDsl.g:2990:1: ( rule__Key__NameAssignment_0 )
            {
             before(grammarAccess.getKeyAccess().getNameAssignment_0()); 
            // InternalErDsl.g:2991:1: ( rule__Key__NameAssignment_0 )
            // InternalErDsl.g:2991:2: rule__Key__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // InternalErDsl.g:3001:1: rule__Key__Group__1 : rule__Key__Group__1__Impl rule__Key__Group__2 ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3005:1: ( rule__Key__Group__1__Impl rule__Key__Group__2 )
            // InternalErDsl.g:3006:2: rule__Key__Group__1__Impl rule__Key__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Key__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // InternalErDsl.g:3013:1: rule__Key__Group__1__Impl : ( '(' ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3017:1: ( ( '(' ) )
            // InternalErDsl.g:3018:1: ( '(' )
            {
            // InternalErDsl.g:3018:1: ( '(' )
            // InternalErDsl.g:3019:1: '('
            {
             before(grammarAccess.getKeyAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__Key__Group__2"
    // InternalErDsl.g:3032:1: rule__Key__Group__2 : rule__Key__Group__2__Impl rule__Key__Group__3 ;
    public final void rule__Key__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3036:1: ( rule__Key__Group__2__Impl rule__Key__Group__3 )
            // InternalErDsl.g:3037:2: rule__Key__Group__2__Impl rule__Key__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Key__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__2"


    // $ANTLR start "rule__Key__Group__2__Impl"
    // InternalErDsl.g:3044:1: rule__Key__Group__2__Impl : ( ( rule__Key__KeyAttributesAssignment_2 ) ) ;
    public final void rule__Key__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3048:1: ( ( ( rule__Key__KeyAttributesAssignment_2 ) ) )
            // InternalErDsl.g:3049:1: ( ( rule__Key__KeyAttributesAssignment_2 ) )
            {
            // InternalErDsl.g:3049:1: ( ( rule__Key__KeyAttributesAssignment_2 ) )
            // InternalErDsl.g:3050:1: ( rule__Key__KeyAttributesAssignment_2 )
            {
             before(grammarAccess.getKeyAccess().getKeyAttributesAssignment_2()); 
            // InternalErDsl.g:3051:1: ( rule__Key__KeyAttributesAssignment_2 )
            // InternalErDsl.g:3051:2: rule__Key__KeyAttributesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__KeyAttributesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getKeyAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__2__Impl"


    // $ANTLR start "rule__Key__Group__3"
    // InternalErDsl.g:3061:1: rule__Key__Group__3 : rule__Key__Group__3__Impl rule__Key__Group__4 ;
    public final void rule__Key__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3065:1: ( rule__Key__Group__3__Impl rule__Key__Group__4 )
            // InternalErDsl.g:3066:2: rule__Key__Group__3__Impl rule__Key__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Key__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__3"


    // $ANTLR start "rule__Key__Group__3__Impl"
    // InternalErDsl.g:3073:1: rule__Key__Group__3__Impl : ( ( rule__Key__Group_3__0 )* ) ;
    public final void rule__Key__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3077:1: ( ( ( rule__Key__Group_3__0 )* ) )
            // InternalErDsl.g:3078:1: ( ( rule__Key__Group_3__0 )* )
            {
            // InternalErDsl.g:3078:1: ( ( rule__Key__Group_3__0 )* )
            // InternalErDsl.g:3079:1: ( rule__Key__Group_3__0 )*
            {
             before(grammarAccess.getKeyAccess().getGroup_3()); 
            // InternalErDsl.g:3080:1: ( rule__Key__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalErDsl.g:3080:2: rule__Key__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Key__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getKeyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__3__Impl"


    // $ANTLR start "rule__Key__Group__4"
    // InternalErDsl.g:3090:1: rule__Key__Group__4 : rule__Key__Group__4__Impl ;
    public final void rule__Key__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3094:1: ( rule__Key__Group__4__Impl )
            // InternalErDsl.g:3095:2: rule__Key__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__4"


    // $ANTLR start "rule__Key__Group__4__Impl"
    // InternalErDsl.g:3101:1: rule__Key__Group__4__Impl : ( ')' ) ;
    public final void rule__Key__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3105:1: ( ( ')' ) )
            // InternalErDsl.g:3106:1: ( ')' )
            {
            // InternalErDsl.g:3106:1: ( ')' )
            // InternalErDsl.g:3107:1: ')'
            {
             before(grammarAccess.getKeyAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__4__Impl"


    // $ANTLR start "rule__Key__Group_3__0"
    // InternalErDsl.g:3130:1: rule__Key__Group_3__0 : rule__Key__Group_3__0__Impl rule__Key__Group_3__1 ;
    public final void rule__Key__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3134:1: ( rule__Key__Group_3__0__Impl rule__Key__Group_3__1 )
            // InternalErDsl.g:3135:2: rule__Key__Group_3__0__Impl rule__Key__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Key__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_3__0"


    // $ANTLR start "rule__Key__Group_3__0__Impl"
    // InternalErDsl.g:3142:1: rule__Key__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Key__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3146:1: ( ( ',' ) )
            // InternalErDsl.g:3147:1: ( ',' )
            {
            // InternalErDsl.g:3147:1: ( ',' )
            // InternalErDsl.g:3148:1: ','
            {
             before(grammarAccess.getKeyAccess().getCommaKeyword_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getKeyAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_3__0__Impl"


    // $ANTLR start "rule__Key__Group_3__1"
    // InternalErDsl.g:3161:1: rule__Key__Group_3__1 : rule__Key__Group_3__1__Impl ;
    public final void rule__Key__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3165:1: ( rule__Key__Group_3__1__Impl )
            // InternalErDsl.g:3166:2: rule__Key__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_3__1"


    // $ANTLR start "rule__Key__Group_3__1__Impl"
    // InternalErDsl.g:3172:1: rule__Key__Group_3__1__Impl : ( ( rule__Key__KeyAttributesAssignment_3_1 ) ) ;
    public final void rule__Key__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3176:1: ( ( ( rule__Key__KeyAttributesAssignment_3_1 ) ) )
            // InternalErDsl.g:3177:1: ( ( rule__Key__KeyAttributesAssignment_3_1 ) )
            {
            // InternalErDsl.g:3177:1: ( ( rule__Key__KeyAttributesAssignment_3_1 ) )
            // InternalErDsl.g:3178:1: ( rule__Key__KeyAttributesAssignment_3_1 )
            {
             before(grammarAccess.getKeyAccess().getKeyAttributesAssignment_3_1()); 
            // InternalErDsl.g:3179:1: ( rule__Key__KeyAttributesAssignment_3_1 )
            // InternalErDsl.g:3179:2: rule__Key__KeyAttributesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Key__KeyAttributesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getKeyAttributesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group_3__1__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalErDsl.g:3193:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3197:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl.g:3198:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalErDsl.g:3205:1: rule__Domain__Group__0__Impl : ( () ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3209:1: ( ( () ) )
            // InternalErDsl.g:3210:1: ( () )
            {
            // InternalErDsl.g:3210:1: ( () )
            // InternalErDsl.g:3211:1: ()
            {
             before(grammarAccess.getDomainAccess().getDomainAction_0()); 
            // InternalErDsl.g:3212:1: ()
            // InternalErDsl.g:3214:1: 
            {
            }

             after(grammarAccess.getDomainAccess().getDomainAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalErDsl.g:3224:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3228:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalErDsl.g:3229:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalErDsl.g:3236:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3240:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl.g:3241:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl.g:3241:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl.g:3242:1: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl.g:3243:1: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl.g:3243:2: rule__Domain__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // InternalErDsl.g:3253:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3257:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalErDsl.g:3258:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // InternalErDsl.g:3265:1: rule__Domain__Group__2__Impl : ( 'extends' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3269:1: ( ( 'extends' ) )
            // InternalErDsl.g:3270:1: ( 'extends' )
            {
            // InternalErDsl.g:3270:1: ( 'extends' )
            // InternalErDsl.g:3271:1: 'extends'
            {
             before(grammarAccess.getDomainAccess().getExtendsKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getExtendsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // InternalErDsl.g:3284:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3288:1: ( rule__Domain__Group__3__Impl )
            // InternalErDsl.g:3289:2: rule__Domain__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // InternalErDsl.g:3295:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__PrimitiveDomainAssignment_3 ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3299:1: ( ( ( rule__Domain__PrimitiveDomainAssignment_3 ) ) )
            // InternalErDsl.g:3300:1: ( ( rule__Domain__PrimitiveDomainAssignment_3 ) )
            {
            // InternalErDsl.g:3300:1: ( ( rule__Domain__PrimitiveDomainAssignment_3 ) )
            // InternalErDsl.g:3301:1: ( rule__Domain__PrimitiveDomainAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getPrimitiveDomainAssignment_3()); 
            // InternalErDsl.g:3302:1: ( rule__Domain__PrimitiveDomainAssignment_3 )
            // InternalErDsl.g:3302:2: rule__Domain__PrimitiveDomainAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Domain__PrimitiveDomainAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getPrimitiveDomainAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // InternalErDsl.g:3320:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3324:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // InternalErDsl.g:3325:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Relationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // InternalErDsl.g:3332:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__NameAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3336:1: ( ( ( rule__Relationship__NameAssignment_0 ) ) )
            // InternalErDsl.g:3337:1: ( ( rule__Relationship__NameAssignment_0 ) )
            {
            // InternalErDsl.g:3337:1: ( ( rule__Relationship__NameAssignment_0 ) )
            // InternalErDsl.g:3338:1: ( rule__Relationship__NameAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getNameAssignment_0()); 
            // InternalErDsl.g:3339:1: ( rule__Relationship__NameAssignment_0 )
            // InternalErDsl.g:3339:2: rule__Relationship__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // InternalErDsl.g:3349:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3353:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // InternalErDsl.g:3354:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Relationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // InternalErDsl.g:3361:1: rule__Relationship__Group__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3365:1: ( ( '{' ) )
            // InternalErDsl.g:3366:1: ( '{' )
            {
            // InternalErDsl.g:3366:1: ( '{' )
            // InternalErDsl.g:3367:1: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // InternalErDsl.g:3380:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3384:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // InternalErDsl.g:3385:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Relationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // InternalErDsl.g:3392:1: rule__Relationship__Group__2__Impl : ( 'entitiesInRelationship' ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3396:1: ( ( 'entitiesInRelationship' ) )
            // InternalErDsl.g:3397:1: ( 'entitiesInRelationship' )
            {
            // InternalErDsl.g:3397:1: ( 'entitiesInRelationship' )
            // InternalErDsl.g:3398:1: 'entitiesInRelationship'
            {
             before(grammarAccess.getRelationshipAccess().getEntitiesInRelationshipKeyword_2()); 
            match(input,36,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getEntitiesInRelationshipKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // InternalErDsl.g:3411:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3415:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // InternalErDsl.g:3416:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Relationship__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // InternalErDsl.g:3423:1: rule__Relationship__Group__3__Impl : ( '{' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3427:1: ( ( '{' ) )
            // InternalErDsl.g:3428:1: ( '{' )
            {
            // InternalErDsl.g:3428:1: ( '{' )
            // InternalErDsl.g:3429:1: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // InternalErDsl.g:3442:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3446:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // InternalErDsl.g:3447:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Relationship__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // InternalErDsl.g:3454:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__EntitiesAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3458:1: ( ( ( rule__Relationship__EntitiesAssignment_4 ) ) )
            // InternalErDsl.g:3459:1: ( ( rule__Relationship__EntitiesAssignment_4 ) )
            {
            // InternalErDsl.g:3459:1: ( ( rule__Relationship__EntitiesAssignment_4 ) )
            // InternalErDsl.g:3460:1: ( rule__Relationship__EntitiesAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getEntitiesAssignment_4()); 
            // InternalErDsl.g:3461:1: ( rule__Relationship__EntitiesAssignment_4 )
            // InternalErDsl.g:3461:2: rule__Relationship__EntitiesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getEntitiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // InternalErDsl.g:3471:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3475:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // InternalErDsl.g:3476:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Relationship__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // InternalErDsl.g:3483:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__Group_5__0 )* ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3487:1: ( ( ( rule__Relationship__Group_5__0 )* ) )
            // InternalErDsl.g:3488:1: ( ( rule__Relationship__Group_5__0 )* )
            {
            // InternalErDsl.g:3488:1: ( ( rule__Relationship__Group_5__0 )* )
            // InternalErDsl.g:3489:1: ( rule__Relationship__Group_5__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_5()); 
            // InternalErDsl.g:3490:1: ( rule__Relationship__Group_5__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==25) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalErDsl.g:3490:2: rule__Relationship__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Relationship__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group__6"
    // InternalErDsl.g:3500:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3504:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // InternalErDsl.g:3505:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Relationship__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6"


    // $ANTLR start "rule__Relationship__Group__6__Impl"
    // InternalErDsl.g:3512:1: rule__Relationship__Group__6__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3516:1: ( ( '}' ) )
            // InternalErDsl.g:3517:1: ( '}' )
            {
            // InternalErDsl.g:3517:1: ( '}' )
            // InternalErDsl.g:3518:1: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__6__Impl"


    // $ANTLR start "rule__Relationship__Group__7"
    // InternalErDsl.g:3531:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl rule__Relationship__Group__8 ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3535:1: ( rule__Relationship__Group__7__Impl rule__Relationship__Group__8 )
            // InternalErDsl.g:3536:2: rule__Relationship__Group__7__Impl rule__Relationship__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Relationship__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7"


    // $ANTLR start "rule__Relationship__Group__7__Impl"
    // InternalErDsl.g:3543:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__Group_7__0 )? ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3547:1: ( ( ( rule__Relationship__Group_7__0 )? ) )
            // InternalErDsl.g:3548:1: ( ( rule__Relationship__Group_7__0 )? )
            {
            // InternalErDsl.g:3548:1: ( ( rule__Relationship__Group_7__0 )? )
            // InternalErDsl.g:3549:1: ( rule__Relationship__Group_7__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_7()); 
            // InternalErDsl.g:3550:1: ( rule__Relationship__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalErDsl.g:3550:2: rule__Relationship__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Relationship__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__7__Impl"


    // $ANTLR start "rule__Relationship__Group__8"
    // InternalErDsl.g:3560:1: rule__Relationship__Group__8 : rule__Relationship__Group__8__Impl ;
    public final void rule__Relationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3564:1: ( rule__Relationship__Group__8__Impl )
            // InternalErDsl.g:3565:2: rule__Relationship__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8"


    // $ANTLR start "rule__Relationship__Group__8__Impl"
    // InternalErDsl.g:3571:1: rule__Relationship__Group__8__Impl : ( '}' ) ;
    public final void rule__Relationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3575:1: ( ( '}' ) )
            // InternalErDsl.g:3576:1: ( '}' )
            {
            // InternalErDsl.g:3576:1: ( '}' )
            // InternalErDsl.g:3577:1: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group__8__Impl"


    // $ANTLR start "rule__Relationship__Group_5__0"
    // InternalErDsl.g:3608:1: rule__Relationship__Group_5__0 : rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 ;
    public final void rule__Relationship__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3612:1: ( rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 )
            // InternalErDsl.g:3613:2: rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Relationship__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__0"


    // $ANTLR start "rule__Relationship__Group_5__0__Impl"
    // InternalErDsl.g:3620:1: rule__Relationship__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3624:1: ( ( ',' ) )
            // InternalErDsl.g:3625:1: ( ',' )
            {
            // InternalErDsl.g:3625:1: ( ',' )
            // InternalErDsl.g:3626:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__0__Impl"


    // $ANTLR start "rule__Relationship__Group_5__1"
    // InternalErDsl.g:3639:1: rule__Relationship__Group_5__1 : rule__Relationship__Group_5__1__Impl ;
    public final void rule__Relationship__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3643:1: ( rule__Relationship__Group_5__1__Impl )
            // InternalErDsl.g:3644:2: rule__Relationship__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__1"


    // $ANTLR start "rule__Relationship__Group_5__1__Impl"
    // InternalErDsl.g:3650:1: rule__Relationship__Group_5__1__Impl : ( ( rule__Relationship__EntitiesAssignment_5_1 ) ) ;
    public final void rule__Relationship__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3654:1: ( ( ( rule__Relationship__EntitiesAssignment_5_1 ) ) )
            // InternalErDsl.g:3655:1: ( ( rule__Relationship__EntitiesAssignment_5_1 ) )
            {
            // InternalErDsl.g:3655:1: ( ( rule__Relationship__EntitiesAssignment_5_1 ) )
            // InternalErDsl.g:3656:1: ( rule__Relationship__EntitiesAssignment_5_1 )
            {
             before(grammarAccess.getRelationshipAccess().getEntitiesAssignment_5_1()); 
            // InternalErDsl.g:3657:1: ( rule__Relationship__EntitiesAssignment_5_1 )
            // InternalErDsl.g:3657:2: rule__Relationship__EntitiesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__EntitiesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getEntitiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_5__1__Impl"


    // $ANTLR start "rule__Relationship__Group_7__0"
    // InternalErDsl.g:3671:1: rule__Relationship__Group_7__0 : rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1 ;
    public final void rule__Relationship__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3675:1: ( rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1 )
            // InternalErDsl.g:3676:2: rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Relationship__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__0"


    // $ANTLR start "rule__Relationship__Group_7__0__Impl"
    // InternalErDsl.g:3683:1: rule__Relationship__Group_7__0__Impl : ( 'attributeSet' ) ;
    public final void rule__Relationship__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3687:1: ( ( 'attributeSet' ) )
            // InternalErDsl.g:3688:1: ( 'attributeSet' )
            {
            // InternalErDsl.g:3688:1: ( 'attributeSet' )
            // InternalErDsl.g:3689:1: 'attributeSet'
            {
             before(grammarAccess.getRelationshipAccess().getAttributeSetKeyword_7_0()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getAttributeSetKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__0__Impl"


    // $ANTLR start "rule__Relationship__Group_7__1"
    // InternalErDsl.g:3702:1: rule__Relationship__Group_7__1 : rule__Relationship__Group_7__1__Impl rule__Relationship__Group_7__2 ;
    public final void rule__Relationship__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3706:1: ( rule__Relationship__Group_7__1__Impl rule__Relationship__Group_7__2 )
            // InternalErDsl.g:3707:2: rule__Relationship__Group_7__1__Impl rule__Relationship__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Relationship__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__1"


    // $ANTLR start "rule__Relationship__Group_7__1__Impl"
    // InternalErDsl.g:3714:1: rule__Relationship__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Relationship__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3718:1: ( ( '{' ) )
            // InternalErDsl.g:3719:1: ( '{' )
            {
            // InternalErDsl.g:3719:1: ( '{' )
            // InternalErDsl.g:3720:1: '{'
            {
             before(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__1__Impl"


    // $ANTLR start "rule__Relationship__Group_7__2"
    // InternalErDsl.g:3733:1: rule__Relationship__Group_7__2 : rule__Relationship__Group_7__2__Impl rule__Relationship__Group_7__3 ;
    public final void rule__Relationship__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3737:1: ( rule__Relationship__Group_7__2__Impl rule__Relationship__Group_7__3 )
            // InternalErDsl.g:3738:2: rule__Relationship__Group_7__2__Impl rule__Relationship__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Relationship__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__2"


    // $ANTLR start "rule__Relationship__Group_7__2__Impl"
    // InternalErDsl.g:3745:1: rule__Relationship__Group_7__2__Impl : ( ( rule__Relationship__RelationshipAttributesAssignment_7_2 ) ) ;
    public final void rule__Relationship__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3749:1: ( ( ( rule__Relationship__RelationshipAttributesAssignment_7_2 ) ) )
            // InternalErDsl.g:3750:1: ( ( rule__Relationship__RelationshipAttributesAssignment_7_2 ) )
            {
            // InternalErDsl.g:3750:1: ( ( rule__Relationship__RelationshipAttributesAssignment_7_2 ) )
            // InternalErDsl.g:3751:1: ( rule__Relationship__RelationshipAttributesAssignment_7_2 )
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAttributesAssignment_7_2()); 
            // InternalErDsl.g:3752:1: ( rule__Relationship__RelationshipAttributesAssignment_7_2 )
            // InternalErDsl.g:3752:2: rule__Relationship__RelationshipAttributesAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__RelationshipAttributesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getRelationshipAttributesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__2__Impl"


    // $ANTLR start "rule__Relationship__Group_7__3"
    // InternalErDsl.g:3762:1: rule__Relationship__Group_7__3 : rule__Relationship__Group_7__3__Impl rule__Relationship__Group_7__4 ;
    public final void rule__Relationship__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3766:1: ( rule__Relationship__Group_7__3__Impl rule__Relationship__Group_7__4 )
            // InternalErDsl.g:3767:2: rule__Relationship__Group_7__3__Impl rule__Relationship__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Relationship__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__3"


    // $ANTLR start "rule__Relationship__Group_7__3__Impl"
    // InternalErDsl.g:3774:1: rule__Relationship__Group_7__3__Impl : ( ( rule__Relationship__Group_7_3__0 )* ) ;
    public final void rule__Relationship__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3778:1: ( ( ( rule__Relationship__Group_7_3__0 )* ) )
            // InternalErDsl.g:3779:1: ( ( rule__Relationship__Group_7_3__0 )* )
            {
            // InternalErDsl.g:3779:1: ( ( rule__Relationship__Group_7_3__0 )* )
            // InternalErDsl.g:3780:1: ( rule__Relationship__Group_7_3__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_7_3()); 
            // InternalErDsl.g:3781:1: ( rule__Relationship__Group_7_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalErDsl.g:3781:2: rule__Relationship__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Relationship__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__3__Impl"


    // $ANTLR start "rule__Relationship__Group_7__4"
    // InternalErDsl.g:3791:1: rule__Relationship__Group_7__4 : rule__Relationship__Group_7__4__Impl ;
    public final void rule__Relationship__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3795:1: ( rule__Relationship__Group_7__4__Impl )
            // InternalErDsl.g:3796:2: rule__Relationship__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__4"


    // $ANTLR start "rule__Relationship__Group_7__4__Impl"
    // InternalErDsl.g:3802:1: rule__Relationship__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Relationship__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3806:1: ( ( '}' ) )
            // InternalErDsl.g:3807:1: ( '}' )
            {
            // InternalErDsl.g:3807:1: ( '}' )
            // InternalErDsl.g:3808:1: '}'
            {
             before(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7__4__Impl"


    // $ANTLR start "rule__Relationship__Group_7_3__0"
    // InternalErDsl.g:3831:1: rule__Relationship__Group_7_3__0 : rule__Relationship__Group_7_3__0__Impl rule__Relationship__Group_7_3__1 ;
    public final void rule__Relationship__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3835:1: ( rule__Relationship__Group_7_3__0__Impl rule__Relationship__Group_7_3__1 )
            // InternalErDsl.g:3836:2: rule__Relationship__Group_7_3__0__Impl rule__Relationship__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Relationship__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__0"


    // $ANTLR start "rule__Relationship__Group_7_3__0__Impl"
    // InternalErDsl.g:3843:1: rule__Relationship__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3847:1: ( ( ',' ) )
            // InternalErDsl.g:3848:1: ( ',' )
            {
            // InternalErDsl.g:3848:1: ( ',' )
            // InternalErDsl.g:3849:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__0__Impl"


    // $ANTLR start "rule__Relationship__Group_7_3__1"
    // InternalErDsl.g:3862:1: rule__Relationship__Group_7_3__1 : rule__Relationship__Group_7_3__1__Impl ;
    public final void rule__Relationship__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3866:1: ( rule__Relationship__Group_7_3__1__Impl )
            // InternalErDsl.g:3867:2: rule__Relationship__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__1"


    // $ANTLR start "rule__Relationship__Group_7_3__1__Impl"
    // InternalErDsl.g:3873:1: rule__Relationship__Group_7_3__1__Impl : ( ( rule__Relationship__RelationshipAttributesAssignment_7_3_1 ) ) ;
    public final void rule__Relationship__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3877:1: ( ( ( rule__Relationship__RelationshipAttributesAssignment_7_3_1 ) ) )
            // InternalErDsl.g:3878:1: ( ( rule__Relationship__RelationshipAttributesAssignment_7_3_1 ) )
            {
            // InternalErDsl.g:3878:1: ( ( rule__Relationship__RelationshipAttributesAssignment_7_3_1 ) )
            // InternalErDsl.g:3879:1: ( rule__Relationship__RelationshipAttributesAssignment_7_3_1 )
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAttributesAssignment_7_3_1()); 
            // InternalErDsl.g:3880:1: ( rule__Relationship__RelationshipAttributesAssignment_7_3_1 )
            // InternalErDsl.g:3880:2: rule__Relationship__RelationshipAttributesAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Relationship__RelationshipAttributesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getRelationshipAttributesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__Group_7_3__1__Impl"


    // $ANTLR start "rule__ISA__Group__0"
    // InternalErDsl.g:3894:1: rule__ISA__Group__0 : rule__ISA__Group__0__Impl rule__ISA__Group__1 ;
    public final void rule__ISA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3898:1: ( rule__ISA__Group__0__Impl rule__ISA__Group__1 )
            // InternalErDsl.g:3899:2: rule__ISA__Group__0__Impl rule__ISA__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ISA__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__0"


    // $ANTLR start "rule__ISA__Group__0__Impl"
    // InternalErDsl.g:3906:1: rule__ISA__Group__0__Impl : ( 'ISA' ) ;
    public final void rule__ISA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3910:1: ( ( 'ISA' ) )
            // InternalErDsl.g:3911:1: ( 'ISA' )
            {
            // InternalErDsl.g:3911:1: ( 'ISA' )
            // InternalErDsl.g:3912:1: 'ISA'
            {
             before(grammarAccess.getISAAccess().getISAKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getISAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__0__Impl"


    // $ANTLR start "rule__ISA__Group__1"
    // InternalErDsl.g:3925:1: rule__ISA__Group__1 : rule__ISA__Group__1__Impl rule__ISA__Group__2 ;
    public final void rule__ISA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3929:1: ( rule__ISA__Group__1__Impl rule__ISA__Group__2 )
            // InternalErDsl.g:3930:2: rule__ISA__Group__1__Impl rule__ISA__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ISA__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__1"


    // $ANTLR start "rule__ISA__Group__1__Impl"
    // InternalErDsl.g:3937:1: rule__ISA__Group__1__Impl : ( ( rule__ISA__NameAssignment_1 ) ) ;
    public final void rule__ISA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3941:1: ( ( ( rule__ISA__NameAssignment_1 ) ) )
            // InternalErDsl.g:3942:1: ( ( rule__ISA__NameAssignment_1 ) )
            {
            // InternalErDsl.g:3942:1: ( ( rule__ISA__NameAssignment_1 ) )
            // InternalErDsl.g:3943:1: ( rule__ISA__NameAssignment_1 )
            {
             before(grammarAccess.getISAAccess().getNameAssignment_1()); 
            // InternalErDsl.g:3944:1: ( rule__ISA__NameAssignment_1 )
            // InternalErDsl.g:3944:2: rule__ISA__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getISAAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__1__Impl"


    // $ANTLR start "rule__ISA__Group__2"
    // InternalErDsl.g:3954:1: rule__ISA__Group__2 : rule__ISA__Group__2__Impl rule__ISA__Group__3 ;
    public final void rule__ISA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3958:1: ( rule__ISA__Group__2__Impl rule__ISA__Group__3 )
            // InternalErDsl.g:3959:2: rule__ISA__Group__2__Impl rule__ISA__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ISA__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__2"


    // $ANTLR start "rule__ISA__Group__2__Impl"
    // InternalErDsl.g:3966:1: rule__ISA__Group__2__Impl : ( '{' ) ;
    public final void rule__ISA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3970:1: ( ( '{' ) )
            // InternalErDsl.g:3971:1: ( '{' )
            {
            // InternalErDsl.g:3971:1: ( '{' )
            // InternalErDsl.g:3972:1: '{'
            {
             before(grammarAccess.getISAAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__2__Impl"


    // $ANTLR start "rule__ISA__Group__3"
    // InternalErDsl.g:3985:1: rule__ISA__Group__3 : rule__ISA__Group__3__Impl rule__ISA__Group__4 ;
    public final void rule__ISA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:3989:1: ( rule__ISA__Group__3__Impl rule__ISA__Group__4 )
            // InternalErDsl.g:3990:2: rule__ISA__Group__3__Impl rule__ISA__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ISA__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__3"


    // $ANTLR start "rule__ISA__Group__3__Impl"
    // InternalErDsl.g:3997:1: rule__ISA__Group__3__Impl : ( 'supertype' ) ;
    public final void rule__ISA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4001:1: ( ( 'supertype' ) )
            // InternalErDsl.g:4002:1: ( 'supertype' )
            {
            // InternalErDsl.g:4002:1: ( 'supertype' )
            // InternalErDsl.g:4003:1: 'supertype'
            {
             before(grammarAccess.getISAAccess().getSupertypeKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getSupertypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__3__Impl"


    // $ANTLR start "rule__ISA__Group__4"
    // InternalErDsl.g:4016:1: rule__ISA__Group__4 : rule__ISA__Group__4__Impl rule__ISA__Group__5 ;
    public final void rule__ISA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4020:1: ( rule__ISA__Group__4__Impl rule__ISA__Group__5 )
            // InternalErDsl.g:4021:2: rule__ISA__Group__4__Impl rule__ISA__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ISA__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__4"


    // $ANTLR start "rule__ISA__Group__4__Impl"
    // InternalErDsl.g:4028:1: rule__ISA__Group__4__Impl : ( ( rule__ISA__SupertypeAssignment_4 ) ) ;
    public final void rule__ISA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4032:1: ( ( ( rule__ISA__SupertypeAssignment_4 ) ) )
            // InternalErDsl.g:4033:1: ( ( rule__ISA__SupertypeAssignment_4 ) )
            {
            // InternalErDsl.g:4033:1: ( ( rule__ISA__SupertypeAssignment_4 ) )
            // InternalErDsl.g:4034:1: ( rule__ISA__SupertypeAssignment_4 )
            {
             before(grammarAccess.getISAAccess().getSupertypeAssignment_4()); 
            // InternalErDsl.g:4035:1: ( rule__ISA__SupertypeAssignment_4 )
            // InternalErDsl.g:4035:2: rule__ISA__SupertypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__SupertypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getISAAccess().getSupertypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__4__Impl"


    // $ANTLR start "rule__ISA__Group__5"
    // InternalErDsl.g:4045:1: rule__ISA__Group__5 : rule__ISA__Group__5__Impl rule__ISA__Group__6 ;
    public final void rule__ISA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4049:1: ( rule__ISA__Group__5__Impl rule__ISA__Group__6 )
            // InternalErDsl.g:4050:2: rule__ISA__Group__5__Impl rule__ISA__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__ISA__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__5"


    // $ANTLR start "rule__ISA__Group__5__Impl"
    // InternalErDsl.g:4057:1: rule__ISA__Group__5__Impl : ( 'subtypes' ) ;
    public final void rule__ISA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4061:1: ( ( 'subtypes' ) )
            // InternalErDsl.g:4062:1: ( 'subtypes' )
            {
            // InternalErDsl.g:4062:1: ( 'subtypes' )
            // InternalErDsl.g:4063:1: 'subtypes'
            {
             before(grammarAccess.getISAAccess().getSubtypesKeyword_5()); 
            match(input,39,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getSubtypesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__5__Impl"


    // $ANTLR start "rule__ISA__Group__6"
    // InternalErDsl.g:4076:1: rule__ISA__Group__6 : rule__ISA__Group__6__Impl rule__ISA__Group__7 ;
    public final void rule__ISA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4080:1: ( rule__ISA__Group__6__Impl rule__ISA__Group__7 )
            // InternalErDsl.g:4081:2: rule__ISA__Group__6__Impl rule__ISA__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ISA__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__6"


    // $ANTLR start "rule__ISA__Group__6__Impl"
    // InternalErDsl.g:4088:1: rule__ISA__Group__6__Impl : ( '(' ) ;
    public final void rule__ISA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4092:1: ( ( '(' ) )
            // InternalErDsl.g:4093:1: ( '(' )
            {
            // InternalErDsl.g:4093:1: ( '(' )
            // InternalErDsl.g:4094:1: '('
            {
             before(grammarAccess.getISAAccess().getLeftParenthesisKeyword_6()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__6__Impl"


    // $ANTLR start "rule__ISA__Group__7"
    // InternalErDsl.g:4107:1: rule__ISA__Group__7 : rule__ISA__Group__7__Impl rule__ISA__Group__8 ;
    public final void rule__ISA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4111:1: ( rule__ISA__Group__7__Impl rule__ISA__Group__8 )
            // InternalErDsl.g:4112:2: rule__ISA__Group__7__Impl rule__ISA__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__ISA__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__7"


    // $ANTLR start "rule__ISA__Group__7__Impl"
    // InternalErDsl.g:4119:1: rule__ISA__Group__7__Impl : ( ( rule__ISA__SubtypesAssignment_7 ) ) ;
    public final void rule__ISA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4123:1: ( ( ( rule__ISA__SubtypesAssignment_7 ) ) )
            // InternalErDsl.g:4124:1: ( ( rule__ISA__SubtypesAssignment_7 ) )
            {
            // InternalErDsl.g:4124:1: ( ( rule__ISA__SubtypesAssignment_7 ) )
            // InternalErDsl.g:4125:1: ( rule__ISA__SubtypesAssignment_7 )
            {
             before(grammarAccess.getISAAccess().getSubtypesAssignment_7()); 
            // InternalErDsl.g:4126:1: ( rule__ISA__SubtypesAssignment_7 )
            // InternalErDsl.g:4126:2: rule__ISA__SubtypesAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__SubtypesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getISAAccess().getSubtypesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__7__Impl"


    // $ANTLR start "rule__ISA__Group__8"
    // InternalErDsl.g:4136:1: rule__ISA__Group__8 : rule__ISA__Group__8__Impl rule__ISA__Group__9 ;
    public final void rule__ISA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4140:1: ( rule__ISA__Group__8__Impl rule__ISA__Group__9 )
            // InternalErDsl.g:4141:2: rule__ISA__Group__8__Impl rule__ISA__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__ISA__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__8"


    // $ANTLR start "rule__ISA__Group__8__Impl"
    // InternalErDsl.g:4148:1: rule__ISA__Group__8__Impl : ( ( rule__ISA__Group_8__0 )* ) ;
    public final void rule__ISA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4152:1: ( ( ( rule__ISA__Group_8__0 )* ) )
            // InternalErDsl.g:4153:1: ( ( rule__ISA__Group_8__0 )* )
            {
            // InternalErDsl.g:4153:1: ( ( rule__ISA__Group_8__0 )* )
            // InternalErDsl.g:4154:1: ( rule__ISA__Group_8__0 )*
            {
             before(grammarAccess.getISAAccess().getGroup_8()); 
            // InternalErDsl.g:4155:1: ( rule__ISA__Group_8__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==25) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalErDsl.g:4155:2: rule__ISA__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__ISA__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getISAAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__8__Impl"


    // $ANTLR start "rule__ISA__Group__9"
    // InternalErDsl.g:4165:1: rule__ISA__Group__9 : rule__ISA__Group__9__Impl rule__ISA__Group__10 ;
    public final void rule__ISA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4169:1: ( rule__ISA__Group__9__Impl rule__ISA__Group__10 )
            // InternalErDsl.g:4170:2: rule__ISA__Group__9__Impl rule__ISA__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ISA__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__9"


    // $ANTLR start "rule__ISA__Group__9__Impl"
    // InternalErDsl.g:4177:1: rule__ISA__Group__9__Impl : ( ')' ) ;
    public final void rule__ISA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4181:1: ( ( ')' ) )
            // InternalErDsl.g:4182:1: ( ')' )
            {
            // InternalErDsl.g:4182:1: ( ')' )
            // InternalErDsl.g:4183:1: ')'
            {
             before(grammarAccess.getISAAccess().getRightParenthesisKeyword_9()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__9__Impl"


    // $ANTLR start "rule__ISA__Group__10"
    // InternalErDsl.g:4196:1: rule__ISA__Group__10 : rule__ISA__Group__10__Impl rule__ISA__Group__11 ;
    public final void rule__ISA__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4200:1: ( rule__ISA__Group__10__Impl rule__ISA__Group__11 )
            // InternalErDsl.g:4201:2: rule__ISA__Group__10__Impl rule__ISA__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ISA__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__10"


    // $ANTLR start "rule__ISA__Group__10__Impl"
    // InternalErDsl.g:4208:1: rule__ISA__Group__10__Impl : ( 'classificationAttribute' ) ;
    public final void rule__ISA__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4212:1: ( ( 'classificationAttribute' ) )
            // InternalErDsl.g:4213:1: ( 'classificationAttribute' )
            {
            // InternalErDsl.g:4213:1: ( 'classificationAttribute' )
            // InternalErDsl.g:4214:1: 'classificationAttribute'
            {
             before(grammarAccess.getISAAccess().getClassificationAttributeKeyword_10()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getClassificationAttributeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__10__Impl"


    // $ANTLR start "rule__ISA__Group__11"
    // InternalErDsl.g:4227:1: rule__ISA__Group__11 : rule__ISA__Group__11__Impl rule__ISA__Group__12 ;
    public final void rule__ISA__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4231:1: ( rule__ISA__Group__11__Impl rule__ISA__Group__12 )
            // InternalErDsl.g:4232:2: rule__ISA__Group__11__Impl rule__ISA__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__ISA__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__11"


    // $ANTLR start "rule__ISA__Group__11__Impl"
    // InternalErDsl.g:4239:1: rule__ISA__Group__11__Impl : ( ( rule__ISA__ClassificationAttributeAssignment_11 ) ) ;
    public final void rule__ISA__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4243:1: ( ( ( rule__ISA__ClassificationAttributeAssignment_11 ) ) )
            // InternalErDsl.g:4244:1: ( ( rule__ISA__ClassificationAttributeAssignment_11 ) )
            {
            // InternalErDsl.g:4244:1: ( ( rule__ISA__ClassificationAttributeAssignment_11 ) )
            // InternalErDsl.g:4245:1: ( rule__ISA__ClassificationAttributeAssignment_11 )
            {
             before(grammarAccess.getISAAccess().getClassificationAttributeAssignment_11()); 
            // InternalErDsl.g:4246:1: ( rule__ISA__ClassificationAttributeAssignment_11 )
            // InternalErDsl.g:4246:2: rule__ISA__ClassificationAttributeAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__ClassificationAttributeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getISAAccess().getClassificationAttributeAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__11__Impl"


    // $ANTLR start "rule__ISA__Group__12"
    // InternalErDsl.g:4256:1: rule__ISA__Group__12 : rule__ISA__Group__12__Impl ;
    public final void rule__ISA__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4260:1: ( rule__ISA__Group__12__Impl )
            // InternalErDsl.g:4261:2: rule__ISA__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__12"


    // $ANTLR start "rule__ISA__Group__12__Impl"
    // InternalErDsl.g:4267:1: rule__ISA__Group__12__Impl : ( '}' ) ;
    public final void rule__ISA__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4271:1: ( ( '}' ) )
            // InternalErDsl.g:4272:1: ( '}' )
            {
            // InternalErDsl.g:4272:1: ( '}' )
            // InternalErDsl.g:4273:1: '}'
            {
             before(grammarAccess.getISAAccess().getRightCurlyBracketKeyword_12()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group__12__Impl"


    // $ANTLR start "rule__ISA__Group_8__0"
    // InternalErDsl.g:4312:1: rule__ISA__Group_8__0 : rule__ISA__Group_8__0__Impl rule__ISA__Group_8__1 ;
    public final void rule__ISA__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4316:1: ( rule__ISA__Group_8__0__Impl rule__ISA__Group_8__1 )
            // InternalErDsl.g:4317:2: rule__ISA__Group_8__0__Impl rule__ISA__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ISA__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group_8__0"


    // $ANTLR start "rule__ISA__Group_8__0__Impl"
    // InternalErDsl.g:4324:1: rule__ISA__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ISA__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4328:1: ( ( ',' ) )
            // InternalErDsl.g:4329:1: ( ',' )
            {
            // InternalErDsl.g:4329:1: ( ',' )
            // InternalErDsl.g:4330:1: ','
            {
             before(grammarAccess.getISAAccess().getCommaKeyword_8_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getISAAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group_8__0__Impl"


    // $ANTLR start "rule__ISA__Group_8__1"
    // InternalErDsl.g:4343:1: rule__ISA__Group_8__1 : rule__ISA__Group_8__1__Impl ;
    public final void rule__ISA__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4347:1: ( rule__ISA__Group_8__1__Impl )
            // InternalErDsl.g:4348:2: rule__ISA__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group_8__1"


    // $ANTLR start "rule__ISA__Group_8__1__Impl"
    // InternalErDsl.g:4354:1: rule__ISA__Group_8__1__Impl : ( ( rule__ISA__SubtypesAssignment_8_1 ) ) ;
    public final void rule__ISA__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4358:1: ( ( ( rule__ISA__SubtypesAssignment_8_1 ) ) )
            // InternalErDsl.g:4359:1: ( ( rule__ISA__SubtypesAssignment_8_1 ) )
            {
            // InternalErDsl.g:4359:1: ( ( rule__ISA__SubtypesAssignment_8_1 ) )
            // InternalErDsl.g:4360:1: ( rule__ISA__SubtypesAssignment_8_1 )
            {
             before(grammarAccess.getISAAccess().getSubtypesAssignment_8_1()); 
            // InternalErDsl.g:4361:1: ( rule__ISA__SubtypesAssignment_8_1 )
            // InternalErDsl.g:4361:2: rule__ISA__SubtypesAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ISA__SubtypesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getISAAccess().getSubtypesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__Group_8__1__Impl"


    // $ANTLR start "rule__Categorisation__Group__0"
    // InternalErDsl.g:4375:1: rule__Categorisation__Group__0 : rule__Categorisation__Group__0__Impl rule__Categorisation__Group__1 ;
    public final void rule__Categorisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4379:1: ( rule__Categorisation__Group__0__Impl rule__Categorisation__Group__1 )
            // InternalErDsl.g:4380:2: rule__Categorisation__Group__0__Impl rule__Categorisation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Categorisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__0"


    // $ANTLR start "rule__Categorisation__Group__0__Impl"
    // InternalErDsl.g:4387:1: rule__Categorisation__Group__0__Impl : ( 'Categorisation' ) ;
    public final void rule__Categorisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4391:1: ( ( 'Categorisation' ) )
            // InternalErDsl.g:4392:1: ( 'Categorisation' )
            {
            // InternalErDsl.g:4392:1: ( 'Categorisation' )
            // InternalErDsl.g:4393:1: 'Categorisation'
            {
             before(grammarAccess.getCategorisationAccess().getCategorisationKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategorisationAccess().getCategorisationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__0__Impl"


    // $ANTLR start "rule__Categorisation__Group__1"
    // InternalErDsl.g:4406:1: rule__Categorisation__Group__1 : rule__Categorisation__Group__1__Impl rule__Categorisation__Group__2 ;
    public final void rule__Categorisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4410:1: ( rule__Categorisation__Group__1__Impl rule__Categorisation__Group__2 )
            // InternalErDsl.g:4411:2: rule__Categorisation__Group__1__Impl rule__Categorisation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Categorisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__1"


    // $ANTLR start "rule__Categorisation__Group__1__Impl"
    // InternalErDsl.g:4418:1: rule__Categorisation__Group__1__Impl : ( ( rule__Categorisation__NameAssignment_1 ) ) ;
    public final void rule__Categorisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4422:1: ( ( ( rule__Categorisation__NameAssignment_1 ) ) )
            // InternalErDsl.g:4423:1: ( ( rule__Categorisation__NameAssignment_1 ) )
            {
            // InternalErDsl.g:4423:1: ( ( rule__Categorisation__NameAssignment_1 ) )
            // InternalErDsl.g:4424:1: ( rule__Categorisation__NameAssignment_1 )
            {
             before(grammarAccess.getCategorisationAccess().getNameAssignment_1()); 
            // InternalErDsl.g:4425:1: ( rule__Categorisation__NameAssignment_1 )
            // InternalErDsl.g:4425:2: rule__Categorisation__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategorisationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__1__Impl"


    // $ANTLR start "rule__Categorisation__Group__2"
    // InternalErDsl.g:4435:1: rule__Categorisation__Group__2 : rule__Categorisation__Group__2__Impl rule__Categorisation__Group__3 ;
    public final void rule__Categorisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4439:1: ( rule__Categorisation__Group__2__Impl rule__Categorisation__Group__3 )
            // InternalErDsl.g:4440:2: rule__Categorisation__Group__2__Impl rule__Categorisation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Categorisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__2"


    // $ANTLR start "rule__Categorisation__Group__2__Impl"
    // InternalErDsl.g:4447:1: rule__Categorisation__Group__2__Impl : ( '{' ) ;
    public final void rule__Categorisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4451:1: ( ( '{' ) )
            // InternalErDsl.g:4452:1: ( '{' )
            {
            // InternalErDsl.g:4452:1: ( '{' )
            // InternalErDsl.g:4453:1: '{'
            {
             before(grammarAccess.getCategorisationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategorisationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__2__Impl"


    // $ANTLR start "rule__Categorisation__Group__3"
    // InternalErDsl.g:4466:1: rule__Categorisation__Group__3 : rule__Categorisation__Group__3__Impl rule__Categorisation__Group__4 ;
    public final void rule__Categorisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4470:1: ( rule__Categorisation__Group__3__Impl rule__Categorisation__Group__4 )
            // InternalErDsl.g:4471:2: rule__Categorisation__Group__3__Impl rule__Categorisation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Categorisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__3"


    // $ANTLR start "rule__Categorisation__Group__3__Impl"
    // InternalErDsl.g:4478:1: rule__Categorisation__Group__3__Impl : ( 'categorisedEntity' ) ;
    public final void rule__Categorisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4482:1: ( ( 'categorisedEntity' ) )
            // InternalErDsl.g:4483:1: ( 'categorisedEntity' )
            {
            // InternalErDsl.g:4483:1: ( 'categorisedEntity' )
            // InternalErDsl.g:4484:1: 'categorisedEntity'
            {
             before(grammarAccess.getCategorisationAccess().getCategorisedEntityKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategorisationAccess().getCategorisedEntityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__3__Impl"


    // $ANTLR start "rule__Categorisation__Group__4"
    // InternalErDsl.g:4497:1: rule__Categorisation__Group__4 : rule__Categorisation__Group__4__Impl rule__Categorisation__Group__5 ;
    public final void rule__Categorisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4501:1: ( rule__Categorisation__Group__4__Impl rule__Categorisation__Group__5 )
            // InternalErDsl.g:4502:2: rule__Categorisation__Group__4__Impl rule__Categorisation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__Categorisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__4"


    // $ANTLR start "rule__Categorisation__Group__4__Impl"
    // InternalErDsl.g:4509:1: rule__Categorisation__Group__4__Impl : ( ( rule__Categorisation__CategorisedEntityAssignment_4 ) ) ;
    public final void rule__Categorisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4513:1: ( ( ( rule__Categorisation__CategorisedEntityAssignment_4 ) ) )
            // InternalErDsl.g:4514:1: ( ( rule__Categorisation__CategorisedEntityAssignment_4 ) )
            {
            // InternalErDsl.g:4514:1: ( ( rule__Categorisation__CategorisedEntityAssignment_4 ) )
            // InternalErDsl.g:4515:1: ( rule__Categorisation__CategorisedEntityAssignment_4 )
            {
             before(grammarAccess.getCategorisationAccess().getCategorisedEntityAssignment_4()); 
            // InternalErDsl.g:4516:1: ( rule__Categorisation__CategorisedEntityAssignment_4 )
            // InternalErDsl.g:4516:2: rule__Categorisation__CategorisedEntityAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__CategorisedEntityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCategorisationAccess().getCategorisedEntityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__4__Impl"


    // $ANTLR start "rule__Categorisation__Group__5"
    // InternalErDsl.g:4526:1: rule__Categorisation__Group__5 : rule__Categorisation__Group__5__Impl rule__Categorisation__Group__6 ;
    public final void rule__Categorisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4530:1: ( rule__Categorisation__Group__5__Impl rule__Categorisation__Group__6 )
            // InternalErDsl.g:4531:2: rule__Categorisation__Group__5__Impl rule__Categorisation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Categorisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__5"


    // $ANTLR start "rule__Categorisation__Group__5__Impl"
    // InternalErDsl.g:4538:1: rule__Categorisation__Group__5__Impl : ( 'categorisationEntities' ) ;
    public final void rule__Categorisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4542:1: ( ( 'categorisationEntities' ) )
            // InternalErDsl.g:4543:1: ( 'categorisationEntities' )
            {
            // InternalErDsl.g:4543:1: ( 'categorisationEntities' )
            // InternalErDsl.g:4544:1: 'categorisationEntities'
            {
             before(grammarAccess.getCategorisationAccess().getCategorisationEntitiesKeyword_5()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategorisationAccess().getCategorisationEntitiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__5__Impl"


    // $ANTLR start "rule__Categorisation__Group__6"
    // InternalErDsl.g:4557:1: rule__Categorisation__Group__6 : rule__Categorisation__Group__6__Impl rule__Categorisation__Group__7 ;
    public final void rule__Categorisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4561:1: ( rule__Categorisation__Group__6__Impl rule__Categorisation__Group__7 )
            // InternalErDsl.g:4562:2: rule__Categorisation__Group__6__Impl rule__Categorisation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Categorisation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__6"


    // $ANTLR start "rule__Categorisation__Group__6__Impl"
    // InternalErDsl.g:4569:1: rule__Categorisation__Group__6__Impl : ( ( rule__Categorisation__CategorisationEntitiesAssignment_6 ) ) ;
    public final void rule__Categorisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4573:1: ( ( ( rule__Categorisation__CategorisationEntitiesAssignment_6 ) ) )
            // InternalErDsl.g:4574:1: ( ( rule__Categorisation__CategorisationEntitiesAssignment_6 ) )
            {
            // InternalErDsl.g:4574:1: ( ( rule__Categorisation__CategorisationEntitiesAssignment_6 ) )
            // InternalErDsl.g:4575:1: ( rule__Categorisation__CategorisationEntitiesAssignment_6 )
            {
             before(grammarAccess.getCategorisationAccess().getCategorisationEntitiesAssignment_6()); 
            // InternalErDsl.g:4576:1: ( rule__Categorisation__CategorisationEntitiesAssignment_6 )
            // InternalErDsl.g:4576:2: rule__Categorisation__CategorisationEntitiesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__CategorisationEntitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCategorisationAccess().getCategorisationEntitiesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__6__Impl"


    // $ANTLR start "rule__Categorisation__Group__7"
    // InternalErDsl.g:4586:1: rule__Categorisation__Group__7 : rule__Categorisation__Group__7__Impl rule__Categorisation__Group__8 ;
    public final void rule__Categorisation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4590:1: ( rule__Categorisation__Group__7__Impl rule__Categorisation__Group__8 )
            // InternalErDsl.g:4591:2: rule__Categorisation__Group__7__Impl rule__Categorisation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Categorisation__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__7"


    // $ANTLR start "rule__Categorisation__Group__7__Impl"
    // InternalErDsl.g:4598:1: rule__Categorisation__Group__7__Impl : ( 'isPartial' ) ;
    public final void rule__Categorisation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4602:1: ( ( 'isPartial' ) )
            // InternalErDsl.g:4603:1: ( 'isPartial' )
            {
            // InternalErDsl.g:4603:1: ( 'isPartial' )
            // InternalErDsl.g:4604:1: 'isPartial'
            {
             before(grammarAccess.getCategorisationAccess().getIsPartialKeyword_7()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategorisationAccess().getIsPartialKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__7__Impl"


    // $ANTLR start "rule__Categorisation__Group__8"
    // InternalErDsl.g:4617:1: rule__Categorisation__Group__8 : rule__Categorisation__Group__8__Impl rule__Categorisation__Group__9 ;
    public final void rule__Categorisation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4621:1: ( rule__Categorisation__Group__8__Impl rule__Categorisation__Group__9 )
            // InternalErDsl.g:4622:2: rule__Categorisation__Group__8__Impl rule__Categorisation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Categorisation__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__8"


    // $ANTLR start "rule__Categorisation__Group__8__Impl"
    // InternalErDsl.g:4629:1: rule__Categorisation__Group__8__Impl : ( ( rule__Categorisation__IsPartialAssignment_8 ) ) ;
    public final void rule__Categorisation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4633:1: ( ( ( rule__Categorisation__IsPartialAssignment_8 ) ) )
            // InternalErDsl.g:4634:1: ( ( rule__Categorisation__IsPartialAssignment_8 ) )
            {
            // InternalErDsl.g:4634:1: ( ( rule__Categorisation__IsPartialAssignment_8 ) )
            // InternalErDsl.g:4635:1: ( rule__Categorisation__IsPartialAssignment_8 )
            {
             before(grammarAccess.getCategorisationAccess().getIsPartialAssignment_8()); 
            // InternalErDsl.g:4636:1: ( rule__Categorisation__IsPartialAssignment_8 )
            // InternalErDsl.g:4636:2: rule__Categorisation__IsPartialAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__IsPartialAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCategorisationAccess().getIsPartialAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__8__Impl"


    // $ANTLR start "rule__Categorisation__Group__9"
    // InternalErDsl.g:4646:1: rule__Categorisation__Group__9 : rule__Categorisation__Group__9__Impl ;
    public final void rule__Categorisation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4650:1: ( rule__Categorisation__Group__9__Impl )
            // InternalErDsl.g:4651:2: rule__Categorisation__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categorisation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__9"


    // $ANTLR start "rule__Categorisation__Group__9__Impl"
    // InternalErDsl.g:4657:1: rule__Categorisation__Group__9__Impl : ( '}' ) ;
    public final void rule__Categorisation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4661:1: ( ( '}' ) )
            // InternalErDsl.g:4662:1: ( '}' )
            {
            // InternalErDsl.g:4662:1: ( '}' )
            // InternalErDsl.g:4663:1: '}'
            {
             before(grammarAccess.getCategorisationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategorisationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__Group__9__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__0"
    // InternalErDsl.g:4696:1: rule__IdentificationDependency__Group__0 : rule__IdentificationDependency__Group__0__Impl rule__IdentificationDependency__Group__1 ;
    public final void rule__IdentificationDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4700:1: ( rule__IdentificationDependency__Group__0__Impl rule__IdentificationDependency__Group__1 )
            // InternalErDsl.g:4701:2: rule__IdentificationDependency__Group__0__Impl rule__IdentificationDependency__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__IdentificationDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__0"


    // $ANTLR start "rule__IdentificationDependency__Group__0__Impl"
    // InternalErDsl.g:4708:1: rule__IdentificationDependency__Group__0__Impl : ( 'IdentificationDependency' ) ;
    public final void rule__IdentificationDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4712:1: ( ( 'IdentificationDependency' ) )
            // InternalErDsl.g:4713:1: ( 'IdentificationDependency' )
            {
            // InternalErDsl.g:4713:1: ( 'IdentificationDependency' )
            // InternalErDsl.g:4714:1: 'IdentificationDependency'
            {
             before(grammarAccess.getIdentificationDependencyAccess().getIdentificationDependencyKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIdentificationDependencyAccess().getIdentificationDependencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__0__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__1"
    // InternalErDsl.g:4727:1: rule__IdentificationDependency__Group__1 : rule__IdentificationDependency__Group__1__Impl rule__IdentificationDependency__Group__2 ;
    public final void rule__IdentificationDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4731:1: ( rule__IdentificationDependency__Group__1__Impl rule__IdentificationDependency__Group__2 )
            // InternalErDsl.g:4732:2: rule__IdentificationDependency__Group__1__Impl rule__IdentificationDependency__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IdentificationDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__1"


    // $ANTLR start "rule__IdentificationDependency__Group__1__Impl"
    // InternalErDsl.g:4739:1: rule__IdentificationDependency__Group__1__Impl : ( ( rule__IdentificationDependency__NameAssignment_1 ) ) ;
    public final void rule__IdentificationDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4743:1: ( ( ( rule__IdentificationDependency__NameAssignment_1 ) ) )
            // InternalErDsl.g:4744:1: ( ( rule__IdentificationDependency__NameAssignment_1 ) )
            {
            // InternalErDsl.g:4744:1: ( ( rule__IdentificationDependency__NameAssignment_1 ) )
            // InternalErDsl.g:4745:1: ( rule__IdentificationDependency__NameAssignment_1 )
            {
             before(grammarAccess.getIdentificationDependencyAccess().getNameAssignment_1()); 
            // InternalErDsl.g:4746:1: ( rule__IdentificationDependency__NameAssignment_1 )
            // InternalErDsl.g:4746:2: rule__IdentificationDependency__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentificationDependencyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__1__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__2"
    // InternalErDsl.g:4756:1: rule__IdentificationDependency__Group__2 : rule__IdentificationDependency__Group__2__Impl rule__IdentificationDependency__Group__3 ;
    public final void rule__IdentificationDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4760:1: ( rule__IdentificationDependency__Group__2__Impl rule__IdentificationDependency__Group__3 )
            // InternalErDsl.g:4761:2: rule__IdentificationDependency__Group__2__Impl rule__IdentificationDependency__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__IdentificationDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__2"


    // $ANTLR start "rule__IdentificationDependency__Group__2__Impl"
    // InternalErDsl.g:4768:1: rule__IdentificationDependency__Group__2__Impl : ( '{' ) ;
    public final void rule__IdentificationDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4772:1: ( ( '{' ) )
            // InternalErDsl.g:4773:1: ( '{' )
            {
            // InternalErDsl.g:4773:1: ( '{' )
            // InternalErDsl.g:4774:1: '{'
            {
             before(grammarAccess.getIdentificationDependencyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIdentificationDependencyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__2__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__3"
    // InternalErDsl.g:4787:1: rule__IdentificationDependency__Group__3 : rule__IdentificationDependency__Group__3__Impl rule__IdentificationDependency__Group__4 ;
    public final void rule__IdentificationDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4791:1: ( rule__IdentificationDependency__Group__3__Impl rule__IdentificationDependency__Group__4 )
            // InternalErDsl.g:4792:2: rule__IdentificationDependency__Group__3__Impl rule__IdentificationDependency__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__IdentificationDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__3"


    // $ANTLR start "rule__IdentificationDependency__Group__3__Impl"
    // InternalErDsl.g:4799:1: rule__IdentificationDependency__Group__3__Impl : ( 'weakEntity' ) ;
    public final void rule__IdentificationDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4803:1: ( ( 'weakEntity' ) )
            // InternalErDsl.g:4804:1: ( 'weakEntity' )
            {
            // InternalErDsl.g:4804:1: ( 'weakEntity' )
            // InternalErDsl.g:4805:1: 'weakEntity'
            {
             before(grammarAccess.getIdentificationDependencyAccess().getWeakEntityKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIdentificationDependencyAccess().getWeakEntityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__3__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__4"
    // InternalErDsl.g:4818:1: rule__IdentificationDependency__Group__4 : rule__IdentificationDependency__Group__4__Impl rule__IdentificationDependency__Group__5 ;
    public final void rule__IdentificationDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4822:1: ( rule__IdentificationDependency__Group__4__Impl rule__IdentificationDependency__Group__5 )
            // InternalErDsl.g:4823:2: rule__IdentificationDependency__Group__4__Impl rule__IdentificationDependency__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__IdentificationDependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__4"


    // $ANTLR start "rule__IdentificationDependency__Group__4__Impl"
    // InternalErDsl.g:4830:1: rule__IdentificationDependency__Group__4__Impl : ( ( rule__IdentificationDependency__WeakEntityAssignment_4 ) ) ;
    public final void rule__IdentificationDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4834:1: ( ( ( rule__IdentificationDependency__WeakEntityAssignment_4 ) ) )
            // InternalErDsl.g:4835:1: ( ( rule__IdentificationDependency__WeakEntityAssignment_4 ) )
            {
            // InternalErDsl.g:4835:1: ( ( rule__IdentificationDependency__WeakEntityAssignment_4 ) )
            // InternalErDsl.g:4836:1: ( rule__IdentificationDependency__WeakEntityAssignment_4 )
            {
             before(grammarAccess.getIdentificationDependencyAccess().getWeakEntityAssignment_4()); 
            // InternalErDsl.g:4837:1: ( rule__IdentificationDependency__WeakEntityAssignment_4 )
            // InternalErDsl.g:4837:2: rule__IdentificationDependency__WeakEntityAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__WeakEntityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIdentificationDependencyAccess().getWeakEntityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__4__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__5"
    // InternalErDsl.g:4847:1: rule__IdentificationDependency__Group__5 : rule__IdentificationDependency__Group__5__Impl rule__IdentificationDependency__Group__6 ;
    public final void rule__IdentificationDependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4851:1: ( rule__IdentificationDependency__Group__5__Impl rule__IdentificationDependency__Group__6 )
            // InternalErDsl.g:4852:2: rule__IdentificationDependency__Group__5__Impl rule__IdentificationDependency__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__IdentificationDependency__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__5"


    // $ANTLR start "rule__IdentificationDependency__Group__5__Impl"
    // InternalErDsl.g:4859:1: rule__IdentificationDependency__Group__5__Impl : ( 'regularEntity' ) ;
    public final void rule__IdentificationDependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4863:1: ( ( 'regularEntity' ) )
            // InternalErDsl.g:4864:1: ( 'regularEntity' )
            {
            // InternalErDsl.g:4864:1: ( 'regularEntity' )
            // InternalErDsl.g:4865:1: 'regularEntity'
            {
             before(grammarAccess.getIdentificationDependencyAccess().getRegularEntityKeyword_5()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIdentificationDependencyAccess().getRegularEntityKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__5__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__6"
    // InternalErDsl.g:4878:1: rule__IdentificationDependency__Group__6 : rule__IdentificationDependency__Group__6__Impl rule__IdentificationDependency__Group__7 ;
    public final void rule__IdentificationDependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4882:1: ( rule__IdentificationDependency__Group__6__Impl rule__IdentificationDependency__Group__7 )
            // InternalErDsl.g:4883:2: rule__IdentificationDependency__Group__6__Impl rule__IdentificationDependency__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__IdentificationDependency__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__6"


    // $ANTLR start "rule__IdentificationDependency__Group__6__Impl"
    // InternalErDsl.g:4890:1: rule__IdentificationDependency__Group__6__Impl : ( ( rule__IdentificationDependency__RegularEntityAssignment_6 ) ) ;
    public final void rule__IdentificationDependency__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4894:1: ( ( ( rule__IdentificationDependency__RegularEntityAssignment_6 ) ) )
            // InternalErDsl.g:4895:1: ( ( rule__IdentificationDependency__RegularEntityAssignment_6 ) )
            {
            // InternalErDsl.g:4895:1: ( ( rule__IdentificationDependency__RegularEntityAssignment_6 ) )
            // InternalErDsl.g:4896:1: ( rule__IdentificationDependency__RegularEntityAssignment_6 )
            {
             before(grammarAccess.getIdentificationDependencyAccess().getRegularEntityAssignment_6()); 
            // InternalErDsl.g:4897:1: ( rule__IdentificationDependency__RegularEntityAssignment_6 )
            // InternalErDsl.g:4897:2: rule__IdentificationDependency__RegularEntityAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__RegularEntityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIdentificationDependencyAccess().getRegularEntityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__6__Impl"


    // $ANTLR start "rule__IdentificationDependency__Group__7"
    // InternalErDsl.g:4907:1: rule__IdentificationDependency__Group__7 : rule__IdentificationDependency__Group__7__Impl ;
    public final void rule__IdentificationDependency__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4911:1: ( rule__IdentificationDependency__Group__7__Impl )
            // InternalErDsl.g:4912:2: rule__IdentificationDependency__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IdentificationDependency__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__7"


    // $ANTLR start "rule__IdentificationDependency__Group__7__Impl"
    // InternalErDsl.g:4918:1: rule__IdentificationDependency__Group__7__Impl : ( '}' ) ;
    public final void rule__IdentificationDependency__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4922:1: ( ( '}' ) )
            // InternalErDsl.g:4923:1: ( '}' )
            {
            // InternalErDsl.g:4923:1: ( '}' )
            // InternalErDsl.g:4924:1: '}'
            {
             before(grammarAccess.getIdentificationDependencyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIdentificationDependencyAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__Group__7__Impl"


    // $ANTLR start "rule__RegularEntity__Group__0"
    // InternalErDsl.g:4953:1: rule__RegularEntity__Group__0 : rule__RegularEntity__Group__0__Impl rule__RegularEntity__Group__1 ;
    public final void rule__RegularEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4957:1: ( rule__RegularEntity__Group__0__Impl rule__RegularEntity__Group__1 )
            // InternalErDsl.g:4958:2: rule__RegularEntity__Group__0__Impl rule__RegularEntity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__RegularEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__0"


    // $ANTLR start "rule__RegularEntity__Group__0__Impl"
    // InternalErDsl.g:4965:1: rule__RegularEntity__Group__0__Impl : ( ( rule__RegularEntity__EntityAssignment_0 ) ) ;
    public final void rule__RegularEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4969:1: ( ( ( rule__RegularEntity__EntityAssignment_0 ) ) )
            // InternalErDsl.g:4970:1: ( ( rule__RegularEntity__EntityAssignment_0 ) )
            {
            // InternalErDsl.g:4970:1: ( ( rule__RegularEntity__EntityAssignment_0 ) )
            // InternalErDsl.g:4971:1: ( rule__RegularEntity__EntityAssignment_0 )
            {
             before(grammarAccess.getRegularEntityAccess().getEntityAssignment_0()); 
            // InternalErDsl.g:4972:1: ( rule__RegularEntity__EntityAssignment_0 )
            // InternalErDsl.g:4972:2: rule__RegularEntity__EntityAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__EntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegularEntityAccess().getEntityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__0__Impl"


    // $ANTLR start "rule__RegularEntity__Group__1"
    // InternalErDsl.g:4982:1: rule__RegularEntity__Group__1 : rule__RegularEntity__Group__1__Impl rule__RegularEntity__Group__2 ;
    public final void rule__RegularEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4986:1: ( rule__RegularEntity__Group__1__Impl rule__RegularEntity__Group__2 )
            // InternalErDsl.g:4987:2: rule__RegularEntity__Group__1__Impl rule__RegularEntity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__RegularEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__1"


    // $ANTLR start "rule__RegularEntity__Group__1__Impl"
    // InternalErDsl.g:4994:1: rule__RegularEntity__Group__1__Impl : ( '(' ) ;
    public final void rule__RegularEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:4998:1: ( ( '(' ) )
            // InternalErDsl.g:4999:1: ( '(' )
            {
            // InternalErDsl.g:4999:1: ( '(' )
            // InternalErDsl.g:5000:1: '('
            {
             before(grammarAccess.getRegularEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRegularEntityAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__1__Impl"


    // $ANTLR start "rule__RegularEntity__Group__2"
    // InternalErDsl.g:5013:1: rule__RegularEntity__Group__2 : rule__RegularEntity__Group__2__Impl rule__RegularEntity__Group__3 ;
    public final void rule__RegularEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5017:1: ( rule__RegularEntity__Group__2__Impl rule__RegularEntity__Group__3 )
            // InternalErDsl.g:5018:2: rule__RegularEntity__Group__2__Impl rule__RegularEntity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__RegularEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__2"


    // $ANTLR start "rule__RegularEntity__Group__2__Impl"
    // InternalErDsl.g:5025:1: rule__RegularEntity__Group__2__Impl : ( ( rule__RegularEntity__MinAssignment_2 ) ) ;
    public final void rule__RegularEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5029:1: ( ( ( rule__RegularEntity__MinAssignment_2 ) ) )
            // InternalErDsl.g:5030:1: ( ( rule__RegularEntity__MinAssignment_2 ) )
            {
            // InternalErDsl.g:5030:1: ( ( rule__RegularEntity__MinAssignment_2 ) )
            // InternalErDsl.g:5031:1: ( rule__RegularEntity__MinAssignment_2 )
            {
             before(grammarAccess.getRegularEntityAccess().getMinAssignment_2()); 
            // InternalErDsl.g:5032:1: ( rule__RegularEntity__MinAssignment_2 )
            // InternalErDsl.g:5032:2: rule__RegularEntity__MinAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__MinAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularEntityAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__2__Impl"


    // $ANTLR start "rule__RegularEntity__Group__3"
    // InternalErDsl.g:5042:1: rule__RegularEntity__Group__3 : rule__RegularEntity__Group__3__Impl rule__RegularEntity__Group__4 ;
    public final void rule__RegularEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5046:1: ( rule__RegularEntity__Group__3__Impl rule__RegularEntity__Group__4 )
            // InternalErDsl.g:5047:2: rule__RegularEntity__Group__3__Impl rule__RegularEntity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__RegularEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__3"


    // $ANTLR start "rule__RegularEntity__Group__3__Impl"
    // InternalErDsl.g:5054:1: rule__RegularEntity__Group__3__Impl : ( ',' ) ;
    public final void rule__RegularEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5058:1: ( ( ',' ) )
            // InternalErDsl.g:5059:1: ( ',' )
            {
            // InternalErDsl.g:5059:1: ( ',' )
            // InternalErDsl.g:5060:1: ','
            {
             before(grammarAccess.getRegularEntityAccess().getCommaKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRegularEntityAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__3__Impl"


    // $ANTLR start "rule__RegularEntity__Group__4"
    // InternalErDsl.g:5073:1: rule__RegularEntity__Group__4 : rule__RegularEntity__Group__4__Impl rule__RegularEntity__Group__5 ;
    public final void rule__RegularEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5077:1: ( rule__RegularEntity__Group__4__Impl rule__RegularEntity__Group__5 )
            // InternalErDsl.g:5078:2: rule__RegularEntity__Group__4__Impl rule__RegularEntity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__RegularEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__4"


    // $ANTLR start "rule__RegularEntity__Group__4__Impl"
    // InternalErDsl.g:5085:1: rule__RegularEntity__Group__4__Impl : ( ( rule__RegularEntity__MaxAssignment_4 ) ) ;
    public final void rule__RegularEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5089:1: ( ( ( rule__RegularEntity__MaxAssignment_4 ) ) )
            // InternalErDsl.g:5090:1: ( ( rule__RegularEntity__MaxAssignment_4 ) )
            {
            // InternalErDsl.g:5090:1: ( ( rule__RegularEntity__MaxAssignment_4 ) )
            // InternalErDsl.g:5091:1: ( rule__RegularEntity__MaxAssignment_4 )
            {
             before(grammarAccess.getRegularEntityAccess().getMaxAssignment_4()); 
            // InternalErDsl.g:5092:1: ( rule__RegularEntity__MaxAssignment_4 )
            // InternalErDsl.g:5092:2: rule__RegularEntity__MaxAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__MaxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularEntityAccess().getMaxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__4__Impl"


    // $ANTLR start "rule__RegularEntity__Group__5"
    // InternalErDsl.g:5102:1: rule__RegularEntity__Group__5 : rule__RegularEntity__Group__5__Impl rule__RegularEntity__Group__6 ;
    public final void rule__RegularEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5106:1: ( rule__RegularEntity__Group__5__Impl rule__RegularEntity__Group__6 )
            // InternalErDsl.g:5107:2: rule__RegularEntity__Group__5__Impl rule__RegularEntity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__RegularEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__5"


    // $ANTLR start "rule__RegularEntity__Group__5__Impl"
    // InternalErDsl.g:5114:1: rule__RegularEntity__Group__5__Impl : ( ')' ) ;
    public final void rule__RegularEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5118:1: ( ( ')' ) )
            // InternalErDsl.g:5119:1: ( ')' )
            {
            // InternalErDsl.g:5119:1: ( ')' )
            // InternalErDsl.g:5120:1: ')'
            {
             before(grammarAccess.getRegularEntityAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRegularEntityAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__5__Impl"


    // $ANTLR start "rule__RegularEntity__Group__6"
    // InternalErDsl.g:5133:1: rule__RegularEntity__Group__6 : rule__RegularEntity__Group__6__Impl ;
    public final void rule__RegularEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5137:1: ( rule__RegularEntity__Group__6__Impl )
            // InternalErDsl.g:5138:2: rule__RegularEntity__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RegularEntity__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__6"


    // $ANTLR start "rule__RegularEntity__Group__6__Impl"
    // InternalErDsl.g:5144:1: rule__RegularEntity__Group__6__Impl : ( ( rule__RegularEntity__RoleAssignment_6 )? ) ;
    public final void rule__RegularEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5148:1: ( ( ( rule__RegularEntity__RoleAssignment_6 )? ) )
            // InternalErDsl.g:5149:1: ( ( rule__RegularEntity__RoleAssignment_6 )? )
            {
            // InternalErDsl.g:5149:1: ( ( rule__RegularEntity__RoleAssignment_6 )? )
            // InternalErDsl.g:5150:1: ( rule__RegularEntity__RoleAssignment_6 )?
            {
             before(grammarAccess.getRegularEntityAccess().getRoleAssignment_6()); 
            // InternalErDsl.g:5151:1: ( rule__RegularEntity__RoleAssignment_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalErDsl.g:5151:2: rule__RegularEntity__RoleAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RegularEntity__RoleAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRegularEntityAccess().getRoleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__Group__6__Impl"


    // $ANTLR start "rule__Categories__Group__0"
    // InternalErDsl.g:5175:1: rule__Categories__Group__0 : rule__Categories__Group__0__Impl rule__Categories__Group__1 ;
    public final void rule__Categories__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5179:1: ( rule__Categories__Group__0__Impl rule__Categories__Group__1 )
            // InternalErDsl.g:5180:2: rule__Categories__Group__0__Impl rule__Categories__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Categories__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__0"


    // $ANTLR start "rule__Categories__Group__0__Impl"
    // InternalErDsl.g:5187:1: rule__Categories__Group__0__Impl : ( '(' ) ;
    public final void rule__Categories__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5191:1: ( ( '(' ) )
            // InternalErDsl.g:5192:1: ( '(' )
            {
            // InternalErDsl.g:5192:1: ( '(' )
            // InternalErDsl.g:5193:1: '('
            {
             before(grammarAccess.getCategoriesAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategoriesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__0__Impl"


    // $ANTLR start "rule__Categories__Group__1"
    // InternalErDsl.g:5206:1: rule__Categories__Group__1 : rule__Categories__Group__1__Impl rule__Categories__Group__2 ;
    public final void rule__Categories__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5210:1: ( rule__Categories__Group__1__Impl rule__Categories__Group__2 )
            // InternalErDsl.g:5211:2: rule__Categories__Group__1__Impl rule__Categories__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Categories__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__1"


    // $ANTLR start "rule__Categories__Group__1__Impl"
    // InternalErDsl.g:5218:1: rule__Categories__Group__1__Impl : ( ( rule__Categories__EntitiesAssignment_1 ) ) ;
    public final void rule__Categories__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5222:1: ( ( ( rule__Categories__EntitiesAssignment_1 ) ) )
            // InternalErDsl.g:5223:1: ( ( rule__Categories__EntitiesAssignment_1 ) )
            {
            // InternalErDsl.g:5223:1: ( ( rule__Categories__EntitiesAssignment_1 ) )
            // InternalErDsl.g:5224:1: ( rule__Categories__EntitiesAssignment_1 )
            {
             before(grammarAccess.getCategoriesAccess().getEntitiesAssignment_1()); 
            // InternalErDsl.g:5225:1: ( rule__Categories__EntitiesAssignment_1 )
            // InternalErDsl.g:5225:2: rule__Categories__EntitiesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__EntitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriesAccess().getEntitiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__1__Impl"


    // $ANTLR start "rule__Categories__Group__2"
    // InternalErDsl.g:5235:1: rule__Categories__Group__2 : rule__Categories__Group__2__Impl rule__Categories__Group__3 ;
    public final void rule__Categories__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5239:1: ( rule__Categories__Group__2__Impl rule__Categories__Group__3 )
            // InternalErDsl.g:5240:2: rule__Categories__Group__2__Impl rule__Categories__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Categories__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__2"


    // $ANTLR start "rule__Categories__Group__2__Impl"
    // InternalErDsl.g:5247:1: rule__Categories__Group__2__Impl : ( ( rule__Categories__Group_2__0 )* ) ;
    public final void rule__Categories__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5251:1: ( ( ( rule__Categories__Group_2__0 )* ) )
            // InternalErDsl.g:5252:1: ( ( rule__Categories__Group_2__0 )* )
            {
            // InternalErDsl.g:5252:1: ( ( rule__Categories__Group_2__0 )* )
            // InternalErDsl.g:5253:1: ( rule__Categories__Group_2__0 )*
            {
             before(grammarAccess.getCategoriesAccess().getGroup_2()); 
            // InternalErDsl.g:5254:1: ( rule__Categories__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==25) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalErDsl.g:5254:2: rule__Categories__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__Categories__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCategoriesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__2__Impl"


    // $ANTLR start "rule__Categories__Group__3"
    // InternalErDsl.g:5264:1: rule__Categories__Group__3 : rule__Categories__Group__3__Impl rule__Categories__Group__4 ;
    public final void rule__Categories__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5268:1: ( rule__Categories__Group__3__Impl rule__Categories__Group__4 )
            // InternalErDsl.g:5269:2: rule__Categories__Group__3__Impl rule__Categories__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Categories__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__3"


    // $ANTLR start "rule__Categories__Group__3__Impl"
    // InternalErDsl.g:5276:1: rule__Categories__Group__3__Impl : ( ')' ) ;
    public final void rule__Categories__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5280:1: ( ( ')' ) )
            // InternalErDsl.g:5281:1: ( ')' )
            {
            // InternalErDsl.g:5281:1: ( ')' )
            // InternalErDsl.g:5282:1: ')'
            {
             before(grammarAccess.getCategoriesAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategoriesAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__3__Impl"


    // $ANTLR start "rule__Categories__Group__4"
    // InternalErDsl.g:5295:1: rule__Categories__Group__4 : rule__Categories__Group__4__Impl rule__Categories__Group__5 ;
    public final void rule__Categories__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5299:1: ( rule__Categories__Group__4__Impl rule__Categories__Group__5 )
            // InternalErDsl.g:5300:2: rule__Categories__Group__4__Impl rule__Categories__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__Categories__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__4"


    // $ANTLR start "rule__Categories__Group__4__Impl"
    // InternalErDsl.g:5307:1: rule__Categories__Group__4__Impl : ( '(' ) ;
    public final void rule__Categories__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5311:1: ( ( '(' ) )
            // InternalErDsl.g:5312:1: ( '(' )
            {
            // InternalErDsl.g:5312:1: ( '(' )
            // InternalErDsl.g:5313:1: '('
            {
             before(grammarAccess.getCategoriesAccess().getLeftParenthesisKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategoriesAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__4__Impl"


    // $ANTLR start "rule__Categories__Group__5"
    // InternalErDsl.g:5326:1: rule__Categories__Group__5 : rule__Categories__Group__5__Impl rule__Categories__Group__6 ;
    public final void rule__Categories__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5330:1: ( rule__Categories__Group__5__Impl rule__Categories__Group__6 )
            // InternalErDsl.g:5331:2: rule__Categories__Group__5__Impl rule__Categories__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__Categories__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__5"


    // $ANTLR start "rule__Categories__Group__5__Impl"
    // InternalErDsl.g:5338:1: rule__Categories__Group__5__Impl : ( ( rule__Categories__MinAssignment_5 ) ) ;
    public final void rule__Categories__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5342:1: ( ( ( rule__Categories__MinAssignment_5 ) ) )
            // InternalErDsl.g:5343:1: ( ( rule__Categories__MinAssignment_5 ) )
            {
            // InternalErDsl.g:5343:1: ( ( rule__Categories__MinAssignment_5 ) )
            // InternalErDsl.g:5344:1: ( rule__Categories__MinAssignment_5 )
            {
             before(grammarAccess.getCategoriesAccess().getMinAssignment_5()); 
            // InternalErDsl.g:5345:1: ( rule__Categories__MinAssignment_5 )
            // InternalErDsl.g:5345:2: rule__Categories__MinAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__MinAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCategoriesAccess().getMinAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__5__Impl"


    // $ANTLR start "rule__Categories__Group__6"
    // InternalErDsl.g:5355:1: rule__Categories__Group__6 : rule__Categories__Group__6__Impl rule__Categories__Group__7 ;
    public final void rule__Categories__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5359:1: ( rule__Categories__Group__6__Impl rule__Categories__Group__7 )
            // InternalErDsl.g:5360:2: rule__Categories__Group__6__Impl rule__Categories__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__Categories__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__6"


    // $ANTLR start "rule__Categories__Group__6__Impl"
    // InternalErDsl.g:5367:1: rule__Categories__Group__6__Impl : ( ',' ) ;
    public final void rule__Categories__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5371:1: ( ( ',' ) )
            // InternalErDsl.g:5372:1: ( ',' )
            {
            // InternalErDsl.g:5372:1: ( ',' )
            // InternalErDsl.g:5373:1: ','
            {
             before(grammarAccess.getCategoriesAccess().getCommaKeyword_6()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategoriesAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__6__Impl"


    // $ANTLR start "rule__Categories__Group__7"
    // InternalErDsl.g:5386:1: rule__Categories__Group__7 : rule__Categories__Group__7__Impl rule__Categories__Group__8 ;
    public final void rule__Categories__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5390:1: ( rule__Categories__Group__7__Impl rule__Categories__Group__8 )
            // InternalErDsl.g:5391:2: rule__Categories__Group__7__Impl rule__Categories__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Categories__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__7"


    // $ANTLR start "rule__Categories__Group__7__Impl"
    // InternalErDsl.g:5398:1: rule__Categories__Group__7__Impl : ( ( rule__Categories__MaxAssignment_7 ) ) ;
    public final void rule__Categories__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5402:1: ( ( ( rule__Categories__MaxAssignment_7 ) ) )
            // InternalErDsl.g:5403:1: ( ( rule__Categories__MaxAssignment_7 ) )
            {
            // InternalErDsl.g:5403:1: ( ( rule__Categories__MaxAssignment_7 ) )
            // InternalErDsl.g:5404:1: ( rule__Categories__MaxAssignment_7 )
            {
             before(grammarAccess.getCategoriesAccess().getMaxAssignment_7()); 
            // InternalErDsl.g:5405:1: ( rule__Categories__MaxAssignment_7 )
            // InternalErDsl.g:5405:2: rule__Categories__MaxAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__MaxAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCategoriesAccess().getMaxAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__7__Impl"


    // $ANTLR start "rule__Categories__Group__8"
    // InternalErDsl.g:5415:1: rule__Categories__Group__8 : rule__Categories__Group__8__Impl ;
    public final void rule__Categories__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5419:1: ( rule__Categories__Group__8__Impl )
            // InternalErDsl.g:5420:2: rule__Categories__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__8"


    // $ANTLR start "rule__Categories__Group__8__Impl"
    // InternalErDsl.g:5426:1: rule__Categories__Group__8__Impl : ( ')' ) ;
    public final void rule__Categories__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5430:1: ( ( ')' ) )
            // InternalErDsl.g:5431:1: ( ')' )
            {
            // InternalErDsl.g:5431:1: ( ')' )
            // InternalErDsl.g:5432:1: ')'
            {
             before(grammarAccess.getCategoriesAccess().getRightParenthesisKeyword_8()); 
            match(input,33,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategoriesAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group__8__Impl"


    // $ANTLR start "rule__Categories__Group_2__0"
    // InternalErDsl.g:5463:1: rule__Categories__Group_2__0 : rule__Categories__Group_2__0__Impl rule__Categories__Group_2__1 ;
    public final void rule__Categories__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5467:1: ( rule__Categories__Group_2__0__Impl rule__Categories__Group_2__1 )
            // InternalErDsl.g:5468:2: rule__Categories__Group_2__0__Impl rule__Categories__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Categories__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group_2__0"


    // $ANTLR start "rule__Categories__Group_2__0__Impl"
    // InternalErDsl.g:5475:1: rule__Categories__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Categories__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5479:1: ( ( ',' ) )
            // InternalErDsl.g:5480:1: ( ',' )
            {
            // InternalErDsl.g:5480:1: ( ',' )
            // InternalErDsl.g:5481:1: ','
            {
             before(grammarAccess.getCategoriesAccess().getCommaKeyword_2_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getCategoriesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group_2__0__Impl"


    // $ANTLR start "rule__Categories__Group_2__1"
    // InternalErDsl.g:5494:1: rule__Categories__Group_2__1 : rule__Categories__Group_2__1__Impl ;
    public final void rule__Categories__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5498:1: ( rule__Categories__Group_2__1__Impl )
            // InternalErDsl.g:5499:2: rule__Categories__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group_2__1"


    // $ANTLR start "rule__Categories__Group_2__1__Impl"
    // InternalErDsl.g:5505:1: rule__Categories__Group_2__1__Impl : ( ( rule__Categories__EntitiesAssignment_2_1 ) ) ;
    public final void rule__Categories__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5509:1: ( ( ( rule__Categories__EntitiesAssignment_2_1 ) ) )
            // InternalErDsl.g:5510:1: ( ( rule__Categories__EntitiesAssignment_2_1 ) )
            {
            // InternalErDsl.g:5510:1: ( ( rule__Categories__EntitiesAssignment_2_1 ) )
            // InternalErDsl.g:5511:1: ( rule__Categories__EntitiesAssignment_2_1 )
            {
             before(grammarAccess.getCategoriesAccess().getEntitiesAssignment_2_1()); 
            // InternalErDsl.g:5512:1: ( rule__Categories__EntitiesAssignment_2_1 )
            // InternalErDsl.g:5512:2: rule__Categories__EntitiesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Categories__EntitiesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriesAccess().getEntitiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__Group_2__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalErDsl.g:5526:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5530:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalErDsl.g:5531:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalErDsl.g:5538:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5542:1: ( ( ( '-' )? ) )
            // InternalErDsl.g:5543:1: ( ( '-' )? )
            {
            // InternalErDsl.g:5543:1: ( ( '-' )? )
            // InternalErDsl.g:5544:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalErDsl.g:5545:1: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalErDsl.g:5546:2: '-'
                    {
                    match(input,48,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalErDsl.g:5557:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5561:1: ( rule__EInt__Group__1__Impl )
            // InternalErDsl.g:5562:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalErDsl.g:5568:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5572:1: ( ( RULE_INT ) )
            // InternalErDsl.g:5573:1: ( RULE_INT )
            {
            // InternalErDsl.g:5573:1: ( RULE_INT )
            // InternalErDsl.g:5574:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ERModel__NameAssignment_0"
    // InternalErDsl.g:5590:1: rule__ERModel__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ERModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5594:1: ( ( ruleEString ) )
            // InternalErDsl.g:5595:1: ( ruleEString )
            {
            // InternalErDsl.g:5595:1: ( ruleEString )
            // InternalErDsl.g:5596:1: ruleEString
            {
             before(grammarAccess.getERModelAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__NameAssignment_0"


    // $ANTLR start "rule__ERModel__DomainsAssignment_2_2"
    // InternalErDsl.g:5605:1: rule__ERModel__DomainsAssignment_2_2 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5609:1: ( ( ruleDomain ) )
            // InternalErDsl.g:5610:1: ( ruleDomain )
            {
            // InternalErDsl.g:5610:1: ( ruleDomain )
            // InternalErDsl.g:5611:1: ruleDomain
            {
             before(grammarAccess.getERModelAccess().getDomainsDomainParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getDomainsDomainParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__DomainsAssignment_2_2"


    // $ANTLR start "rule__ERModel__DomainsAssignment_2_3_1"
    // InternalErDsl.g:5620:1: rule__ERModel__DomainsAssignment_2_3_1 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5624:1: ( ( ruleDomain ) )
            // InternalErDsl.g:5625:1: ( ruleDomain )
            {
            // InternalErDsl.g:5625:1: ( ruleDomain )
            // InternalErDsl.g:5626:1: ruleDomain
            {
             before(grammarAccess.getERModelAccess().getDomainsDomainParserRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getDomainsDomainParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__DomainsAssignment_2_3_1"


    // $ANTLR start "rule__ERModel__EntitiesAssignment_3_2"
    // InternalErDsl.g:5635:1: rule__ERModel__EntitiesAssignment_3_2 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5639:1: ( ( ruleEntity ) )
            // InternalErDsl.g:5640:1: ( ruleEntity )
            {
            // InternalErDsl.g:5640:1: ( ruleEntity )
            // InternalErDsl.g:5641:1: ruleEntity
            {
             before(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__EntitiesAssignment_3_2"


    // $ANTLR start "rule__ERModel__EntitiesAssignment_3_3_1"
    // InternalErDsl.g:5650:1: rule__ERModel__EntitiesAssignment_3_3_1 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5654:1: ( ( ruleEntity ) )
            // InternalErDsl.g:5655:1: ( ruleEntity )
            {
            // InternalErDsl.g:5655:1: ( ruleEntity )
            // InternalErDsl.g:5656:1: ruleEntity
            {
             before(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__EntitiesAssignment_3_3_1"


    // $ANTLR start "rule__ERModel__GerundsAssignment_4_2"
    // InternalErDsl.g:5665:1: rule__ERModel__GerundsAssignment_4_2 : ( ruleGerund ) ;
    public final void rule__ERModel__GerundsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5669:1: ( ( ruleGerund ) )
            // InternalErDsl.g:5670:1: ( ruleGerund )
            {
            // InternalErDsl.g:5670:1: ( ruleGerund )
            // InternalErDsl.g:5671:1: ruleGerund
            {
             before(grammarAccess.getERModelAccess().getGerundsGerundParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGerund();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getGerundsGerundParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__GerundsAssignment_4_2"


    // $ANTLR start "rule__ERModel__GerundsAssignment_4_3_1"
    // InternalErDsl.g:5680:1: rule__ERModel__GerundsAssignment_4_3_1 : ( ruleGerund ) ;
    public final void rule__ERModel__GerundsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5684:1: ( ( ruleGerund ) )
            // InternalErDsl.g:5685:1: ( ruleGerund )
            {
            // InternalErDsl.g:5685:1: ( ruleGerund )
            // InternalErDsl.g:5686:1: ruleGerund
            {
             before(grammarAccess.getERModelAccess().getGerundsGerundParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleGerund();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getGerundsGerundParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__GerundsAssignment_4_3_1"


    // $ANTLR start "rule__ERModel__RelationshipsAssignment_5_2"
    // InternalErDsl.g:5695:1: rule__ERModel__RelationshipsAssignment_5_2 : ( ruleRelationshipConcept ) ;
    public final void rule__ERModel__RelationshipsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5699:1: ( ( ruleRelationshipConcept ) )
            // InternalErDsl.g:5700:1: ( ruleRelationshipConcept )
            {
            // InternalErDsl.g:5700:1: ( ruleRelationshipConcept )
            // InternalErDsl.g:5701:1: ruleRelationshipConcept
            {
             before(grammarAccess.getERModelAccess().getRelationshipsRelationshipConceptParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRelationshipConcept();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getRelationshipsRelationshipConceptParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__RelationshipsAssignment_5_2"


    // $ANTLR start "rule__ERModel__RelationshipsAssignment_5_3_1"
    // InternalErDsl.g:5710:1: rule__ERModel__RelationshipsAssignment_5_3_1 : ( ruleRelationshipConcept ) ;
    public final void rule__ERModel__RelationshipsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5714:1: ( ( ruleRelationshipConcept ) )
            // InternalErDsl.g:5715:1: ( ruleRelationshipConcept )
            {
            // InternalErDsl.g:5715:1: ( ruleRelationshipConcept )
            // InternalErDsl.g:5716:1: ruleRelationshipConcept
            {
             before(grammarAccess.getERModelAccess().getRelationshipsRelationshipConceptParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRelationshipConcept();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getRelationshipsRelationshipConceptParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__RelationshipsAssignment_5_3_1"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalErDsl.g:5725:1: rule__Entity__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5729:1: ( ( ruleEString ) )
            // InternalErDsl.g:5730:1: ( ruleEString )
            {
            // InternalErDsl.g:5730:1: ( ruleEString )
            // InternalErDsl.g:5731:1: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_0"


    // $ANTLR start "rule__Entity__EntityAttributesAssignment_2_2"
    // InternalErDsl.g:5740:1: rule__Entity__EntityAttributesAssignment_2_2 : ( ruleAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5744:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:5745:1: ( ruleAttribute )
            {
            // InternalErDsl.g:5745:1: ( ruleAttribute )
            // InternalErDsl.g:5746:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAttributeParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityAttributesAttributeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityAttributesAssignment_2_2"


    // $ANTLR start "rule__Entity__EntityAttributesAssignment_2_3_1"
    // InternalErDsl.g:5755:1: rule__Entity__EntityAttributesAssignment_2_3_1 : ( ruleAttribute ) ;
    public final void rule__Entity__EntityAttributesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5759:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:5760:1: ( ruleAttribute )
            {
            // InternalErDsl.g:5760:1: ( ruleAttribute )
            // InternalErDsl.g:5761:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getEntityAttributesAttributeParserRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEntityAttributesAttributeParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__EntityAttributesAssignment_2_3_1"


    // $ANTLR start "rule__Entity__KeySetAssignment_3_2"
    // InternalErDsl.g:5770:1: rule__Entity__KeySetAssignment_3_2 : ( ruleKey ) ;
    public final void rule__Entity__KeySetAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5774:1: ( ( ruleKey ) )
            // InternalErDsl.g:5775:1: ( ruleKey )
            {
            // InternalErDsl.g:5775:1: ( ruleKey )
            // InternalErDsl.g:5776:1: ruleKey
            {
             before(grammarAccess.getEntityAccess().getKeySetKeyParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getKeySetKeyParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__KeySetAssignment_3_2"


    // $ANTLR start "rule__Entity__KeySetAssignment_3_3_1"
    // InternalErDsl.g:5785:1: rule__Entity__KeySetAssignment_3_3_1 : ( ruleKey ) ;
    public final void rule__Entity__KeySetAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5789:1: ( ( ruleKey ) )
            // InternalErDsl.g:5790:1: ( ruleKey )
            {
            // InternalErDsl.g:5790:1: ( ruleKey )
            // InternalErDsl.g:5791:1: ruleKey
            {
             before(grammarAccess.getEntityAccess().getKeySetKeyParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getKeySetKeyParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__KeySetAssignment_3_3_1"


    // $ANTLR start "rule__Entity__PrimaryKeyAssignment_4_1"
    // InternalErDsl.g:5800:1: rule__Entity__PrimaryKeyAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Entity__PrimaryKeyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5804:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:5805:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:5805:1: ( ( ruleEString ) )
            // InternalErDsl.g:5806:1: ( ruleEString )
            {
             before(grammarAccess.getEntityAccess().getPrimaryKeyKeyCrossReference_4_1_0()); 
            // InternalErDsl.g:5807:1: ( ruleEString )
            // InternalErDsl.g:5808:1: ruleEString
            {
             before(grammarAccess.getEntityAccess().getPrimaryKeyKeyEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPrimaryKeyKeyEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getPrimaryKeyKeyCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PrimaryKeyAssignment_4_1"


    // $ANTLR start "rule__Gerund__RelationshipAssignment"
    // InternalErDsl.g:5819:1: rule__Gerund__RelationshipAssignment : ( ruleRelationship ) ;
    public final void rule__Gerund__RelationshipAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5823:1: ( ( ruleRelationship ) )
            // InternalErDsl.g:5824:1: ( ruleRelationship )
            {
            // InternalErDsl.g:5824:1: ( ruleRelationship )
            // InternalErDsl.g:5825:1: ruleRelationship
            {
             before(grammarAccess.getGerundAccess().getRelationshipRelationshipParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRelationship();

            state._fsp--;

             after(grammarAccess.getGerundAccess().getRelationshipRelationshipParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gerund__RelationshipAssignment"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalErDsl.g:5834:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5838:1: ( ( ruleEString ) )
            // InternalErDsl.g:5839:1: ( ruleEString )
            {
            // InternalErDsl.g:5839:1: ( ruleEString )
            // InternalErDsl.g:5840:1: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__AttributeDomainAssignment_2"
    // InternalErDsl.g:5849:1: rule__Attribute__AttributeDomainAssignment_2 : ( ruleAttributeDomain ) ;
    public final void rule__Attribute__AttributeDomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5853:1: ( ( ruleAttributeDomain ) )
            // InternalErDsl.g:5854:1: ( ruleAttributeDomain )
            {
            // InternalErDsl.g:5854:1: ( ruleAttributeDomain )
            // InternalErDsl.g:5855:1: ruleAttributeDomain
            {
             before(grammarAccess.getAttributeAccess().getAttributeDomainAttributeDomainParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttributeDomain();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeDomainAttributeDomainParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeDomainAssignment_2"


    // $ANTLR start "rule__AttributeDomain__DomainAssignment_0"
    // InternalErDsl.g:5864:1: rule__AttributeDomain__DomainAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__AttributeDomain__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5868:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:5869:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:5869:1: ( ( ruleEString ) )
            // InternalErDsl.g:5870:1: ( ruleEString )
            {
             before(grammarAccess.getAttributeDomainAccess().getDomainDomainCrossReference_0_0()); 
            // InternalErDsl.g:5871:1: ( ruleEString )
            // InternalErDsl.g:5872:1: ruleEString
            {
             before(grammarAccess.getAttributeDomainAccess().getDomainDomainEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeDomainAccess().getDomainDomainEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeDomainAccess().getDomainDomainCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__DomainAssignment_0"


    // $ANTLR start "rule__AttributeDomain__LengthAssignment_1_1"
    // InternalErDsl.g:5883:1: rule__AttributeDomain__LengthAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__AttributeDomain__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5887:1: ( ( ruleEInt ) )
            // InternalErDsl.g:5888:1: ( ruleEInt )
            {
            // InternalErDsl.g:5888:1: ( ruleEInt )
            // InternalErDsl.g:5889:1: ruleEInt
            {
             before(grammarAccess.getAttributeDomainAccess().getLengthEIntParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAttributeDomainAccess().getLengthEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__LengthAssignment_1_1"


    // $ANTLR start "rule__AttributeDomain__DefaultAssignment_2_1"
    // InternalErDsl.g:5898:1: rule__AttributeDomain__DefaultAssignment_2_1 : ( ruleEString ) ;
    public final void rule__AttributeDomain__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5902:1: ( ( ruleEString ) )
            // InternalErDsl.g:5903:1: ( ruleEString )
            {
            // InternalErDsl.g:5903:1: ( ruleEString )
            // InternalErDsl.g:5904:1: ruleEString
            {
             before(grammarAccess.getAttributeDomainAccess().getDefaultEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeDomainAccess().getDefaultEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDomain__DefaultAssignment_2_1"


    // $ANTLR start "rule__Key__NameAssignment_0"
    // InternalErDsl.g:5913:1: rule__Key__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Key__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5917:1: ( ( ruleEString ) )
            // InternalErDsl.g:5918:1: ( ruleEString )
            {
            // InternalErDsl.g:5918:1: ( ruleEString )
            // InternalErDsl.g:5919:1: ruleEString
            {
             before(grammarAccess.getKeyAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__NameAssignment_0"


    // $ANTLR start "rule__Key__KeyAttributesAssignment_2"
    // InternalErDsl.g:5928:1: rule__Key__KeyAttributesAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Key__KeyAttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5932:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:5933:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:5933:1: ( ( ruleEString ) )
            // InternalErDsl.g:5934:1: ( ruleEString )
            {
             before(grammarAccess.getKeyAccess().getKeyAttributesAttributeCrossReference_2_0()); 
            // InternalErDsl.g:5935:1: ( ruleEString )
            // InternalErDsl.g:5936:1: ruleEString
            {
             before(grammarAccess.getKeyAccess().getKeyAttributesAttributeEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyAccess().getKeyAttributesAttributeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getKeyAccess().getKeyAttributesAttributeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__KeyAttributesAssignment_2"


    // $ANTLR start "rule__Key__KeyAttributesAssignment_3_1"
    // InternalErDsl.g:5947:1: rule__Key__KeyAttributesAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Key__KeyAttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5951:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:5952:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:5952:1: ( ( ruleEString ) )
            // InternalErDsl.g:5953:1: ( ruleEString )
            {
             before(grammarAccess.getKeyAccess().getKeyAttributesAttributeCrossReference_3_1_0()); 
            // InternalErDsl.g:5954:1: ( ruleEString )
            // InternalErDsl.g:5955:1: ruleEString
            {
             before(grammarAccess.getKeyAccess().getKeyAttributesAttributeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyAccess().getKeyAttributesAttributeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getKeyAccess().getKeyAttributesAttributeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__KeyAttributesAssignment_3_1"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalErDsl.g:5966:1: rule__Domain__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5970:1: ( ( ruleEString ) )
            // InternalErDsl.g:5971:1: ( ruleEString )
            {
            // InternalErDsl.g:5971:1: ( ruleEString )
            // InternalErDsl.g:5972:1: ruleEString
            {
             before(grammarAccess.getDomainAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__Domain__PrimitiveDomainAssignment_3"
    // InternalErDsl.g:5981:1: rule__Domain__PrimitiveDomainAssignment_3 : ( rulePrimitiveDomain ) ;
    public final void rule__Domain__PrimitiveDomainAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:5985:1: ( ( rulePrimitiveDomain ) )
            // InternalErDsl.g:5986:1: ( rulePrimitiveDomain )
            {
            // InternalErDsl.g:5986:1: ( rulePrimitiveDomain )
            // InternalErDsl.g:5987:1: rulePrimitiveDomain
            {
             before(grammarAccess.getDomainAccess().getPrimitiveDomainPrimitiveDomainParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimitiveDomain();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getPrimitiveDomainPrimitiveDomainParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__PrimitiveDomainAssignment_3"


    // $ANTLR start "rule__Relationship__NameAssignment_0"
    // InternalErDsl.g:5996:1: rule__Relationship__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Relationship__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6000:1: ( ( ruleEString ) )
            // InternalErDsl.g:6001:1: ( ruleEString )
            {
            // InternalErDsl.g:6001:1: ( ruleEString )
            // InternalErDsl.g:6002:1: ruleEString
            {
             before(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__NameAssignment_0"


    // $ANTLR start "rule__Relationship__EntitiesAssignment_4"
    // InternalErDsl.g:6011:1: rule__Relationship__EntitiesAssignment_4 : ( ruleRegularEntity ) ;
    public final void rule__Relationship__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6015:1: ( ( ruleRegularEntity ) )
            // InternalErDsl.g:6016:1: ( ruleRegularEntity )
            {
            // InternalErDsl.g:6016:1: ( ruleRegularEntity )
            // InternalErDsl.g:6017:1: ruleRegularEntity
            {
             before(grammarAccess.getRelationshipAccess().getEntitiesRegularEntityParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRegularEntity();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getEntitiesRegularEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__EntitiesAssignment_4"


    // $ANTLR start "rule__Relationship__EntitiesAssignment_5_1"
    // InternalErDsl.g:6026:1: rule__Relationship__EntitiesAssignment_5_1 : ( ruleRegularEntity ) ;
    public final void rule__Relationship__EntitiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6030:1: ( ( ruleRegularEntity ) )
            // InternalErDsl.g:6031:1: ( ruleRegularEntity )
            {
            // InternalErDsl.g:6031:1: ( ruleRegularEntity )
            // InternalErDsl.g:6032:1: ruleRegularEntity
            {
             before(grammarAccess.getRelationshipAccess().getEntitiesRegularEntityParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRegularEntity();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getEntitiesRegularEntityParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__EntitiesAssignment_5_1"


    // $ANTLR start "rule__Relationship__RelationshipAttributesAssignment_7_2"
    // InternalErDsl.g:6041:1: rule__Relationship__RelationshipAttributesAssignment_7_2 : ( ruleAttribute ) ;
    public final void rule__Relationship__RelationshipAttributesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6045:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:6046:1: ( ruleAttribute )
            {
            // InternalErDsl.g:6046:1: ( ruleAttribute )
            // InternalErDsl.g:6047:1: ruleAttribute
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAttributesAttributeParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getRelationshipAttributesAttributeParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__RelationshipAttributesAssignment_7_2"


    // $ANTLR start "rule__Relationship__RelationshipAttributesAssignment_7_3_1"
    // InternalErDsl.g:6056:1: rule__Relationship__RelationshipAttributesAssignment_7_3_1 : ( ruleAttribute ) ;
    public final void rule__Relationship__RelationshipAttributesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6060:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:6061:1: ( ruleAttribute )
            {
            // InternalErDsl.g:6061:1: ( ruleAttribute )
            // InternalErDsl.g:6062:1: ruleAttribute
            {
             before(grammarAccess.getRelationshipAccess().getRelationshipAttributesAttributeParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationshipAccess().getRelationshipAttributesAttributeParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relationship__RelationshipAttributesAssignment_7_3_1"


    // $ANTLR start "rule__ISA__NameAssignment_1"
    // InternalErDsl.g:6071:1: rule__ISA__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ISA__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6075:1: ( ( ruleEString ) )
            // InternalErDsl.g:6076:1: ( ruleEString )
            {
            // InternalErDsl.g:6076:1: ( ruleEString )
            // InternalErDsl.g:6077:1: ruleEString
            {
             before(grammarAccess.getISAAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getISAAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__NameAssignment_1"


    // $ANTLR start "rule__ISA__SupertypeAssignment_4"
    // InternalErDsl.g:6086:1: rule__ISA__SupertypeAssignment_4 : ( ruleRegularEntity ) ;
    public final void rule__ISA__SupertypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6090:1: ( ( ruleRegularEntity ) )
            // InternalErDsl.g:6091:1: ( ruleRegularEntity )
            {
            // InternalErDsl.g:6091:1: ( ruleRegularEntity )
            // InternalErDsl.g:6092:1: ruleRegularEntity
            {
             before(grammarAccess.getISAAccess().getSupertypeRegularEntityParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRegularEntity();

            state._fsp--;

             after(grammarAccess.getISAAccess().getSupertypeRegularEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__SupertypeAssignment_4"


    // $ANTLR start "rule__ISA__SubtypesAssignment_7"
    // InternalErDsl.g:6101:1: rule__ISA__SubtypesAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ISA__SubtypesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6105:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6106:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6106:1: ( ( ruleEString ) )
            // InternalErDsl.g:6107:1: ( ruleEString )
            {
             before(grammarAccess.getISAAccess().getSubtypesEntityCrossReference_7_0()); 
            // InternalErDsl.g:6108:1: ( ruleEString )
            // InternalErDsl.g:6109:1: ruleEString
            {
             before(grammarAccess.getISAAccess().getSubtypesEntityEStringParserRuleCall_7_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getISAAccess().getSubtypesEntityEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getISAAccess().getSubtypesEntityCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__SubtypesAssignment_7"


    // $ANTLR start "rule__ISA__SubtypesAssignment_8_1"
    // InternalErDsl.g:6120:1: rule__ISA__SubtypesAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__ISA__SubtypesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6124:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6125:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6125:1: ( ( ruleEString ) )
            // InternalErDsl.g:6126:1: ( ruleEString )
            {
             before(grammarAccess.getISAAccess().getSubtypesEntityCrossReference_8_1_0()); 
            // InternalErDsl.g:6127:1: ( ruleEString )
            // InternalErDsl.g:6128:1: ruleEString
            {
             before(grammarAccess.getISAAccess().getSubtypesEntityEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getISAAccess().getSubtypesEntityEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getISAAccess().getSubtypesEntityCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__SubtypesAssignment_8_1"


    // $ANTLR start "rule__ISA__ClassificationAttributeAssignment_11"
    // InternalErDsl.g:6139:1: rule__ISA__ClassificationAttributeAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__ISA__ClassificationAttributeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6143:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6144:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6144:1: ( ( ruleEString ) )
            // InternalErDsl.g:6145:1: ( ruleEString )
            {
             before(grammarAccess.getISAAccess().getClassificationAttributeAttributeCrossReference_11_0()); 
            // InternalErDsl.g:6146:1: ( ruleEString )
            // InternalErDsl.g:6147:1: ruleEString
            {
             before(grammarAccess.getISAAccess().getClassificationAttributeAttributeEStringParserRuleCall_11_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getISAAccess().getClassificationAttributeAttributeEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getISAAccess().getClassificationAttributeAttributeCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ISA__ClassificationAttributeAssignment_11"


    // $ANTLR start "rule__Categorisation__NameAssignment_1"
    // InternalErDsl.g:6158:1: rule__Categorisation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Categorisation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6162:1: ( ( ruleEString ) )
            // InternalErDsl.g:6163:1: ( ruleEString )
            {
            // InternalErDsl.g:6163:1: ( ruleEString )
            // InternalErDsl.g:6164:1: ruleEString
            {
             before(grammarAccess.getCategorisationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategorisationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__NameAssignment_1"


    // $ANTLR start "rule__Categorisation__CategorisedEntityAssignment_4"
    // InternalErDsl.g:6173:1: rule__Categorisation__CategorisedEntityAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Categorisation__CategorisedEntityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6177:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6178:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6178:1: ( ( ruleEString ) )
            // InternalErDsl.g:6179:1: ( ruleEString )
            {
             before(grammarAccess.getCategorisationAccess().getCategorisedEntityEntityConceptCrossReference_4_0()); 
            // InternalErDsl.g:6180:1: ( ruleEString )
            // InternalErDsl.g:6181:1: ruleEString
            {
             before(grammarAccess.getCategorisationAccess().getCategorisedEntityEntityConceptEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategorisationAccess().getCategorisedEntityEntityConceptEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCategorisationAccess().getCategorisedEntityEntityConceptCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__CategorisedEntityAssignment_4"


    // $ANTLR start "rule__Categorisation__CategorisationEntitiesAssignment_6"
    // InternalErDsl.g:6192:1: rule__Categorisation__CategorisationEntitiesAssignment_6 : ( ruleCategories ) ;
    public final void rule__Categorisation__CategorisationEntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6196:1: ( ( ruleCategories ) )
            // InternalErDsl.g:6197:1: ( ruleCategories )
            {
            // InternalErDsl.g:6197:1: ( ruleCategories )
            // InternalErDsl.g:6198:1: ruleCategories
            {
             before(grammarAccess.getCategorisationAccess().getCategorisationEntitiesCategoriesParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCategories();

            state._fsp--;

             after(grammarAccess.getCategorisationAccess().getCategorisationEntitiesCategoriesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__CategorisationEntitiesAssignment_6"


    // $ANTLR start "rule__Categorisation__IsPartialAssignment_8"
    // InternalErDsl.g:6207:1: rule__Categorisation__IsPartialAssignment_8 : ( ruleEBoolean ) ;
    public final void rule__Categorisation__IsPartialAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6211:1: ( ( ruleEBoolean ) )
            // InternalErDsl.g:6212:1: ( ruleEBoolean )
            {
            // InternalErDsl.g:6212:1: ( ruleEBoolean )
            // InternalErDsl.g:6213:1: ruleEBoolean
            {
             before(grammarAccess.getCategorisationAccess().getIsPartialEBooleanParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getCategorisationAccess().getIsPartialEBooleanParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categorisation__IsPartialAssignment_8"


    // $ANTLR start "rule__IdentificationDependency__NameAssignment_1"
    // InternalErDsl.g:6222:1: rule__IdentificationDependency__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__IdentificationDependency__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6226:1: ( ( ruleEString ) )
            // InternalErDsl.g:6227:1: ( ruleEString )
            {
            // InternalErDsl.g:6227:1: ( ruleEString )
            // InternalErDsl.g:6228:1: ruleEString
            {
             before(grammarAccess.getIdentificationDependencyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentificationDependencyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__NameAssignment_1"


    // $ANTLR start "rule__IdentificationDependency__WeakEntityAssignment_4"
    // InternalErDsl.g:6237:1: rule__IdentificationDependency__WeakEntityAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__IdentificationDependency__WeakEntityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6241:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6242:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6242:1: ( ( ruleEString ) )
            // InternalErDsl.g:6243:1: ( ruleEString )
            {
             before(grammarAccess.getIdentificationDependencyAccess().getWeakEntityEntityCrossReference_4_0()); 
            // InternalErDsl.g:6244:1: ( ruleEString )
            // InternalErDsl.g:6245:1: ruleEString
            {
             before(grammarAccess.getIdentificationDependencyAccess().getWeakEntityEntityEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentificationDependencyAccess().getWeakEntityEntityEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getIdentificationDependencyAccess().getWeakEntityEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__WeakEntityAssignment_4"


    // $ANTLR start "rule__IdentificationDependency__RegularEntityAssignment_6"
    // InternalErDsl.g:6256:1: rule__IdentificationDependency__RegularEntityAssignment_6 : ( ruleRegularEntity ) ;
    public final void rule__IdentificationDependency__RegularEntityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6260:1: ( ( ruleRegularEntity ) )
            // InternalErDsl.g:6261:1: ( ruleRegularEntity )
            {
            // InternalErDsl.g:6261:1: ( ruleRegularEntity )
            // InternalErDsl.g:6262:1: ruleRegularEntity
            {
             before(grammarAccess.getIdentificationDependencyAccess().getRegularEntityRegularEntityParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRegularEntity();

            state._fsp--;

             after(grammarAccess.getIdentificationDependencyAccess().getRegularEntityRegularEntityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IdentificationDependency__RegularEntityAssignment_6"


    // $ANTLR start "rule__RegularEntity__EntityAssignment_0"
    // InternalErDsl.g:6271:1: rule__RegularEntity__EntityAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__RegularEntity__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6275:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6276:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6276:1: ( ( ruleEString ) )
            // InternalErDsl.g:6277:1: ( ruleEString )
            {
             before(grammarAccess.getRegularEntityAccess().getEntityEntityConceptCrossReference_0_0()); 
            // InternalErDsl.g:6278:1: ( ruleEString )
            // InternalErDsl.g:6279:1: ruleEString
            {
             before(grammarAccess.getRegularEntityAccess().getEntityEntityConceptEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegularEntityAccess().getEntityEntityConceptEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRegularEntityAccess().getEntityEntityConceptCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__EntityAssignment_0"


    // $ANTLR start "rule__RegularEntity__MinAssignment_2"
    // InternalErDsl.g:6290:1: rule__RegularEntity__MinAssignment_2 : ( ruleMinCardinality ) ;
    public final void rule__RegularEntity__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6294:1: ( ( ruleMinCardinality ) )
            // InternalErDsl.g:6295:1: ( ruleMinCardinality )
            {
            // InternalErDsl.g:6295:1: ( ruleMinCardinality )
            // InternalErDsl.g:6296:1: ruleMinCardinality
            {
             before(grammarAccess.getRegularEntityAccess().getMinMinCardinalityParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMinCardinality();

            state._fsp--;

             after(grammarAccess.getRegularEntityAccess().getMinMinCardinalityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__MinAssignment_2"


    // $ANTLR start "rule__RegularEntity__MaxAssignment_4"
    // InternalErDsl.g:6305:1: rule__RegularEntity__MaxAssignment_4 : ( ruleMaxCardinality ) ;
    public final void rule__RegularEntity__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6309:1: ( ( ruleMaxCardinality ) )
            // InternalErDsl.g:6310:1: ( ruleMaxCardinality )
            {
            // InternalErDsl.g:6310:1: ( ruleMaxCardinality )
            // InternalErDsl.g:6311:1: ruleMaxCardinality
            {
             before(grammarAccess.getRegularEntityAccess().getMaxMaxCardinalityParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMaxCardinality();

            state._fsp--;

             after(grammarAccess.getRegularEntityAccess().getMaxMaxCardinalityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__MaxAssignment_4"


    // $ANTLR start "rule__RegularEntity__RoleAssignment_6"
    // InternalErDsl.g:6320:1: rule__RegularEntity__RoleAssignment_6 : ( ruleEString ) ;
    public final void rule__RegularEntity__RoleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6324:1: ( ( ruleEString ) )
            // InternalErDsl.g:6325:1: ( ruleEString )
            {
            // InternalErDsl.g:6325:1: ( ruleEString )
            // InternalErDsl.g:6326:1: ruleEString
            {
             before(grammarAccess.getRegularEntityAccess().getRoleEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegularEntityAccess().getRoleEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularEntity__RoleAssignment_6"


    // $ANTLR start "rule__Categories__EntitiesAssignment_1"
    // InternalErDsl.g:6335:1: rule__Categories__EntitiesAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Categories__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6339:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6340:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6340:1: ( ( ruleEString ) )
            // InternalErDsl.g:6341:1: ( ruleEString )
            {
             before(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptCrossReference_1_0()); 
            // InternalErDsl.g:6342:1: ( ruleEString )
            // InternalErDsl.g:6343:1: ruleEString
            {
             before(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__EntitiesAssignment_1"


    // $ANTLR start "rule__Categories__EntitiesAssignment_2_1"
    // InternalErDsl.g:6354:1: rule__Categories__EntitiesAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Categories__EntitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6358:1: ( ( ( ruleEString ) ) )
            // InternalErDsl.g:6359:1: ( ( ruleEString ) )
            {
            // InternalErDsl.g:6359:1: ( ( ruleEString ) )
            // InternalErDsl.g:6360:1: ( ruleEString )
            {
             before(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptCrossReference_2_1_0()); 
            // InternalErDsl.g:6361:1: ( ruleEString )
            // InternalErDsl.g:6362:1: ruleEString
            {
             before(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCategoriesAccess().getEntitiesEntityConceptCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__EntitiesAssignment_2_1"


    // $ANTLR start "rule__Categories__MinAssignment_5"
    // InternalErDsl.g:6373:1: rule__Categories__MinAssignment_5 : ( ruleMinCardinality ) ;
    public final void rule__Categories__MinAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6377:1: ( ( ruleMinCardinality ) )
            // InternalErDsl.g:6378:1: ( ruleMinCardinality )
            {
            // InternalErDsl.g:6378:1: ( ruleMinCardinality )
            // InternalErDsl.g:6379:1: ruleMinCardinality
            {
             before(grammarAccess.getCategoriesAccess().getMinMinCardinalityParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMinCardinality();

            state._fsp--;

             after(grammarAccess.getCategoriesAccess().getMinMinCardinalityParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__MinAssignment_5"


    // $ANTLR start "rule__Categories__MaxAssignment_7"
    // InternalErDsl.g:6388:1: rule__Categories__MaxAssignment_7 : ( ruleMaxCardinality ) ;
    public final void rule__Categories__MaxAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalErDsl.g:6392:1: ( ( ruleMaxCardinality ) )
            // InternalErDsl.g:6393:1: ( ruleMaxCardinality )
            {
            // InternalErDsl.g:6393:1: ( ruleMaxCardinality )
            // InternalErDsl.g:6394:1: ruleMaxCardinality
            {
             before(grammarAccess.getCategoriesAccess().getMaxMaxCardinalityParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMaxCardinality();

            state._fsp--;

             after(grammarAccess.getCategoriesAccess().getMaxMaxCardinalityParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categories__MaxAssignment_7"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001D800000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002800000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000222000000030L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000E0800000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000000040L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000202000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000FC000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000003000L});
    }


}