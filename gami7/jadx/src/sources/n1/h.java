package n1;

import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9042h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9043i;

    public /* synthetic */ h(int i2, Object obj) {
        this.f9042h = i2;
        this.f9043i = obj;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        switch (this.f9042h) {
            case 0:
                y yVar = (y) this.f9043i;
                z2.h.f(yVar, "this$0");
                yVar.f9132r = enumC0465n.a();
                if (yVar.f9118c != null) {
                    Iterator<E> it = yVar.f9122g.iterator();
                    while (it.hasNext()) {
                        C0945f c0945f = (C0945f) it.next();
                        c0945f.getClass();
                        c0945f.f9030k = enumC0465n.a();
                        c0945f.i();
                    }
                    break;
                }
                break;
            default:
                u1.e eVar = (u1.e) this.f9043i;
                z2.h.f(eVar, "this$0");
                if (enumC0465n != EnumC0465n.ON_START) {
                    if (enumC0465n == EnumC0465n.ON_STOP) {
                        eVar.f11266f = false;
                        break;
                    }
                } else {
                    eVar.f11266f = true;
                    break;
                }
                break;
        }
    }
}
