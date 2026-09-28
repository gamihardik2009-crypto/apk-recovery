package M2;

import a.AbstractC0423a;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* loaded from: classes.dex */
public final class F implements InterfaceC0343g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4806h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4807i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.f f4808j;

    public F(InterfaceC0343g interfaceC0343g, InterfaceC0343g interfaceC0343g2, y2.f fVar) {
        this.f4806h = interfaceC0343g;
        this.f4807i = interfaceC0343g2;
        this.f4808j = fVar;
    }

    @Override // M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        N2.s sVar = new N2.s(new InterfaceC0343g[]{this.f4806h, this.f4807i}, G.f4809i, new C0357v(this.f4808j, null, 1), interfaceC0344h, null);
        N2.u uVar = new N2.u(interfaceC1073d, interfaceC1073d.n());
        Object b02 = AbstractC0423a.b0(uVar, uVar, sVar);
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        C0880v c0880v = C0880v.f8657a;
        if (b02 != enumC1145a) {
            b02 = c0880v;
        }
        return b02 == enumC1145a ? b02 : c0880v;
    }
}
