package j1;

import C1.y;
import J.C0284p0;
import J.Q0;
import J2.B;
import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import m2.C0880v;
import q2.C1079j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import z2.h;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774b extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1078i f8087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f8088n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0284p0 f8089o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0774b(InterfaceC1078i interfaceC1078i, InterfaceC0343g interfaceC0343g, C0284p0 c0284p0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8087m = interfaceC1078i;
        this.f8088n = interfaceC0343g;
        this.f8089o = c0284p0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0774b) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0774b(this.f8087m, this.f8088n, this.f8089o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8086l;
        if (i2 == 0) {
            y.J(obj);
            C1079j c1079j = C1079j.f9784h;
            InterfaceC1078i interfaceC1078i = this.f8087m;
            boolean a3 = h.a(interfaceC1078i, c1079j);
            C0284p0 c0284p0 = this.f8089o;
            InterfaceC0343g interfaceC0343g = this.f8088n;
            if (a3) {
                Q0 q0 = new Q0(c0284p0, 2);
                this.f8086l = 1;
                if (interfaceC0343g.b(q0, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                C0773a c0773a = new C0773a(interfaceC0343g, c0284p0, null);
                this.f8086l = 2;
                if (B.z(interfaceC1078i, c0773a, this) == enumC1145a) {
                    return enumC1145a;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return C0880v.f8657a;
    }
}
