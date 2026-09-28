package Y1;

import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class A implements InterfaceC0343g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6238h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f6239i;

    public /* synthetic */ A(InterfaceC0343g interfaceC0343g, int i2) {
        this.f6238h = i2;
        this.f6239i = interfaceC0343g;
    }

    @Override // M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        switch (this.f6238h) {
            case 0:
                Object b3 = this.f6239i.b(new v(interfaceC0344h, 1), interfaceC1073d);
                if (b3 != EnumC1145a.f10026h) {
                    break;
                }
                break;
            case 1:
                Object b4 = this.f6239i.b(new v(interfaceC0344h, 2), interfaceC1073d);
                if (b4 != EnumC1145a.f10026h) {
                    break;
                }
                break;
            case 2:
                Object b5 = this.f6239i.b(new v(interfaceC0344h, 3), interfaceC1073d);
                if (b5 != EnumC1145a.f10026h) {
                    break;
                }
                break;
            default:
                Object b6 = this.f6239i.b(new v(interfaceC0344h, 4), interfaceC1073d);
                if (b6 != EnumC1145a.f10026h) {
                    break;
                }
                break;
        }
        return C0880v.f8657a;
    }
}
