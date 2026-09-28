package W;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final View f5883a;

    /* renamed from: b, reason: collision with root package name */
    public final f f5884b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f5885c;

    public a(View view, f fVar) {
        this.f5883a = view;
        this.f5884b = fVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f5885c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
