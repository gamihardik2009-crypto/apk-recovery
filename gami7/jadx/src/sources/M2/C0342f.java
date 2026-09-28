package M2;

import H.Q1;
import N2.AbstractC0364c;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;

/* renamed from: M2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342f implements InterfaceC0343g {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0343g f4880h;

    /* renamed from: i, reason: collision with root package name */
    public final y2.c f4881i;

    /* renamed from: j, reason: collision with root package name */
    public final y2.e f4882j;

    public C0342f(InterfaceC0343g interfaceC0343g) {
        C0353q c0353q = C0353q.f4913i;
        C0352p c0352p = C0352p.f4912i;
        this.f4880h = interfaceC0343g;
        this.f4881i = c0353q;
        this.f4882j = c0352p;
    }

    @Override // M2.InterfaceC0343g
    public final Object b(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        z2.s sVar = new z2.s();
        sVar.f11909h = AbstractC0364c.f5033b;
        Object b3 = this.f4880h.b(new Q1(this, sVar, interfaceC0344h, 1), interfaceC1073d);
        return b3 == EnumC1145a.f10026h ? b3 : C0880v.f8657a;
    }
}
