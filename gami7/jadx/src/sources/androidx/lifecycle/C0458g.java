package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import s.AbstractC1166e;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458g implements r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6894h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6895i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6896j;

    public C0458g(InterfaceC0456e interfaceC0456e, r rVar) {
        z2.h.f(interfaceC0456e, "defaultLifecycleObserver");
        this.f6895i = interfaceC0456e;
        this.f6896j = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        switch (this.f6894h) {
            case 0:
                int i2 = AbstractC0457f.f6893a[enumC0465n.ordinal()];
                InterfaceC0456e interfaceC0456e = (InterfaceC0456e) this.f6895i;
                switch (i2) {
                    case 1:
                        interfaceC0456e.getClass();
                        break;
                    case 2:
                        interfaceC0456e.f(interfaceC0470t);
                        break;
                    case 3:
                        interfaceC0456e.b(interfaceC0470t);
                        break;
                    case 4:
                        interfaceC0456e.getClass();
                        break;
                    case AbstractC1166e.f10138f /* 5 */:
                        interfaceC0456e.e(interfaceC0470t);
                        break;
                    case AbstractC1166e.f10136d /* 6 */:
                        interfaceC0456e.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f6896j;
                if (rVar != null) {
                    rVar.d(interfaceC0470t, enumC0465n);
                    return;
                }
                return;
            case 1:
                if (enumC0465n == EnumC0465n.ON_START) {
                    ((C0472v) this.f6895i).f(this);
                    ((u1.e) this.f6896j).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0453b) this.f6896j).f6880a;
                List list = (List) hashMap.get(enumC0465n);
                Object obj = this.f6895i;
                C0453b.a(list, interfaceC0470t, enumC0465n, obj);
                C0453b.a((List) hashMap.get(EnumC0465n.ON_ANY), interfaceC0470t, enumC0465n, obj);
                return;
        }
    }

    public C0458g(Object obj) {
        this.f6895i = obj;
        C0455d c0455d = C0455d.f6885c;
        Class<?> cls = obj.getClass();
        C0453b c0453b = (C0453b) c0455d.f6886a.get(cls);
        this.f6896j = c0453b == null ? c0455d.a(cls, null) : c0453b;
    }

    public C0458g(C0472v c0472v, u1.e eVar) {
        this.f6895i = c0472v;
        this.f6896j = eVar;
    }
}
