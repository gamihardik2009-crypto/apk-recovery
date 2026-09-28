package W1;

import J.InterfaceC0258c0;
import M2.d0;
import java.util.Set;
import m2.C0880v;
import n2.AbstractC0961m;

/* renamed from: W1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398t implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6082i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6083j;

    public /* synthetic */ C0398t(Object obj, int i2, Object obj2) {
        this.f6081h = i2;
        this.f6082i = obj;
        this.f6083j = obj2;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6081h) {
            case 0:
                ((InterfaceC0258c0) this.f6083j).setValue((R1.b) this.f6082i);
                break;
            case 1:
                String str = ((U) this.f6083j).f6003b;
                P p3 = (P) this.f6082i;
                p3.getClass();
                z2.h.f(str, "phone");
                d0 d0Var = p3.f5964g;
                Set a02 = AbstractC0961m.a0((Iterable) d0Var.getValue());
                if (a02.contains(str)) {
                    a02.remove(str);
                } else {
                    a02.add(str);
                }
                d0Var.k(a02);
                break;
            default:
                ((InterfaceC0258c0) this.f6083j).setValue((R1.e) this.f6082i);
                break;
        }
        return C0880v.f8657a;
    }
}
