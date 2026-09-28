package l;

import m.InterfaceC0817A;
import m.k0;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788C extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8115i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0789D f8116j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0788C(C0789D c0789d, int i2) {
        super(1);
        this.f8115i = i2;
        this.f8116j = c0789d;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC0817A interfaceC0817A;
        InterfaceC0817A interfaceC0817A2;
        switch (this.f8115i) {
            case 0:
                k0 k0Var = (k0) obj;
                EnumC0812v enumC0812v = EnumC0812v.f8246h;
                EnumC0812v enumC0812v2 = EnumC0812v.f8247i;
                boolean a3 = k0Var.a(enumC0812v, enumC0812v2);
                Object obj2 = null;
                C0789D c0789d = this.f8116j;
                if (a3) {
                    C0810t c0810t = c0789d.f8125y.f8128a.f8169c;
                    if (c0810t != null) {
                        obj2 = c0810t.f8240c;
                    }
                } else if (k0Var.a(enumC0812v2, EnumC0812v.f8248j)) {
                    C0810t c0810t2 = c0789d.f8126z.f8131a.f8169c;
                    if (c0810t2 != null) {
                        obj2 = c0810t2.f8240c;
                    }
                } else {
                    obj2 = z.f8263d;
                }
                return obj2 == null ? z.f8263d : obj2;
            default:
                k0 k0Var2 = (k0) obj;
                EnumC0812v enumC0812v3 = EnumC0812v.f8246h;
                EnumC0812v enumC0812v4 = EnumC0812v.f8247i;
                boolean a4 = k0Var2.a(enumC0812v3, enumC0812v4);
                C0789D c0789d2 = this.f8116j;
                if (a4) {
                    T t3 = c0789d2.f8125y.f8128a.f8168b;
                    return (t3 == null || (interfaceC0817A2 = t3.f8165b) == null) ? z.f8262c : interfaceC0817A2;
                }
                if (!k0Var2.a(enumC0812v4, EnumC0812v.f8248j)) {
                    return z.f8262c;
                }
                T t4 = c0789d2.f8126z.f8131a.f8168b;
                return (t4 == null || (interfaceC0817A = t4.f8165b) == null) ? z.f8262c : interfaceC0817A;
        }
    }
}
