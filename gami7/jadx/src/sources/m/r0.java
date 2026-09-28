package m;

import J.InterfaceC0258c0;
import J.W0;
import android.content.Context;
import android.view.View;
import b1.AbstractC0535l;
import b1.AbstractC0542s;
import java.util.Iterator;
import java.util.List;
import n1.C0945f;
import s.AbstractC1166e;
import v.C1346S;

/* loaded from: classes.dex */
public final class r0 implements J.H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8570c;

    public /* synthetic */ r0(Object obj, int i2, Object obj2) {
        this.f8568a = i2;
        this.f8569b = obj;
        this.f8570c = obj2;
    }

    @Override // J.H
    public final void a() {
        m0 m0Var;
        Object obj = this.f8570c;
        Object obj2 = this.f8569b;
        switch (this.f8568a) {
            case 0:
                ((p0) obj2).f8556j.remove((p0) obj);
                break;
            case 1:
                p0 p0Var = (p0) obj2;
                p0Var.getClass();
                i0 i0Var = (i0) ((j0) obj).f8504b.getValue();
                if (i0Var != null && (m0Var = i0Var.f8498h) != null) {
                    p0Var.f8555i.remove(m0Var);
                    break;
                }
                break;
            case 2:
                ((p0) obj2).f8555i.remove((m0) obj);
                break;
            case 3:
                ((C0945f) obj2).f9034o.f((androidx.lifecycle.r) obj);
                break;
            case 4:
                Iterator it = ((List) ((W0) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((o1.i) obj).b().b((C0945f) it.next());
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                s.Z z3 = (s.Z) obj2;
                int i2 = z3.f10109s - 1;
                z3.f10109s = i2;
                if (i2 == 0) {
                    int i3 = AbstractC0542s.f7132a;
                    View view = (View) obj;
                    AbstractC0535l.u(view, null);
                    AbstractC0542s.a(view, null);
                    view.removeOnAttachStateChangeListener(z3.f10110t);
                    break;
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u0.P) obj);
                break;
            case 7:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((u0.Q) obj);
                break;
            case 8:
                ((C1346S) obj2).f11313c.add(obj);
                break;
            default:
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) obj2;
                r.n nVar = (r.n) interfaceC0258c0.getValue();
                if (nVar != null) {
                    r.m mVar = new r.m(nVar);
                    r.l lVar = (r.l) obj;
                    if (lVar != null) {
                        lVar.c(mVar);
                    }
                    interfaceC0258c0.setValue(null);
                    break;
                }
                break;
        }
    }
}
