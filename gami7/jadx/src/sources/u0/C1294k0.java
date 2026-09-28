package u0;

import J.C0257c;
import J.C0274k0;
import J.C0285q;
import J.C0291t0;
import android.content.Context;

/* renamed from: u0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294k0 extends AbstractC1273a {

    /* renamed from: p, reason: collision with root package name */
    public final C0274k0 f11074p;
    public boolean q;

    public C1294k0(Context context) {
        super(context, null, 0);
        this.f11074p = C0257c.N(null, J.W.f4109m);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // u0.AbstractC1273a
    public final void a(int i2, C0285q c0285q) {
        int i3;
        c0285q.W(420213850);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            y2.e eVar = (y2.e) this.f11074p.getValue();
            if (eVar == null) {
                c0285q.U(358373017);
            } else {
                c0285q.U(150107752);
                eVar.j(c0285q, 0);
            }
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new R0.q(i2, 5, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C1294k0.class.getName();
    }

    @Override // u0.AbstractC1273a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.q;
    }

    public final void setContent(y2.e eVar) {
        this.q = true;
        this.f11074p.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f11022k == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
            }
            c();
        }
    }
}
