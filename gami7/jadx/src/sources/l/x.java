package l;

import m.InterfaceC0817A;
import m.k0;

/* loaded from: classes.dex */
public final class x extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8256i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0790E f8257j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0791F f8258k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(C0790E c0790e, C0791F c0791f, int i2) {
        super(1);
        this.f8256i = i2;
        this.f8257j = c0790e;
        this.f8258k = c0791f;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        InterfaceC0817A interfaceC0817A;
        InterfaceC0817A interfaceC0817A2;
        InterfaceC0817A interfaceC0817A3;
        InterfaceC0817A interfaceC0817A4;
        switch (this.f8256i) {
            case 0:
                k0 k0Var = (k0) obj;
                EnumC0812v enumC0812v = EnumC0812v.f8246h;
                EnumC0812v enumC0812v2 = EnumC0812v.f8247i;
                if (k0Var.a(enumC0812v, enumC0812v2)) {
                    G g3 = this.f8257j.f8128a.f8167a;
                    return (g3 == null || (interfaceC0817A2 = g3.f8133b) == null) ? z.f8261b : interfaceC0817A2;
                }
                if (!k0Var.a(enumC0812v2, EnumC0812v.f8248j)) {
                    return z.f8261b;
                }
                G g4 = this.f8258k.f8131a.f8167a;
                return (g4 == null || (interfaceC0817A = g4.f8133b) == null) ? z.f8261b : interfaceC0817A;
            case 1:
                int ordinal = ((EnumC0812v) obj).ordinal();
                float f3 = 1.0f;
                if (ordinal == 0) {
                    G g5 = this.f8257j.f8128a.f8167a;
                    if (g5 != null) {
                        f3 = g5.f8132a;
                    }
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new J2.r();
                    }
                    G g6 = this.f8258k.f8131a.f8167a;
                    if (g6 != null) {
                        f3 = g6.f8132a;
                    }
                }
                return Float.valueOf(f3);
            case 2:
                k0 k0Var2 = (k0) obj;
                EnumC0812v enumC0812v3 = EnumC0812v.f8246h;
                EnumC0812v enumC0812v4 = EnumC0812v.f8247i;
                if (k0Var2.a(enumC0812v3, enumC0812v4)) {
                    L l3 = this.f8257j.f8128a.f8170d;
                    return (l3 == null || (interfaceC0817A4 = l3.f8142c) == null) ? z.f8261b : interfaceC0817A4;
                }
                if (!k0Var2.a(enumC0812v4, EnumC0812v.f8248j)) {
                    return z.f8261b;
                }
                L l4 = this.f8258k.f8131a.f8170d;
                return (l4 == null || (interfaceC0817A3 = l4.f8142c) == null) ? z.f8261b : interfaceC0817A3;
            default:
                int ordinal2 = ((EnumC0812v) obj).ordinal();
                float f4 = 1.0f;
                if (ordinal2 == 0) {
                    L l5 = this.f8257j.f8128a.f8170d;
                    if (l5 != null) {
                        f4 = l5.f8140a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new J2.r();
                    }
                    L l6 = this.f8258k.f8131a.f8170d;
                    if (l6 != null) {
                        f4 = l6.f8140a;
                    }
                }
                return Float.valueOf(f4);
        }
    }
}
