package R0;

import D.X;
import J.H;
import a.AbstractC0423a;
import androidx.lifecycle.Q;
import b.InterfaceC0479c;
import c.C0551a;
import c.C0560j;
import java.util.Iterator;
import m2.C0880v;
import s.AbstractC1166e;
import u0.C1304p0;
import u0.r1;
import v.C1333E;
import v.C1337I;
import v.C1368v;

/* renamed from: R0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371a implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5386b;

    public /* synthetic */ C0371a(int i2, Object obj) {
        this.f5385a = i2;
        this.f5386b = obj;
    }

    @Override // J.H
    public final void a() {
        C0880v c0880v;
        switch (this.f5385a) {
            case 0:
                u uVar = (u) this.f5386b;
                uVar.dismiss();
                r rVar = uVar.f5441n;
                r1 r1Var = rVar.f11021j;
                if (r1Var != null) {
                    r1Var.a();
                }
                rVar.f11021j = null;
                rVar.requestLayout();
                return;
            case 1:
                x xVar = (x) this.f5386b;
                r1 r1Var2 = xVar.f11021j;
                if (r1Var2 != null) {
                    r1Var2.a();
                }
                xVar.f11021j = null;
                xVar.requestLayout();
                Q.l(xVar, null);
                xVar.f5460u.removeViewImmediate(xVar);
                return;
            case 2:
                AbstractC0423a abstractC0423a = ((C0551a) this.f5386b).f7159a;
                if (abstractC0423a != null) {
                    abstractC0423a.d0();
                    c0880v = C0880v.f8657a;
                } else {
                    c0880v = null;
                }
                if (c0880v == null) {
                    throw new IllegalStateException("Launcher has not been initialized".toString());
                }
                return;
            case 3:
                Iterator it = ((C0560j) this.f5386b).f7022b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0479c) it.next()).cancel();
                }
                return;
            case 4:
                ((C1304p0) this.f5386b).f11120a.c();
                return;
            case AbstractC1166e.f10138f /* 5 */:
                ((C1368v) this.f5386b).f11394d = null;
                return;
            case AbstractC1166e.f10136d /* 6 */:
                ((C1337I) this.f5386b).f11290c = null;
                return;
            case 7:
                C1333E c1333e = (C1333E) this.f5386b;
                int a3 = c1333e.a();
                for (int i2 = 0; i2 < a3; i2++) {
                    c1333e.c();
                }
                return;
            default:
                ((X) this.f5386b).m();
                return;
        }
    }
}
