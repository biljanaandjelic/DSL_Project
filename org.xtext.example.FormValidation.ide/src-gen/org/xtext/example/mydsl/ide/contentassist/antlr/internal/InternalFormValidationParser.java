package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.FormValidationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormValidationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Number'", "'Date'", "'{'", "'}'", "'type'", "'Required'", "'Email'", "'MinLength'", "'MaxLength'", "'Length'", "'MinNumber'", "'MinDate'", "'MaxNumber'", "'MaxDate'", "'AcceptableValuesString'", "','", "'AcceptableValuesDate'", "'StringPattern'", "'DatePattern'", "'.'", "'NotEquals'", "'attributearray'", "'GreaterThan'", "'classattribute'", "'Equals'", "'LessThan'", "'('", "')'", "'isRequired'", "'isEmail'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(FormValidationGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleValidationClass"
    // InternalFormValidation.g:53:1: entryRuleValidationClass : ruleValidationClass EOF ;
    public final void entryRuleValidationClass() throws RecognitionException {
        try {
            // InternalFormValidation.g:54:1: ( ruleValidationClass EOF )
            // InternalFormValidation.g:55:1: ruleValidationClass EOF
            {
             before(grammarAccess.getValidationClassRule()); 
            pushFollow(FOLLOW_1);
            ruleValidationClass();

            state._fsp--;

             after(grammarAccess.getValidationClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidationClass"


    // $ANTLR start "ruleValidationClass"
    // InternalFormValidation.g:62:1: ruleValidationClass : ( ( rule__ValidationClass__Group__0 ) ) ;
    public final void ruleValidationClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:66:2: ( ( ( rule__ValidationClass__Group__0 ) ) )
            // InternalFormValidation.g:67:2: ( ( rule__ValidationClass__Group__0 ) )
            {
            // InternalFormValidation.g:67:2: ( ( rule__ValidationClass__Group__0 ) )
            // InternalFormValidation.g:68:3: ( rule__ValidationClass__Group__0 )
            {
             before(grammarAccess.getValidationClassAccess().getGroup()); 
            // InternalFormValidation.g:69:3: ( rule__ValidationClass__Group__0 )
            // InternalFormValidation.g:69:4: rule__ValidationClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationClassAccess().getGroup()); 

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
    // $ANTLR end "ruleValidationClass"


    // $ANTLR start "entryRuleClassRule"
    // InternalFormValidation.g:78:1: entryRuleClassRule : ruleClassRule EOF ;
    public final void entryRuleClassRule() throws RecognitionException {
        try {
            // InternalFormValidation.g:79:1: ( ruleClassRule EOF )
            // InternalFormValidation.g:80:1: ruleClassRule EOF
            {
             before(grammarAccess.getClassRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleClassRule();

            state._fsp--;

             after(grammarAccess.getClassRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassRule"


    // $ANTLR start "ruleClassRule"
    // InternalFormValidation.g:87:1: ruleClassRule : ( ( rule__ClassRule__Alternatives ) ) ;
    public final void ruleClassRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:91:2: ( ( ( rule__ClassRule__Alternatives ) ) )
            // InternalFormValidation.g:92:2: ( ( rule__ClassRule__Alternatives ) )
            {
            // InternalFormValidation.g:92:2: ( ( rule__ClassRule__Alternatives ) )
            // InternalFormValidation.g:93:3: ( rule__ClassRule__Alternatives )
            {
             before(grammarAccess.getClassRuleAccess().getAlternatives()); 
            // InternalFormValidation.g:94:3: ( rule__ClassRule__Alternatives )
            // InternalFormValidation.g:94:4: rule__ClassRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleClassRule"


    // $ANTLR start "entryRuleAttributeRule"
    // InternalFormValidation.g:103:1: entryRuleAttributeRule : ruleAttributeRule EOF ;
    public final void entryRuleAttributeRule() throws RecognitionException {
        try {
            // InternalFormValidation.g:104:1: ( ruleAttributeRule EOF )
            // InternalFormValidation.g:105:1: ruleAttributeRule EOF
            {
             before(grammarAccess.getAttributeRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeRule();

            state._fsp--;

             after(grammarAccess.getAttributeRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeRule"


    // $ANTLR start "ruleAttributeRule"
    // InternalFormValidation.g:112:1: ruleAttributeRule : ( ( rule__AttributeRule__Alternatives ) ) ;
    public final void ruleAttributeRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:116:2: ( ( ( rule__AttributeRule__Alternatives ) ) )
            // InternalFormValidation.g:117:2: ( ( rule__AttributeRule__Alternatives ) )
            {
            // InternalFormValidation.g:117:2: ( ( rule__AttributeRule__Alternatives ) )
            // InternalFormValidation.g:118:3: ( rule__AttributeRule__Alternatives )
            {
             before(grammarAccess.getAttributeRuleAccess().getAlternatives()); 
            // InternalFormValidation.g:119:3: ( rule__AttributeRule__Alternatives )
            // InternalFormValidation.g:119:4: rule__AttributeRule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeRule"


    // $ANTLR start "entryRuleEString"
    // InternalFormValidation.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFormValidation.g:129:1: ( ruleEString EOF )
            // InternalFormValidation.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalFormValidation.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFormValidation.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFormValidation.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalFormValidation.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFormValidation.g:144:3: ( rule__EString__Alternatives )
            // InternalFormValidation.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleClassAttribute"
    // InternalFormValidation.g:153:1: entryRuleClassAttribute : ruleClassAttribute EOF ;
    public final void entryRuleClassAttribute() throws RecognitionException {
        try {
            // InternalFormValidation.g:154:1: ( ruleClassAttribute EOF )
            // InternalFormValidation.g:155:1: ruleClassAttribute EOF
            {
             before(grammarAccess.getClassAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleClassAttribute();

            state._fsp--;

             after(grammarAccess.getClassAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassAttribute"


    // $ANTLR start "ruleClassAttribute"
    // InternalFormValidation.g:162:1: ruleClassAttribute : ( ( rule__ClassAttribute__Group__0 ) ) ;
    public final void ruleClassAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:166:2: ( ( ( rule__ClassAttribute__Group__0 ) ) )
            // InternalFormValidation.g:167:2: ( ( rule__ClassAttribute__Group__0 ) )
            {
            // InternalFormValidation.g:167:2: ( ( rule__ClassAttribute__Group__0 ) )
            // InternalFormValidation.g:168:3: ( rule__ClassAttribute__Group__0 )
            {
             before(grammarAccess.getClassAttributeAccess().getGroup()); 
            // InternalFormValidation.g:169:3: ( rule__ClassAttribute__Group__0 )
            // InternalFormValidation.g:169:4: rule__ClassAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleClassAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalFormValidation.g:178:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalFormValidation.g:179:1: ( ruleAttributeType EOF )
            // InternalFormValidation.g:180:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalFormValidation.g:187:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:191:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // InternalFormValidation.g:192:2: ( ( rule__AttributeType__Group__0 ) )
            {
            // InternalFormValidation.g:192:2: ( ( rule__AttributeType__Group__0 ) )
            // InternalFormValidation.g:193:3: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // InternalFormValidation.g:194:3: ( rule__AttributeType__Group__0 )
            // InternalFormValidation.g:194:4: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleRequired"
    // InternalFormValidation.g:203:1: entryRuleRequired : ruleRequired EOF ;
    public final void entryRuleRequired() throws RecognitionException {
        try {
            // InternalFormValidation.g:204:1: ( ruleRequired EOF )
            // InternalFormValidation.g:205:1: ruleRequired EOF
            {
             before(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_1);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getRequiredRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // InternalFormValidation.g:212:1: ruleRequired : ( ( rule__Required__Group__0 ) ) ;
    public final void ruleRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:216:2: ( ( ( rule__Required__Group__0 ) ) )
            // InternalFormValidation.g:217:2: ( ( rule__Required__Group__0 ) )
            {
            // InternalFormValidation.g:217:2: ( ( rule__Required__Group__0 ) )
            // InternalFormValidation.g:218:3: ( rule__Required__Group__0 )
            {
             before(grammarAccess.getRequiredAccess().getGroup()); 
            // InternalFormValidation.g:219:3: ( rule__Required__Group__0 )
            // InternalFormValidation.g:219:4: rule__Required__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Required__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredAccess().getGroup()); 

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
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleEmail"
    // InternalFormValidation.g:228:1: entryRuleEmail : ruleEmail EOF ;
    public final void entryRuleEmail() throws RecognitionException {
        try {
            // InternalFormValidation.g:229:1: ( ruleEmail EOF )
            // InternalFormValidation.g:230:1: ruleEmail EOF
            {
             before(grammarAccess.getEmailRule()); 
            pushFollow(FOLLOW_1);
            ruleEmail();

            state._fsp--;

             after(grammarAccess.getEmailRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEmail"


    // $ANTLR start "ruleEmail"
    // InternalFormValidation.g:237:1: ruleEmail : ( ( rule__Email__Group__0 ) ) ;
    public final void ruleEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:241:2: ( ( ( rule__Email__Group__0 ) ) )
            // InternalFormValidation.g:242:2: ( ( rule__Email__Group__0 ) )
            {
            // InternalFormValidation.g:242:2: ( ( rule__Email__Group__0 ) )
            // InternalFormValidation.g:243:3: ( rule__Email__Group__0 )
            {
             before(grammarAccess.getEmailAccess().getGroup()); 
            // InternalFormValidation.g:244:3: ( rule__Email__Group__0 )
            // InternalFormValidation.g:244:4: rule__Email__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Email__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmailAccess().getGroup()); 

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
    // $ANTLR end "ruleEmail"


    // $ANTLR start "entryRuleMinLength"
    // InternalFormValidation.g:253:1: entryRuleMinLength : ruleMinLength EOF ;
    public final void entryRuleMinLength() throws RecognitionException {
        try {
            // InternalFormValidation.g:254:1: ( ruleMinLength EOF )
            // InternalFormValidation.g:255:1: ruleMinLength EOF
            {
             before(grammarAccess.getMinLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleMinLength();

            state._fsp--;

             after(grammarAccess.getMinLengthRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMinLength"


    // $ANTLR start "ruleMinLength"
    // InternalFormValidation.g:262:1: ruleMinLength : ( ( rule__MinLength__Group__0 ) ) ;
    public final void ruleMinLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:266:2: ( ( ( rule__MinLength__Group__0 ) ) )
            // InternalFormValidation.g:267:2: ( ( rule__MinLength__Group__0 ) )
            {
            // InternalFormValidation.g:267:2: ( ( rule__MinLength__Group__0 ) )
            // InternalFormValidation.g:268:3: ( rule__MinLength__Group__0 )
            {
             before(grammarAccess.getMinLengthAccess().getGroup()); 
            // InternalFormValidation.g:269:3: ( rule__MinLength__Group__0 )
            // InternalFormValidation.g:269:4: rule__MinLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinLength__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinLengthAccess().getGroup()); 

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
    // $ANTLR end "ruleMinLength"


    // $ANTLR start "entryRuleMaxLength"
    // InternalFormValidation.g:278:1: entryRuleMaxLength : ruleMaxLength EOF ;
    public final void entryRuleMaxLength() throws RecognitionException {
        try {
            // InternalFormValidation.g:279:1: ( ruleMaxLength EOF )
            // InternalFormValidation.g:280:1: ruleMaxLength EOF
            {
             before(grammarAccess.getMaxLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxLength();

            state._fsp--;

             after(grammarAccess.getMaxLengthRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaxLength"


    // $ANTLR start "ruleMaxLength"
    // InternalFormValidation.g:287:1: ruleMaxLength : ( ( rule__MaxLength__Group__0 ) ) ;
    public final void ruleMaxLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:291:2: ( ( ( rule__MaxLength__Group__0 ) ) )
            // InternalFormValidation.g:292:2: ( ( rule__MaxLength__Group__0 ) )
            {
            // InternalFormValidation.g:292:2: ( ( rule__MaxLength__Group__0 ) )
            // InternalFormValidation.g:293:3: ( rule__MaxLength__Group__0 )
            {
             before(grammarAccess.getMaxLengthAccess().getGroup()); 
            // InternalFormValidation.g:294:3: ( rule__MaxLength__Group__0 )
            // InternalFormValidation.g:294:4: rule__MaxLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxLength__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxLengthAccess().getGroup()); 

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
    // $ANTLR end "ruleMaxLength"


    // $ANTLR start "entryRuleLength"
    // InternalFormValidation.g:303:1: entryRuleLength : ruleLength EOF ;
    public final void entryRuleLength() throws RecognitionException {
        try {
            // InternalFormValidation.g:304:1: ( ruleLength EOF )
            // InternalFormValidation.g:305:1: ruleLength EOF
            {
             before(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleLength();

            state._fsp--;

             after(grammarAccess.getLengthRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // InternalFormValidation.g:312:1: ruleLength : ( ( rule__Length__Group__0 ) ) ;
    public final void ruleLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:316:2: ( ( ( rule__Length__Group__0 ) ) )
            // InternalFormValidation.g:317:2: ( ( rule__Length__Group__0 ) )
            {
            // InternalFormValidation.g:317:2: ( ( rule__Length__Group__0 ) )
            // InternalFormValidation.g:318:3: ( rule__Length__Group__0 )
            {
             before(grammarAccess.getLengthAccess().getGroup()); 
            // InternalFormValidation.g:319:3: ( rule__Length__Group__0 )
            // InternalFormValidation.g:319:4: rule__Length__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Length__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLengthAccess().getGroup()); 

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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleMinNumber"
    // InternalFormValidation.g:328:1: entryRuleMinNumber : ruleMinNumber EOF ;
    public final void entryRuleMinNumber() throws RecognitionException {
        try {
            // InternalFormValidation.g:329:1: ( ruleMinNumber EOF )
            // InternalFormValidation.g:330:1: ruleMinNumber EOF
            {
             before(grammarAccess.getMinNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleMinNumber();

            state._fsp--;

             after(grammarAccess.getMinNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMinNumber"


    // $ANTLR start "ruleMinNumber"
    // InternalFormValidation.g:337:1: ruleMinNumber : ( ( rule__MinNumber__Group__0 ) ) ;
    public final void ruleMinNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:341:2: ( ( ( rule__MinNumber__Group__0 ) ) )
            // InternalFormValidation.g:342:2: ( ( rule__MinNumber__Group__0 ) )
            {
            // InternalFormValidation.g:342:2: ( ( rule__MinNumber__Group__0 ) )
            // InternalFormValidation.g:343:3: ( rule__MinNumber__Group__0 )
            {
             before(grammarAccess.getMinNumberAccess().getGroup()); 
            // InternalFormValidation.g:344:3: ( rule__MinNumber__Group__0 )
            // InternalFormValidation.g:344:4: rule__MinNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleMinNumber"


    // $ANTLR start "entryRuleMinDate"
    // InternalFormValidation.g:353:1: entryRuleMinDate : ruleMinDate EOF ;
    public final void entryRuleMinDate() throws RecognitionException {
        try {
            // InternalFormValidation.g:354:1: ( ruleMinDate EOF )
            // InternalFormValidation.g:355:1: ruleMinDate EOF
            {
             before(grammarAccess.getMinDateRule()); 
            pushFollow(FOLLOW_1);
            ruleMinDate();

            state._fsp--;

             after(grammarAccess.getMinDateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMinDate"


    // $ANTLR start "ruleMinDate"
    // InternalFormValidation.g:362:1: ruleMinDate : ( ( rule__MinDate__Group__0 ) ) ;
    public final void ruleMinDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:366:2: ( ( ( rule__MinDate__Group__0 ) ) )
            // InternalFormValidation.g:367:2: ( ( rule__MinDate__Group__0 ) )
            {
            // InternalFormValidation.g:367:2: ( ( rule__MinDate__Group__0 ) )
            // InternalFormValidation.g:368:3: ( rule__MinDate__Group__0 )
            {
             before(grammarAccess.getMinDateAccess().getGroup()); 
            // InternalFormValidation.g:369:3: ( rule__MinDate__Group__0 )
            // InternalFormValidation.g:369:4: rule__MinDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinDateAccess().getGroup()); 

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
    // $ANTLR end "ruleMinDate"


    // $ANTLR start "entryRuleMaxNumber"
    // InternalFormValidation.g:378:1: entryRuleMaxNumber : ruleMaxNumber EOF ;
    public final void entryRuleMaxNumber() throws RecognitionException {
        try {
            // InternalFormValidation.g:379:1: ( ruleMaxNumber EOF )
            // InternalFormValidation.g:380:1: ruleMaxNumber EOF
            {
             before(grammarAccess.getMaxNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxNumber();

            state._fsp--;

             after(grammarAccess.getMaxNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaxNumber"


    // $ANTLR start "ruleMaxNumber"
    // InternalFormValidation.g:387:1: ruleMaxNumber : ( ( rule__MaxNumber__Group__0 ) ) ;
    public final void ruleMaxNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:391:2: ( ( ( rule__MaxNumber__Group__0 ) ) )
            // InternalFormValidation.g:392:2: ( ( rule__MaxNumber__Group__0 ) )
            {
            // InternalFormValidation.g:392:2: ( ( rule__MaxNumber__Group__0 ) )
            // InternalFormValidation.g:393:3: ( rule__MaxNumber__Group__0 )
            {
             before(grammarAccess.getMaxNumberAccess().getGroup()); 
            // InternalFormValidation.g:394:3: ( rule__MaxNumber__Group__0 )
            // InternalFormValidation.g:394:4: rule__MaxNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleMaxNumber"


    // $ANTLR start "entryRuleMaxDate"
    // InternalFormValidation.g:403:1: entryRuleMaxDate : ruleMaxDate EOF ;
    public final void entryRuleMaxDate() throws RecognitionException {
        try {
            // InternalFormValidation.g:404:1: ( ruleMaxDate EOF )
            // InternalFormValidation.g:405:1: ruleMaxDate EOF
            {
             before(grammarAccess.getMaxDateRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxDate();

            state._fsp--;

             after(grammarAccess.getMaxDateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMaxDate"


    // $ANTLR start "ruleMaxDate"
    // InternalFormValidation.g:412:1: ruleMaxDate : ( ( rule__MaxDate__Group__0 ) ) ;
    public final void ruleMaxDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:416:2: ( ( ( rule__MaxDate__Group__0 ) ) )
            // InternalFormValidation.g:417:2: ( ( rule__MaxDate__Group__0 ) )
            {
            // InternalFormValidation.g:417:2: ( ( rule__MaxDate__Group__0 ) )
            // InternalFormValidation.g:418:3: ( rule__MaxDate__Group__0 )
            {
             before(grammarAccess.getMaxDateAccess().getGroup()); 
            // InternalFormValidation.g:419:3: ( rule__MaxDate__Group__0 )
            // InternalFormValidation.g:419:4: rule__MaxDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxDateAccess().getGroup()); 

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
    // $ANTLR end "ruleMaxDate"


    // $ANTLR start "entryRuleAcceptableValuesString"
    // InternalFormValidation.g:428:1: entryRuleAcceptableValuesString : ruleAcceptableValuesString EOF ;
    public final void entryRuleAcceptableValuesString() throws RecognitionException {
        try {
            // InternalFormValidation.g:429:1: ( ruleAcceptableValuesString EOF )
            // InternalFormValidation.g:430:1: ruleAcceptableValuesString EOF
            {
             before(grammarAccess.getAcceptableValuesStringRule()); 
            pushFollow(FOLLOW_1);
            ruleAcceptableValuesString();

            state._fsp--;

             after(grammarAccess.getAcceptableValuesStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAcceptableValuesString"


    // $ANTLR start "ruleAcceptableValuesString"
    // InternalFormValidation.g:437:1: ruleAcceptableValuesString : ( ( rule__AcceptableValuesString__Group__0 ) ) ;
    public final void ruleAcceptableValuesString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:441:2: ( ( ( rule__AcceptableValuesString__Group__0 ) ) )
            // InternalFormValidation.g:442:2: ( ( rule__AcceptableValuesString__Group__0 ) )
            {
            // InternalFormValidation.g:442:2: ( ( rule__AcceptableValuesString__Group__0 ) )
            // InternalFormValidation.g:443:3: ( rule__AcceptableValuesString__Group__0 )
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getGroup()); 
            // InternalFormValidation.g:444:3: ( rule__AcceptableValuesString__Group__0 )
            // InternalFormValidation.g:444:4: rule__AcceptableValuesString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAcceptableValuesStringAccess().getGroup()); 

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
    // $ANTLR end "ruleAcceptableValuesString"


    // $ANTLR start "entryRuleAcceptableValuesDate"
    // InternalFormValidation.g:453:1: entryRuleAcceptableValuesDate : ruleAcceptableValuesDate EOF ;
    public final void entryRuleAcceptableValuesDate() throws RecognitionException {
        try {
            // InternalFormValidation.g:454:1: ( ruleAcceptableValuesDate EOF )
            // InternalFormValidation.g:455:1: ruleAcceptableValuesDate EOF
            {
             before(grammarAccess.getAcceptableValuesDateRule()); 
            pushFollow(FOLLOW_1);
            ruleAcceptableValuesDate();

            state._fsp--;

             after(grammarAccess.getAcceptableValuesDateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAcceptableValuesDate"


    // $ANTLR start "ruleAcceptableValuesDate"
    // InternalFormValidation.g:462:1: ruleAcceptableValuesDate : ( ( rule__AcceptableValuesDate__Group__0 ) ) ;
    public final void ruleAcceptableValuesDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:466:2: ( ( ( rule__AcceptableValuesDate__Group__0 ) ) )
            // InternalFormValidation.g:467:2: ( ( rule__AcceptableValuesDate__Group__0 ) )
            {
            // InternalFormValidation.g:467:2: ( ( rule__AcceptableValuesDate__Group__0 ) )
            // InternalFormValidation.g:468:3: ( rule__AcceptableValuesDate__Group__0 )
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getGroup()); 
            // InternalFormValidation.g:469:3: ( rule__AcceptableValuesDate__Group__0 )
            // InternalFormValidation.g:469:4: rule__AcceptableValuesDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAcceptableValuesDateAccess().getGroup()); 

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
    // $ANTLR end "ruleAcceptableValuesDate"


    // $ANTLR start "entryRuleStringPattern"
    // InternalFormValidation.g:478:1: entryRuleStringPattern : ruleStringPattern EOF ;
    public final void entryRuleStringPattern() throws RecognitionException {
        try {
            // InternalFormValidation.g:479:1: ( ruleStringPattern EOF )
            // InternalFormValidation.g:480:1: ruleStringPattern EOF
            {
             before(grammarAccess.getStringPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleStringPattern();

            state._fsp--;

             after(grammarAccess.getStringPatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringPattern"


    // $ANTLR start "ruleStringPattern"
    // InternalFormValidation.g:487:1: ruleStringPattern : ( ( rule__StringPattern__Group__0 ) ) ;
    public final void ruleStringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:491:2: ( ( ( rule__StringPattern__Group__0 ) ) )
            // InternalFormValidation.g:492:2: ( ( rule__StringPattern__Group__0 ) )
            {
            // InternalFormValidation.g:492:2: ( ( rule__StringPattern__Group__0 ) )
            // InternalFormValidation.g:493:3: ( rule__StringPattern__Group__0 )
            {
             before(grammarAccess.getStringPatternAccess().getGroup()); 
            // InternalFormValidation.g:494:3: ( rule__StringPattern__Group__0 )
            // InternalFormValidation.g:494:4: rule__StringPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringPatternAccess().getGroup()); 

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
    // $ANTLR end "ruleStringPattern"


    // $ANTLR start "entryRuleDatePattern"
    // InternalFormValidation.g:503:1: entryRuleDatePattern : ruleDatePattern EOF ;
    public final void entryRuleDatePattern() throws RecognitionException {
        try {
            // InternalFormValidation.g:504:1: ( ruleDatePattern EOF )
            // InternalFormValidation.g:505:1: ruleDatePattern EOF
            {
             before(grammarAccess.getDatePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleDatePattern();

            state._fsp--;

             after(grammarAccess.getDatePatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDatePattern"


    // $ANTLR start "ruleDatePattern"
    // InternalFormValidation.g:512:1: ruleDatePattern : ( ( rule__DatePattern__Group__0 ) ) ;
    public final void ruleDatePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:516:2: ( ( ( rule__DatePattern__Group__0 ) ) )
            // InternalFormValidation.g:517:2: ( ( rule__DatePattern__Group__0 ) )
            {
            // InternalFormValidation.g:517:2: ( ( rule__DatePattern__Group__0 ) )
            // InternalFormValidation.g:518:3: ( rule__DatePattern__Group__0 )
            {
             before(grammarAccess.getDatePatternAccess().getGroup()); 
            // InternalFormValidation.g:519:3: ( rule__DatePattern__Group__0 )
            // InternalFormValidation.g:519:4: rule__DatePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DatePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatePatternAccess().getGroup()); 

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
    // $ANTLR end "ruleDatePattern"


    // $ANTLR start "entryRuleInt0"
    // InternalFormValidation.g:528:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // InternalFormValidation.g:529:1: ( ruleInt0 EOF )
            // InternalFormValidation.g:530:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalFormValidation.g:537:1: ruleInt0 : ( RULE_INT ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:541:2: ( ( RULE_INT ) )
            // InternalFormValidation.g:542:2: ( RULE_INT )
            {
            // InternalFormValidation.g:542:2: ( RULE_INT )
            // InternalFormValidation.g:543:3: RULE_INT
            {
             before(grammarAccess.getInt0Access().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleFloat"
    // InternalFormValidation.g:553:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalFormValidation.g:554:1: ( ruleFloat EOF )
            // InternalFormValidation.g:555:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalFormValidation.g:562:1: ruleFloat : ( ( rule__Float__Alternatives ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:566:2: ( ( ( rule__Float__Alternatives ) ) )
            // InternalFormValidation.g:567:2: ( ( rule__Float__Alternatives ) )
            {
            // InternalFormValidation.g:567:2: ( ( rule__Float__Alternatives ) )
            // InternalFormValidation.g:568:3: ( rule__Float__Alternatives )
            {
             before(grammarAccess.getFloatAccess().getAlternatives()); 
            // InternalFormValidation.g:569:3: ( rule__Float__Alternatives )
            // InternalFormValidation.g:569:4: rule__Float__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Float__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleNotEquals"
    // InternalFormValidation.g:578:1: entryRuleNotEquals : ruleNotEquals EOF ;
    public final void entryRuleNotEquals() throws RecognitionException {
        try {
            // InternalFormValidation.g:579:1: ( ruleNotEquals EOF )
            // InternalFormValidation.g:580:1: ruleNotEquals EOF
            {
             before(grammarAccess.getNotEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleNotEquals();

            state._fsp--;

             after(grammarAccess.getNotEqualsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotEquals"


    // $ANTLR start "ruleNotEquals"
    // InternalFormValidation.g:587:1: ruleNotEquals : ( ( rule__NotEquals__Group__0 ) ) ;
    public final void ruleNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:591:2: ( ( ( rule__NotEquals__Group__0 ) ) )
            // InternalFormValidation.g:592:2: ( ( rule__NotEquals__Group__0 ) )
            {
            // InternalFormValidation.g:592:2: ( ( rule__NotEquals__Group__0 ) )
            // InternalFormValidation.g:593:3: ( rule__NotEquals__Group__0 )
            {
             before(grammarAccess.getNotEqualsAccess().getGroup()); 
            // InternalFormValidation.g:594:3: ( rule__NotEquals__Group__0 )
            // InternalFormValidation.g:594:4: rule__NotEquals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotEqualsAccess().getGroup()); 

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
    // $ANTLR end "ruleNotEquals"


    // $ANTLR start "entryRuleGreaterThan"
    // InternalFormValidation.g:603:1: entryRuleGreaterThan : ruleGreaterThan EOF ;
    public final void entryRuleGreaterThan() throws RecognitionException {
        try {
            // InternalFormValidation.g:604:1: ( ruleGreaterThan EOF )
            // InternalFormValidation.g:605:1: ruleGreaterThan EOF
            {
             before(grammarAccess.getGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            ruleGreaterThan();

            state._fsp--;

             after(grammarAccess.getGreaterThanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGreaterThan"


    // $ANTLR start "ruleGreaterThan"
    // InternalFormValidation.g:612:1: ruleGreaterThan : ( ( rule__GreaterThan__Group__0 ) ) ;
    public final void ruleGreaterThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:616:2: ( ( ( rule__GreaterThan__Group__0 ) ) )
            // InternalFormValidation.g:617:2: ( ( rule__GreaterThan__Group__0 ) )
            {
            // InternalFormValidation.g:617:2: ( ( rule__GreaterThan__Group__0 ) )
            // InternalFormValidation.g:618:3: ( rule__GreaterThan__Group__0 )
            {
             before(grammarAccess.getGreaterThanAccess().getGroup()); 
            // InternalFormValidation.g:619:3: ( rule__GreaterThan__Group__0 )
            // InternalFormValidation.g:619:4: rule__GreaterThan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getGroup()); 

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
    // $ANTLR end "ruleGreaterThan"


    // $ANTLR start "entryRuleEquals"
    // InternalFormValidation.g:628:1: entryRuleEquals : ruleEquals EOF ;
    public final void entryRuleEquals() throws RecognitionException {
        try {
            // InternalFormValidation.g:629:1: ( ruleEquals EOF )
            // InternalFormValidation.g:630:1: ruleEquals EOF
            {
             before(grammarAccess.getEqualsRule()); 
            pushFollow(FOLLOW_1);
            ruleEquals();

            state._fsp--;

             after(grammarAccess.getEqualsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEquals"


    // $ANTLR start "ruleEquals"
    // InternalFormValidation.g:637:1: ruleEquals : ( ( rule__Equals__Group__0 ) ) ;
    public final void ruleEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:641:2: ( ( ( rule__Equals__Group__0 ) ) )
            // InternalFormValidation.g:642:2: ( ( rule__Equals__Group__0 ) )
            {
            // InternalFormValidation.g:642:2: ( ( rule__Equals__Group__0 ) )
            // InternalFormValidation.g:643:3: ( rule__Equals__Group__0 )
            {
             before(grammarAccess.getEqualsAccess().getGroup()); 
            // InternalFormValidation.g:644:3: ( rule__Equals__Group__0 )
            // InternalFormValidation.g:644:4: rule__Equals__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualsAccess().getGroup()); 

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
    // $ANTLR end "ruleEquals"


    // $ANTLR start "entryRuleLessThan"
    // InternalFormValidation.g:653:1: entryRuleLessThan : ruleLessThan EOF ;
    public final void entryRuleLessThan() throws RecognitionException {
        try {
            // InternalFormValidation.g:654:1: ( ruleLessThan EOF )
            // InternalFormValidation.g:655:1: ruleLessThan EOF
            {
             before(grammarAccess.getLessThanRule()); 
            pushFollow(FOLLOW_1);
            ruleLessThan();

            state._fsp--;

             after(grammarAccess.getLessThanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLessThan"


    // $ANTLR start "ruleLessThan"
    // InternalFormValidation.g:662:1: ruleLessThan : ( ( rule__LessThan__Group__0 ) ) ;
    public final void ruleLessThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:666:2: ( ( ( rule__LessThan__Group__0 ) ) )
            // InternalFormValidation.g:667:2: ( ( rule__LessThan__Group__0 ) )
            {
            // InternalFormValidation.g:667:2: ( ( rule__LessThan__Group__0 ) )
            // InternalFormValidation.g:668:3: ( rule__LessThan__Group__0 )
            {
             before(grammarAccess.getLessThanAccess().getGroup()); 
            // InternalFormValidation.g:669:3: ( rule__LessThan__Group__0 )
            // InternalFormValidation.g:669:4: rule__LessThan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLessThanAccess().getGroup()); 

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
    // $ANTLR end "ruleLessThan"


    // $ANTLR start "entryRuleAttributeArray"
    // InternalFormValidation.g:678:1: entryRuleAttributeArray : ruleAttributeArray EOF ;
    public final void entryRuleAttributeArray() throws RecognitionException {
        try {
            // InternalFormValidation.g:679:1: ( ruleAttributeArray EOF )
            // InternalFormValidation.g:680:1: ruleAttributeArray EOF
            {
             before(grammarAccess.getAttributeArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getAttributeArrayRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeArray"


    // $ANTLR start "ruleAttributeArray"
    // InternalFormValidation.g:687:1: ruleAttributeArray : ( ( rule__AttributeArray__Group__0 ) ) ;
    public final void ruleAttributeArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:691:2: ( ( ( rule__AttributeArray__Group__0 ) ) )
            // InternalFormValidation.g:692:2: ( ( rule__AttributeArray__Group__0 ) )
            {
            // InternalFormValidation.g:692:2: ( ( rule__AttributeArray__Group__0 ) )
            // InternalFormValidation.g:693:3: ( rule__AttributeArray__Group__0 )
            {
             before(grammarAccess.getAttributeArrayAccess().getGroup()); 
            // InternalFormValidation.g:694:3: ( rule__AttributeArray__Group__0 )
            // InternalFormValidation.g:694:4: rule__AttributeArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeArrayAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeArray"


    // $ANTLR start "ruleEVrsta"
    // InternalFormValidation.g:703:1: ruleEVrsta : ( ( rule__EVrsta__Alternatives ) ) ;
    public final void ruleEVrsta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:707:1: ( ( ( rule__EVrsta__Alternatives ) ) )
            // InternalFormValidation.g:708:2: ( ( rule__EVrsta__Alternatives ) )
            {
            // InternalFormValidation.g:708:2: ( ( rule__EVrsta__Alternatives ) )
            // InternalFormValidation.g:709:3: ( rule__EVrsta__Alternatives )
            {
             before(grammarAccess.getEVrstaAccess().getAlternatives()); 
            // InternalFormValidation.g:710:3: ( rule__EVrsta__Alternatives )
            // InternalFormValidation.g:710:4: rule__EVrsta__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EVrsta__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEVrstaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEVrsta"


    // $ANTLR start "rule__ClassRule__Alternatives"
    // InternalFormValidation.g:718:1: rule__ClassRule__Alternatives : ( ( ruleNotEquals ) | ( ruleGreaterThan ) | ( ruleEquals ) | ( ruleLessThan ) );
    public final void rule__ClassRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:722:1: ( ( ruleNotEquals ) | ( ruleGreaterThan ) | ( ruleEquals ) | ( ruleLessThan ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 34:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case 37:
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
                    // InternalFormValidation.g:723:2: ( ruleNotEquals )
                    {
                    // InternalFormValidation.g:723:2: ( ruleNotEquals )
                    // InternalFormValidation.g:724:3: ruleNotEquals
                    {
                     before(grammarAccess.getClassRuleAccess().getNotEqualsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNotEquals();

                    state._fsp--;

                     after(grammarAccess.getClassRuleAccess().getNotEqualsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:729:2: ( ruleGreaterThan )
                    {
                    // InternalFormValidation.g:729:2: ( ruleGreaterThan )
                    // InternalFormValidation.g:730:3: ruleGreaterThan
                    {
                     before(grammarAccess.getClassRuleAccess().getGreaterThanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGreaterThan();

                    state._fsp--;

                     after(grammarAccess.getClassRuleAccess().getGreaterThanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValidation.g:735:2: ( ruleEquals )
                    {
                    // InternalFormValidation.g:735:2: ( ruleEquals )
                    // InternalFormValidation.g:736:3: ruleEquals
                    {
                     before(grammarAccess.getClassRuleAccess().getEqualsParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEquals();

                    state._fsp--;

                     after(grammarAccess.getClassRuleAccess().getEqualsParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFormValidation.g:741:2: ( ruleLessThan )
                    {
                    // InternalFormValidation.g:741:2: ( ruleLessThan )
                    // InternalFormValidation.g:742:3: ruleLessThan
                    {
                     before(grammarAccess.getClassRuleAccess().getLessThanParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLessThan();

                    state._fsp--;

                     after(grammarAccess.getClassRuleAccess().getLessThanParserRuleCall_3()); 

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
    // $ANTLR end "rule__ClassRule__Alternatives"


    // $ANTLR start "rule__AttributeRule__Alternatives"
    // InternalFormValidation.g:751:1: rule__AttributeRule__Alternatives : ( ( ruleRequired ) | ( ruleEmail ) | ( ruleMinLength ) | ( ruleMaxLength ) | ( ruleLength ) | ( ruleMinNumber ) | ( ruleMinDate ) | ( ruleMaxNumber ) | ( ruleMaxDate ) | ( ruleAcceptableValuesString ) | ( ruleAcceptableValuesDate ) | ( ruleStringPattern ) | ( ruleDatePattern ) );
    public final void rule__AttributeRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:755:1: ( ( ruleRequired ) | ( ruleEmail ) | ( ruleMinLength ) | ( ruleMaxLength ) | ( ruleLength ) | ( ruleMinNumber ) | ( ruleMinDate ) | ( ruleMaxNumber ) | ( ruleMaxDate ) | ( ruleAcceptableValuesString ) | ( ruleAcceptableValuesDate ) | ( ruleStringPattern ) | ( ruleDatePattern ) )
            int alt2=13;
            switch ( input.LA(1) ) {
            case 17:
            case 40:
                {
                alt2=1;
                }
                break;
            case 18:
            case 41:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 21:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 23:
                {
                alt2=7;
                }
                break;
            case 24:
                {
                alt2=8;
                }
                break;
            case 25:
                {
                alt2=9;
                }
                break;
            case 26:
                {
                alt2=10;
                }
                break;
            case 28:
                {
                alt2=11;
                }
                break;
            case 29:
                {
                alt2=12;
                }
                break;
            case 30:
                {
                alt2=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFormValidation.g:756:2: ( ruleRequired )
                    {
                    // InternalFormValidation.g:756:2: ( ruleRequired )
                    // InternalFormValidation.g:757:3: ruleRequired
                    {
                     before(grammarAccess.getAttributeRuleAccess().getRequiredParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRequired();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getRequiredParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:762:2: ( ruleEmail )
                    {
                    // InternalFormValidation.g:762:2: ( ruleEmail )
                    // InternalFormValidation.g:763:3: ruleEmail
                    {
                     before(grammarAccess.getAttributeRuleAccess().getEmailParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmail();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getEmailParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValidation.g:768:2: ( ruleMinLength )
                    {
                    // InternalFormValidation.g:768:2: ( ruleMinLength )
                    // InternalFormValidation.g:769:3: ruleMinLength
                    {
                     before(grammarAccess.getAttributeRuleAccess().getMinLengthParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMinLength();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getMinLengthParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFormValidation.g:774:2: ( ruleMaxLength )
                    {
                    // InternalFormValidation.g:774:2: ( ruleMaxLength )
                    // InternalFormValidation.g:775:3: ruleMaxLength
                    {
                     before(grammarAccess.getAttributeRuleAccess().getMaxLengthParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxLength();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getMaxLengthParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalFormValidation.g:780:2: ( ruleLength )
                    {
                    // InternalFormValidation.g:780:2: ( ruleLength )
                    // InternalFormValidation.g:781:3: ruleLength
                    {
                     before(grammarAccess.getAttributeRuleAccess().getLengthParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLength();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getLengthParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalFormValidation.g:786:2: ( ruleMinNumber )
                    {
                    // InternalFormValidation.g:786:2: ( ruleMinNumber )
                    // InternalFormValidation.g:787:3: ruleMinNumber
                    {
                     before(grammarAccess.getAttributeRuleAccess().getMinNumberParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMinNumber();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getMinNumberParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalFormValidation.g:792:2: ( ruleMinDate )
                    {
                    // InternalFormValidation.g:792:2: ( ruleMinDate )
                    // InternalFormValidation.g:793:3: ruleMinDate
                    {
                     before(grammarAccess.getAttributeRuleAccess().getMinDateParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMinDate();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getMinDateParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalFormValidation.g:798:2: ( ruleMaxNumber )
                    {
                    // InternalFormValidation.g:798:2: ( ruleMaxNumber )
                    // InternalFormValidation.g:799:3: ruleMaxNumber
                    {
                     before(grammarAccess.getAttributeRuleAccess().getMaxNumberParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxNumber();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getMaxNumberParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalFormValidation.g:804:2: ( ruleMaxDate )
                    {
                    // InternalFormValidation.g:804:2: ( ruleMaxDate )
                    // InternalFormValidation.g:805:3: ruleMaxDate
                    {
                     before(grammarAccess.getAttributeRuleAccess().getMaxDateParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxDate();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getMaxDateParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalFormValidation.g:810:2: ( ruleAcceptableValuesString )
                    {
                    // InternalFormValidation.g:810:2: ( ruleAcceptableValuesString )
                    // InternalFormValidation.g:811:3: ruleAcceptableValuesString
                    {
                     before(grammarAccess.getAttributeRuleAccess().getAcceptableValuesStringParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleAcceptableValuesString();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getAcceptableValuesStringParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalFormValidation.g:816:2: ( ruleAcceptableValuesDate )
                    {
                    // InternalFormValidation.g:816:2: ( ruleAcceptableValuesDate )
                    // InternalFormValidation.g:817:3: ruleAcceptableValuesDate
                    {
                     before(grammarAccess.getAttributeRuleAccess().getAcceptableValuesDateParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleAcceptableValuesDate();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getAcceptableValuesDateParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalFormValidation.g:822:2: ( ruleStringPattern )
                    {
                    // InternalFormValidation.g:822:2: ( ruleStringPattern )
                    // InternalFormValidation.g:823:3: ruleStringPattern
                    {
                     before(grammarAccess.getAttributeRuleAccess().getStringPatternParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleStringPattern();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getStringPatternParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalFormValidation.g:828:2: ( ruleDatePattern )
                    {
                    // InternalFormValidation.g:828:2: ( ruleDatePattern )
                    // InternalFormValidation.g:829:3: ruleDatePattern
                    {
                     before(grammarAccess.getAttributeRuleAccess().getDatePatternParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleDatePattern();

                    state._fsp--;

                     after(grammarAccess.getAttributeRuleAccess().getDatePatternParserRuleCall_12()); 

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
    // $ANTLR end "rule__AttributeRule__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFormValidation.g:838:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:842:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFormValidation.g:843:2: ( RULE_STRING )
                    {
                    // InternalFormValidation.g:843:2: ( RULE_STRING )
                    // InternalFormValidation.g:844:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:849:2: ( RULE_ID )
                    {
                    // InternalFormValidation.g:849:2: ( RULE_ID )
                    // InternalFormValidation.g:850:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Float__Alternatives"
    // InternalFormValidation.g:859:1: rule__Float__Alternatives : ( ( ( rule__Float__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__Float__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:863:1: ( ( ( rule__Float__Group_0__0 ) ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==31) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==15||(LA4_1>=17 && LA4_1<=26)||(LA4_1>=28 && LA4_1<=30)||(LA4_1>=40 && LA4_1<=41)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFormValidation.g:864:2: ( ( rule__Float__Group_0__0 ) )
                    {
                    // InternalFormValidation.g:864:2: ( ( rule__Float__Group_0__0 ) )
                    // InternalFormValidation.g:865:3: ( rule__Float__Group_0__0 )
                    {
                     before(grammarAccess.getFloatAccess().getGroup_0()); 
                    // InternalFormValidation.g:866:3: ( rule__Float__Group_0__0 )
                    // InternalFormValidation.g:866:4: rule__Float__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFloatAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:870:2: ( RULE_INT )
                    {
                    // InternalFormValidation.g:870:2: ( RULE_INT )
                    // InternalFormValidation.g:871:3: RULE_INT
                    {
                     before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Float__Alternatives"


    // $ANTLR start "rule__EVrsta__Alternatives"
    // InternalFormValidation.g:880:1: rule__EVrsta__Alternatives : ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Date' ) ) );
    public final void rule__EVrsta__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:884:1: ( ( ( 'String' ) ) | ( ( 'Number' ) ) | ( ( 'Date' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFormValidation.g:885:2: ( ( 'String' ) )
                    {
                    // InternalFormValidation.g:885:2: ( ( 'String' ) )
                    // InternalFormValidation.g:886:3: ( 'String' )
                    {
                     before(grammarAccess.getEVrstaAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalFormValidation.g:887:3: ( 'String' )
                    // InternalFormValidation.g:887:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEVrstaAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFormValidation.g:891:2: ( ( 'Number' ) )
                    {
                    // InternalFormValidation.g:891:2: ( ( 'Number' ) )
                    // InternalFormValidation.g:892:3: ( 'Number' )
                    {
                     before(grammarAccess.getEVrstaAccess().getNumberEnumLiteralDeclaration_1()); 
                    // InternalFormValidation.g:893:3: ( 'Number' )
                    // InternalFormValidation.g:893:4: 'Number'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEVrstaAccess().getNumberEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFormValidation.g:897:2: ( ( 'Date' ) )
                    {
                    // InternalFormValidation.g:897:2: ( ( 'Date' ) )
                    // InternalFormValidation.g:898:3: ( 'Date' )
                    {
                     before(grammarAccess.getEVrstaAccess().getDateEnumLiteralDeclaration_2()); 
                    // InternalFormValidation.g:899:3: ( 'Date' )
                    // InternalFormValidation.g:899:4: 'Date'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEVrstaAccess().getDateEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__EVrsta__Alternatives"


    // $ANTLR start "rule__ValidationClass__Group__0"
    // InternalFormValidation.g:907:1: rule__ValidationClass__Group__0 : rule__ValidationClass__Group__0__Impl rule__ValidationClass__Group__1 ;
    public final void rule__ValidationClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:911:1: ( rule__ValidationClass__Group__0__Impl rule__ValidationClass__Group__1 )
            // InternalFormValidation.g:912:2: rule__ValidationClass__Group__0__Impl rule__ValidationClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ValidationClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__1();

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
    // $ANTLR end "rule__ValidationClass__Group__0"


    // $ANTLR start "rule__ValidationClass__Group__0__Impl"
    // InternalFormValidation.g:919:1: rule__ValidationClass__Group__0__Impl : ( () ) ;
    public final void rule__ValidationClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:923:1: ( ( () ) )
            // InternalFormValidation.g:924:1: ( () )
            {
            // InternalFormValidation.g:924:1: ( () )
            // InternalFormValidation.g:925:2: ()
            {
             before(grammarAccess.getValidationClassAccess().getValidationClassAction_0()); 
            // InternalFormValidation.g:926:2: ()
            // InternalFormValidation.g:926:3: 
            {
            }

             after(grammarAccess.getValidationClassAccess().getValidationClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationClass__Group__0__Impl"


    // $ANTLR start "rule__ValidationClass__Group__1"
    // InternalFormValidation.g:934:1: rule__ValidationClass__Group__1 : rule__ValidationClass__Group__1__Impl rule__ValidationClass__Group__2 ;
    public final void rule__ValidationClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:938:1: ( rule__ValidationClass__Group__1__Impl rule__ValidationClass__Group__2 )
            // InternalFormValidation.g:939:2: rule__ValidationClass__Group__1__Impl rule__ValidationClass__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ValidationClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__2();

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
    // $ANTLR end "rule__ValidationClass__Group__1"


    // $ANTLR start "rule__ValidationClass__Group__1__Impl"
    // InternalFormValidation.g:946:1: rule__ValidationClass__Group__1__Impl : ( ( rule__ValidationClass__NameAssignment_1 ) ) ;
    public final void rule__ValidationClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:950:1: ( ( ( rule__ValidationClass__NameAssignment_1 ) ) )
            // InternalFormValidation.g:951:1: ( ( rule__ValidationClass__NameAssignment_1 ) )
            {
            // InternalFormValidation.g:951:1: ( ( rule__ValidationClass__NameAssignment_1 ) )
            // InternalFormValidation.g:952:2: ( rule__ValidationClass__NameAssignment_1 )
            {
             before(grammarAccess.getValidationClassAccess().getNameAssignment_1()); 
            // InternalFormValidation.g:953:2: ( rule__ValidationClass__NameAssignment_1 )
            // InternalFormValidation.g:953:3: rule__ValidationClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationClassAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ValidationClass__Group__1__Impl"


    // $ANTLR start "rule__ValidationClass__Group__2"
    // InternalFormValidation.g:961:1: rule__ValidationClass__Group__2 : rule__ValidationClass__Group__2__Impl rule__ValidationClass__Group__3 ;
    public final void rule__ValidationClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:965:1: ( rule__ValidationClass__Group__2__Impl rule__ValidationClass__Group__3 )
            // InternalFormValidation.g:966:2: rule__ValidationClass__Group__2__Impl rule__ValidationClass__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ValidationClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__3();

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
    // $ANTLR end "rule__ValidationClass__Group__2"


    // $ANTLR start "rule__ValidationClass__Group__2__Impl"
    // InternalFormValidation.g:973:1: rule__ValidationClass__Group__2__Impl : ( '{' ) ;
    public final void rule__ValidationClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:977:1: ( ( '{' ) )
            // InternalFormValidation.g:978:1: ( '{' )
            {
            // InternalFormValidation.g:978:1: ( '{' )
            // InternalFormValidation.g:979:2: '{'
            {
             before(grammarAccess.getValidationClassAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getValidationClassAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ValidationClass__Group__2__Impl"


    // $ANTLR start "rule__ValidationClass__Group__3"
    // InternalFormValidation.g:988:1: rule__ValidationClass__Group__3 : rule__ValidationClass__Group__3__Impl rule__ValidationClass__Group__4 ;
    public final void rule__ValidationClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:992:1: ( rule__ValidationClass__Group__3__Impl rule__ValidationClass__Group__4 )
            // InternalFormValidation.g:993:2: rule__ValidationClass__Group__3__Impl rule__ValidationClass__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ValidationClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__4();

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
    // $ANTLR end "rule__ValidationClass__Group__3"


    // $ANTLR start "rule__ValidationClass__Group__3__Impl"
    // InternalFormValidation.g:1000:1: rule__ValidationClass__Group__3__Impl : ( ( rule__ValidationClass__Group_3__0 )? ) ;
    public final void rule__ValidationClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1004:1: ( ( ( rule__ValidationClass__Group_3__0 )? ) )
            // InternalFormValidation.g:1005:1: ( ( rule__ValidationClass__Group_3__0 )? )
            {
            // InternalFormValidation.g:1005:1: ( ( rule__ValidationClass__Group_3__0 )? )
            // InternalFormValidation.g:1006:2: ( rule__ValidationClass__Group_3__0 )?
            {
             before(grammarAccess.getValidationClassAccess().getGroup_3()); 
            // InternalFormValidation.g:1007:2: ( rule__ValidationClass__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFormValidation.g:1007:3: rule__ValidationClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidationClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidationClassAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ValidationClass__Group__3__Impl"


    // $ANTLR start "rule__ValidationClass__Group__4"
    // InternalFormValidation.g:1015:1: rule__ValidationClass__Group__4 : rule__ValidationClass__Group__4__Impl rule__ValidationClass__Group__5 ;
    public final void rule__ValidationClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1019:1: ( rule__ValidationClass__Group__4__Impl rule__ValidationClass__Group__5 )
            // InternalFormValidation.g:1020:2: rule__ValidationClass__Group__4__Impl rule__ValidationClass__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ValidationClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__5();

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
    // $ANTLR end "rule__ValidationClass__Group__4"


    // $ANTLR start "rule__ValidationClass__Group__4__Impl"
    // InternalFormValidation.g:1027:1: rule__ValidationClass__Group__4__Impl : ( ( rule__ValidationClass__Group_4__0 )? ) ;
    public final void rule__ValidationClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1031:1: ( ( ( rule__ValidationClass__Group_4__0 )? ) )
            // InternalFormValidation.g:1032:1: ( ( rule__ValidationClass__Group_4__0 )? )
            {
            // InternalFormValidation.g:1032:1: ( ( rule__ValidationClass__Group_4__0 )? )
            // InternalFormValidation.g:1033:2: ( rule__ValidationClass__Group_4__0 )?
            {
             before(grammarAccess.getValidationClassAccess().getGroup_4()); 
            // InternalFormValidation.g:1034:2: ( rule__ValidationClass__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32||LA7_0==34||(LA7_0>=36 && LA7_0<=37)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFormValidation.g:1034:3: rule__ValidationClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ValidationClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getValidationClassAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ValidationClass__Group__4__Impl"


    // $ANTLR start "rule__ValidationClass__Group__5"
    // InternalFormValidation.g:1042:1: rule__ValidationClass__Group__5 : rule__ValidationClass__Group__5__Impl ;
    public final void rule__ValidationClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1046:1: ( rule__ValidationClass__Group__5__Impl )
            // InternalFormValidation.g:1047:2: rule__ValidationClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group__5__Impl();

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
    // $ANTLR end "rule__ValidationClass__Group__5"


    // $ANTLR start "rule__ValidationClass__Group__5__Impl"
    // InternalFormValidation.g:1053:1: rule__ValidationClass__Group__5__Impl : ( '}' ) ;
    public final void rule__ValidationClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1057:1: ( ( '}' ) )
            // InternalFormValidation.g:1058:1: ( '}' )
            {
            // InternalFormValidation.g:1058:1: ( '}' )
            // InternalFormValidation.g:1059:2: '}'
            {
             before(grammarAccess.getValidationClassAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getValidationClassAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ValidationClass__Group__5__Impl"


    // $ANTLR start "rule__ValidationClass__Group_3__0"
    // InternalFormValidation.g:1069:1: rule__ValidationClass__Group_3__0 : rule__ValidationClass__Group_3__0__Impl rule__ValidationClass__Group_3__1 ;
    public final void rule__ValidationClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1073:1: ( rule__ValidationClass__Group_3__0__Impl rule__ValidationClass__Group_3__1 )
            // InternalFormValidation.g:1074:2: rule__ValidationClass__Group_3__0__Impl rule__ValidationClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ValidationClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group_3__1();

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
    // $ANTLR end "rule__ValidationClass__Group_3__0"


    // $ANTLR start "rule__ValidationClass__Group_3__0__Impl"
    // InternalFormValidation.g:1081:1: rule__ValidationClass__Group_3__0__Impl : ( ( rule__ValidationClass__ClassattributeAssignment_3_0 ) ) ;
    public final void rule__ValidationClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1085:1: ( ( ( rule__ValidationClass__ClassattributeAssignment_3_0 ) ) )
            // InternalFormValidation.g:1086:1: ( ( rule__ValidationClass__ClassattributeAssignment_3_0 ) )
            {
            // InternalFormValidation.g:1086:1: ( ( rule__ValidationClass__ClassattributeAssignment_3_0 ) )
            // InternalFormValidation.g:1087:2: ( rule__ValidationClass__ClassattributeAssignment_3_0 )
            {
             before(grammarAccess.getValidationClassAccess().getClassattributeAssignment_3_0()); 
            // InternalFormValidation.g:1088:2: ( rule__ValidationClass__ClassattributeAssignment_3_0 )
            // InternalFormValidation.g:1088:3: rule__ValidationClass__ClassattributeAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__ClassattributeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getValidationClassAccess().getClassattributeAssignment_3_0()); 

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
    // $ANTLR end "rule__ValidationClass__Group_3__0__Impl"


    // $ANTLR start "rule__ValidationClass__Group_3__1"
    // InternalFormValidation.g:1096:1: rule__ValidationClass__Group_3__1 : rule__ValidationClass__Group_3__1__Impl ;
    public final void rule__ValidationClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1100:1: ( rule__ValidationClass__Group_3__1__Impl )
            // InternalFormValidation.g:1101:2: rule__ValidationClass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group_3__1__Impl();

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
    // $ANTLR end "rule__ValidationClass__Group_3__1"


    // $ANTLR start "rule__ValidationClass__Group_3__1__Impl"
    // InternalFormValidation.g:1107:1: rule__ValidationClass__Group_3__1__Impl : ( ( rule__ValidationClass__ClassattributeAssignment_3_1 )* ) ;
    public final void rule__ValidationClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1111:1: ( ( ( rule__ValidationClass__ClassattributeAssignment_3_1 )* ) )
            // InternalFormValidation.g:1112:1: ( ( rule__ValidationClass__ClassattributeAssignment_3_1 )* )
            {
            // InternalFormValidation.g:1112:1: ( ( rule__ValidationClass__ClassattributeAssignment_3_1 )* )
            // InternalFormValidation.g:1113:2: ( rule__ValidationClass__ClassattributeAssignment_3_1 )*
            {
             before(grammarAccess.getValidationClassAccess().getClassattributeAssignment_3_1()); 
            // InternalFormValidation.g:1114:2: ( rule__ValidationClass__ClassattributeAssignment_3_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFormValidation.g:1114:3: rule__ValidationClass__ClassattributeAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ValidationClass__ClassattributeAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getValidationClassAccess().getClassattributeAssignment_3_1()); 

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
    // $ANTLR end "rule__ValidationClass__Group_3__1__Impl"


    // $ANTLR start "rule__ValidationClass__Group_4__0"
    // InternalFormValidation.g:1123:1: rule__ValidationClass__Group_4__0 : rule__ValidationClass__Group_4__0__Impl rule__ValidationClass__Group_4__1 ;
    public final void rule__ValidationClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1127:1: ( rule__ValidationClass__Group_4__0__Impl rule__ValidationClass__Group_4__1 )
            // InternalFormValidation.g:1128:2: rule__ValidationClass__Group_4__0__Impl rule__ValidationClass__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ValidationClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group_4__1();

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
    // $ANTLR end "rule__ValidationClass__Group_4__0"


    // $ANTLR start "rule__ValidationClass__Group_4__0__Impl"
    // InternalFormValidation.g:1135:1: rule__ValidationClass__Group_4__0__Impl : ( ( rule__ValidationClass__ClassruleAssignment_4_0 ) ) ;
    public final void rule__ValidationClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1139:1: ( ( ( rule__ValidationClass__ClassruleAssignment_4_0 ) ) )
            // InternalFormValidation.g:1140:1: ( ( rule__ValidationClass__ClassruleAssignment_4_0 ) )
            {
            // InternalFormValidation.g:1140:1: ( ( rule__ValidationClass__ClassruleAssignment_4_0 ) )
            // InternalFormValidation.g:1141:2: ( rule__ValidationClass__ClassruleAssignment_4_0 )
            {
             before(grammarAccess.getValidationClassAccess().getClassruleAssignment_4_0()); 
            // InternalFormValidation.g:1142:2: ( rule__ValidationClass__ClassruleAssignment_4_0 )
            // InternalFormValidation.g:1142:3: rule__ValidationClass__ClassruleAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__ClassruleAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getValidationClassAccess().getClassruleAssignment_4_0()); 

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
    // $ANTLR end "rule__ValidationClass__Group_4__0__Impl"


    // $ANTLR start "rule__ValidationClass__Group_4__1"
    // InternalFormValidation.g:1150:1: rule__ValidationClass__Group_4__1 : rule__ValidationClass__Group_4__1__Impl ;
    public final void rule__ValidationClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1154:1: ( rule__ValidationClass__Group_4__1__Impl )
            // InternalFormValidation.g:1155:2: rule__ValidationClass__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValidationClass__Group_4__1__Impl();

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
    // $ANTLR end "rule__ValidationClass__Group_4__1"


    // $ANTLR start "rule__ValidationClass__Group_4__1__Impl"
    // InternalFormValidation.g:1161:1: rule__ValidationClass__Group_4__1__Impl : ( ( rule__ValidationClass__ClassruleAssignment_4_1 )* ) ;
    public final void rule__ValidationClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1165:1: ( ( ( rule__ValidationClass__ClassruleAssignment_4_1 )* ) )
            // InternalFormValidation.g:1166:1: ( ( rule__ValidationClass__ClassruleAssignment_4_1 )* )
            {
            // InternalFormValidation.g:1166:1: ( ( rule__ValidationClass__ClassruleAssignment_4_1 )* )
            // InternalFormValidation.g:1167:2: ( rule__ValidationClass__ClassruleAssignment_4_1 )*
            {
             before(grammarAccess.getValidationClassAccess().getClassruleAssignment_4_1()); 
            // InternalFormValidation.g:1168:2: ( rule__ValidationClass__ClassruleAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32||LA9_0==34||(LA9_0>=36 && LA9_0<=37)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFormValidation.g:1168:3: rule__ValidationClass__ClassruleAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ValidationClass__ClassruleAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getValidationClassAccess().getClassruleAssignment_4_1()); 

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
    // $ANTLR end "rule__ValidationClass__Group_4__1__Impl"


    // $ANTLR start "rule__ClassAttribute__Group__0"
    // InternalFormValidation.g:1177:1: rule__ClassAttribute__Group__0 : rule__ClassAttribute__Group__0__Impl rule__ClassAttribute__Group__1 ;
    public final void rule__ClassAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1181:1: ( rule__ClassAttribute__Group__0__Impl rule__ClassAttribute__Group__1 )
            // InternalFormValidation.g:1182:2: rule__ClassAttribute__Group__0__Impl rule__ClassAttribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ClassAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__1();

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
    // $ANTLR end "rule__ClassAttribute__Group__0"


    // $ANTLR start "rule__ClassAttribute__Group__0__Impl"
    // InternalFormValidation.g:1189:1: rule__ClassAttribute__Group__0__Impl : ( ( rule__ClassAttribute__NameAssignment_0 ) ) ;
    public final void rule__ClassAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1193:1: ( ( ( rule__ClassAttribute__NameAssignment_0 ) ) )
            // InternalFormValidation.g:1194:1: ( ( rule__ClassAttribute__NameAssignment_0 ) )
            {
            // InternalFormValidation.g:1194:1: ( ( rule__ClassAttribute__NameAssignment_0 ) )
            // InternalFormValidation.g:1195:2: ( rule__ClassAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getClassAttributeAccess().getNameAssignment_0()); 
            // InternalFormValidation.g:1196:2: ( rule__ClassAttribute__NameAssignment_0 )
            // InternalFormValidation.g:1196:3: rule__ClassAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ClassAttribute__Group__0__Impl"


    // $ANTLR start "rule__ClassAttribute__Group__1"
    // InternalFormValidation.g:1204:1: rule__ClassAttribute__Group__1 : rule__ClassAttribute__Group__1__Impl rule__ClassAttribute__Group__2 ;
    public final void rule__ClassAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1208:1: ( rule__ClassAttribute__Group__1__Impl rule__ClassAttribute__Group__2 )
            // InternalFormValidation.g:1209:2: rule__ClassAttribute__Group__1__Impl rule__ClassAttribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ClassAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__2();

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
    // $ANTLR end "rule__ClassAttribute__Group__1"


    // $ANTLR start "rule__ClassAttribute__Group__1__Impl"
    // InternalFormValidation.g:1216:1: rule__ClassAttribute__Group__1__Impl : ( '{' ) ;
    public final void rule__ClassAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1220:1: ( ( '{' ) )
            // InternalFormValidation.g:1221:1: ( '{' )
            {
            // InternalFormValidation.g:1221:1: ( '{' )
            // InternalFormValidation.g:1222:2: '{'
            {
             before(grammarAccess.getClassAttributeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClassAttributeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ClassAttribute__Group__1__Impl"


    // $ANTLR start "rule__ClassAttribute__Group__2"
    // InternalFormValidation.g:1231:1: rule__ClassAttribute__Group__2 : rule__ClassAttribute__Group__2__Impl rule__ClassAttribute__Group__3 ;
    public final void rule__ClassAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1235:1: ( rule__ClassAttribute__Group__2__Impl rule__ClassAttribute__Group__3 )
            // InternalFormValidation.g:1236:2: rule__ClassAttribute__Group__2__Impl rule__ClassAttribute__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ClassAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__3();

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
    // $ANTLR end "rule__ClassAttribute__Group__2"


    // $ANTLR start "rule__ClassAttribute__Group__2__Impl"
    // InternalFormValidation.g:1243:1: rule__ClassAttribute__Group__2__Impl : ( 'type' ) ;
    public final void rule__ClassAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1247:1: ( ( 'type' ) )
            // InternalFormValidation.g:1248:1: ( 'type' )
            {
            // InternalFormValidation.g:1248:1: ( 'type' )
            // InternalFormValidation.g:1249:2: 'type'
            {
             before(grammarAccess.getClassAttributeAccess().getTypeKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAttributeAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__ClassAttribute__Group__2__Impl"


    // $ANTLR start "rule__ClassAttribute__Group__3"
    // InternalFormValidation.g:1258:1: rule__ClassAttribute__Group__3 : rule__ClassAttribute__Group__3__Impl rule__ClassAttribute__Group__4 ;
    public final void rule__ClassAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1262:1: ( rule__ClassAttribute__Group__3__Impl rule__ClassAttribute__Group__4 )
            // InternalFormValidation.g:1263:2: rule__ClassAttribute__Group__3__Impl rule__ClassAttribute__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ClassAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__4();

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
    // $ANTLR end "rule__ClassAttribute__Group__3"


    // $ANTLR start "rule__ClassAttribute__Group__3__Impl"
    // InternalFormValidation.g:1270:1: rule__ClassAttribute__Group__3__Impl : ( ( rule__ClassAttribute__AttributetypeAssignment_3 ) ) ;
    public final void rule__ClassAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1274:1: ( ( ( rule__ClassAttribute__AttributetypeAssignment_3 ) ) )
            // InternalFormValidation.g:1275:1: ( ( rule__ClassAttribute__AttributetypeAssignment_3 ) )
            {
            // InternalFormValidation.g:1275:1: ( ( rule__ClassAttribute__AttributetypeAssignment_3 ) )
            // InternalFormValidation.g:1276:2: ( rule__ClassAttribute__AttributetypeAssignment_3 )
            {
             before(grammarAccess.getClassAttributeAccess().getAttributetypeAssignment_3()); 
            // InternalFormValidation.g:1277:2: ( rule__ClassAttribute__AttributetypeAssignment_3 )
            // InternalFormValidation.g:1277:3: rule__ClassAttribute__AttributetypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassAttribute__AttributetypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAttributeAccess().getAttributetypeAssignment_3()); 

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
    // $ANTLR end "rule__ClassAttribute__Group__3__Impl"


    // $ANTLR start "rule__ClassAttribute__Group__4"
    // InternalFormValidation.g:1285:1: rule__ClassAttribute__Group__4 : rule__ClassAttribute__Group__4__Impl rule__ClassAttribute__Group__5 ;
    public final void rule__ClassAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1289:1: ( rule__ClassAttribute__Group__4__Impl rule__ClassAttribute__Group__5 )
            // InternalFormValidation.g:1290:2: rule__ClassAttribute__Group__4__Impl rule__ClassAttribute__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ClassAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__5();

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
    // $ANTLR end "rule__ClassAttribute__Group__4"


    // $ANTLR start "rule__ClassAttribute__Group__4__Impl"
    // InternalFormValidation.g:1297:1: rule__ClassAttribute__Group__4__Impl : ( ( rule__ClassAttribute__Group_4__0 )? ) ;
    public final void rule__ClassAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1301:1: ( ( ( rule__ClassAttribute__Group_4__0 )? ) )
            // InternalFormValidation.g:1302:1: ( ( rule__ClassAttribute__Group_4__0 )? )
            {
            // InternalFormValidation.g:1302:1: ( ( rule__ClassAttribute__Group_4__0 )? )
            // InternalFormValidation.g:1303:2: ( rule__ClassAttribute__Group_4__0 )?
            {
             before(grammarAccess.getClassAttributeAccess().getGroup_4()); 
            // InternalFormValidation.g:1304:2: ( rule__ClassAttribute__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=17 && LA10_0<=26)||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=40 && LA10_0<=41)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFormValidation.g:1304:3: rule__ClassAttribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassAttribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAttributeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ClassAttribute__Group__4__Impl"


    // $ANTLR start "rule__ClassAttribute__Group__5"
    // InternalFormValidation.g:1312:1: rule__ClassAttribute__Group__5 : rule__ClassAttribute__Group__5__Impl ;
    public final void rule__ClassAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1316:1: ( rule__ClassAttribute__Group__5__Impl )
            // InternalFormValidation.g:1317:2: rule__ClassAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group__5__Impl();

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
    // $ANTLR end "rule__ClassAttribute__Group__5"


    // $ANTLR start "rule__ClassAttribute__Group__5__Impl"
    // InternalFormValidation.g:1323:1: rule__ClassAttribute__Group__5__Impl : ( '}' ) ;
    public final void rule__ClassAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1327:1: ( ( '}' ) )
            // InternalFormValidation.g:1328:1: ( '}' )
            {
            // InternalFormValidation.g:1328:1: ( '}' )
            // InternalFormValidation.g:1329:2: '}'
            {
             before(grammarAccess.getClassAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClassAttributeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ClassAttribute__Group__5__Impl"


    // $ANTLR start "rule__ClassAttribute__Group_4__0"
    // InternalFormValidation.g:1339:1: rule__ClassAttribute__Group_4__0 : rule__ClassAttribute__Group_4__0__Impl rule__ClassAttribute__Group_4__1 ;
    public final void rule__ClassAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1343:1: ( rule__ClassAttribute__Group_4__0__Impl rule__ClassAttribute__Group_4__1 )
            // InternalFormValidation.g:1344:2: rule__ClassAttribute__Group_4__0__Impl rule__ClassAttribute__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ClassAttribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group_4__1();

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
    // $ANTLR end "rule__ClassAttribute__Group_4__0"


    // $ANTLR start "rule__ClassAttribute__Group_4__0__Impl"
    // InternalFormValidation.g:1351:1: rule__ClassAttribute__Group_4__0__Impl : ( ( rule__ClassAttribute__AttributeruleAssignment_4_0 ) ) ;
    public final void rule__ClassAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1355:1: ( ( ( rule__ClassAttribute__AttributeruleAssignment_4_0 ) ) )
            // InternalFormValidation.g:1356:1: ( ( rule__ClassAttribute__AttributeruleAssignment_4_0 ) )
            {
            // InternalFormValidation.g:1356:1: ( ( rule__ClassAttribute__AttributeruleAssignment_4_0 ) )
            // InternalFormValidation.g:1357:2: ( rule__ClassAttribute__AttributeruleAssignment_4_0 )
            {
             before(grammarAccess.getClassAttributeAccess().getAttributeruleAssignment_4_0()); 
            // InternalFormValidation.g:1358:2: ( rule__ClassAttribute__AttributeruleAssignment_4_0 )
            // InternalFormValidation.g:1358:3: rule__ClassAttribute__AttributeruleAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassAttribute__AttributeruleAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getClassAttributeAccess().getAttributeruleAssignment_4_0()); 

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
    // $ANTLR end "rule__ClassAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__ClassAttribute__Group_4__1"
    // InternalFormValidation.g:1366:1: rule__ClassAttribute__Group_4__1 : rule__ClassAttribute__Group_4__1__Impl ;
    public final void rule__ClassAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1370:1: ( rule__ClassAttribute__Group_4__1__Impl )
            // InternalFormValidation.g:1371:2: rule__ClassAttribute__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassAttribute__Group_4__1__Impl();

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
    // $ANTLR end "rule__ClassAttribute__Group_4__1"


    // $ANTLR start "rule__ClassAttribute__Group_4__1__Impl"
    // InternalFormValidation.g:1377:1: rule__ClassAttribute__Group_4__1__Impl : ( ( rule__ClassAttribute__AttributeruleAssignment_4_1 )* ) ;
    public final void rule__ClassAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1381:1: ( ( ( rule__ClassAttribute__AttributeruleAssignment_4_1 )* ) )
            // InternalFormValidation.g:1382:1: ( ( rule__ClassAttribute__AttributeruleAssignment_4_1 )* )
            {
            // InternalFormValidation.g:1382:1: ( ( rule__ClassAttribute__AttributeruleAssignment_4_1 )* )
            // InternalFormValidation.g:1383:2: ( rule__ClassAttribute__AttributeruleAssignment_4_1 )*
            {
             before(grammarAccess.getClassAttributeAccess().getAttributeruleAssignment_4_1()); 
            // InternalFormValidation.g:1384:2: ( rule__ClassAttribute__AttributeruleAssignment_4_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=17 && LA11_0<=26)||(LA11_0>=28 && LA11_0<=30)||(LA11_0>=40 && LA11_0<=41)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFormValidation.g:1384:3: rule__ClassAttribute__AttributeruleAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ClassAttribute__AttributeruleAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAttributeAccess().getAttributeruleAssignment_4_1()); 

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
    // $ANTLR end "rule__ClassAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // InternalFormValidation.g:1393:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1397:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalFormValidation.g:1398:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1();

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
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // InternalFormValidation.g:1405:1: rule__AttributeType__Group__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1409:1: ( ( () ) )
            // InternalFormValidation.g:1410:1: ( () )
            {
            // InternalFormValidation.g:1410:1: ( () )
            // InternalFormValidation.g:1411:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_0()); 
            // InternalFormValidation.g:1412:2: ()
            // InternalFormValidation.g:1412:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // InternalFormValidation.g:1420:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1424:1: ( rule__AttributeType__Group__1__Impl )
            // InternalFormValidation.g:1425:2: rule__AttributeType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // InternalFormValidation.g:1431:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__VrstaAssignment_1 ) ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1435:1: ( ( ( rule__AttributeType__VrstaAssignment_1 ) ) )
            // InternalFormValidation.g:1436:1: ( ( rule__AttributeType__VrstaAssignment_1 ) )
            {
            // InternalFormValidation.g:1436:1: ( ( rule__AttributeType__VrstaAssignment_1 ) )
            // InternalFormValidation.g:1437:2: ( rule__AttributeType__VrstaAssignment_1 )
            {
             before(grammarAccess.getAttributeTypeAccess().getVrstaAssignment_1()); 
            // InternalFormValidation.g:1438:2: ( rule__AttributeType__VrstaAssignment_1 )
            // InternalFormValidation.g:1438:3: rule__AttributeType__VrstaAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__VrstaAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getVrstaAssignment_1()); 

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
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__Required__Group__0"
    // InternalFormValidation.g:1447:1: rule__Required__Group__0 : rule__Required__Group__0__Impl rule__Required__Group__1 ;
    public final void rule__Required__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1451:1: ( rule__Required__Group__0__Impl rule__Required__Group__1 )
            // InternalFormValidation.g:1452:2: rule__Required__Group__0__Impl rule__Required__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Required__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Required__Group__1();

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
    // $ANTLR end "rule__Required__Group__0"


    // $ANTLR start "rule__Required__Group__0__Impl"
    // InternalFormValidation.g:1459:1: rule__Required__Group__0__Impl : ( () ) ;
    public final void rule__Required__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1463:1: ( ( () ) )
            // InternalFormValidation.g:1464:1: ( () )
            {
            // InternalFormValidation.g:1464:1: ( () )
            // InternalFormValidation.g:1465:2: ()
            {
             before(grammarAccess.getRequiredAccess().getRequiredAction_0()); 
            // InternalFormValidation.g:1466:2: ()
            // InternalFormValidation.g:1466:3: 
            {
            }

             after(grammarAccess.getRequiredAccess().getRequiredAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Required__Group__0__Impl"


    // $ANTLR start "rule__Required__Group__1"
    // InternalFormValidation.g:1474:1: rule__Required__Group__1 : rule__Required__Group__1__Impl rule__Required__Group__2 ;
    public final void rule__Required__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1478:1: ( rule__Required__Group__1__Impl rule__Required__Group__2 )
            // InternalFormValidation.g:1479:2: rule__Required__Group__1__Impl rule__Required__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Required__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Required__Group__2();

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
    // $ANTLR end "rule__Required__Group__1"


    // $ANTLR start "rule__Required__Group__1__Impl"
    // InternalFormValidation.g:1486:1: rule__Required__Group__1__Impl : ( ( rule__Required__IsRequiredAssignment_1 )? ) ;
    public final void rule__Required__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1490:1: ( ( ( rule__Required__IsRequiredAssignment_1 )? ) )
            // InternalFormValidation.g:1491:1: ( ( rule__Required__IsRequiredAssignment_1 )? )
            {
            // InternalFormValidation.g:1491:1: ( ( rule__Required__IsRequiredAssignment_1 )? )
            // InternalFormValidation.g:1492:2: ( rule__Required__IsRequiredAssignment_1 )?
            {
             before(grammarAccess.getRequiredAccess().getIsRequiredAssignment_1()); 
            // InternalFormValidation.g:1493:2: ( rule__Required__IsRequiredAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFormValidation.g:1493:3: rule__Required__IsRequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Required__IsRequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequiredAccess().getIsRequiredAssignment_1()); 

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
    // $ANTLR end "rule__Required__Group__1__Impl"


    // $ANTLR start "rule__Required__Group__2"
    // InternalFormValidation.g:1501:1: rule__Required__Group__2 : rule__Required__Group__2__Impl ;
    public final void rule__Required__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1505:1: ( rule__Required__Group__2__Impl )
            // InternalFormValidation.g:1506:2: rule__Required__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Required__Group__2__Impl();

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
    // $ANTLR end "rule__Required__Group__2"


    // $ANTLR start "rule__Required__Group__2__Impl"
    // InternalFormValidation.g:1512:1: rule__Required__Group__2__Impl : ( 'Required' ) ;
    public final void rule__Required__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1516:1: ( ( 'Required' ) )
            // InternalFormValidation.g:1517:1: ( 'Required' )
            {
            // InternalFormValidation.g:1517:1: ( 'Required' )
            // InternalFormValidation.g:1518:2: 'Required'
            {
             before(grammarAccess.getRequiredAccess().getRequiredKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRequiredAccess().getRequiredKeyword_2()); 

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
    // $ANTLR end "rule__Required__Group__2__Impl"


    // $ANTLR start "rule__Email__Group__0"
    // InternalFormValidation.g:1528:1: rule__Email__Group__0 : rule__Email__Group__0__Impl rule__Email__Group__1 ;
    public final void rule__Email__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1532:1: ( rule__Email__Group__0__Impl rule__Email__Group__1 )
            // InternalFormValidation.g:1533:2: rule__Email__Group__0__Impl rule__Email__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Email__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__1();

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
    // $ANTLR end "rule__Email__Group__0"


    // $ANTLR start "rule__Email__Group__0__Impl"
    // InternalFormValidation.g:1540:1: rule__Email__Group__0__Impl : ( () ) ;
    public final void rule__Email__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1544:1: ( ( () ) )
            // InternalFormValidation.g:1545:1: ( () )
            {
            // InternalFormValidation.g:1545:1: ( () )
            // InternalFormValidation.g:1546:2: ()
            {
             before(grammarAccess.getEmailAccess().getEmailAction_0()); 
            // InternalFormValidation.g:1547:2: ()
            // InternalFormValidation.g:1547:3: 
            {
            }

             after(grammarAccess.getEmailAccess().getEmailAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Email__Group__0__Impl"


    // $ANTLR start "rule__Email__Group__1"
    // InternalFormValidation.g:1555:1: rule__Email__Group__1 : rule__Email__Group__1__Impl rule__Email__Group__2 ;
    public final void rule__Email__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1559:1: ( rule__Email__Group__1__Impl rule__Email__Group__2 )
            // InternalFormValidation.g:1560:2: rule__Email__Group__1__Impl rule__Email__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Email__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Email__Group__2();

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
    // $ANTLR end "rule__Email__Group__1"


    // $ANTLR start "rule__Email__Group__1__Impl"
    // InternalFormValidation.g:1567:1: rule__Email__Group__1__Impl : ( ( rule__Email__IsEmailAssignment_1 )? ) ;
    public final void rule__Email__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1571:1: ( ( ( rule__Email__IsEmailAssignment_1 )? ) )
            // InternalFormValidation.g:1572:1: ( ( rule__Email__IsEmailAssignment_1 )? )
            {
            // InternalFormValidation.g:1572:1: ( ( rule__Email__IsEmailAssignment_1 )? )
            // InternalFormValidation.g:1573:2: ( rule__Email__IsEmailAssignment_1 )?
            {
             before(grammarAccess.getEmailAccess().getIsEmailAssignment_1()); 
            // InternalFormValidation.g:1574:2: ( rule__Email__IsEmailAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFormValidation.g:1574:3: rule__Email__IsEmailAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Email__IsEmailAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmailAccess().getIsEmailAssignment_1()); 

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
    // $ANTLR end "rule__Email__Group__1__Impl"


    // $ANTLR start "rule__Email__Group__2"
    // InternalFormValidation.g:1582:1: rule__Email__Group__2 : rule__Email__Group__2__Impl ;
    public final void rule__Email__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1586:1: ( rule__Email__Group__2__Impl )
            // InternalFormValidation.g:1587:2: rule__Email__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Email__Group__2__Impl();

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
    // $ANTLR end "rule__Email__Group__2"


    // $ANTLR start "rule__Email__Group__2__Impl"
    // InternalFormValidation.g:1593:1: rule__Email__Group__2__Impl : ( 'Email' ) ;
    public final void rule__Email__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1597:1: ( ( 'Email' ) )
            // InternalFormValidation.g:1598:1: ( 'Email' )
            {
            // InternalFormValidation.g:1598:1: ( 'Email' )
            // InternalFormValidation.g:1599:2: 'Email'
            {
             before(grammarAccess.getEmailAccess().getEmailKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getEmailKeyword_2()); 

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
    // $ANTLR end "rule__Email__Group__2__Impl"


    // $ANTLR start "rule__MinLength__Group__0"
    // InternalFormValidation.g:1609:1: rule__MinLength__Group__0 : rule__MinLength__Group__0__Impl rule__MinLength__Group__1 ;
    public final void rule__MinLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1613:1: ( rule__MinLength__Group__0__Impl rule__MinLength__Group__1 )
            // InternalFormValidation.g:1614:2: rule__MinLength__Group__0__Impl rule__MinLength__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MinLength__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLength__Group__1();

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
    // $ANTLR end "rule__MinLength__Group__0"


    // $ANTLR start "rule__MinLength__Group__0__Impl"
    // InternalFormValidation.g:1621:1: rule__MinLength__Group__0__Impl : ( () ) ;
    public final void rule__MinLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1625:1: ( ( () ) )
            // InternalFormValidation.g:1626:1: ( () )
            {
            // InternalFormValidation.g:1626:1: ( () )
            // InternalFormValidation.g:1627:2: ()
            {
             before(grammarAccess.getMinLengthAccess().getMinLengthAction_0()); 
            // InternalFormValidation.g:1628:2: ()
            // InternalFormValidation.g:1628:3: 
            {
            }

             after(grammarAccess.getMinLengthAccess().getMinLengthAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinLength__Group__0__Impl"


    // $ANTLR start "rule__MinLength__Group__1"
    // InternalFormValidation.g:1636:1: rule__MinLength__Group__1 : rule__MinLength__Group__1__Impl rule__MinLength__Group__2 ;
    public final void rule__MinLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1640:1: ( rule__MinLength__Group__1__Impl rule__MinLength__Group__2 )
            // InternalFormValidation.g:1641:2: rule__MinLength__Group__1__Impl rule__MinLength__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MinLength__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinLength__Group__2();

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
    // $ANTLR end "rule__MinLength__Group__1"


    // $ANTLR start "rule__MinLength__Group__1__Impl"
    // InternalFormValidation.g:1648:1: rule__MinLength__Group__1__Impl : ( 'MinLength' ) ;
    public final void rule__MinLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1652:1: ( ( 'MinLength' ) )
            // InternalFormValidation.g:1653:1: ( 'MinLength' )
            {
            // InternalFormValidation.g:1653:1: ( 'MinLength' )
            // InternalFormValidation.g:1654:2: 'MinLength'
            {
             before(grammarAccess.getMinLengthAccess().getMinLengthKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMinLengthAccess().getMinLengthKeyword_1()); 

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
    // $ANTLR end "rule__MinLength__Group__1__Impl"


    // $ANTLR start "rule__MinLength__Group__2"
    // InternalFormValidation.g:1663:1: rule__MinLength__Group__2 : rule__MinLength__Group__2__Impl ;
    public final void rule__MinLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1667:1: ( rule__MinLength__Group__2__Impl )
            // InternalFormValidation.g:1668:2: rule__MinLength__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinLength__Group__2__Impl();

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
    // $ANTLR end "rule__MinLength__Group__2"


    // $ANTLR start "rule__MinLength__Group__2__Impl"
    // InternalFormValidation.g:1674:1: rule__MinLength__Group__2__Impl : ( ( rule__MinLength__ValueAssignment_2 )? ) ;
    public final void rule__MinLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1678:1: ( ( ( rule__MinLength__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:1679:1: ( ( rule__MinLength__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:1679:1: ( ( rule__MinLength__ValueAssignment_2 )? )
            // InternalFormValidation.g:1680:2: ( rule__MinLength__ValueAssignment_2 )?
            {
             before(grammarAccess.getMinLengthAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:1681:2: ( rule__MinLength__ValueAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFormValidation.g:1681:3: rule__MinLength__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinLength__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMinLengthAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MinLength__Group__2__Impl"


    // $ANTLR start "rule__MaxLength__Group__0"
    // InternalFormValidation.g:1690:1: rule__MaxLength__Group__0 : rule__MaxLength__Group__0__Impl rule__MaxLength__Group__1 ;
    public final void rule__MaxLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1694:1: ( rule__MaxLength__Group__0__Impl rule__MaxLength__Group__1 )
            // InternalFormValidation.g:1695:2: rule__MaxLength__Group__0__Impl rule__MaxLength__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__MaxLength__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLength__Group__1();

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
    // $ANTLR end "rule__MaxLength__Group__0"


    // $ANTLR start "rule__MaxLength__Group__0__Impl"
    // InternalFormValidation.g:1702:1: rule__MaxLength__Group__0__Impl : ( () ) ;
    public final void rule__MaxLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1706:1: ( ( () ) )
            // InternalFormValidation.g:1707:1: ( () )
            {
            // InternalFormValidation.g:1707:1: ( () )
            // InternalFormValidation.g:1708:2: ()
            {
             before(grammarAccess.getMaxLengthAccess().getMaxLengthAction_0()); 
            // InternalFormValidation.g:1709:2: ()
            // InternalFormValidation.g:1709:3: 
            {
            }

             after(grammarAccess.getMaxLengthAccess().getMaxLengthAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxLength__Group__0__Impl"


    // $ANTLR start "rule__MaxLength__Group__1"
    // InternalFormValidation.g:1717:1: rule__MaxLength__Group__1 : rule__MaxLength__Group__1__Impl rule__MaxLength__Group__2 ;
    public final void rule__MaxLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1721:1: ( rule__MaxLength__Group__1__Impl rule__MaxLength__Group__2 )
            // InternalFormValidation.g:1722:2: rule__MaxLength__Group__1__Impl rule__MaxLength__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MaxLength__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxLength__Group__2();

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
    // $ANTLR end "rule__MaxLength__Group__1"


    // $ANTLR start "rule__MaxLength__Group__1__Impl"
    // InternalFormValidation.g:1729:1: rule__MaxLength__Group__1__Impl : ( 'MaxLength' ) ;
    public final void rule__MaxLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1733:1: ( ( 'MaxLength' ) )
            // InternalFormValidation.g:1734:1: ( 'MaxLength' )
            {
            // InternalFormValidation.g:1734:1: ( 'MaxLength' )
            // InternalFormValidation.g:1735:2: 'MaxLength'
            {
             before(grammarAccess.getMaxLengthAccess().getMaxLengthKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaxLengthAccess().getMaxLengthKeyword_1()); 

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
    // $ANTLR end "rule__MaxLength__Group__1__Impl"


    // $ANTLR start "rule__MaxLength__Group__2"
    // InternalFormValidation.g:1744:1: rule__MaxLength__Group__2 : rule__MaxLength__Group__2__Impl ;
    public final void rule__MaxLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1748:1: ( rule__MaxLength__Group__2__Impl )
            // InternalFormValidation.g:1749:2: rule__MaxLength__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxLength__Group__2__Impl();

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
    // $ANTLR end "rule__MaxLength__Group__2"


    // $ANTLR start "rule__MaxLength__Group__2__Impl"
    // InternalFormValidation.g:1755:1: rule__MaxLength__Group__2__Impl : ( ( rule__MaxLength__ValueAssignment_2 )? ) ;
    public final void rule__MaxLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1759:1: ( ( ( rule__MaxLength__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:1760:1: ( ( rule__MaxLength__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:1760:1: ( ( rule__MaxLength__ValueAssignment_2 )? )
            // InternalFormValidation.g:1761:2: ( rule__MaxLength__ValueAssignment_2 )?
            {
             before(grammarAccess.getMaxLengthAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:1762:2: ( rule__MaxLength__ValueAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFormValidation.g:1762:3: rule__MaxLength__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxLength__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxLengthAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MaxLength__Group__2__Impl"


    // $ANTLR start "rule__Length__Group__0"
    // InternalFormValidation.g:1771:1: rule__Length__Group__0 : rule__Length__Group__0__Impl rule__Length__Group__1 ;
    public final void rule__Length__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1775:1: ( rule__Length__Group__0__Impl rule__Length__Group__1 )
            // InternalFormValidation.g:1776:2: rule__Length__Group__0__Impl rule__Length__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Length__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Length__Group__1();

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
    // $ANTLR end "rule__Length__Group__0"


    // $ANTLR start "rule__Length__Group__0__Impl"
    // InternalFormValidation.g:1783:1: rule__Length__Group__0__Impl : ( () ) ;
    public final void rule__Length__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1787:1: ( ( () ) )
            // InternalFormValidation.g:1788:1: ( () )
            {
            // InternalFormValidation.g:1788:1: ( () )
            // InternalFormValidation.g:1789:2: ()
            {
             before(grammarAccess.getLengthAccess().getLengthAction_0()); 
            // InternalFormValidation.g:1790:2: ()
            // InternalFormValidation.g:1790:3: 
            {
            }

             after(grammarAccess.getLengthAccess().getLengthAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__0__Impl"


    // $ANTLR start "rule__Length__Group__1"
    // InternalFormValidation.g:1798:1: rule__Length__Group__1 : rule__Length__Group__1__Impl rule__Length__Group__2 ;
    public final void rule__Length__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1802:1: ( rule__Length__Group__1__Impl rule__Length__Group__2 )
            // InternalFormValidation.g:1803:2: rule__Length__Group__1__Impl rule__Length__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Length__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Length__Group__2();

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
    // $ANTLR end "rule__Length__Group__1"


    // $ANTLR start "rule__Length__Group__1__Impl"
    // InternalFormValidation.g:1810:1: rule__Length__Group__1__Impl : ( 'Length' ) ;
    public final void rule__Length__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1814:1: ( ( 'Length' ) )
            // InternalFormValidation.g:1815:1: ( 'Length' )
            {
            // InternalFormValidation.g:1815:1: ( 'Length' )
            // InternalFormValidation.g:1816:2: 'Length'
            {
             before(grammarAccess.getLengthAccess().getLengthKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLengthAccess().getLengthKeyword_1()); 

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
    // $ANTLR end "rule__Length__Group__1__Impl"


    // $ANTLR start "rule__Length__Group__2"
    // InternalFormValidation.g:1825:1: rule__Length__Group__2 : rule__Length__Group__2__Impl ;
    public final void rule__Length__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1829:1: ( rule__Length__Group__2__Impl )
            // InternalFormValidation.g:1830:2: rule__Length__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Length__Group__2__Impl();

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
    // $ANTLR end "rule__Length__Group__2"


    // $ANTLR start "rule__Length__Group__2__Impl"
    // InternalFormValidation.g:1836:1: rule__Length__Group__2__Impl : ( ( rule__Length__ValueAssignment_2 )? ) ;
    public final void rule__Length__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1840:1: ( ( ( rule__Length__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:1841:1: ( ( rule__Length__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:1841:1: ( ( rule__Length__ValueAssignment_2 )? )
            // InternalFormValidation.g:1842:2: ( rule__Length__ValueAssignment_2 )?
            {
             before(grammarAccess.getLengthAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:1843:2: ( rule__Length__ValueAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFormValidation.g:1843:3: rule__Length__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Length__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLengthAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Length__Group__2__Impl"


    // $ANTLR start "rule__MinNumber__Group__0"
    // InternalFormValidation.g:1852:1: rule__MinNumber__Group__0 : rule__MinNumber__Group__0__Impl rule__MinNumber__Group__1 ;
    public final void rule__MinNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1856:1: ( rule__MinNumber__Group__0__Impl rule__MinNumber__Group__1 )
            // InternalFormValidation.g:1857:2: rule__MinNumber__Group__0__Impl rule__MinNumber__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MinNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinNumber__Group__1();

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
    // $ANTLR end "rule__MinNumber__Group__0"


    // $ANTLR start "rule__MinNumber__Group__0__Impl"
    // InternalFormValidation.g:1864:1: rule__MinNumber__Group__0__Impl : ( () ) ;
    public final void rule__MinNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1868:1: ( ( () ) )
            // InternalFormValidation.g:1869:1: ( () )
            {
            // InternalFormValidation.g:1869:1: ( () )
            // InternalFormValidation.g:1870:2: ()
            {
             before(grammarAccess.getMinNumberAccess().getMinNumberAction_0()); 
            // InternalFormValidation.g:1871:2: ()
            // InternalFormValidation.g:1871:3: 
            {
            }

             after(grammarAccess.getMinNumberAccess().getMinNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinNumber__Group__0__Impl"


    // $ANTLR start "rule__MinNumber__Group__1"
    // InternalFormValidation.g:1879:1: rule__MinNumber__Group__1 : rule__MinNumber__Group__1__Impl rule__MinNumber__Group__2 ;
    public final void rule__MinNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1883:1: ( rule__MinNumber__Group__1__Impl rule__MinNumber__Group__2 )
            // InternalFormValidation.g:1884:2: rule__MinNumber__Group__1__Impl rule__MinNumber__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MinNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinNumber__Group__2();

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
    // $ANTLR end "rule__MinNumber__Group__1"


    // $ANTLR start "rule__MinNumber__Group__1__Impl"
    // InternalFormValidation.g:1891:1: rule__MinNumber__Group__1__Impl : ( 'MinNumber' ) ;
    public final void rule__MinNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1895:1: ( ( 'MinNumber' ) )
            // InternalFormValidation.g:1896:1: ( 'MinNumber' )
            {
            // InternalFormValidation.g:1896:1: ( 'MinNumber' )
            // InternalFormValidation.g:1897:2: 'MinNumber'
            {
             before(grammarAccess.getMinNumberAccess().getMinNumberKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMinNumberAccess().getMinNumberKeyword_1()); 

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
    // $ANTLR end "rule__MinNumber__Group__1__Impl"


    // $ANTLR start "rule__MinNumber__Group__2"
    // InternalFormValidation.g:1906:1: rule__MinNumber__Group__2 : rule__MinNumber__Group__2__Impl ;
    public final void rule__MinNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1910:1: ( rule__MinNumber__Group__2__Impl )
            // InternalFormValidation.g:1911:2: rule__MinNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinNumber__Group__2__Impl();

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
    // $ANTLR end "rule__MinNumber__Group__2"


    // $ANTLR start "rule__MinNumber__Group__2__Impl"
    // InternalFormValidation.g:1917:1: rule__MinNumber__Group__2__Impl : ( ( rule__MinNumber__ValueAssignment_2 )? ) ;
    public final void rule__MinNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1921:1: ( ( ( rule__MinNumber__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:1922:1: ( ( rule__MinNumber__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:1922:1: ( ( rule__MinNumber__ValueAssignment_2 )? )
            // InternalFormValidation.g:1923:2: ( rule__MinNumber__ValueAssignment_2 )?
            {
             before(grammarAccess.getMinNumberAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:1924:2: ( rule__MinNumber__ValueAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFormValidation.g:1924:3: rule__MinNumber__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinNumber__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMinNumberAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MinNumber__Group__2__Impl"


    // $ANTLR start "rule__MinDate__Group__0"
    // InternalFormValidation.g:1933:1: rule__MinDate__Group__0 : rule__MinDate__Group__0__Impl rule__MinDate__Group__1 ;
    public final void rule__MinDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1937:1: ( rule__MinDate__Group__0__Impl rule__MinDate__Group__1 )
            // InternalFormValidation.g:1938:2: rule__MinDate__Group__0__Impl rule__MinDate__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MinDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinDate__Group__1();

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
    // $ANTLR end "rule__MinDate__Group__0"


    // $ANTLR start "rule__MinDate__Group__0__Impl"
    // InternalFormValidation.g:1945:1: rule__MinDate__Group__0__Impl : ( () ) ;
    public final void rule__MinDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1949:1: ( ( () ) )
            // InternalFormValidation.g:1950:1: ( () )
            {
            // InternalFormValidation.g:1950:1: ( () )
            // InternalFormValidation.g:1951:2: ()
            {
             before(grammarAccess.getMinDateAccess().getMinDateAction_0()); 
            // InternalFormValidation.g:1952:2: ()
            // InternalFormValidation.g:1952:3: 
            {
            }

             after(grammarAccess.getMinDateAccess().getMinDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinDate__Group__0__Impl"


    // $ANTLR start "rule__MinDate__Group__1"
    // InternalFormValidation.g:1960:1: rule__MinDate__Group__1 : rule__MinDate__Group__1__Impl rule__MinDate__Group__2 ;
    public final void rule__MinDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1964:1: ( rule__MinDate__Group__1__Impl rule__MinDate__Group__2 )
            // InternalFormValidation.g:1965:2: rule__MinDate__Group__1__Impl rule__MinDate__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MinDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinDate__Group__2();

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
    // $ANTLR end "rule__MinDate__Group__1"


    // $ANTLR start "rule__MinDate__Group__1__Impl"
    // InternalFormValidation.g:1972:1: rule__MinDate__Group__1__Impl : ( 'MinDate' ) ;
    public final void rule__MinDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1976:1: ( ( 'MinDate' ) )
            // InternalFormValidation.g:1977:1: ( 'MinDate' )
            {
            // InternalFormValidation.g:1977:1: ( 'MinDate' )
            // InternalFormValidation.g:1978:2: 'MinDate'
            {
             before(grammarAccess.getMinDateAccess().getMinDateKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMinDateAccess().getMinDateKeyword_1()); 

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
    // $ANTLR end "rule__MinDate__Group__1__Impl"


    // $ANTLR start "rule__MinDate__Group__2"
    // InternalFormValidation.g:1987:1: rule__MinDate__Group__2 : rule__MinDate__Group__2__Impl ;
    public final void rule__MinDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:1991:1: ( rule__MinDate__Group__2__Impl )
            // InternalFormValidation.g:1992:2: rule__MinDate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinDate__Group__2__Impl();

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
    // $ANTLR end "rule__MinDate__Group__2"


    // $ANTLR start "rule__MinDate__Group__2__Impl"
    // InternalFormValidation.g:1998:1: rule__MinDate__Group__2__Impl : ( ( rule__MinDate__ValueAssignment_2 )? ) ;
    public final void rule__MinDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2002:1: ( ( ( rule__MinDate__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:2003:1: ( ( rule__MinDate__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:2003:1: ( ( rule__MinDate__ValueAssignment_2 )? )
            // InternalFormValidation.g:2004:2: ( rule__MinDate__ValueAssignment_2 )?
            {
             before(grammarAccess.getMinDateAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:2005:2: ( rule__MinDate__ValueAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFormValidation.g:2005:3: rule__MinDate__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MinDate__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMinDateAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MinDate__Group__2__Impl"


    // $ANTLR start "rule__MaxNumber__Group__0"
    // InternalFormValidation.g:2014:1: rule__MaxNumber__Group__0 : rule__MaxNumber__Group__0__Impl rule__MaxNumber__Group__1 ;
    public final void rule__MaxNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2018:1: ( rule__MaxNumber__Group__0__Impl rule__MaxNumber__Group__1 )
            // InternalFormValidation.g:2019:2: rule__MaxNumber__Group__0__Impl rule__MaxNumber__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MaxNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxNumber__Group__1();

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
    // $ANTLR end "rule__MaxNumber__Group__0"


    // $ANTLR start "rule__MaxNumber__Group__0__Impl"
    // InternalFormValidation.g:2026:1: rule__MaxNumber__Group__0__Impl : ( () ) ;
    public final void rule__MaxNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2030:1: ( ( () ) )
            // InternalFormValidation.g:2031:1: ( () )
            {
            // InternalFormValidation.g:2031:1: ( () )
            // InternalFormValidation.g:2032:2: ()
            {
             before(grammarAccess.getMaxNumberAccess().getMaxNumberAction_0()); 
            // InternalFormValidation.g:2033:2: ()
            // InternalFormValidation.g:2033:3: 
            {
            }

             after(grammarAccess.getMaxNumberAccess().getMaxNumberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxNumber__Group__0__Impl"


    // $ANTLR start "rule__MaxNumber__Group__1"
    // InternalFormValidation.g:2041:1: rule__MaxNumber__Group__1 : rule__MaxNumber__Group__1__Impl rule__MaxNumber__Group__2 ;
    public final void rule__MaxNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2045:1: ( rule__MaxNumber__Group__1__Impl rule__MaxNumber__Group__2 )
            // InternalFormValidation.g:2046:2: rule__MaxNumber__Group__1__Impl rule__MaxNumber__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MaxNumber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxNumber__Group__2();

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
    // $ANTLR end "rule__MaxNumber__Group__1"


    // $ANTLR start "rule__MaxNumber__Group__1__Impl"
    // InternalFormValidation.g:2053:1: rule__MaxNumber__Group__1__Impl : ( 'MaxNumber' ) ;
    public final void rule__MaxNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2057:1: ( ( 'MaxNumber' ) )
            // InternalFormValidation.g:2058:1: ( 'MaxNumber' )
            {
            // InternalFormValidation.g:2058:1: ( 'MaxNumber' )
            // InternalFormValidation.g:2059:2: 'MaxNumber'
            {
             before(grammarAccess.getMaxNumberAccess().getMaxNumberKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaxNumberAccess().getMaxNumberKeyword_1()); 

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
    // $ANTLR end "rule__MaxNumber__Group__1__Impl"


    // $ANTLR start "rule__MaxNumber__Group__2"
    // InternalFormValidation.g:2068:1: rule__MaxNumber__Group__2 : rule__MaxNumber__Group__2__Impl ;
    public final void rule__MaxNumber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2072:1: ( rule__MaxNumber__Group__2__Impl )
            // InternalFormValidation.g:2073:2: rule__MaxNumber__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxNumber__Group__2__Impl();

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
    // $ANTLR end "rule__MaxNumber__Group__2"


    // $ANTLR start "rule__MaxNumber__Group__2__Impl"
    // InternalFormValidation.g:2079:1: rule__MaxNumber__Group__2__Impl : ( ( rule__MaxNumber__ValueAssignment_2 )? ) ;
    public final void rule__MaxNumber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2083:1: ( ( ( rule__MaxNumber__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:2084:1: ( ( rule__MaxNumber__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:2084:1: ( ( rule__MaxNumber__ValueAssignment_2 )? )
            // InternalFormValidation.g:2085:2: ( rule__MaxNumber__ValueAssignment_2 )?
            {
             before(grammarAccess.getMaxNumberAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:2086:2: ( rule__MaxNumber__ValueAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFormValidation.g:2086:3: rule__MaxNumber__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxNumber__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxNumberAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MaxNumber__Group__2__Impl"


    // $ANTLR start "rule__MaxDate__Group__0"
    // InternalFormValidation.g:2095:1: rule__MaxDate__Group__0 : rule__MaxDate__Group__0__Impl rule__MaxDate__Group__1 ;
    public final void rule__MaxDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2099:1: ( rule__MaxDate__Group__0__Impl rule__MaxDate__Group__1 )
            // InternalFormValidation.g:2100:2: rule__MaxDate__Group__0__Impl rule__MaxDate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__MaxDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxDate__Group__1();

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
    // $ANTLR end "rule__MaxDate__Group__0"


    // $ANTLR start "rule__MaxDate__Group__0__Impl"
    // InternalFormValidation.g:2107:1: rule__MaxDate__Group__0__Impl : ( () ) ;
    public final void rule__MaxDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2111:1: ( ( () ) )
            // InternalFormValidation.g:2112:1: ( () )
            {
            // InternalFormValidation.g:2112:1: ( () )
            // InternalFormValidation.g:2113:2: ()
            {
             before(grammarAccess.getMaxDateAccess().getMaxDateAction_0()); 
            // InternalFormValidation.g:2114:2: ()
            // InternalFormValidation.g:2114:3: 
            {
            }

             after(grammarAccess.getMaxDateAccess().getMaxDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxDate__Group__0__Impl"


    // $ANTLR start "rule__MaxDate__Group__1"
    // InternalFormValidation.g:2122:1: rule__MaxDate__Group__1 : rule__MaxDate__Group__1__Impl rule__MaxDate__Group__2 ;
    public final void rule__MaxDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2126:1: ( rule__MaxDate__Group__1__Impl rule__MaxDate__Group__2 )
            // InternalFormValidation.g:2127:2: rule__MaxDate__Group__1__Impl rule__MaxDate__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MaxDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxDate__Group__2();

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
    // $ANTLR end "rule__MaxDate__Group__1"


    // $ANTLR start "rule__MaxDate__Group__1__Impl"
    // InternalFormValidation.g:2134:1: rule__MaxDate__Group__1__Impl : ( 'MaxDate' ) ;
    public final void rule__MaxDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2138:1: ( ( 'MaxDate' ) )
            // InternalFormValidation.g:2139:1: ( 'MaxDate' )
            {
            // InternalFormValidation.g:2139:1: ( 'MaxDate' )
            // InternalFormValidation.g:2140:2: 'MaxDate'
            {
             before(grammarAccess.getMaxDateAccess().getMaxDateKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaxDateAccess().getMaxDateKeyword_1()); 

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
    // $ANTLR end "rule__MaxDate__Group__1__Impl"


    // $ANTLR start "rule__MaxDate__Group__2"
    // InternalFormValidation.g:2149:1: rule__MaxDate__Group__2 : rule__MaxDate__Group__2__Impl ;
    public final void rule__MaxDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2153:1: ( rule__MaxDate__Group__2__Impl )
            // InternalFormValidation.g:2154:2: rule__MaxDate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxDate__Group__2__Impl();

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
    // $ANTLR end "rule__MaxDate__Group__2"


    // $ANTLR start "rule__MaxDate__Group__2__Impl"
    // InternalFormValidation.g:2160:1: rule__MaxDate__Group__2__Impl : ( ( rule__MaxDate__ValueAssignment_2 )? ) ;
    public final void rule__MaxDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2164:1: ( ( ( rule__MaxDate__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:2165:1: ( ( rule__MaxDate__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:2165:1: ( ( rule__MaxDate__ValueAssignment_2 )? )
            // InternalFormValidation.g:2166:2: ( rule__MaxDate__ValueAssignment_2 )?
            {
             before(grammarAccess.getMaxDateAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:2167:2: ( rule__MaxDate__ValueAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFormValidation.g:2167:3: rule__MaxDate__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxDate__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMaxDateAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__MaxDate__Group__2__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group__0"
    // InternalFormValidation.g:2176:1: rule__AcceptableValuesString__Group__0 : rule__AcceptableValuesString__Group__0__Impl rule__AcceptableValuesString__Group__1 ;
    public final void rule__AcceptableValuesString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2180:1: ( rule__AcceptableValuesString__Group__0__Impl rule__AcceptableValuesString__Group__1 )
            // InternalFormValidation.g:2181:2: rule__AcceptableValuesString__Group__0__Impl rule__AcceptableValuesString__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AcceptableValuesString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group__1();

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
    // $ANTLR end "rule__AcceptableValuesString__Group__0"


    // $ANTLR start "rule__AcceptableValuesString__Group__0__Impl"
    // InternalFormValidation.g:2188:1: rule__AcceptableValuesString__Group__0__Impl : ( () ) ;
    public final void rule__AcceptableValuesString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2192:1: ( ( () ) )
            // InternalFormValidation.g:2193:1: ( () )
            {
            // InternalFormValidation.g:2193:1: ( () )
            // InternalFormValidation.g:2194:2: ()
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringAction_0()); 
            // InternalFormValidation.g:2195:2: ()
            // InternalFormValidation.g:2195:3: 
            {
            }

             after(grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceptableValuesString__Group__0__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group__1"
    // InternalFormValidation.g:2203:1: rule__AcceptableValuesString__Group__1 : rule__AcceptableValuesString__Group__1__Impl rule__AcceptableValuesString__Group__2 ;
    public final void rule__AcceptableValuesString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2207:1: ( rule__AcceptableValuesString__Group__1__Impl rule__AcceptableValuesString__Group__2 )
            // InternalFormValidation.g:2208:2: rule__AcceptableValuesString__Group__1__Impl rule__AcceptableValuesString__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AcceptableValuesString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group__2();

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
    // $ANTLR end "rule__AcceptableValuesString__Group__1"


    // $ANTLR start "rule__AcceptableValuesString__Group__1__Impl"
    // InternalFormValidation.g:2215:1: rule__AcceptableValuesString__Group__1__Impl : ( 'AcceptableValuesString' ) ;
    public final void rule__AcceptableValuesString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2219:1: ( ( 'AcceptableValuesString' ) )
            // InternalFormValidation.g:2220:1: ( 'AcceptableValuesString' )
            {
            // InternalFormValidation.g:2220:1: ( 'AcceptableValuesString' )
            // InternalFormValidation.g:2221:2: 'AcceptableValuesString'
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesStringAccess().getAcceptableValuesStringKeyword_1()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group__1__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group__2"
    // InternalFormValidation.g:2230:1: rule__AcceptableValuesString__Group__2 : rule__AcceptableValuesString__Group__2__Impl ;
    public final void rule__AcceptableValuesString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2234:1: ( rule__AcceptableValuesString__Group__2__Impl )
            // InternalFormValidation.g:2235:2: rule__AcceptableValuesString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group__2__Impl();

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
    // $ANTLR end "rule__AcceptableValuesString__Group__2"


    // $ANTLR start "rule__AcceptableValuesString__Group__2__Impl"
    // InternalFormValidation.g:2241:1: rule__AcceptableValuesString__Group__2__Impl : ( ( rule__AcceptableValuesString__Group_2__0 )? ) ;
    public final void rule__AcceptableValuesString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2245:1: ( ( ( rule__AcceptableValuesString__Group_2__0 )? ) )
            // InternalFormValidation.g:2246:1: ( ( rule__AcceptableValuesString__Group_2__0 )? )
            {
            // InternalFormValidation.g:2246:1: ( ( rule__AcceptableValuesString__Group_2__0 )? )
            // InternalFormValidation.g:2247:2: ( rule__AcceptableValuesString__Group_2__0 )?
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getGroup_2()); 
            // InternalFormValidation.g:2248:2: ( rule__AcceptableValuesString__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFormValidation.g:2248:3: rule__AcceptableValuesString__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AcceptableValuesString__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAcceptableValuesStringAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group__2__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__0"
    // InternalFormValidation.g:2257:1: rule__AcceptableValuesString__Group_2__0 : rule__AcceptableValuesString__Group_2__0__Impl rule__AcceptableValuesString__Group_2__1 ;
    public final void rule__AcceptableValuesString__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2261:1: ( rule__AcceptableValuesString__Group_2__0__Impl rule__AcceptableValuesString__Group_2__1 )
            // InternalFormValidation.g:2262:2: rule__AcceptableValuesString__Group_2__0__Impl rule__AcceptableValuesString__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AcceptableValuesString__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group_2__1();

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__0"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__0__Impl"
    // InternalFormValidation.g:2269:1: rule__AcceptableValuesString__Group_2__0__Impl : ( '{' ) ;
    public final void rule__AcceptableValuesString__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2273:1: ( ( '{' ) )
            // InternalFormValidation.g:2274:1: ( '{' )
            {
            // InternalFormValidation.g:2274:1: ( '{' )
            // InternalFormValidation.g:2275:2: '{'
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesStringAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__0__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__1"
    // InternalFormValidation.g:2284:1: rule__AcceptableValuesString__Group_2__1 : rule__AcceptableValuesString__Group_2__1__Impl rule__AcceptableValuesString__Group_2__2 ;
    public final void rule__AcceptableValuesString__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2288:1: ( rule__AcceptableValuesString__Group_2__1__Impl rule__AcceptableValuesString__Group_2__2 )
            // InternalFormValidation.g:2289:2: rule__AcceptableValuesString__Group_2__1__Impl rule__AcceptableValuesString__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__AcceptableValuesString__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group_2__2();

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__1"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__1__Impl"
    // InternalFormValidation.g:2296:1: rule__AcceptableValuesString__Group_2__1__Impl : ( ( rule__AcceptableValuesString__ValuesAssignment_2_1 ) ) ;
    public final void rule__AcceptableValuesString__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2300:1: ( ( ( rule__AcceptableValuesString__ValuesAssignment_2_1 ) ) )
            // InternalFormValidation.g:2301:1: ( ( rule__AcceptableValuesString__ValuesAssignment_2_1 ) )
            {
            // InternalFormValidation.g:2301:1: ( ( rule__AcceptableValuesString__ValuesAssignment_2_1 ) )
            // InternalFormValidation.g:2302:2: ( rule__AcceptableValuesString__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getValuesAssignment_2_1()); 
            // InternalFormValidation.g:2303:2: ( rule__AcceptableValuesString__ValuesAssignment_2_1 )
            // InternalFormValidation.g:2303:3: rule__AcceptableValuesString__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAcceptableValuesStringAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__1__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__2"
    // InternalFormValidation.g:2311:1: rule__AcceptableValuesString__Group_2__2 : rule__AcceptableValuesString__Group_2__2__Impl rule__AcceptableValuesString__Group_2__3 ;
    public final void rule__AcceptableValuesString__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2315:1: ( rule__AcceptableValuesString__Group_2__2__Impl rule__AcceptableValuesString__Group_2__3 )
            // InternalFormValidation.g:2316:2: rule__AcceptableValuesString__Group_2__2__Impl rule__AcceptableValuesString__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__AcceptableValuesString__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group_2__3();

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__2"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__2__Impl"
    // InternalFormValidation.g:2323:1: rule__AcceptableValuesString__Group_2__2__Impl : ( ( rule__AcceptableValuesString__Group_2_2__0 )* ) ;
    public final void rule__AcceptableValuesString__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2327:1: ( ( ( rule__AcceptableValuesString__Group_2_2__0 )* ) )
            // InternalFormValidation.g:2328:1: ( ( rule__AcceptableValuesString__Group_2_2__0 )* )
            {
            // InternalFormValidation.g:2328:1: ( ( rule__AcceptableValuesString__Group_2_2__0 )* )
            // InternalFormValidation.g:2329:2: ( rule__AcceptableValuesString__Group_2_2__0 )*
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getGroup_2_2()); 
            // InternalFormValidation.g:2330:2: ( rule__AcceptableValuesString__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFormValidation.g:2330:3: rule__AcceptableValuesString__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AcceptableValuesString__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAcceptableValuesStringAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__2__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__3"
    // InternalFormValidation.g:2338:1: rule__AcceptableValuesString__Group_2__3 : rule__AcceptableValuesString__Group_2__3__Impl ;
    public final void rule__AcceptableValuesString__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2342:1: ( rule__AcceptableValuesString__Group_2__3__Impl )
            // InternalFormValidation.g:2343:2: rule__AcceptableValuesString__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group_2__3__Impl();

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__3"


    // $ANTLR start "rule__AcceptableValuesString__Group_2__3__Impl"
    // InternalFormValidation.g:2349:1: rule__AcceptableValuesString__Group_2__3__Impl : ( '}' ) ;
    public final void rule__AcceptableValuesString__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2353:1: ( ( '}' ) )
            // InternalFormValidation.g:2354:1: ( '}' )
            {
            // InternalFormValidation.g:2354:1: ( '}' )
            // InternalFormValidation.g:2355:2: '}'
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesStringAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2__3__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group_2_2__0"
    // InternalFormValidation.g:2365:1: rule__AcceptableValuesString__Group_2_2__0 : rule__AcceptableValuesString__Group_2_2__0__Impl rule__AcceptableValuesString__Group_2_2__1 ;
    public final void rule__AcceptableValuesString__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2369:1: ( rule__AcceptableValuesString__Group_2_2__0__Impl rule__AcceptableValuesString__Group_2_2__1 )
            // InternalFormValidation.g:2370:2: rule__AcceptableValuesString__Group_2_2__0__Impl rule__AcceptableValuesString__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AcceptableValuesString__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group_2_2__1();

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2_2__0"


    // $ANTLR start "rule__AcceptableValuesString__Group_2_2__0__Impl"
    // InternalFormValidation.g:2377:1: rule__AcceptableValuesString__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__AcceptableValuesString__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2381:1: ( ( ',' ) )
            // InternalFormValidation.g:2382:1: ( ',' )
            {
            // InternalFormValidation.g:2382:1: ( ',' )
            // InternalFormValidation.g:2383:2: ','
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesStringAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2_2__0__Impl"


    // $ANTLR start "rule__AcceptableValuesString__Group_2_2__1"
    // InternalFormValidation.g:2392:1: rule__AcceptableValuesString__Group_2_2__1 : rule__AcceptableValuesString__Group_2_2__1__Impl ;
    public final void rule__AcceptableValuesString__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2396:1: ( rule__AcceptableValuesString__Group_2_2__1__Impl )
            // InternalFormValidation.g:2397:2: rule__AcceptableValuesString__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2_2__1"


    // $ANTLR start "rule__AcceptableValuesString__Group_2_2__1__Impl"
    // InternalFormValidation.g:2403:1: rule__AcceptableValuesString__Group_2_2__1__Impl : ( ( rule__AcceptableValuesString__ValuesAssignment_2_2_1 ) ) ;
    public final void rule__AcceptableValuesString__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2407:1: ( ( ( rule__AcceptableValuesString__ValuesAssignment_2_2_1 ) ) )
            // InternalFormValidation.g:2408:1: ( ( rule__AcceptableValuesString__ValuesAssignment_2_2_1 ) )
            {
            // InternalFormValidation.g:2408:1: ( ( rule__AcceptableValuesString__ValuesAssignment_2_2_1 ) )
            // InternalFormValidation.g:2409:2: ( rule__AcceptableValuesString__ValuesAssignment_2_2_1 )
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getValuesAssignment_2_2_1()); 
            // InternalFormValidation.g:2410:2: ( rule__AcceptableValuesString__ValuesAssignment_2_2_1 )
            // InternalFormValidation.g:2410:3: rule__AcceptableValuesString__ValuesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesString__ValuesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAcceptableValuesStringAccess().getValuesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__AcceptableValuesString__Group_2_2__1__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group__0"
    // InternalFormValidation.g:2419:1: rule__AcceptableValuesDate__Group__0 : rule__AcceptableValuesDate__Group__0__Impl rule__AcceptableValuesDate__Group__1 ;
    public final void rule__AcceptableValuesDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2423:1: ( rule__AcceptableValuesDate__Group__0__Impl rule__AcceptableValuesDate__Group__1 )
            // InternalFormValidation.g:2424:2: rule__AcceptableValuesDate__Group__0__Impl rule__AcceptableValuesDate__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__AcceptableValuesDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group__1();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group__0"


    // $ANTLR start "rule__AcceptableValuesDate__Group__0__Impl"
    // InternalFormValidation.g:2431:1: rule__AcceptableValuesDate__Group__0__Impl : ( () ) ;
    public final void rule__AcceptableValuesDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2435:1: ( ( () ) )
            // InternalFormValidation.g:2436:1: ( () )
            {
            // InternalFormValidation.g:2436:1: ( () )
            // InternalFormValidation.g:2437:2: ()
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateAction_0()); 
            // InternalFormValidation.g:2438:2: ()
            // InternalFormValidation.g:2438:3: 
            {
            }

             after(grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AcceptableValuesDate__Group__0__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group__1"
    // InternalFormValidation.g:2446:1: rule__AcceptableValuesDate__Group__1 : rule__AcceptableValuesDate__Group__1__Impl rule__AcceptableValuesDate__Group__2 ;
    public final void rule__AcceptableValuesDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2450:1: ( rule__AcceptableValuesDate__Group__1__Impl rule__AcceptableValuesDate__Group__2 )
            // InternalFormValidation.g:2451:2: rule__AcceptableValuesDate__Group__1__Impl rule__AcceptableValuesDate__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AcceptableValuesDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group__2();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group__1"


    // $ANTLR start "rule__AcceptableValuesDate__Group__1__Impl"
    // InternalFormValidation.g:2458:1: rule__AcceptableValuesDate__Group__1__Impl : ( 'AcceptableValuesDate' ) ;
    public final void rule__AcceptableValuesDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2462:1: ( ( 'AcceptableValuesDate' ) )
            // InternalFormValidation.g:2463:1: ( 'AcceptableValuesDate' )
            {
            // InternalFormValidation.g:2463:1: ( 'AcceptableValuesDate' )
            // InternalFormValidation.g:2464:2: 'AcceptableValuesDate'
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesDateAccess().getAcceptableValuesDateKeyword_1()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group__1__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group__2"
    // InternalFormValidation.g:2473:1: rule__AcceptableValuesDate__Group__2 : rule__AcceptableValuesDate__Group__2__Impl ;
    public final void rule__AcceptableValuesDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2477:1: ( rule__AcceptableValuesDate__Group__2__Impl )
            // InternalFormValidation.g:2478:2: rule__AcceptableValuesDate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group__2__Impl();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group__2"


    // $ANTLR start "rule__AcceptableValuesDate__Group__2__Impl"
    // InternalFormValidation.g:2484:1: rule__AcceptableValuesDate__Group__2__Impl : ( ( rule__AcceptableValuesDate__Group_2__0 )? ) ;
    public final void rule__AcceptableValuesDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2488:1: ( ( ( rule__AcceptableValuesDate__Group_2__0 )? ) )
            // InternalFormValidation.g:2489:1: ( ( rule__AcceptableValuesDate__Group_2__0 )? )
            {
            // InternalFormValidation.g:2489:1: ( ( rule__AcceptableValuesDate__Group_2__0 )? )
            // InternalFormValidation.g:2490:2: ( rule__AcceptableValuesDate__Group_2__0 )?
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getGroup_2()); 
            // InternalFormValidation.g:2491:2: ( rule__AcceptableValuesDate__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalFormValidation.g:2491:3: rule__AcceptableValuesDate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AcceptableValuesDate__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAcceptableValuesDateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group__2__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__0"
    // InternalFormValidation.g:2500:1: rule__AcceptableValuesDate__Group_2__0 : rule__AcceptableValuesDate__Group_2__0__Impl rule__AcceptableValuesDate__Group_2__1 ;
    public final void rule__AcceptableValuesDate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2504:1: ( rule__AcceptableValuesDate__Group_2__0__Impl rule__AcceptableValuesDate__Group_2__1 )
            // InternalFormValidation.g:2505:2: rule__AcceptableValuesDate__Group_2__0__Impl rule__AcceptableValuesDate__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AcceptableValuesDate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group_2__1();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__0"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__0__Impl"
    // InternalFormValidation.g:2512:1: rule__AcceptableValuesDate__Group_2__0__Impl : ( '{' ) ;
    public final void rule__AcceptableValuesDate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2516:1: ( ( '{' ) )
            // InternalFormValidation.g:2517:1: ( '{' )
            {
            // InternalFormValidation.g:2517:1: ( '{' )
            // InternalFormValidation.g:2518:2: '{'
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesDateAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__0__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__1"
    // InternalFormValidation.g:2527:1: rule__AcceptableValuesDate__Group_2__1 : rule__AcceptableValuesDate__Group_2__1__Impl rule__AcceptableValuesDate__Group_2__2 ;
    public final void rule__AcceptableValuesDate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2531:1: ( rule__AcceptableValuesDate__Group_2__1__Impl rule__AcceptableValuesDate__Group_2__2 )
            // InternalFormValidation.g:2532:2: rule__AcceptableValuesDate__Group_2__1__Impl rule__AcceptableValuesDate__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__AcceptableValuesDate__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group_2__2();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__1"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__1__Impl"
    // InternalFormValidation.g:2539:1: rule__AcceptableValuesDate__Group_2__1__Impl : ( ( rule__AcceptableValuesDate__ValuesAssignment_2_1 ) ) ;
    public final void rule__AcceptableValuesDate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2543:1: ( ( ( rule__AcceptableValuesDate__ValuesAssignment_2_1 ) ) )
            // InternalFormValidation.g:2544:1: ( ( rule__AcceptableValuesDate__ValuesAssignment_2_1 ) )
            {
            // InternalFormValidation.g:2544:1: ( ( rule__AcceptableValuesDate__ValuesAssignment_2_1 ) )
            // InternalFormValidation.g:2545:2: ( rule__AcceptableValuesDate__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getValuesAssignment_2_1()); 
            // InternalFormValidation.g:2546:2: ( rule__AcceptableValuesDate__ValuesAssignment_2_1 )
            // InternalFormValidation.g:2546:3: rule__AcceptableValuesDate__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAcceptableValuesDateAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__1__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__2"
    // InternalFormValidation.g:2554:1: rule__AcceptableValuesDate__Group_2__2 : rule__AcceptableValuesDate__Group_2__2__Impl rule__AcceptableValuesDate__Group_2__3 ;
    public final void rule__AcceptableValuesDate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2558:1: ( rule__AcceptableValuesDate__Group_2__2__Impl rule__AcceptableValuesDate__Group_2__3 )
            // InternalFormValidation.g:2559:2: rule__AcceptableValuesDate__Group_2__2__Impl rule__AcceptableValuesDate__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__AcceptableValuesDate__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group_2__3();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__2"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__2__Impl"
    // InternalFormValidation.g:2566:1: rule__AcceptableValuesDate__Group_2__2__Impl : ( ( rule__AcceptableValuesDate__Group_2_2__0 )* ) ;
    public final void rule__AcceptableValuesDate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2570:1: ( ( ( rule__AcceptableValuesDate__Group_2_2__0 )* ) )
            // InternalFormValidation.g:2571:1: ( ( rule__AcceptableValuesDate__Group_2_2__0 )* )
            {
            // InternalFormValidation.g:2571:1: ( ( rule__AcceptableValuesDate__Group_2_2__0 )* )
            // InternalFormValidation.g:2572:2: ( rule__AcceptableValuesDate__Group_2_2__0 )*
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getGroup_2_2()); 
            // InternalFormValidation.g:2573:2: ( rule__AcceptableValuesDate__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalFormValidation.g:2573:3: rule__AcceptableValuesDate__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AcceptableValuesDate__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAcceptableValuesDateAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__2__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__3"
    // InternalFormValidation.g:2581:1: rule__AcceptableValuesDate__Group_2__3 : rule__AcceptableValuesDate__Group_2__3__Impl ;
    public final void rule__AcceptableValuesDate__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2585:1: ( rule__AcceptableValuesDate__Group_2__3__Impl )
            // InternalFormValidation.g:2586:2: rule__AcceptableValuesDate__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group_2__3__Impl();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__3"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2__3__Impl"
    // InternalFormValidation.g:2592:1: rule__AcceptableValuesDate__Group_2__3__Impl : ( '}' ) ;
    public final void rule__AcceptableValuesDate__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2596:1: ( ( '}' ) )
            // InternalFormValidation.g:2597:1: ( '}' )
            {
            // InternalFormValidation.g:2597:1: ( '}' )
            // InternalFormValidation.g:2598:2: '}'
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesDateAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2__3__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2_2__0"
    // InternalFormValidation.g:2608:1: rule__AcceptableValuesDate__Group_2_2__0 : rule__AcceptableValuesDate__Group_2_2__0__Impl rule__AcceptableValuesDate__Group_2_2__1 ;
    public final void rule__AcceptableValuesDate__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2612:1: ( rule__AcceptableValuesDate__Group_2_2__0__Impl rule__AcceptableValuesDate__Group_2_2__1 )
            // InternalFormValidation.g:2613:2: rule__AcceptableValuesDate__Group_2_2__0__Impl rule__AcceptableValuesDate__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AcceptableValuesDate__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group_2_2__1();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2_2__0"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2_2__0__Impl"
    // InternalFormValidation.g:2620:1: rule__AcceptableValuesDate__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__AcceptableValuesDate__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2624:1: ( ( ',' ) )
            // InternalFormValidation.g:2625:1: ( ',' )
            {
            // InternalFormValidation.g:2625:1: ( ',' )
            // InternalFormValidation.g:2626:2: ','
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAcceptableValuesDateAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2_2__0__Impl"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2_2__1"
    // InternalFormValidation.g:2635:1: rule__AcceptableValuesDate__Group_2_2__1 : rule__AcceptableValuesDate__Group_2_2__1__Impl ;
    public final void rule__AcceptableValuesDate__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2639:1: ( rule__AcceptableValuesDate__Group_2_2__1__Impl )
            // InternalFormValidation.g:2640:2: rule__AcceptableValuesDate__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2_2__1"


    // $ANTLR start "rule__AcceptableValuesDate__Group_2_2__1__Impl"
    // InternalFormValidation.g:2646:1: rule__AcceptableValuesDate__Group_2_2__1__Impl : ( ( rule__AcceptableValuesDate__ValuesAssignment_2_2_1 ) ) ;
    public final void rule__AcceptableValuesDate__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2650:1: ( ( ( rule__AcceptableValuesDate__ValuesAssignment_2_2_1 ) ) )
            // InternalFormValidation.g:2651:1: ( ( rule__AcceptableValuesDate__ValuesAssignment_2_2_1 ) )
            {
            // InternalFormValidation.g:2651:1: ( ( rule__AcceptableValuesDate__ValuesAssignment_2_2_1 ) )
            // InternalFormValidation.g:2652:2: ( rule__AcceptableValuesDate__ValuesAssignment_2_2_1 )
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getValuesAssignment_2_2_1()); 
            // InternalFormValidation.g:2653:2: ( rule__AcceptableValuesDate__ValuesAssignment_2_2_1 )
            // InternalFormValidation.g:2653:3: rule__AcceptableValuesDate__ValuesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AcceptableValuesDate__ValuesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAcceptableValuesDateAccess().getValuesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__Group_2_2__1__Impl"


    // $ANTLR start "rule__StringPattern__Group__0"
    // InternalFormValidation.g:2662:1: rule__StringPattern__Group__0 : rule__StringPattern__Group__0__Impl rule__StringPattern__Group__1 ;
    public final void rule__StringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2666:1: ( rule__StringPattern__Group__0__Impl rule__StringPattern__Group__1 )
            // InternalFormValidation.g:2667:2: rule__StringPattern__Group__0__Impl rule__StringPattern__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__StringPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringPattern__Group__1();

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
    // $ANTLR end "rule__StringPattern__Group__0"


    // $ANTLR start "rule__StringPattern__Group__0__Impl"
    // InternalFormValidation.g:2674:1: rule__StringPattern__Group__0__Impl : ( () ) ;
    public final void rule__StringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2678:1: ( ( () ) )
            // InternalFormValidation.g:2679:1: ( () )
            {
            // InternalFormValidation.g:2679:1: ( () )
            // InternalFormValidation.g:2680:2: ()
            {
             before(grammarAccess.getStringPatternAccess().getStringPatternAction_0()); 
            // InternalFormValidation.g:2681:2: ()
            // InternalFormValidation.g:2681:3: 
            {
            }

             after(grammarAccess.getStringPatternAccess().getStringPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringPattern__Group__0__Impl"


    // $ANTLR start "rule__StringPattern__Group__1"
    // InternalFormValidation.g:2689:1: rule__StringPattern__Group__1 : rule__StringPattern__Group__1__Impl rule__StringPattern__Group__2 ;
    public final void rule__StringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2693:1: ( rule__StringPattern__Group__1__Impl rule__StringPattern__Group__2 )
            // InternalFormValidation.g:2694:2: rule__StringPattern__Group__1__Impl rule__StringPattern__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StringPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringPattern__Group__2();

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
    // $ANTLR end "rule__StringPattern__Group__1"


    // $ANTLR start "rule__StringPattern__Group__1__Impl"
    // InternalFormValidation.g:2701:1: rule__StringPattern__Group__1__Impl : ( 'StringPattern' ) ;
    public final void rule__StringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2705:1: ( ( 'StringPattern' ) )
            // InternalFormValidation.g:2706:1: ( 'StringPattern' )
            {
            // InternalFormValidation.g:2706:1: ( 'StringPattern' )
            // InternalFormValidation.g:2707:2: 'StringPattern'
            {
             before(grammarAccess.getStringPatternAccess().getStringPatternKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringPatternAccess().getStringPatternKeyword_1()); 

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
    // $ANTLR end "rule__StringPattern__Group__1__Impl"


    // $ANTLR start "rule__StringPattern__Group__2"
    // InternalFormValidation.g:2716:1: rule__StringPattern__Group__2 : rule__StringPattern__Group__2__Impl ;
    public final void rule__StringPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2720:1: ( rule__StringPattern__Group__2__Impl )
            // InternalFormValidation.g:2721:2: rule__StringPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringPattern__Group__2__Impl();

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
    // $ANTLR end "rule__StringPattern__Group__2"


    // $ANTLR start "rule__StringPattern__Group__2__Impl"
    // InternalFormValidation.g:2727:1: rule__StringPattern__Group__2__Impl : ( ( rule__StringPattern__ValueAssignment_2 )? ) ;
    public final void rule__StringPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2731:1: ( ( ( rule__StringPattern__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:2732:1: ( ( rule__StringPattern__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:2732:1: ( ( rule__StringPattern__ValueAssignment_2 )? )
            // InternalFormValidation.g:2733:2: ( rule__StringPattern__ValueAssignment_2 )?
            {
             before(grammarAccess.getStringPatternAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:2734:2: ( rule__StringPattern__ValueAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalFormValidation.g:2734:3: rule__StringPattern__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringPattern__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringPatternAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__StringPattern__Group__2__Impl"


    // $ANTLR start "rule__DatePattern__Group__0"
    // InternalFormValidation.g:2743:1: rule__DatePattern__Group__0 : rule__DatePattern__Group__0__Impl rule__DatePattern__Group__1 ;
    public final void rule__DatePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2747:1: ( rule__DatePattern__Group__0__Impl rule__DatePattern__Group__1 )
            // InternalFormValidation.g:2748:2: rule__DatePattern__Group__0__Impl rule__DatePattern__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DatePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatePattern__Group__1();

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
    // $ANTLR end "rule__DatePattern__Group__0"


    // $ANTLR start "rule__DatePattern__Group__0__Impl"
    // InternalFormValidation.g:2755:1: rule__DatePattern__Group__0__Impl : ( () ) ;
    public final void rule__DatePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2759:1: ( ( () ) )
            // InternalFormValidation.g:2760:1: ( () )
            {
            // InternalFormValidation.g:2760:1: ( () )
            // InternalFormValidation.g:2761:2: ()
            {
             before(grammarAccess.getDatePatternAccess().getDatePatternAction_0()); 
            // InternalFormValidation.g:2762:2: ()
            // InternalFormValidation.g:2762:3: 
            {
            }

             after(grammarAccess.getDatePatternAccess().getDatePatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatePattern__Group__0__Impl"


    // $ANTLR start "rule__DatePattern__Group__1"
    // InternalFormValidation.g:2770:1: rule__DatePattern__Group__1 : rule__DatePattern__Group__1__Impl rule__DatePattern__Group__2 ;
    public final void rule__DatePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2774:1: ( rule__DatePattern__Group__1__Impl rule__DatePattern__Group__2 )
            // InternalFormValidation.g:2775:2: rule__DatePattern__Group__1__Impl rule__DatePattern__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DatePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DatePattern__Group__2();

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
    // $ANTLR end "rule__DatePattern__Group__1"


    // $ANTLR start "rule__DatePattern__Group__1__Impl"
    // InternalFormValidation.g:2782:1: rule__DatePattern__Group__1__Impl : ( 'DatePattern' ) ;
    public final void rule__DatePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2786:1: ( ( 'DatePattern' ) )
            // InternalFormValidation.g:2787:1: ( 'DatePattern' )
            {
            // InternalFormValidation.g:2787:1: ( 'DatePattern' )
            // InternalFormValidation.g:2788:2: 'DatePattern'
            {
             before(grammarAccess.getDatePatternAccess().getDatePatternKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDatePatternAccess().getDatePatternKeyword_1()); 

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
    // $ANTLR end "rule__DatePattern__Group__1__Impl"


    // $ANTLR start "rule__DatePattern__Group__2"
    // InternalFormValidation.g:2797:1: rule__DatePattern__Group__2 : rule__DatePattern__Group__2__Impl ;
    public final void rule__DatePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2801:1: ( rule__DatePattern__Group__2__Impl )
            // InternalFormValidation.g:2802:2: rule__DatePattern__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DatePattern__Group__2__Impl();

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
    // $ANTLR end "rule__DatePattern__Group__2"


    // $ANTLR start "rule__DatePattern__Group__2__Impl"
    // InternalFormValidation.g:2808:1: rule__DatePattern__Group__2__Impl : ( ( rule__DatePattern__ValueAssignment_2 )? ) ;
    public final void rule__DatePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2812:1: ( ( ( rule__DatePattern__ValueAssignment_2 )? ) )
            // InternalFormValidation.g:2813:1: ( ( rule__DatePattern__ValueAssignment_2 )? )
            {
            // InternalFormValidation.g:2813:1: ( ( rule__DatePattern__ValueAssignment_2 )? )
            // InternalFormValidation.g:2814:2: ( rule__DatePattern__ValueAssignment_2 )?
            {
             before(grammarAccess.getDatePatternAccess().getValueAssignment_2()); 
            // InternalFormValidation.g:2815:2: ( rule__DatePattern__ValueAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalFormValidation.g:2815:3: rule__DatePattern__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DatePattern__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDatePatternAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__DatePattern__Group__2__Impl"


    // $ANTLR start "rule__Float__Group_0__0"
    // InternalFormValidation.g:2824:1: rule__Float__Group_0__0 : rule__Float__Group_0__0__Impl rule__Float__Group_0__1 ;
    public final void rule__Float__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2828:1: ( rule__Float__Group_0__0__Impl rule__Float__Group_0__1 )
            // InternalFormValidation.g:2829:2: rule__Float__Group_0__0__Impl rule__Float__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Float__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_0__1();

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
    // $ANTLR end "rule__Float__Group_0__0"


    // $ANTLR start "rule__Float__Group_0__0__Impl"
    // InternalFormValidation.g:2836:1: rule__Float__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2840:1: ( ( RULE_INT ) )
            // InternalFormValidation.g:2841:1: ( RULE_INT )
            {
            // InternalFormValidation.g:2841:1: ( RULE_INT )
            // InternalFormValidation.g:2842:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Float__Group_0__0__Impl"


    // $ANTLR start "rule__Float__Group_0__1"
    // InternalFormValidation.g:2851:1: rule__Float__Group_0__1 : rule__Float__Group_0__1__Impl rule__Float__Group_0__2 ;
    public final void rule__Float__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2855:1: ( rule__Float__Group_0__1__Impl rule__Float__Group_0__2 )
            // InternalFormValidation.g:2856:2: rule__Float__Group_0__1__Impl rule__Float__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__Float__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_0__2();

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
    // $ANTLR end "rule__Float__Group_0__1"


    // $ANTLR start "rule__Float__Group_0__1__Impl"
    // InternalFormValidation.g:2863:1: rule__Float__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Float__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2867:1: ( ( '.' ) )
            // InternalFormValidation.g:2868:1: ( '.' )
            {
            // InternalFormValidation.g:2868:1: ( '.' )
            // InternalFormValidation.g:2869:2: '.'
            {
             before(grammarAccess.getFloatAccess().getFullStopKeyword_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__Float__Group_0__1__Impl"


    // $ANTLR start "rule__Float__Group_0__2"
    // InternalFormValidation.g:2878:1: rule__Float__Group_0__2 : rule__Float__Group_0__2__Impl ;
    public final void rule__Float__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2882:1: ( rule__Float__Group_0__2__Impl )
            // InternalFormValidation.g:2883:2: rule__Float__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group_0__2__Impl();

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
    // $ANTLR end "rule__Float__Group_0__2"


    // $ANTLR start "rule__Float__Group_0__2__Impl"
    // InternalFormValidation.g:2889:1: rule__Float__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2893:1: ( ( RULE_INT ) )
            // InternalFormValidation.g:2894:1: ( RULE_INT )
            {
            // InternalFormValidation.g:2894:1: ( RULE_INT )
            // InternalFormValidation.g:2895:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0_2()); 

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
    // $ANTLR end "rule__Float__Group_0__2__Impl"


    // $ANTLR start "rule__NotEquals__Group__0"
    // InternalFormValidation.g:2905:1: rule__NotEquals__Group__0 : rule__NotEquals__Group__0__Impl rule__NotEquals__Group__1 ;
    public final void rule__NotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2909:1: ( rule__NotEquals__Group__0__Impl rule__NotEquals__Group__1 )
            // InternalFormValidation.g:2910:2: rule__NotEquals__Group__0__Impl rule__NotEquals__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__NotEquals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__1();

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
    // $ANTLR end "rule__NotEquals__Group__0"


    // $ANTLR start "rule__NotEquals__Group__0__Impl"
    // InternalFormValidation.g:2917:1: rule__NotEquals__Group__0__Impl : ( () ) ;
    public final void rule__NotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2921:1: ( ( () ) )
            // InternalFormValidation.g:2922:1: ( () )
            {
            // InternalFormValidation.g:2922:1: ( () )
            // InternalFormValidation.g:2923:2: ()
            {
             before(grammarAccess.getNotEqualsAccess().getNotEqualsAction_0()); 
            // InternalFormValidation.g:2924:2: ()
            // InternalFormValidation.g:2924:3: 
            {
            }

             after(grammarAccess.getNotEqualsAccess().getNotEqualsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotEquals__Group__0__Impl"


    // $ANTLR start "rule__NotEquals__Group__1"
    // InternalFormValidation.g:2932:1: rule__NotEquals__Group__1 : rule__NotEquals__Group__1__Impl rule__NotEquals__Group__2 ;
    public final void rule__NotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2936:1: ( rule__NotEquals__Group__1__Impl rule__NotEquals__Group__2 )
            // InternalFormValidation.g:2937:2: rule__NotEquals__Group__1__Impl rule__NotEquals__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NotEquals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__2();

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
    // $ANTLR end "rule__NotEquals__Group__1"


    // $ANTLR start "rule__NotEquals__Group__1__Impl"
    // InternalFormValidation.g:2944:1: rule__NotEquals__Group__1__Impl : ( 'NotEquals' ) ;
    public final void rule__NotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2948:1: ( ( 'NotEquals' ) )
            // InternalFormValidation.g:2949:1: ( 'NotEquals' )
            {
            // InternalFormValidation.g:2949:1: ( 'NotEquals' )
            // InternalFormValidation.g:2950:2: 'NotEquals'
            {
             before(grammarAccess.getNotEqualsAccess().getNotEqualsKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNotEqualsAccess().getNotEqualsKeyword_1()); 

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
    // $ANTLR end "rule__NotEquals__Group__1__Impl"


    // $ANTLR start "rule__NotEquals__Group__2"
    // InternalFormValidation.g:2959:1: rule__NotEquals__Group__2 : rule__NotEquals__Group__2__Impl rule__NotEquals__Group__3 ;
    public final void rule__NotEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2963:1: ( rule__NotEquals__Group__2__Impl rule__NotEquals__Group__3 )
            // InternalFormValidation.g:2964:2: rule__NotEquals__Group__2__Impl rule__NotEquals__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__NotEquals__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__3();

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
    // $ANTLR end "rule__NotEquals__Group__2"


    // $ANTLR start "rule__NotEquals__Group__2__Impl"
    // InternalFormValidation.g:2971:1: rule__NotEquals__Group__2__Impl : ( '{' ) ;
    public final void rule__NotEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2975:1: ( ( '{' ) )
            // InternalFormValidation.g:2976:1: ( '{' )
            {
            // InternalFormValidation.g:2976:1: ( '{' )
            // InternalFormValidation.g:2977:2: '{'
            {
             before(grammarAccess.getNotEqualsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNotEqualsAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__NotEquals__Group__2__Impl"


    // $ANTLR start "rule__NotEquals__Group__3"
    // InternalFormValidation.g:2986:1: rule__NotEquals__Group__3 : rule__NotEquals__Group__3__Impl rule__NotEquals__Group__4 ;
    public final void rule__NotEquals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:2990:1: ( rule__NotEquals__Group__3__Impl rule__NotEquals__Group__4 )
            // InternalFormValidation.g:2991:2: rule__NotEquals__Group__3__Impl rule__NotEquals__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__NotEquals__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__4();

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
    // $ANTLR end "rule__NotEquals__Group__3"


    // $ANTLR start "rule__NotEquals__Group__3__Impl"
    // InternalFormValidation.g:2998:1: rule__NotEquals__Group__3__Impl : ( ( rule__NotEquals__Group_3__0 )? ) ;
    public final void rule__NotEquals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3002:1: ( ( ( rule__NotEquals__Group_3__0 )? ) )
            // InternalFormValidation.g:3003:1: ( ( rule__NotEquals__Group_3__0 )? )
            {
            // InternalFormValidation.g:3003:1: ( ( rule__NotEquals__Group_3__0 )? )
            // InternalFormValidation.g:3004:2: ( rule__NotEquals__Group_3__0 )?
            {
             before(grammarAccess.getNotEqualsAccess().getGroup_3()); 
            // InternalFormValidation.g:3005:2: ( rule__NotEquals__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFormValidation.g:3005:3: rule__NotEquals__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotEquals__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotEqualsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NotEquals__Group__3__Impl"


    // $ANTLR start "rule__NotEquals__Group__4"
    // InternalFormValidation.g:3013:1: rule__NotEquals__Group__4 : rule__NotEquals__Group__4__Impl ;
    public final void rule__NotEquals__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3017:1: ( rule__NotEquals__Group__4__Impl )
            // InternalFormValidation.g:3018:2: rule__NotEquals__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__Group__4__Impl();

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
    // $ANTLR end "rule__NotEquals__Group__4"


    // $ANTLR start "rule__NotEquals__Group__4__Impl"
    // InternalFormValidation.g:3024:1: rule__NotEquals__Group__4__Impl : ( '}' ) ;
    public final void rule__NotEquals__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3028:1: ( ( '}' ) )
            // InternalFormValidation.g:3029:1: ( '}' )
            {
            // InternalFormValidation.g:3029:1: ( '}' )
            // InternalFormValidation.g:3030:2: '}'
            {
             before(grammarAccess.getNotEqualsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNotEqualsAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__NotEquals__Group__4__Impl"


    // $ANTLR start "rule__NotEquals__Group_3__0"
    // InternalFormValidation.g:3040:1: rule__NotEquals__Group_3__0 : rule__NotEquals__Group_3__0__Impl rule__NotEquals__Group_3__1 ;
    public final void rule__NotEquals__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3044:1: ( rule__NotEquals__Group_3__0__Impl rule__NotEquals__Group_3__1 )
            // InternalFormValidation.g:3045:2: rule__NotEquals__Group_3__0__Impl rule__NotEquals__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__NotEquals__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotEquals__Group_3__1();

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
    // $ANTLR end "rule__NotEquals__Group_3__0"


    // $ANTLR start "rule__NotEquals__Group_3__0__Impl"
    // InternalFormValidation.g:3052:1: rule__NotEquals__Group_3__0__Impl : ( 'attributearray' ) ;
    public final void rule__NotEquals__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3056:1: ( ( 'attributearray' ) )
            // InternalFormValidation.g:3057:1: ( 'attributearray' )
            {
            // InternalFormValidation.g:3057:1: ( 'attributearray' )
            // InternalFormValidation.g:3058:2: 'attributearray'
            {
             before(grammarAccess.getNotEqualsAccess().getAttributearrayKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNotEqualsAccess().getAttributearrayKeyword_3_0()); 

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
    // $ANTLR end "rule__NotEquals__Group_3__0__Impl"


    // $ANTLR start "rule__NotEquals__Group_3__1"
    // InternalFormValidation.g:3067:1: rule__NotEquals__Group_3__1 : rule__NotEquals__Group_3__1__Impl ;
    public final void rule__NotEquals__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3071:1: ( rule__NotEquals__Group_3__1__Impl )
            // InternalFormValidation.g:3072:2: rule__NotEquals__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__Group_3__1__Impl();

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
    // $ANTLR end "rule__NotEquals__Group_3__1"


    // $ANTLR start "rule__NotEquals__Group_3__1__Impl"
    // InternalFormValidation.g:3078:1: rule__NotEquals__Group_3__1__Impl : ( ( rule__NotEquals__AttributearrayAssignment_3_1 ) ) ;
    public final void rule__NotEquals__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3082:1: ( ( ( rule__NotEquals__AttributearrayAssignment_3_1 ) ) )
            // InternalFormValidation.g:3083:1: ( ( rule__NotEquals__AttributearrayAssignment_3_1 ) )
            {
            // InternalFormValidation.g:3083:1: ( ( rule__NotEquals__AttributearrayAssignment_3_1 ) )
            // InternalFormValidation.g:3084:2: ( rule__NotEquals__AttributearrayAssignment_3_1 )
            {
             before(grammarAccess.getNotEqualsAccess().getAttributearrayAssignment_3_1()); 
            // InternalFormValidation.g:3085:2: ( rule__NotEquals__AttributearrayAssignment_3_1 )
            // InternalFormValidation.g:3085:3: rule__NotEquals__AttributearrayAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__NotEquals__AttributearrayAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNotEqualsAccess().getAttributearrayAssignment_3_1()); 

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
    // $ANTLR end "rule__NotEquals__Group_3__1__Impl"


    // $ANTLR start "rule__GreaterThan__Group__0"
    // InternalFormValidation.g:3094:1: rule__GreaterThan__Group__0 : rule__GreaterThan__Group__0__Impl rule__GreaterThan__Group__1 ;
    public final void rule__GreaterThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3098:1: ( rule__GreaterThan__Group__0__Impl rule__GreaterThan__Group__1 )
            // InternalFormValidation.g:3099:2: rule__GreaterThan__Group__0__Impl rule__GreaterThan__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__GreaterThan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__1();

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
    // $ANTLR end "rule__GreaterThan__Group__0"


    // $ANTLR start "rule__GreaterThan__Group__0__Impl"
    // InternalFormValidation.g:3106:1: rule__GreaterThan__Group__0__Impl : ( () ) ;
    public final void rule__GreaterThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3110:1: ( ( () ) )
            // InternalFormValidation.g:3111:1: ( () )
            {
            // InternalFormValidation.g:3111:1: ( () )
            // InternalFormValidation.g:3112:2: ()
            {
             before(grammarAccess.getGreaterThanAccess().getGreaterThanAction_0()); 
            // InternalFormValidation.g:3113:2: ()
            // InternalFormValidation.g:3113:3: 
            {
            }

             after(grammarAccess.getGreaterThanAccess().getGreaterThanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GreaterThan__Group__0__Impl"


    // $ANTLR start "rule__GreaterThan__Group__1"
    // InternalFormValidation.g:3121:1: rule__GreaterThan__Group__1 : rule__GreaterThan__Group__1__Impl rule__GreaterThan__Group__2 ;
    public final void rule__GreaterThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3125:1: ( rule__GreaterThan__Group__1__Impl rule__GreaterThan__Group__2 )
            // InternalFormValidation.g:3126:2: rule__GreaterThan__Group__1__Impl rule__GreaterThan__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GreaterThan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__2();

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
    // $ANTLR end "rule__GreaterThan__Group__1"


    // $ANTLR start "rule__GreaterThan__Group__1__Impl"
    // InternalFormValidation.g:3133:1: rule__GreaterThan__Group__1__Impl : ( 'GreaterThan' ) ;
    public final void rule__GreaterThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3137:1: ( ( 'GreaterThan' ) )
            // InternalFormValidation.g:3138:1: ( 'GreaterThan' )
            {
            // InternalFormValidation.g:3138:1: ( 'GreaterThan' )
            // InternalFormValidation.g:3139:2: 'GreaterThan'
            {
             before(grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getGreaterThanKeyword_1()); 

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
    // $ANTLR end "rule__GreaterThan__Group__1__Impl"


    // $ANTLR start "rule__GreaterThan__Group__2"
    // InternalFormValidation.g:3148:1: rule__GreaterThan__Group__2 : rule__GreaterThan__Group__2__Impl rule__GreaterThan__Group__3 ;
    public final void rule__GreaterThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3152:1: ( rule__GreaterThan__Group__2__Impl rule__GreaterThan__Group__3 )
            // InternalFormValidation.g:3153:2: rule__GreaterThan__Group__2__Impl rule__GreaterThan__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__GreaterThan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__3();

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
    // $ANTLR end "rule__GreaterThan__Group__2"


    // $ANTLR start "rule__GreaterThan__Group__2__Impl"
    // InternalFormValidation.g:3160:1: rule__GreaterThan__Group__2__Impl : ( '{' ) ;
    public final void rule__GreaterThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3164:1: ( ( '{' ) )
            // InternalFormValidation.g:3165:1: ( '{' )
            {
            // InternalFormValidation.g:3165:1: ( '{' )
            // InternalFormValidation.g:3166:2: '{'
            {
             before(grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__GreaterThan__Group__2__Impl"


    // $ANTLR start "rule__GreaterThan__Group__3"
    // InternalFormValidation.g:3175:1: rule__GreaterThan__Group__3 : rule__GreaterThan__Group__3__Impl rule__GreaterThan__Group__4 ;
    public final void rule__GreaterThan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3179:1: ( rule__GreaterThan__Group__3__Impl rule__GreaterThan__Group__4 )
            // InternalFormValidation.g:3180:2: rule__GreaterThan__Group__3__Impl rule__GreaterThan__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__GreaterThan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__4();

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
    // $ANTLR end "rule__GreaterThan__Group__3"


    // $ANTLR start "rule__GreaterThan__Group__3__Impl"
    // InternalFormValidation.g:3187:1: rule__GreaterThan__Group__3__Impl : ( ( rule__GreaterThan__Group_3__0 )? ) ;
    public final void rule__GreaterThan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3191:1: ( ( ( rule__GreaterThan__Group_3__0 )? ) )
            // InternalFormValidation.g:3192:1: ( ( rule__GreaterThan__Group_3__0 )? )
            {
            // InternalFormValidation.g:3192:1: ( ( rule__GreaterThan__Group_3__0 )? )
            // InternalFormValidation.g:3193:2: ( rule__GreaterThan__Group_3__0 )?
            {
             before(grammarAccess.getGreaterThanAccess().getGroup_3()); 
            // InternalFormValidation.g:3194:2: ( rule__GreaterThan__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalFormValidation.g:3194:3: rule__GreaterThan__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreaterThan__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGreaterThanAccess().getGroup_3()); 

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
    // $ANTLR end "rule__GreaterThan__Group__3__Impl"


    // $ANTLR start "rule__GreaterThan__Group__4"
    // InternalFormValidation.g:3202:1: rule__GreaterThan__Group__4 : rule__GreaterThan__Group__4__Impl rule__GreaterThan__Group__5 ;
    public final void rule__GreaterThan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3206:1: ( rule__GreaterThan__Group__4__Impl rule__GreaterThan__Group__5 )
            // InternalFormValidation.g:3207:2: rule__GreaterThan__Group__4__Impl rule__GreaterThan__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__GreaterThan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__5();

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
    // $ANTLR end "rule__GreaterThan__Group__4"


    // $ANTLR start "rule__GreaterThan__Group__4__Impl"
    // InternalFormValidation.g:3214:1: rule__GreaterThan__Group__4__Impl : ( ( rule__GreaterThan__Group_4__0 )? ) ;
    public final void rule__GreaterThan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3218:1: ( ( ( rule__GreaterThan__Group_4__0 )? ) )
            // InternalFormValidation.g:3219:1: ( ( rule__GreaterThan__Group_4__0 )? )
            {
            // InternalFormValidation.g:3219:1: ( ( rule__GreaterThan__Group_4__0 )? )
            // InternalFormValidation.g:3220:2: ( rule__GreaterThan__Group_4__0 )?
            {
             before(grammarAccess.getGreaterThanAccess().getGroup_4()); 
            // InternalFormValidation.g:3221:2: ( rule__GreaterThan__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalFormValidation.g:3221:3: rule__GreaterThan__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GreaterThan__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGreaterThanAccess().getGroup_4()); 

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
    // $ANTLR end "rule__GreaterThan__Group__4__Impl"


    // $ANTLR start "rule__GreaterThan__Group__5"
    // InternalFormValidation.g:3229:1: rule__GreaterThan__Group__5 : rule__GreaterThan__Group__5__Impl ;
    public final void rule__GreaterThan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3233:1: ( rule__GreaterThan__Group__5__Impl )
            // InternalFormValidation.g:3234:2: rule__GreaterThan__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group__5__Impl();

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
    // $ANTLR end "rule__GreaterThan__Group__5"


    // $ANTLR start "rule__GreaterThan__Group__5__Impl"
    // InternalFormValidation.g:3240:1: rule__GreaterThan__Group__5__Impl : ( '}' ) ;
    public final void rule__GreaterThan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3244:1: ( ( '}' ) )
            // InternalFormValidation.g:3245:1: ( '}' )
            {
            // InternalFormValidation.g:3245:1: ( '}' )
            // InternalFormValidation.g:3246:2: '}'
            {
             before(grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__GreaterThan__Group__5__Impl"


    // $ANTLR start "rule__GreaterThan__Group_3__0"
    // InternalFormValidation.g:3256:1: rule__GreaterThan__Group_3__0 : rule__GreaterThan__Group_3__0__Impl rule__GreaterThan__Group_3__1 ;
    public final void rule__GreaterThan__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3260:1: ( rule__GreaterThan__Group_3__0__Impl rule__GreaterThan__Group_3__1 )
            // InternalFormValidation.g:3261:2: rule__GreaterThan__Group_3__0__Impl rule__GreaterThan__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__GreaterThan__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_3__1();

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
    // $ANTLR end "rule__GreaterThan__Group_3__0"


    // $ANTLR start "rule__GreaterThan__Group_3__0__Impl"
    // InternalFormValidation.g:3268:1: rule__GreaterThan__Group_3__0__Impl : ( 'classattribute' ) ;
    public final void rule__GreaterThan__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3272:1: ( ( 'classattribute' ) )
            // InternalFormValidation.g:3273:1: ( 'classattribute' )
            {
            // InternalFormValidation.g:3273:1: ( 'classattribute' )
            // InternalFormValidation.g:3274:2: 'classattribute'
            {
             before(grammarAccess.getGreaterThanAccess().getClassattributeKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getClassattributeKeyword_3_0()); 

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
    // $ANTLR end "rule__GreaterThan__Group_3__0__Impl"


    // $ANTLR start "rule__GreaterThan__Group_3__1"
    // InternalFormValidation.g:3283:1: rule__GreaterThan__Group_3__1 : rule__GreaterThan__Group_3__1__Impl ;
    public final void rule__GreaterThan__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3287:1: ( rule__GreaterThan__Group_3__1__Impl )
            // InternalFormValidation.g:3288:2: rule__GreaterThan__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_3__1__Impl();

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
    // $ANTLR end "rule__GreaterThan__Group_3__1"


    // $ANTLR start "rule__GreaterThan__Group_3__1__Impl"
    // InternalFormValidation.g:3294:1: rule__GreaterThan__Group_3__1__Impl : ( ( rule__GreaterThan__ClassattributeAssignment_3_1 ) ) ;
    public final void rule__GreaterThan__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3298:1: ( ( ( rule__GreaterThan__ClassattributeAssignment_3_1 ) ) )
            // InternalFormValidation.g:3299:1: ( ( rule__GreaterThan__ClassattributeAssignment_3_1 ) )
            {
            // InternalFormValidation.g:3299:1: ( ( rule__GreaterThan__ClassattributeAssignment_3_1 ) )
            // InternalFormValidation.g:3300:2: ( rule__GreaterThan__ClassattributeAssignment_3_1 )
            {
             before(grammarAccess.getGreaterThanAccess().getClassattributeAssignment_3_1()); 
            // InternalFormValidation.g:3301:2: ( rule__GreaterThan__ClassattributeAssignment_3_1 )
            // InternalFormValidation.g:3301:3: rule__GreaterThan__ClassattributeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__ClassattributeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getClassattributeAssignment_3_1()); 

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
    // $ANTLR end "rule__GreaterThan__Group_3__1__Impl"


    // $ANTLR start "rule__GreaterThan__Group_4__0"
    // InternalFormValidation.g:3310:1: rule__GreaterThan__Group_4__0 : rule__GreaterThan__Group_4__0__Impl rule__GreaterThan__Group_4__1 ;
    public final void rule__GreaterThan__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3314:1: ( rule__GreaterThan__Group_4__0__Impl rule__GreaterThan__Group_4__1 )
            // InternalFormValidation.g:3315:2: rule__GreaterThan__Group_4__0__Impl rule__GreaterThan__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__GreaterThan__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_4__1();

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
    // $ANTLR end "rule__GreaterThan__Group_4__0"


    // $ANTLR start "rule__GreaterThan__Group_4__0__Impl"
    // InternalFormValidation.g:3322:1: rule__GreaterThan__Group_4__0__Impl : ( 'attributearray' ) ;
    public final void rule__GreaterThan__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3326:1: ( ( 'attributearray' ) )
            // InternalFormValidation.g:3327:1: ( 'attributearray' )
            {
            // InternalFormValidation.g:3327:1: ( 'attributearray' )
            // InternalFormValidation.g:3328:2: 'attributearray'
            {
             before(grammarAccess.getGreaterThanAccess().getAttributearrayKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getAttributearrayKeyword_4_0()); 

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
    // $ANTLR end "rule__GreaterThan__Group_4__0__Impl"


    // $ANTLR start "rule__GreaterThan__Group_4__1"
    // InternalFormValidation.g:3337:1: rule__GreaterThan__Group_4__1 : rule__GreaterThan__Group_4__1__Impl rule__GreaterThan__Group_4__2 ;
    public final void rule__GreaterThan__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3341:1: ( rule__GreaterThan__Group_4__1__Impl rule__GreaterThan__Group_4__2 )
            // InternalFormValidation.g:3342:2: rule__GreaterThan__Group_4__1__Impl rule__GreaterThan__Group_4__2
            {
            pushFollow(FOLLOW_35);
            rule__GreaterThan__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_4__2();

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
    // $ANTLR end "rule__GreaterThan__Group_4__1"


    // $ANTLR start "rule__GreaterThan__Group_4__1__Impl"
    // InternalFormValidation.g:3349:1: rule__GreaterThan__Group_4__1__Impl : ( ( rule__GreaterThan__AttributearrayAssignment_4_1 ) ) ;
    public final void rule__GreaterThan__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3353:1: ( ( ( rule__GreaterThan__AttributearrayAssignment_4_1 ) ) )
            // InternalFormValidation.g:3354:1: ( ( rule__GreaterThan__AttributearrayAssignment_4_1 ) )
            {
            // InternalFormValidation.g:3354:1: ( ( rule__GreaterThan__AttributearrayAssignment_4_1 ) )
            // InternalFormValidation.g:3355:2: ( rule__GreaterThan__AttributearrayAssignment_4_1 )
            {
             before(grammarAccess.getGreaterThanAccess().getAttributearrayAssignment_4_1()); 
            // InternalFormValidation.g:3356:2: ( rule__GreaterThan__AttributearrayAssignment_4_1 )
            // InternalFormValidation.g:3356:3: rule__GreaterThan__AttributearrayAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__AttributearrayAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getAttributearrayAssignment_4_1()); 

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
    // $ANTLR end "rule__GreaterThan__Group_4__1__Impl"


    // $ANTLR start "rule__GreaterThan__Group_4__2"
    // InternalFormValidation.g:3364:1: rule__GreaterThan__Group_4__2 : rule__GreaterThan__Group_4__2__Impl ;
    public final void rule__GreaterThan__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3368:1: ( rule__GreaterThan__Group_4__2__Impl )
            // InternalFormValidation.g:3369:2: rule__GreaterThan__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_4__2__Impl();

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
    // $ANTLR end "rule__GreaterThan__Group_4__2"


    // $ANTLR start "rule__GreaterThan__Group_4__2__Impl"
    // InternalFormValidation.g:3375:1: rule__GreaterThan__Group_4__2__Impl : ( ( rule__GreaterThan__Group_4_2__0 )* ) ;
    public final void rule__GreaterThan__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3379:1: ( ( ( rule__GreaterThan__Group_4_2__0 )* ) )
            // InternalFormValidation.g:3380:1: ( ( rule__GreaterThan__Group_4_2__0 )* )
            {
            // InternalFormValidation.g:3380:1: ( ( rule__GreaterThan__Group_4_2__0 )* )
            // InternalFormValidation.g:3381:2: ( rule__GreaterThan__Group_4_2__0 )*
            {
             before(grammarAccess.getGreaterThanAccess().getGroup_4_2()); 
            // InternalFormValidation.g:3382:2: ( rule__GreaterThan__Group_4_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalFormValidation.g:3382:3: rule__GreaterThan__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__GreaterThan__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGreaterThanAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__GreaterThan__Group_4__2__Impl"


    // $ANTLR start "rule__GreaterThan__Group_4_2__0"
    // InternalFormValidation.g:3391:1: rule__GreaterThan__Group_4_2__0 : rule__GreaterThan__Group_4_2__0__Impl rule__GreaterThan__Group_4_2__1 ;
    public final void rule__GreaterThan__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3395:1: ( rule__GreaterThan__Group_4_2__0__Impl rule__GreaterThan__Group_4_2__1 )
            // InternalFormValidation.g:3396:2: rule__GreaterThan__Group_4_2__0__Impl rule__GreaterThan__Group_4_2__1
            {
            pushFollow(FOLLOW_32);
            rule__GreaterThan__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_4_2__1();

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
    // $ANTLR end "rule__GreaterThan__Group_4_2__0"


    // $ANTLR start "rule__GreaterThan__Group_4_2__0__Impl"
    // InternalFormValidation.g:3403:1: rule__GreaterThan__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__GreaterThan__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3407:1: ( ( ',' ) )
            // InternalFormValidation.g:3408:1: ( ',' )
            {
            // InternalFormValidation.g:3408:1: ( ',' )
            // InternalFormValidation.g:3409:2: ','
            {
             before(grammarAccess.getGreaterThanAccess().getCommaKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGreaterThanAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__GreaterThan__Group_4_2__0__Impl"


    // $ANTLR start "rule__GreaterThan__Group_4_2__1"
    // InternalFormValidation.g:3418:1: rule__GreaterThan__Group_4_2__1 : rule__GreaterThan__Group_4_2__1__Impl ;
    public final void rule__GreaterThan__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3422:1: ( rule__GreaterThan__Group_4_2__1__Impl )
            // InternalFormValidation.g:3423:2: rule__GreaterThan__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__GreaterThan__Group_4_2__1"


    // $ANTLR start "rule__GreaterThan__Group_4_2__1__Impl"
    // InternalFormValidation.g:3429:1: rule__GreaterThan__Group_4_2__1__Impl : ( ( rule__GreaterThan__AttributearrayAssignment_4_2_1 ) ) ;
    public final void rule__GreaterThan__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3433:1: ( ( ( rule__GreaterThan__AttributearrayAssignment_4_2_1 ) ) )
            // InternalFormValidation.g:3434:1: ( ( rule__GreaterThan__AttributearrayAssignment_4_2_1 ) )
            {
            // InternalFormValidation.g:3434:1: ( ( rule__GreaterThan__AttributearrayAssignment_4_2_1 ) )
            // InternalFormValidation.g:3435:2: ( rule__GreaterThan__AttributearrayAssignment_4_2_1 )
            {
             before(grammarAccess.getGreaterThanAccess().getAttributearrayAssignment_4_2_1()); 
            // InternalFormValidation.g:3436:2: ( rule__GreaterThan__AttributearrayAssignment_4_2_1 )
            // InternalFormValidation.g:3436:3: rule__GreaterThan__AttributearrayAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GreaterThan__AttributearrayAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGreaterThanAccess().getAttributearrayAssignment_4_2_1()); 

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
    // $ANTLR end "rule__GreaterThan__Group_4_2__1__Impl"


    // $ANTLR start "rule__Equals__Group__0"
    // InternalFormValidation.g:3445:1: rule__Equals__Group__0 : rule__Equals__Group__0__Impl rule__Equals__Group__1 ;
    public final void rule__Equals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3449:1: ( rule__Equals__Group__0__Impl rule__Equals__Group__1 )
            // InternalFormValidation.g:3450:2: rule__Equals__Group__0__Impl rule__Equals__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Equals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group__1();

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
    // $ANTLR end "rule__Equals__Group__0"


    // $ANTLR start "rule__Equals__Group__0__Impl"
    // InternalFormValidation.g:3457:1: rule__Equals__Group__0__Impl : ( () ) ;
    public final void rule__Equals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3461:1: ( ( () ) )
            // InternalFormValidation.g:3462:1: ( () )
            {
            // InternalFormValidation.g:3462:1: ( () )
            // InternalFormValidation.g:3463:2: ()
            {
             before(grammarAccess.getEqualsAccess().getEqualsAction_0()); 
            // InternalFormValidation.g:3464:2: ()
            // InternalFormValidation.g:3464:3: 
            {
            }

             after(grammarAccess.getEqualsAccess().getEqualsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equals__Group__0__Impl"


    // $ANTLR start "rule__Equals__Group__1"
    // InternalFormValidation.g:3472:1: rule__Equals__Group__1 : rule__Equals__Group__1__Impl rule__Equals__Group__2 ;
    public final void rule__Equals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3476:1: ( rule__Equals__Group__1__Impl rule__Equals__Group__2 )
            // InternalFormValidation.g:3477:2: rule__Equals__Group__1__Impl rule__Equals__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Equals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group__2();

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
    // $ANTLR end "rule__Equals__Group__1"


    // $ANTLR start "rule__Equals__Group__1__Impl"
    // InternalFormValidation.g:3484:1: rule__Equals__Group__1__Impl : ( 'Equals' ) ;
    public final void rule__Equals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3488:1: ( ( 'Equals' ) )
            // InternalFormValidation.g:3489:1: ( 'Equals' )
            {
            // InternalFormValidation.g:3489:1: ( 'Equals' )
            // InternalFormValidation.g:3490:2: 'Equals'
            {
             before(grammarAccess.getEqualsAccess().getEqualsKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEqualsAccess().getEqualsKeyword_1()); 

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
    // $ANTLR end "rule__Equals__Group__1__Impl"


    // $ANTLR start "rule__Equals__Group__2"
    // InternalFormValidation.g:3499:1: rule__Equals__Group__2 : rule__Equals__Group__2__Impl rule__Equals__Group__3 ;
    public final void rule__Equals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3503:1: ( rule__Equals__Group__2__Impl rule__Equals__Group__3 )
            // InternalFormValidation.g:3504:2: rule__Equals__Group__2__Impl rule__Equals__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Equals__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group__3();

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
    // $ANTLR end "rule__Equals__Group__2"


    // $ANTLR start "rule__Equals__Group__2__Impl"
    // InternalFormValidation.g:3511:1: rule__Equals__Group__2__Impl : ( '{' ) ;
    public final void rule__Equals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3515:1: ( ( '{' ) )
            // InternalFormValidation.g:3516:1: ( '{' )
            {
            // InternalFormValidation.g:3516:1: ( '{' )
            // InternalFormValidation.g:3517:2: '{'
            {
             before(grammarAccess.getEqualsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEqualsAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Equals__Group__2__Impl"


    // $ANTLR start "rule__Equals__Group__3"
    // InternalFormValidation.g:3526:1: rule__Equals__Group__3 : rule__Equals__Group__3__Impl rule__Equals__Group__4 ;
    public final void rule__Equals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3530:1: ( rule__Equals__Group__3__Impl rule__Equals__Group__4 )
            // InternalFormValidation.g:3531:2: rule__Equals__Group__3__Impl rule__Equals__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Equals__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group__4();

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
    // $ANTLR end "rule__Equals__Group__3"


    // $ANTLR start "rule__Equals__Group__3__Impl"
    // InternalFormValidation.g:3538:1: rule__Equals__Group__3__Impl : ( ( rule__Equals__Group_3__0 )? ) ;
    public final void rule__Equals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3542:1: ( ( ( rule__Equals__Group_3__0 )? ) )
            // InternalFormValidation.g:3543:1: ( ( rule__Equals__Group_3__0 )? )
            {
            // InternalFormValidation.g:3543:1: ( ( rule__Equals__Group_3__0 )? )
            // InternalFormValidation.g:3544:2: ( rule__Equals__Group_3__0 )?
            {
             before(grammarAccess.getEqualsAccess().getGroup_3()); 
            // InternalFormValidation.g:3545:2: ( rule__Equals__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalFormValidation.g:3545:3: rule__Equals__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equals__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqualsAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Equals__Group__3__Impl"


    // $ANTLR start "rule__Equals__Group__4"
    // InternalFormValidation.g:3553:1: rule__Equals__Group__4 : rule__Equals__Group__4__Impl ;
    public final void rule__Equals__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3557:1: ( rule__Equals__Group__4__Impl )
            // InternalFormValidation.g:3558:2: rule__Equals__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equals__Group__4__Impl();

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
    // $ANTLR end "rule__Equals__Group__4"


    // $ANTLR start "rule__Equals__Group__4__Impl"
    // InternalFormValidation.g:3564:1: rule__Equals__Group__4__Impl : ( '}' ) ;
    public final void rule__Equals__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3568:1: ( ( '}' ) )
            // InternalFormValidation.g:3569:1: ( '}' )
            {
            // InternalFormValidation.g:3569:1: ( '}' )
            // InternalFormValidation.g:3570:2: '}'
            {
             before(grammarAccess.getEqualsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEqualsAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Equals__Group__4__Impl"


    // $ANTLR start "rule__Equals__Group_3__0"
    // InternalFormValidation.g:3580:1: rule__Equals__Group_3__0 : rule__Equals__Group_3__0__Impl rule__Equals__Group_3__1 ;
    public final void rule__Equals__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3584:1: ( rule__Equals__Group_3__0__Impl rule__Equals__Group_3__1 )
            // InternalFormValidation.g:3585:2: rule__Equals__Group_3__0__Impl rule__Equals__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Equals__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equals__Group_3__1();

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
    // $ANTLR end "rule__Equals__Group_3__0"


    // $ANTLR start "rule__Equals__Group_3__0__Impl"
    // InternalFormValidation.g:3592:1: rule__Equals__Group_3__0__Impl : ( 'attributearray' ) ;
    public final void rule__Equals__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3596:1: ( ( 'attributearray' ) )
            // InternalFormValidation.g:3597:1: ( 'attributearray' )
            {
            // InternalFormValidation.g:3597:1: ( 'attributearray' )
            // InternalFormValidation.g:3598:2: 'attributearray'
            {
             before(grammarAccess.getEqualsAccess().getAttributearrayKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEqualsAccess().getAttributearrayKeyword_3_0()); 

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
    // $ANTLR end "rule__Equals__Group_3__0__Impl"


    // $ANTLR start "rule__Equals__Group_3__1"
    // InternalFormValidation.g:3607:1: rule__Equals__Group_3__1 : rule__Equals__Group_3__1__Impl ;
    public final void rule__Equals__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3611:1: ( rule__Equals__Group_3__1__Impl )
            // InternalFormValidation.g:3612:2: rule__Equals__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equals__Group_3__1__Impl();

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
    // $ANTLR end "rule__Equals__Group_3__1"


    // $ANTLR start "rule__Equals__Group_3__1__Impl"
    // InternalFormValidation.g:3618:1: rule__Equals__Group_3__1__Impl : ( ( rule__Equals__AttributearrayAssignment_3_1 ) ) ;
    public final void rule__Equals__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3622:1: ( ( ( rule__Equals__AttributearrayAssignment_3_1 ) ) )
            // InternalFormValidation.g:3623:1: ( ( rule__Equals__AttributearrayAssignment_3_1 ) )
            {
            // InternalFormValidation.g:3623:1: ( ( rule__Equals__AttributearrayAssignment_3_1 ) )
            // InternalFormValidation.g:3624:2: ( rule__Equals__AttributearrayAssignment_3_1 )
            {
             before(grammarAccess.getEqualsAccess().getAttributearrayAssignment_3_1()); 
            // InternalFormValidation.g:3625:2: ( rule__Equals__AttributearrayAssignment_3_1 )
            // InternalFormValidation.g:3625:3: rule__Equals__AttributearrayAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Equals__AttributearrayAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualsAccess().getAttributearrayAssignment_3_1()); 

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
    // $ANTLR end "rule__Equals__Group_3__1__Impl"


    // $ANTLR start "rule__LessThan__Group__0"
    // InternalFormValidation.g:3634:1: rule__LessThan__Group__0 : rule__LessThan__Group__0__Impl rule__LessThan__Group__1 ;
    public final void rule__LessThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3638:1: ( rule__LessThan__Group__0__Impl rule__LessThan__Group__1 )
            // InternalFormValidation.g:3639:2: rule__LessThan__Group__0__Impl rule__LessThan__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LessThan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group__1();

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
    // $ANTLR end "rule__LessThan__Group__0"


    // $ANTLR start "rule__LessThan__Group__0__Impl"
    // InternalFormValidation.g:3646:1: rule__LessThan__Group__0__Impl : ( () ) ;
    public final void rule__LessThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3650:1: ( ( () ) )
            // InternalFormValidation.g:3651:1: ( () )
            {
            // InternalFormValidation.g:3651:1: ( () )
            // InternalFormValidation.g:3652:2: ()
            {
             before(grammarAccess.getLessThanAccess().getLessThanAction_0()); 
            // InternalFormValidation.g:3653:2: ()
            // InternalFormValidation.g:3653:3: 
            {
            }

             after(grammarAccess.getLessThanAccess().getLessThanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessThan__Group__0__Impl"


    // $ANTLR start "rule__LessThan__Group__1"
    // InternalFormValidation.g:3661:1: rule__LessThan__Group__1 : rule__LessThan__Group__1__Impl rule__LessThan__Group__2 ;
    public final void rule__LessThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3665:1: ( rule__LessThan__Group__1__Impl rule__LessThan__Group__2 )
            // InternalFormValidation.g:3666:2: rule__LessThan__Group__1__Impl rule__LessThan__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LessThan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group__2();

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
    // $ANTLR end "rule__LessThan__Group__1"


    // $ANTLR start "rule__LessThan__Group__1__Impl"
    // InternalFormValidation.g:3673:1: rule__LessThan__Group__1__Impl : ( 'LessThan' ) ;
    public final void rule__LessThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3677:1: ( ( 'LessThan' ) )
            // InternalFormValidation.g:3678:1: ( 'LessThan' )
            {
            // InternalFormValidation.g:3678:1: ( 'LessThan' )
            // InternalFormValidation.g:3679:2: 'LessThan'
            {
             before(grammarAccess.getLessThanAccess().getLessThanKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getLessThanKeyword_1()); 

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
    // $ANTLR end "rule__LessThan__Group__1__Impl"


    // $ANTLR start "rule__LessThan__Group__2"
    // InternalFormValidation.g:3688:1: rule__LessThan__Group__2 : rule__LessThan__Group__2__Impl rule__LessThan__Group__3 ;
    public final void rule__LessThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3692:1: ( rule__LessThan__Group__2__Impl rule__LessThan__Group__3 )
            // InternalFormValidation.g:3693:2: rule__LessThan__Group__2__Impl rule__LessThan__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__LessThan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group__3();

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
    // $ANTLR end "rule__LessThan__Group__2"


    // $ANTLR start "rule__LessThan__Group__2__Impl"
    // InternalFormValidation.g:3700:1: rule__LessThan__Group__2__Impl : ( '{' ) ;
    public final void rule__LessThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3704:1: ( ( '{' ) )
            // InternalFormValidation.g:3705:1: ( '{' )
            {
            // InternalFormValidation.g:3705:1: ( '{' )
            // InternalFormValidation.g:3706:2: '{'
            {
             before(grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LessThan__Group__2__Impl"


    // $ANTLR start "rule__LessThan__Group__3"
    // InternalFormValidation.g:3715:1: rule__LessThan__Group__3 : rule__LessThan__Group__3__Impl rule__LessThan__Group__4 ;
    public final void rule__LessThan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3719:1: ( rule__LessThan__Group__3__Impl rule__LessThan__Group__4 )
            // InternalFormValidation.g:3720:2: rule__LessThan__Group__3__Impl rule__LessThan__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__LessThan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group__4();

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
    // $ANTLR end "rule__LessThan__Group__3"


    // $ANTLR start "rule__LessThan__Group__3__Impl"
    // InternalFormValidation.g:3727:1: rule__LessThan__Group__3__Impl : ( ( rule__LessThan__Group_3__0 )? ) ;
    public final void rule__LessThan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3731:1: ( ( ( rule__LessThan__Group_3__0 )? ) )
            // InternalFormValidation.g:3732:1: ( ( rule__LessThan__Group_3__0 )? )
            {
            // InternalFormValidation.g:3732:1: ( ( rule__LessThan__Group_3__0 )? )
            // InternalFormValidation.g:3733:2: ( rule__LessThan__Group_3__0 )?
            {
             before(grammarAccess.getLessThanAccess().getGroup_3()); 
            // InternalFormValidation.g:3734:2: ( rule__LessThan__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalFormValidation.g:3734:3: rule__LessThan__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LessThan__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLessThanAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LessThan__Group__3__Impl"


    // $ANTLR start "rule__LessThan__Group__4"
    // InternalFormValidation.g:3742:1: rule__LessThan__Group__4 : rule__LessThan__Group__4__Impl rule__LessThan__Group__5 ;
    public final void rule__LessThan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3746:1: ( rule__LessThan__Group__4__Impl rule__LessThan__Group__5 )
            // InternalFormValidation.g:3747:2: rule__LessThan__Group__4__Impl rule__LessThan__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__LessThan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group__5();

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
    // $ANTLR end "rule__LessThan__Group__4"


    // $ANTLR start "rule__LessThan__Group__4__Impl"
    // InternalFormValidation.g:3754:1: rule__LessThan__Group__4__Impl : ( ( rule__LessThan__Group_4__0 )? ) ;
    public final void rule__LessThan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3758:1: ( ( ( rule__LessThan__Group_4__0 )? ) )
            // InternalFormValidation.g:3759:1: ( ( rule__LessThan__Group_4__0 )? )
            {
            // InternalFormValidation.g:3759:1: ( ( rule__LessThan__Group_4__0 )? )
            // InternalFormValidation.g:3760:2: ( rule__LessThan__Group_4__0 )?
            {
             before(grammarAccess.getLessThanAccess().getGroup_4()); 
            // InternalFormValidation.g:3761:2: ( rule__LessThan__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalFormValidation.g:3761:3: rule__LessThan__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LessThan__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLessThanAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LessThan__Group__4__Impl"


    // $ANTLR start "rule__LessThan__Group__5"
    // InternalFormValidation.g:3769:1: rule__LessThan__Group__5 : rule__LessThan__Group__5__Impl ;
    public final void rule__LessThan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3773:1: ( rule__LessThan__Group__5__Impl )
            // InternalFormValidation.g:3774:2: rule__LessThan__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__Group__5__Impl();

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
    // $ANTLR end "rule__LessThan__Group__5"


    // $ANTLR start "rule__LessThan__Group__5__Impl"
    // InternalFormValidation.g:3780:1: rule__LessThan__Group__5__Impl : ( '}' ) ;
    public final void rule__LessThan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3784:1: ( ( '}' ) )
            // InternalFormValidation.g:3785:1: ( '}' )
            {
            // InternalFormValidation.g:3785:1: ( '}' )
            // InternalFormValidation.g:3786:2: '}'
            {
             before(grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__LessThan__Group__5__Impl"


    // $ANTLR start "rule__LessThan__Group_3__0"
    // InternalFormValidation.g:3796:1: rule__LessThan__Group_3__0 : rule__LessThan__Group_3__0__Impl rule__LessThan__Group_3__1 ;
    public final void rule__LessThan__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3800:1: ( rule__LessThan__Group_3__0__Impl rule__LessThan__Group_3__1 )
            // InternalFormValidation.g:3801:2: rule__LessThan__Group_3__0__Impl rule__LessThan__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__LessThan__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group_3__1();

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
    // $ANTLR end "rule__LessThan__Group_3__0"


    // $ANTLR start "rule__LessThan__Group_3__0__Impl"
    // InternalFormValidation.g:3808:1: rule__LessThan__Group_3__0__Impl : ( 'classattribute' ) ;
    public final void rule__LessThan__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3812:1: ( ( 'classattribute' ) )
            // InternalFormValidation.g:3813:1: ( 'classattribute' )
            {
            // InternalFormValidation.g:3813:1: ( 'classattribute' )
            // InternalFormValidation.g:3814:2: 'classattribute'
            {
             before(grammarAccess.getLessThanAccess().getClassattributeKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getClassattributeKeyword_3_0()); 

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
    // $ANTLR end "rule__LessThan__Group_3__0__Impl"


    // $ANTLR start "rule__LessThan__Group_3__1"
    // InternalFormValidation.g:3823:1: rule__LessThan__Group_3__1 : rule__LessThan__Group_3__1__Impl ;
    public final void rule__LessThan__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3827:1: ( rule__LessThan__Group_3__1__Impl )
            // InternalFormValidation.g:3828:2: rule__LessThan__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__Group_3__1__Impl();

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
    // $ANTLR end "rule__LessThan__Group_3__1"


    // $ANTLR start "rule__LessThan__Group_3__1__Impl"
    // InternalFormValidation.g:3834:1: rule__LessThan__Group_3__1__Impl : ( ( rule__LessThan__ClassattributeAssignment_3_1 ) ) ;
    public final void rule__LessThan__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3838:1: ( ( ( rule__LessThan__ClassattributeAssignment_3_1 ) ) )
            // InternalFormValidation.g:3839:1: ( ( rule__LessThan__ClassattributeAssignment_3_1 ) )
            {
            // InternalFormValidation.g:3839:1: ( ( rule__LessThan__ClassattributeAssignment_3_1 ) )
            // InternalFormValidation.g:3840:2: ( rule__LessThan__ClassattributeAssignment_3_1 )
            {
             before(grammarAccess.getLessThanAccess().getClassattributeAssignment_3_1()); 
            // InternalFormValidation.g:3841:2: ( rule__LessThan__ClassattributeAssignment_3_1 )
            // InternalFormValidation.g:3841:3: rule__LessThan__ClassattributeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__ClassattributeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLessThanAccess().getClassattributeAssignment_3_1()); 

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
    // $ANTLR end "rule__LessThan__Group_3__1__Impl"


    // $ANTLR start "rule__LessThan__Group_4__0"
    // InternalFormValidation.g:3850:1: rule__LessThan__Group_4__0 : rule__LessThan__Group_4__0__Impl rule__LessThan__Group_4__1 ;
    public final void rule__LessThan__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3854:1: ( rule__LessThan__Group_4__0__Impl rule__LessThan__Group_4__1 )
            // InternalFormValidation.g:3855:2: rule__LessThan__Group_4__0__Impl rule__LessThan__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__LessThan__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4__1();

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
    // $ANTLR end "rule__LessThan__Group_4__0"


    // $ANTLR start "rule__LessThan__Group_4__0__Impl"
    // InternalFormValidation.g:3862:1: rule__LessThan__Group_4__0__Impl : ( 'attributearray' ) ;
    public final void rule__LessThan__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3866:1: ( ( 'attributearray' ) )
            // InternalFormValidation.g:3867:1: ( 'attributearray' )
            {
            // InternalFormValidation.g:3867:1: ( 'attributearray' )
            // InternalFormValidation.g:3868:2: 'attributearray'
            {
             before(grammarAccess.getLessThanAccess().getAttributearrayKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getAttributearrayKeyword_4_0()); 

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
    // $ANTLR end "rule__LessThan__Group_4__0__Impl"


    // $ANTLR start "rule__LessThan__Group_4__1"
    // InternalFormValidation.g:3877:1: rule__LessThan__Group_4__1 : rule__LessThan__Group_4__1__Impl rule__LessThan__Group_4__2 ;
    public final void rule__LessThan__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3881:1: ( rule__LessThan__Group_4__1__Impl rule__LessThan__Group_4__2 )
            // InternalFormValidation.g:3882:2: rule__LessThan__Group_4__1__Impl rule__LessThan__Group_4__2
            {
            pushFollow(FOLLOW_32);
            rule__LessThan__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4__2();

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
    // $ANTLR end "rule__LessThan__Group_4__1"


    // $ANTLR start "rule__LessThan__Group_4__1__Impl"
    // InternalFormValidation.g:3889:1: rule__LessThan__Group_4__1__Impl : ( '{' ) ;
    public final void rule__LessThan__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3893:1: ( ( '{' ) )
            // InternalFormValidation.g:3894:1: ( '{' )
            {
            // InternalFormValidation.g:3894:1: ( '{' )
            // InternalFormValidation.g:3895:2: '{'
            {
             before(grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__LessThan__Group_4__1__Impl"


    // $ANTLR start "rule__LessThan__Group_4__2"
    // InternalFormValidation.g:3904:1: rule__LessThan__Group_4__2 : rule__LessThan__Group_4__2__Impl rule__LessThan__Group_4__3 ;
    public final void rule__LessThan__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3908:1: ( rule__LessThan__Group_4__2__Impl rule__LessThan__Group_4__3 )
            // InternalFormValidation.g:3909:2: rule__LessThan__Group_4__2__Impl rule__LessThan__Group_4__3
            {
            pushFollow(FOLLOW_25);
            rule__LessThan__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4__3();

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
    // $ANTLR end "rule__LessThan__Group_4__2"


    // $ANTLR start "rule__LessThan__Group_4__2__Impl"
    // InternalFormValidation.g:3916:1: rule__LessThan__Group_4__2__Impl : ( ( rule__LessThan__AttributearrayAssignment_4_2 ) ) ;
    public final void rule__LessThan__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3920:1: ( ( ( rule__LessThan__AttributearrayAssignment_4_2 ) ) )
            // InternalFormValidation.g:3921:1: ( ( rule__LessThan__AttributearrayAssignment_4_2 ) )
            {
            // InternalFormValidation.g:3921:1: ( ( rule__LessThan__AttributearrayAssignment_4_2 ) )
            // InternalFormValidation.g:3922:2: ( rule__LessThan__AttributearrayAssignment_4_2 )
            {
             before(grammarAccess.getLessThanAccess().getAttributearrayAssignment_4_2()); 
            // InternalFormValidation.g:3923:2: ( rule__LessThan__AttributearrayAssignment_4_2 )
            // InternalFormValidation.g:3923:3: rule__LessThan__AttributearrayAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__AttributearrayAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLessThanAccess().getAttributearrayAssignment_4_2()); 

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
    // $ANTLR end "rule__LessThan__Group_4__2__Impl"


    // $ANTLR start "rule__LessThan__Group_4__3"
    // InternalFormValidation.g:3931:1: rule__LessThan__Group_4__3 : rule__LessThan__Group_4__3__Impl rule__LessThan__Group_4__4 ;
    public final void rule__LessThan__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3935:1: ( rule__LessThan__Group_4__3__Impl rule__LessThan__Group_4__4 )
            // InternalFormValidation.g:3936:2: rule__LessThan__Group_4__3__Impl rule__LessThan__Group_4__4
            {
            pushFollow(FOLLOW_25);
            rule__LessThan__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4__4();

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
    // $ANTLR end "rule__LessThan__Group_4__3"


    // $ANTLR start "rule__LessThan__Group_4__3__Impl"
    // InternalFormValidation.g:3943:1: rule__LessThan__Group_4__3__Impl : ( ( rule__LessThan__Group_4_3__0 )* ) ;
    public final void rule__LessThan__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3947:1: ( ( ( rule__LessThan__Group_4_3__0 )* ) )
            // InternalFormValidation.g:3948:1: ( ( rule__LessThan__Group_4_3__0 )* )
            {
            // InternalFormValidation.g:3948:1: ( ( rule__LessThan__Group_4_3__0 )* )
            // InternalFormValidation.g:3949:2: ( rule__LessThan__Group_4_3__0 )*
            {
             before(grammarAccess.getLessThanAccess().getGroup_4_3()); 
            // InternalFormValidation.g:3950:2: ( rule__LessThan__Group_4_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==27) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalFormValidation.g:3950:3: rule__LessThan__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__LessThan__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getLessThanAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__LessThan__Group_4__3__Impl"


    // $ANTLR start "rule__LessThan__Group_4__4"
    // InternalFormValidation.g:3958:1: rule__LessThan__Group_4__4 : rule__LessThan__Group_4__4__Impl ;
    public final void rule__LessThan__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3962:1: ( rule__LessThan__Group_4__4__Impl )
            // InternalFormValidation.g:3963:2: rule__LessThan__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4__4__Impl();

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
    // $ANTLR end "rule__LessThan__Group_4__4"


    // $ANTLR start "rule__LessThan__Group_4__4__Impl"
    // InternalFormValidation.g:3969:1: rule__LessThan__Group_4__4__Impl : ( '}' ) ;
    public final void rule__LessThan__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3973:1: ( ( '}' ) )
            // InternalFormValidation.g:3974:1: ( '}' )
            {
            // InternalFormValidation.g:3974:1: ( '}' )
            // InternalFormValidation.g:3975:2: '}'
            {
             before(grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__LessThan__Group_4__4__Impl"


    // $ANTLR start "rule__LessThan__Group_4_3__0"
    // InternalFormValidation.g:3985:1: rule__LessThan__Group_4_3__0 : rule__LessThan__Group_4_3__0__Impl rule__LessThan__Group_4_3__1 ;
    public final void rule__LessThan__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:3989:1: ( rule__LessThan__Group_4_3__0__Impl rule__LessThan__Group_4_3__1 )
            // InternalFormValidation.g:3990:2: rule__LessThan__Group_4_3__0__Impl rule__LessThan__Group_4_3__1
            {
            pushFollow(FOLLOW_32);
            rule__LessThan__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4_3__1();

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
    // $ANTLR end "rule__LessThan__Group_4_3__0"


    // $ANTLR start "rule__LessThan__Group_4_3__0__Impl"
    // InternalFormValidation.g:3997:1: rule__LessThan__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__LessThan__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4001:1: ( ( ',' ) )
            // InternalFormValidation.g:4002:1: ( ',' )
            {
            // InternalFormValidation.g:4002:1: ( ',' )
            // InternalFormValidation.g:4003:2: ','
            {
             before(grammarAccess.getLessThanAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLessThanAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__LessThan__Group_4_3__0__Impl"


    // $ANTLR start "rule__LessThan__Group_4_3__1"
    // InternalFormValidation.g:4012:1: rule__LessThan__Group_4_3__1 : rule__LessThan__Group_4_3__1__Impl ;
    public final void rule__LessThan__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4016:1: ( rule__LessThan__Group_4_3__1__Impl )
            // InternalFormValidation.g:4017:2: rule__LessThan__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__LessThan__Group_4_3__1"


    // $ANTLR start "rule__LessThan__Group_4_3__1__Impl"
    // InternalFormValidation.g:4023:1: rule__LessThan__Group_4_3__1__Impl : ( ( rule__LessThan__AttributearrayAssignment_4_3_1 ) ) ;
    public final void rule__LessThan__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4027:1: ( ( ( rule__LessThan__AttributearrayAssignment_4_3_1 ) ) )
            // InternalFormValidation.g:4028:1: ( ( rule__LessThan__AttributearrayAssignment_4_3_1 ) )
            {
            // InternalFormValidation.g:4028:1: ( ( rule__LessThan__AttributearrayAssignment_4_3_1 ) )
            // InternalFormValidation.g:4029:2: ( rule__LessThan__AttributearrayAssignment_4_3_1 )
            {
             before(grammarAccess.getLessThanAccess().getAttributearrayAssignment_4_3_1()); 
            // InternalFormValidation.g:4030:2: ( rule__LessThan__AttributearrayAssignment_4_3_1 )
            // InternalFormValidation.g:4030:3: rule__LessThan__AttributearrayAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LessThan__AttributearrayAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLessThanAccess().getAttributearrayAssignment_4_3_1()); 

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
    // $ANTLR end "rule__LessThan__Group_4_3__1__Impl"


    // $ANTLR start "rule__AttributeArray__Group__0"
    // InternalFormValidation.g:4039:1: rule__AttributeArray__Group__0 : rule__AttributeArray__Group__0__Impl rule__AttributeArray__Group__1 ;
    public final void rule__AttributeArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4043:1: ( rule__AttributeArray__Group__0__Impl rule__AttributeArray__Group__1 )
            // InternalFormValidation.g:4044:2: rule__AttributeArray__Group__0__Impl rule__AttributeArray__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AttributeArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group__1();

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
    // $ANTLR end "rule__AttributeArray__Group__0"


    // $ANTLR start "rule__AttributeArray__Group__0__Impl"
    // InternalFormValidation.g:4051:1: rule__AttributeArray__Group__0__Impl : ( () ) ;
    public final void rule__AttributeArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4055:1: ( ( () ) )
            // InternalFormValidation.g:4056:1: ( () )
            {
            // InternalFormValidation.g:4056:1: ( () )
            // InternalFormValidation.g:4057:2: ()
            {
             before(grammarAccess.getAttributeArrayAccess().getAttributeArrayAction_0()); 
            // InternalFormValidation.g:4058:2: ()
            // InternalFormValidation.g:4058:3: 
            {
            }

             after(grammarAccess.getAttributeArrayAccess().getAttributeArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeArray__Group__0__Impl"


    // $ANTLR start "rule__AttributeArray__Group__1"
    // InternalFormValidation.g:4066:1: rule__AttributeArray__Group__1 : rule__AttributeArray__Group__1__Impl ;
    public final void rule__AttributeArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4070:1: ( rule__AttributeArray__Group__1__Impl )
            // InternalFormValidation.g:4071:2: rule__AttributeArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeArray__Group__1"


    // $ANTLR start "rule__AttributeArray__Group__1__Impl"
    // InternalFormValidation.g:4077:1: rule__AttributeArray__Group__1__Impl : ( ( rule__AttributeArray__Group_1__0 )? ) ;
    public final void rule__AttributeArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4081:1: ( ( ( rule__AttributeArray__Group_1__0 )? ) )
            // InternalFormValidation.g:4082:1: ( ( rule__AttributeArray__Group_1__0 )? )
            {
            // InternalFormValidation.g:4082:1: ( ( rule__AttributeArray__Group_1__0 )? )
            // InternalFormValidation.g:4083:2: ( rule__AttributeArray__Group_1__0 )?
            {
             before(grammarAccess.getAttributeArrayAccess().getGroup_1()); 
            // InternalFormValidation.g:4084:2: ( rule__AttributeArray__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalFormValidation.g:4084:3: rule__AttributeArray__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeArray__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeArrayAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AttributeArray__Group__1__Impl"


    // $ANTLR start "rule__AttributeArray__Group_1__0"
    // InternalFormValidation.g:4093:1: rule__AttributeArray__Group_1__0 : rule__AttributeArray__Group_1__0__Impl rule__AttributeArray__Group_1__1 ;
    public final void rule__AttributeArray__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4097:1: ( rule__AttributeArray__Group_1__0__Impl rule__AttributeArray__Group_1__1 )
            // InternalFormValidation.g:4098:2: rule__AttributeArray__Group_1__0__Impl rule__AttributeArray__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AttributeArray__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group_1__1();

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
    // $ANTLR end "rule__AttributeArray__Group_1__0"


    // $ANTLR start "rule__AttributeArray__Group_1__0__Impl"
    // InternalFormValidation.g:4105:1: rule__AttributeArray__Group_1__0__Impl : ( '(' ) ;
    public final void rule__AttributeArray__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4109:1: ( ( '(' ) )
            // InternalFormValidation.g:4110:1: ( '(' )
            {
            // InternalFormValidation.g:4110:1: ( '(' )
            // InternalFormValidation.g:4111:2: '('
            {
             before(grammarAccess.getAttributeArrayAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeArrayAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__AttributeArray__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeArray__Group_1__1"
    // InternalFormValidation.g:4120:1: rule__AttributeArray__Group_1__1 : rule__AttributeArray__Group_1__1__Impl rule__AttributeArray__Group_1__2 ;
    public final void rule__AttributeArray__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4124:1: ( rule__AttributeArray__Group_1__1__Impl rule__AttributeArray__Group_1__2 )
            // InternalFormValidation.g:4125:2: rule__AttributeArray__Group_1__1__Impl rule__AttributeArray__Group_1__2
            {
            pushFollow(FOLLOW_37);
            rule__AttributeArray__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group_1__2();

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
    // $ANTLR end "rule__AttributeArray__Group_1__1"


    // $ANTLR start "rule__AttributeArray__Group_1__1__Impl"
    // InternalFormValidation.g:4132:1: rule__AttributeArray__Group_1__1__Impl : ( ( rule__AttributeArray__ClassattributeAssignment_1_1 ) ) ;
    public final void rule__AttributeArray__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4136:1: ( ( ( rule__AttributeArray__ClassattributeAssignment_1_1 ) ) )
            // InternalFormValidation.g:4137:1: ( ( rule__AttributeArray__ClassattributeAssignment_1_1 ) )
            {
            // InternalFormValidation.g:4137:1: ( ( rule__AttributeArray__ClassattributeAssignment_1_1 ) )
            // InternalFormValidation.g:4138:2: ( rule__AttributeArray__ClassattributeAssignment_1_1 )
            {
             before(grammarAccess.getAttributeArrayAccess().getClassattributeAssignment_1_1()); 
            // InternalFormValidation.g:4139:2: ( rule__AttributeArray__ClassattributeAssignment_1_1 )
            // InternalFormValidation.g:4139:3: rule__AttributeArray__ClassattributeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeArray__ClassattributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeArrayAccess().getClassattributeAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeArray__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeArray__Group_1__2"
    // InternalFormValidation.g:4147:1: rule__AttributeArray__Group_1__2 : rule__AttributeArray__Group_1__2__Impl rule__AttributeArray__Group_1__3 ;
    public final void rule__AttributeArray__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4151:1: ( rule__AttributeArray__Group_1__2__Impl rule__AttributeArray__Group_1__3 )
            // InternalFormValidation.g:4152:2: rule__AttributeArray__Group_1__2__Impl rule__AttributeArray__Group_1__3
            {
            pushFollow(FOLLOW_37);
            rule__AttributeArray__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group_1__3();

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
    // $ANTLR end "rule__AttributeArray__Group_1__2"


    // $ANTLR start "rule__AttributeArray__Group_1__2__Impl"
    // InternalFormValidation.g:4159:1: rule__AttributeArray__Group_1__2__Impl : ( ( rule__AttributeArray__Group_1_2__0 )* ) ;
    public final void rule__AttributeArray__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4163:1: ( ( ( rule__AttributeArray__Group_1_2__0 )* ) )
            // InternalFormValidation.g:4164:1: ( ( rule__AttributeArray__Group_1_2__0 )* )
            {
            // InternalFormValidation.g:4164:1: ( ( rule__AttributeArray__Group_1_2__0 )* )
            // InternalFormValidation.g:4165:2: ( rule__AttributeArray__Group_1_2__0 )*
            {
             before(grammarAccess.getAttributeArrayAccess().getGroup_1_2()); 
            // InternalFormValidation.g:4166:2: ( rule__AttributeArray__Group_1_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalFormValidation.g:4166:3: rule__AttributeArray__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AttributeArray__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getAttributeArrayAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__AttributeArray__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeArray__Group_1__3"
    // InternalFormValidation.g:4174:1: rule__AttributeArray__Group_1__3 : rule__AttributeArray__Group_1__3__Impl ;
    public final void rule__AttributeArray__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4178:1: ( rule__AttributeArray__Group_1__3__Impl )
            // InternalFormValidation.g:4179:2: rule__AttributeArray__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group_1__3__Impl();

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
    // $ANTLR end "rule__AttributeArray__Group_1__3"


    // $ANTLR start "rule__AttributeArray__Group_1__3__Impl"
    // InternalFormValidation.g:4185:1: rule__AttributeArray__Group_1__3__Impl : ( ')' ) ;
    public final void rule__AttributeArray__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4189:1: ( ( ')' ) )
            // InternalFormValidation.g:4190:1: ( ')' )
            {
            // InternalFormValidation.g:4190:1: ( ')' )
            // InternalFormValidation.g:4191:2: ')'
            {
             before(grammarAccess.getAttributeArrayAccess().getRightParenthesisKeyword_1_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAttributeArrayAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__AttributeArray__Group_1__3__Impl"


    // $ANTLR start "rule__AttributeArray__Group_1_2__0"
    // InternalFormValidation.g:4201:1: rule__AttributeArray__Group_1_2__0 : rule__AttributeArray__Group_1_2__0__Impl rule__AttributeArray__Group_1_2__1 ;
    public final void rule__AttributeArray__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4205:1: ( rule__AttributeArray__Group_1_2__0__Impl rule__AttributeArray__Group_1_2__1 )
            // InternalFormValidation.g:4206:2: rule__AttributeArray__Group_1_2__0__Impl rule__AttributeArray__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AttributeArray__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group_1_2__1();

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
    // $ANTLR end "rule__AttributeArray__Group_1_2__0"


    // $ANTLR start "rule__AttributeArray__Group_1_2__0__Impl"
    // InternalFormValidation.g:4213:1: rule__AttributeArray__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeArray__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4217:1: ( ( ',' ) )
            // InternalFormValidation.g:4218:1: ( ',' )
            {
            // InternalFormValidation.g:4218:1: ( ',' )
            // InternalFormValidation.g:4219:2: ','
            {
             before(grammarAccess.getAttributeArrayAccess().getCommaKeyword_1_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeArrayAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__AttributeArray__Group_1_2__0__Impl"


    // $ANTLR start "rule__AttributeArray__Group_1_2__1"
    // InternalFormValidation.g:4228:1: rule__AttributeArray__Group_1_2__1 : rule__AttributeArray__Group_1_2__1__Impl ;
    public final void rule__AttributeArray__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4232:1: ( rule__AttributeArray__Group_1_2__1__Impl )
            // InternalFormValidation.g:4233:2: rule__AttributeArray__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeArray__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__AttributeArray__Group_1_2__1"


    // $ANTLR start "rule__AttributeArray__Group_1_2__1__Impl"
    // InternalFormValidation.g:4239:1: rule__AttributeArray__Group_1_2__1__Impl : ( ( rule__AttributeArray__ClassattributeAssignment_1_2_1 ) ) ;
    public final void rule__AttributeArray__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4243:1: ( ( ( rule__AttributeArray__ClassattributeAssignment_1_2_1 ) ) )
            // InternalFormValidation.g:4244:1: ( ( rule__AttributeArray__ClassattributeAssignment_1_2_1 ) )
            {
            // InternalFormValidation.g:4244:1: ( ( rule__AttributeArray__ClassattributeAssignment_1_2_1 ) )
            // InternalFormValidation.g:4245:2: ( rule__AttributeArray__ClassattributeAssignment_1_2_1 )
            {
             before(grammarAccess.getAttributeArrayAccess().getClassattributeAssignment_1_2_1()); 
            // InternalFormValidation.g:4246:2: ( rule__AttributeArray__ClassattributeAssignment_1_2_1 )
            // InternalFormValidation.g:4246:3: rule__AttributeArray__ClassattributeAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeArray__ClassattributeAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeArrayAccess().getClassattributeAssignment_1_2_1()); 

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
    // $ANTLR end "rule__AttributeArray__Group_1_2__1__Impl"


    // $ANTLR start "rule__ValidationClass__NameAssignment_1"
    // InternalFormValidation.g:4255:1: rule__ValidationClass__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ValidationClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4259:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4260:2: ( ruleEString )
            {
            // InternalFormValidation.g:4260:2: ( ruleEString )
            // InternalFormValidation.g:4261:3: ruleEString
            {
             before(grammarAccess.getValidationClassAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getValidationClassAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ValidationClass__NameAssignment_1"


    // $ANTLR start "rule__ValidationClass__ClassattributeAssignment_3_0"
    // InternalFormValidation.g:4270:1: rule__ValidationClass__ClassattributeAssignment_3_0 : ( ruleClassAttribute ) ;
    public final void rule__ValidationClass__ClassattributeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4274:1: ( ( ruleClassAttribute ) )
            // InternalFormValidation.g:4275:2: ( ruleClassAttribute )
            {
            // InternalFormValidation.g:4275:2: ( ruleClassAttribute )
            // InternalFormValidation.g:4276:3: ruleClassAttribute
            {
             before(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassAttribute();

            state._fsp--;

             after(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__ValidationClass__ClassattributeAssignment_3_0"


    // $ANTLR start "rule__ValidationClass__ClassattributeAssignment_3_1"
    // InternalFormValidation.g:4285:1: rule__ValidationClass__ClassattributeAssignment_3_1 : ( ruleClassAttribute ) ;
    public final void rule__ValidationClass__ClassattributeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4289:1: ( ( ruleClassAttribute ) )
            // InternalFormValidation.g:4290:2: ( ruleClassAttribute )
            {
            // InternalFormValidation.g:4290:2: ( ruleClassAttribute )
            // InternalFormValidation.g:4291:3: ruleClassAttribute
            {
             before(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassAttribute();

            state._fsp--;

             after(grammarAccess.getValidationClassAccess().getClassattributeClassAttributeParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ValidationClass__ClassattributeAssignment_3_1"


    // $ANTLR start "rule__ValidationClass__ClassruleAssignment_4_0"
    // InternalFormValidation.g:4300:1: rule__ValidationClass__ClassruleAssignment_4_0 : ( ruleClassRule ) ;
    public final void rule__ValidationClass__ClassruleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4304:1: ( ( ruleClassRule ) )
            // InternalFormValidation.g:4305:2: ( ruleClassRule )
            {
            // InternalFormValidation.g:4305:2: ( ruleClassRule )
            // InternalFormValidation.g:4306:3: ruleClassRule
            {
             before(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassRule();

            state._fsp--;

             after(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__ValidationClass__ClassruleAssignment_4_0"


    // $ANTLR start "rule__ValidationClass__ClassruleAssignment_4_1"
    // InternalFormValidation.g:4315:1: rule__ValidationClass__ClassruleAssignment_4_1 : ( ruleClassRule ) ;
    public final void rule__ValidationClass__ClassruleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4319:1: ( ( ruleClassRule ) )
            // InternalFormValidation.g:4320:2: ( ruleClassRule )
            {
            // InternalFormValidation.g:4320:2: ( ruleClassRule )
            // InternalFormValidation.g:4321:3: ruleClassRule
            {
             before(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassRule();

            state._fsp--;

             after(grammarAccess.getValidationClassAccess().getClassruleClassRuleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ValidationClass__ClassruleAssignment_4_1"


    // $ANTLR start "rule__ClassAttribute__NameAssignment_0"
    // InternalFormValidation.g:4330:1: rule__ClassAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ClassAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4334:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4335:2: ( ruleEString )
            {
            // InternalFormValidation.g:4335:2: ( ruleEString )
            // InternalFormValidation.g:4336:3: ruleEString
            {
             before(grammarAccess.getClassAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAttributeAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ClassAttribute__NameAssignment_0"


    // $ANTLR start "rule__ClassAttribute__AttributetypeAssignment_3"
    // InternalFormValidation.g:4345:1: rule__ClassAttribute__AttributetypeAssignment_3 : ( ruleAttributeType ) ;
    public final void rule__ClassAttribute__AttributetypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4349:1: ( ( ruleAttributeType ) )
            // InternalFormValidation.g:4350:2: ( ruleAttributeType )
            {
            // InternalFormValidation.g:4350:2: ( ruleAttributeType )
            // InternalFormValidation.g:4351:3: ruleAttributeType
            {
             before(grammarAccess.getClassAttributeAccess().getAttributetypeAttributeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getClassAttributeAccess().getAttributetypeAttributeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ClassAttribute__AttributetypeAssignment_3"


    // $ANTLR start "rule__ClassAttribute__AttributeruleAssignment_4_0"
    // InternalFormValidation.g:4360:1: rule__ClassAttribute__AttributeruleAssignment_4_0 : ( ruleAttributeRule ) ;
    public final void rule__ClassAttribute__AttributeruleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4364:1: ( ( ruleAttributeRule ) )
            // InternalFormValidation.g:4365:2: ( ruleAttributeRule )
            {
            // InternalFormValidation.g:4365:2: ( ruleAttributeRule )
            // InternalFormValidation.g:4366:3: ruleAttributeRule
            {
             before(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeRule();

            state._fsp--;

             after(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__ClassAttribute__AttributeruleAssignment_4_0"


    // $ANTLR start "rule__ClassAttribute__AttributeruleAssignment_4_1"
    // InternalFormValidation.g:4375:1: rule__ClassAttribute__AttributeruleAssignment_4_1 : ( ruleAttributeRule ) ;
    public final void rule__ClassAttribute__AttributeruleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4379:1: ( ( ruleAttributeRule ) )
            // InternalFormValidation.g:4380:2: ( ruleAttributeRule )
            {
            // InternalFormValidation.g:4380:2: ( ruleAttributeRule )
            // InternalFormValidation.g:4381:3: ruleAttributeRule
            {
             before(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeRule();

            state._fsp--;

             after(grammarAccess.getClassAttributeAccess().getAttributeruleAttributeRuleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ClassAttribute__AttributeruleAssignment_4_1"


    // $ANTLR start "rule__AttributeType__VrstaAssignment_1"
    // InternalFormValidation.g:4390:1: rule__AttributeType__VrstaAssignment_1 : ( ruleEVrsta ) ;
    public final void rule__AttributeType__VrstaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4394:1: ( ( ruleEVrsta ) )
            // InternalFormValidation.g:4395:2: ( ruleEVrsta )
            {
            // InternalFormValidation.g:4395:2: ( ruleEVrsta )
            // InternalFormValidation.g:4396:3: ruleEVrsta
            {
             before(grammarAccess.getAttributeTypeAccess().getVrstaEVrstaEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEVrsta();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getVrstaEVrstaEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeType__VrstaAssignment_1"


    // $ANTLR start "rule__Required__IsRequiredAssignment_1"
    // InternalFormValidation.g:4405:1: rule__Required__IsRequiredAssignment_1 : ( ( 'isRequired' ) ) ;
    public final void rule__Required__IsRequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4409:1: ( ( ( 'isRequired' ) ) )
            // InternalFormValidation.g:4410:2: ( ( 'isRequired' ) )
            {
            // InternalFormValidation.g:4410:2: ( ( 'isRequired' ) )
            // InternalFormValidation.g:4411:3: ( 'isRequired' )
            {
             before(grammarAccess.getRequiredAccess().getIsRequiredIsRequiredKeyword_1_0()); 
            // InternalFormValidation.g:4412:3: ( 'isRequired' )
            // InternalFormValidation.g:4413:4: 'isRequired'
            {
             before(grammarAccess.getRequiredAccess().getIsRequiredIsRequiredKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRequiredAccess().getIsRequiredIsRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getRequiredAccess().getIsRequiredIsRequiredKeyword_1_0()); 

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
    // $ANTLR end "rule__Required__IsRequiredAssignment_1"


    // $ANTLR start "rule__Email__IsEmailAssignment_1"
    // InternalFormValidation.g:4424:1: rule__Email__IsEmailAssignment_1 : ( ( 'isEmail' ) ) ;
    public final void rule__Email__IsEmailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4428:1: ( ( ( 'isEmail' ) ) )
            // InternalFormValidation.g:4429:2: ( ( 'isEmail' ) )
            {
            // InternalFormValidation.g:4429:2: ( ( 'isEmail' ) )
            // InternalFormValidation.g:4430:3: ( 'isEmail' )
            {
             before(grammarAccess.getEmailAccess().getIsEmailIsEmailKeyword_1_0()); 
            // InternalFormValidation.g:4431:3: ( 'isEmail' )
            // InternalFormValidation.g:4432:4: 'isEmail'
            {
             before(grammarAccess.getEmailAccess().getIsEmailIsEmailKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEmailAccess().getIsEmailIsEmailKeyword_1_0()); 

            }

             after(grammarAccess.getEmailAccess().getIsEmailIsEmailKeyword_1_0()); 

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
    // $ANTLR end "rule__Email__IsEmailAssignment_1"


    // $ANTLR start "rule__MinLength__ValueAssignment_2"
    // InternalFormValidation.g:4443:1: rule__MinLength__ValueAssignment_2 : ( ruleInt0 ) ;
    public final void rule__MinLength__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4447:1: ( ( ruleInt0 ) )
            // InternalFormValidation.g:4448:2: ( ruleInt0 )
            {
            // InternalFormValidation.g:4448:2: ( ruleInt0 )
            // InternalFormValidation.g:4449:3: ruleInt0
            {
             before(grammarAccess.getMinLengthAccess().getValueInt0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getMinLengthAccess().getValueInt0ParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MinLength__ValueAssignment_2"


    // $ANTLR start "rule__MaxLength__ValueAssignment_2"
    // InternalFormValidation.g:4458:1: rule__MaxLength__ValueAssignment_2 : ( ruleInt0 ) ;
    public final void rule__MaxLength__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4462:1: ( ( ruleInt0 ) )
            // InternalFormValidation.g:4463:2: ( ruleInt0 )
            {
            // InternalFormValidation.g:4463:2: ( ruleInt0 )
            // InternalFormValidation.g:4464:3: ruleInt0
            {
             before(grammarAccess.getMaxLengthAccess().getValueInt0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getMaxLengthAccess().getValueInt0ParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MaxLength__ValueAssignment_2"


    // $ANTLR start "rule__Length__ValueAssignment_2"
    // InternalFormValidation.g:4473:1: rule__Length__ValueAssignment_2 : ( ruleInt0 ) ;
    public final void rule__Length__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4477:1: ( ( ruleInt0 ) )
            // InternalFormValidation.g:4478:2: ( ruleInt0 )
            {
            // InternalFormValidation.g:4478:2: ( ruleInt0 )
            // InternalFormValidation.g:4479:3: ruleInt0
            {
             before(grammarAccess.getLengthAccess().getValueInt0ParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getLengthAccess().getValueInt0ParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Length__ValueAssignment_2"


    // $ANTLR start "rule__MinNumber__ValueAssignment_2"
    // InternalFormValidation.g:4488:1: rule__MinNumber__ValueAssignment_2 : ( ruleFloat ) ;
    public final void rule__MinNumber__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4492:1: ( ( ruleFloat ) )
            // InternalFormValidation.g:4493:2: ( ruleFloat )
            {
            // InternalFormValidation.g:4493:2: ( ruleFloat )
            // InternalFormValidation.g:4494:3: ruleFloat
            {
             before(grammarAccess.getMinNumberAccess().getValueFloatParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getMinNumberAccess().getValueFloatParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MinNumber__ValueAssignment_2"


    // $ANTLR start "rule__MinDate__ValueAssignment_2"
    // InternalFormValidation.g:4503:1: rule__MinDate__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__MinDate__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4507:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4508:2: ( ruleEString )
            {
            // InternalFormValidation.g:4508:2: ( ruleEString )
            // InternalFormValidation.g:4509:3: ruleEString
            {
             before(grammarAccess.getMinDateAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMinDateAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MinDate__ValueAssignment_2"


    // $ANTLR start "rule__MaxNumber__ValueAssignment_2"
    // InternalFormValidation.g:4518:1: rule__MaxNumber__ValueAssignment_2 : ( ruleFloat ) ;
    public final void rule__MaxNumber__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4522:1: ( ( ruleFloat ) )
            // InternalFormValidation.g:4523:2: ( ruleFloat )
            {
            // InternalFormValidation.g:4523:2: ( ruleFloat )
            // InternalFormValidation.g:4524:3: ruleFloat
            {
             before(grammarAccess.getMaxNumberAccess().getValueFloatParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getMaxNumberAccess().getValueFloatParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MaxNumber__ValueAssignment_2"


    // $ANTLR start "rule__MaxDate__ValueAssignment_2"
    // InternalFormValidation.g:4533:1: rule__MaxDate__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__MaxDate__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4537:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4538:2: ( ruleEString )
            {
            // InternalFormValidation.g:4538:2: ( ruleEString )
            // InternalFormValidation.g:4539:3: ruleEString
            {
             before(grammarAccess.getMaxDateAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMaxDateAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MaxDate__ValueAssignment_2"


    // $ANTLR start "rule__AcceptableValuesString__ValuesAssignment_2_1"
    // InternalFormValidation.g:4548:1: rule__AcceptableValuesString__ValuesAssignment_2_1 : ( ruleEString ) ;
    public final void rule__AcceptableValuesString__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4552:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4553:2: ( ruleEString )
            {
            // InternalFormValidation.g:4553:2: ( ruleEString )
            // InternalFormValidation.g:4554:3: ruleEString
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AcceptableValuesString__ValuesAssignment_2_1"


    // $ANTLR start "rule__AcceptableValuesString__ValuesAssignment_2_2_1"
    // InternalFormValidation.g:4563:1: rule__AcceptableValuesString__ValuesAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__AcceptableValuesString__ValuesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4567:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4568:2: ( ruleEString )
            {
            // InternalFormValidation.g:4568:2: ( ruleEString )
            // InternalFormValidation.g:4569:3: ruleEString
            {
             before(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAcceptableValuesStringAccess().getValuesEStringParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__AcceptableValuesString__ValuesAssignment_2_2_1"


    // $ANTLR start "rule__AcceptableValuesDate__ValuesAssignment_2_1"
    // InternalFormValidation.g:4578:1: rule__AcceptableValuesDate__ValuesAssignment_2_1 : ( ruleEString ) ;
    public final void rule__AcceptableValuesDate__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4582:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4583:2: ( ruleEString )
            {
            // InternalFormValidation.g:4583:2: ( ruleEString )
            // InternalFormValidation.g:4584:3: ruleEString
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__ValuesAssignment_2_1"


    // $ANTLR start "rule__AcceptableValuesDate__ValuesAssignment_2_2_1"
    // InternalFormValidation.g:4593:1: rule__AcceptableValuesDate__ValuesAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__AcceptableValuesDate__ValuesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4597:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4598:2: ( ruleEString )
            {
            // InternalFormValidation.g:4598:2: ( ruleEString )
            // InternalFormValidation.g:4599:3: ruleEString
            {
             before(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAcceptableValuesDateAccess().getValuesEStringParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__AcceptableValuesDate__ValuesAssignment_2_2_1"


    // $ANTLR start "rule__StringPattern__ValueAssignment_2"
    // InternalFormValidation.g:4608:1: rule__StringPattern__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__StringPattern__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4612:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4613:2: ( ruleEString )
            {
            // InternalFormValidation.g:4613:2: ( ruleEString )
            // InternalFormValidation.g:4614:3: ruleEString
            {
             before(grammarAccess.getStringPatternAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringPatternAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringPattern__ValueAssignment_2"


    // $ANTLR start "rule__DatePattern__ValueAssignment_2"
    // InternalFormValidation.g:4623:1: rule__DatePattern__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__DatePattern__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4627:1: ( ( ruleEString ) )
            // InternalFormValidation.g:4628:2: ( ruleEString )
            {
            // InternalFormValidation.g:4628:2: ( ruleEString )
            // InternalFormValidation.g:4629:3: ruleEString
            {
             before(grammarAccess.getDatePatternAccess().getValueEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatePatternAccess().getValueEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DatePattern__ValueAssignment_2"


    // $ANTLR start "rule__NotEquals__AttributearrayAssignment_3_1"
    // InternalFormValidation.g:4638:1: rule__NotEquals__AttributearrayAssignment_3_1 : ( ruleAttributeArray ) ;
    public final void rule__NotEquals__AttributearrayAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4642:1: ( ( ruleAttributeArray ) )
            // InternalFormValidation.g:4643:2: ( ruleAttributeArray )
            {
            // InternalFormValidation.g:4643:2: ( ruleAttributeArray )
            // InternalFormValidation.g:4644:3: ruleAttributeArray
            {
             before(grammarAccess.getNotEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getNotEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NotEquals__AttributearrayAssignment_3_1"


    // $ANTLR start "rule__GreaterThan__ClassattributeAssignment_3_1"
    // InternalFormValidation.g:4653:1: rule__GreaterThan__ClassattributeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__GreaterThan__ClassattributeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4657:1: ( ( ( ruleEString ) ) )
            // InternalFormValidation.g:4658:2: ( ( ruleEString ) )
            {
            // InternalFormValidation.g:4658:2: ( ( ruleEString ) )
            // InternalFormValidation.g:4659:3: ( ruleEString )
            {
             before(grammarAccess.getGreaterThanAccess().getClassattributeClassAttributeCrossReference_3_1_0()); 
            // InternalFormValidation.g:4660:3: ( ruleEString )
            // InternalFormValidation.g:4661:4: ruleEString
            {
             before(grammarAccess.getGreaterThanAccess().getClassattributeClassAttributeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGreaterThanAccess().getClassattributeClassAttributeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getGreaterThanAccess().getClassattributeClassAttributeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__GreaterThan__ClassattributeAssignment_3_1"


    // $ANTLR start "rule__GreaterThan__AttributearrayAssignment_4_1"
    // InternalFormValidation.g:4672:1: rule__GreaterThan__AttributearrayAssignment_4_1 : ( ruleAttributeArray ) ;
    public final void rule__GreaterThan__AttributearrayAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4676:1: ( ( ruleAttributeArray ) )
            // InternalFormValidation.g:4677:2: ( ruleAttributeArray )
            {
            // InternalFormValidation.g:4677:2: ( ruleAttributeArray )
            // InternalFormValidation.g:4678:3: ruleAttributeArray
            {
             before(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__GreaterThan__AttributearrayAssignment_4_1"


    // $ANTLR start "rule__GreaterThan__AttributearrayAssignment_4_2_1"
    // InternalFormValidation.g:4687:1: rule__GreaterThan__AttributearrayAssignment_4_2_1 : ( ruleAttributeArray ) ;
    public final void rule__GreaterThan__AttributearrayAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4691:1: ( ( ruleAttributeArray ) )
            // InternalFormValidation.g:4692:2: ( ruleAttributeArray )
            {
            // InternalFormValidation.g:4692:2: ( ruleAttributeArray )
            // InternalFormValidation.g:4693:3: ruleAttributeArray
            {
             before(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getGreaterThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__GreaterThan__AttributearrayAssignment_4_2_1"


    // $ANTLR start "rule__Equals__AttributearrayAssignment_3_1"
    // InternalFormValidation.g:4702:1: rule__Equals__AttributearrayAssignment_3_1 : ( ruleAttributeArray ) ;
    public final void rule__Equals__AttributearrayAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4706:1: ( ( ruleAttributeArray ) )
            // InternalFormValidation.g:4707:2: ( ruleAttributeArray )
            {
            // InternalFormValidation.g:4707:2: ( ruleAttributeArray )
            // InternalFormValidation.g:4708:3: ruleAttributeArray
            {
             before(grammarAccess.getEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getEqualsAccess().getAttributearrayAttributeArrayParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Equals__AttributearrayAssignment_3_1"


    // $ANTLR start "rule__LessThan__ClassattributeAssignment_3_1"
    // InternalFormValidation.g:4717:1: rule__LessThan__ClassattributeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LessThan__ClassattributeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4721:1: ( ( ( ruleEString ) ) )
            // InternalFormValidation.g:4722:2: ( ( ruleEString ) )
            {
            // InternalFormValidation.g:4722:2: ( ( ruleEString ) )
            // InternalFormValidation.g:4723:3: ( ruleEString )
            {
             before(grammarAccess.getLessThanAccess().getClassattributeClassAttributeCrossReference_3_1_0()); 
            // InternalFormValidation.g:4724:3: ( ruleEString )
            // InternalFormValidation.g:4725:4: ruleEString
            {
             before(grammarAccess.getLessThanAccess().getClassattributeClassAttributeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLessThanAccess().getClassattributeClassAttributeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLessThanAccess().getClassattributeClassAttributeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__LessThan__ClassattributeAssignment_3_1"


    // $ANTLR start "rule__LessThan__AttributearrayAssignment_4_2"
    // InternalFormValidation.g:4736:1: rule__LessThan__AttributearrayAssignment_4_2 : ( ruleAttributeArray ) ;
    public final void rule__LessThan__AttributearrayAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4740:1: ( ( ruleAttributeArray ) )
            // InternalFormValidation.g:4741:2: ( ruleAttributeArray )
            {
            // InternalFormValidation.g:4741:2: ( ruleAttributeArray )
            // InternalFormValidation.g:4742:3: ruleAttributeArray
            {
             before(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__LessThan__AttributearrayAssignment_4_2"


    // $ANTLR start "rule__LessThan__AttributearrayAssignment_4_3_1"
    // InternalFormValidation.g:4751:1: rule__LessThan__AttributearrayAssignment_4_3_1 : ( ruleAttributeArray ) ;
    public final void rule__LessThan__AttributearrayAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4755:1: ( ( ruleAttributeArray ) )
            // InternalFormValidation.g:4756:2: ( ruleAttributeArray )
            {
            // InternalFormValidation.g:4756:2: ( ruleAttributeArray )
            // InternalFormValidation.g:4757:3: ruleAttributeArray
            {
             before(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeArray();

            state._fsp--;

             after(grammarAccess.getLessThanAccess().getAttributearrayAttributeArrayParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__LessThan__AttributearrayAssignment_4_3_1"


    // $ANTLR start "rule__AttributeArray__ClassattributeAssignment_1_1"
    // InternalFormValidation.g:4766:1: rule__AttributeArray__ClassattributeAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__AttributeArray__ClassattributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4770:1: ( ( ( ruleEString ) ) )
            // InternalFormValidation.g:4771:2: ( ( ruleEString ) )
            {
            // InternalFormValidation.g:4771:2: ( ( ruleEString ) )
            // InternalFormValidation.g:4772:3: ( ruleEString )
            {
             before(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeCrossReference_1_1_0()); 
            // InternalFormValidation.g:4773:3: ( ruleEString )
            // InternalFormValidation.g:4774:4: ruleEString
            {
             before(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__AttributeArray__ClassattributeAssignment_1_1"


    // $ANTLR start "rule__AttributeArray__ClassattributeAssignment_1_2_1"
    // InternalFormValidation.g:4785:1: rule__AttributeArray__ClassattributeAssignment_1_2_1 : ( ( ruleEString ) ) ;
    public final void rule__AttributeArray__ClassattributeAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFormValidation.g:4789:1: ( ( ( ruleEString ) ) )
            // InternalFormValidation.g:4790:2: ( ( ruleEString ) )
            {
            // InternalFormValidation.g:4790:2: ( ( ruleEString ) )
            // InternalFormValidation.g:4791:3: ( ruleEString )
            {
             before(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeCrossReference_1_2_1_0()); 
            // InternalFormValidation.g:4792:3: ( ruleEString )
            // InternalFormValidation.g:4793:4: ruleEString
            {
             before(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeEStringParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeEStringParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getAttributeArrayAccess().getClassattributeClassAttributeCrossReference_1_2_1_0()); 

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
    // $ANTLR end "rule__AttributeArray__ClassattributeAssignment_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000003500008060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003500000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000003500000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000030077FE8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000030077FE0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000030077FE0002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000A00008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008008000000L});

}