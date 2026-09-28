package m;

import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class s0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public S2.d f8571l;

    /* renamed from: m, reason: collision with root package name */
    public G.s f8572m;

    /* renamed from: n, reason: collision with root package name */
    public int f8573n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G.s f8574o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(G.s sVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8574o = sVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((s0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new s0(this.f8574o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        S2.d dVar;
        G.s sVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8573n;
        if (i2 == 0) {
            C1.y.J(obj);
            G.s sVar2 = this.f8574o;
            W w2 = (W) sVar2;
            w2.getClass();
            ((T.w) v0.f8587a.getValue()).c(w2, g0.f8473l, w2.f8377n);
            dVar = w2.q;
            this.f8571l = dVar;
            this.f8572m = sVar2;
            this.f8573n = 1;
            if (dVar.c(null, this) == enumC1145a) {
                return enumC1145a;
            }
            sVar = sVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = this.f8572m;
            dVar = this.f8571l;
            C1.y.J(obj);
        }
        try {
            ((W) sVar).f8374k = sVar.h();
            InterfaceC0310g interfaceC0310g = ((W) sVar).f8379p;
            if (interfaceC0310g != null) {
                interfaceC0310g.t(sVar.h());
            }
            ((W) sVar).f8379p = null;
            dVar.d(null);
            return C0880v.f8657a;
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
    }
}
