package R0;

import J.C0257c;
import J.C0274k0;
import J.C0285q;
import J.C0291t0;
import J.W;
import android.content.Context;
import android.view.View;
import android.view.Window;
import u0.AbstractC1273a;

/* loaded from: classes.dex */
public final class r extends AbstractC1273a {

    /* renamed from: p, reason: collision with root package name */
    public final Window f5426p;
    public final C0274k0 q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5427r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5428s;

    public r(Context context, Window window) {
        super(context);
        this.f5426p = window;
        this.q = C0257c.N(o.f5421a, W.f4109m);
    }

    @Override // u0.AbstractC1273a
    public final void a(int i2, C0285q c0285q) {
        int i3;
        c0285q.W(1735448596);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            ((y2.e) this.q.getValue()).j(c0285q, 0);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new q(i2, 0, this);
        }
    }

    @Override // u0.AbstractC1273a
    public final void d(boolean z3, int i2, int i3, int i4, int i5) {
        View childAt;
        super.d(z3, i2, i3, i4, i5);
        if (this.f5427r || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f5426p.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // u0.AbstractC1273a
    public final void e(int i2, int i3) {
        if (this.f5427r) {
            super.e(i2, i3);
            return;
        }
        super.e(View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // u0.AbstractC1273a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5428s;
    }
}
