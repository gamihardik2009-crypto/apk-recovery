package B;

import J.C0257c;
import J.Y;
import J2.InterfaceC0328z;
import M2.O;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f203l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0007h f204m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f205n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003d(C0007h c0007h, z zVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f204m = c0007h;
        this.f205n = zVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0003d) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0003d(this.f204m, this.f205n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f203l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0001b c0001b = C0001b.f197j;
            this.f203l = 1;
            if (C0257c.H(n()).d(new Y(0, c0001b), this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
                throw new J2.r();
            }
            C1.y.J(obj);
        }
        M2.H i3 = this.f204m.i();
        if (i3 == null) {
            return C0880v.f8657a;
        }
        C0002c c0002c = new C0002c(0, this.f205n);
        this.f203l = 2;
        O.m((O) i3, c0002c, this);
        return enumC1145a;
    }
}
