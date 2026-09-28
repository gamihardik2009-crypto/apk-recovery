package H;

import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* renamed from: H.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179q2 implements InterfaceC0343g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f3035i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3036j;

    public /* synthetic */ C0179q2(InterfaceC0343g interfaceC0343g, Object obj, int i2) {
        this.f3034h = i2;
        this.f3035i = interfaceC0343g;
        this.f3036j = obj;
    }

    @Override // M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        switch (this.f3034h) {
            case 0:
                Object b3 = this.f3035i.b(new D.J(interfaceC0344h, 3, (C0185r2) this.f3036j), interfaceC1073d);
                if (b3 != EnumC1145a.f10026h) {
                    break;
                }
                break;
            default:
                Object b4 = this.f3035i.b(new Q1(new z2.o(), interfaceC0344h, (y2.e) this.f3036j, 2), interfaceC1073d);
                if (b4 != EnumC1145a.f10026h) {
                    break;
                }
                break;
        }
        return C0880v.f8657a;
    }
}
