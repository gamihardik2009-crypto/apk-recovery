package n;

import m2.C0880v;
import p.C1006a0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913v extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public int f8860l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ C1006a0 f8861m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ long f8862n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0914w f8863o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0913v(C0914w c0914w, InterfaceC1073d interfaceC1073d) {
        super(3, interfaceC1073d);
        this.f8863o = c0914w;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        long j3 = ((b0.c) obj2).f7058a;
        C0913v c0913v = new C0913v(this.f8863o, (InterfaceC1073d) obj3);
        c0913v.f8861m = (C1006a0) obj;
        c0913v.f8862n = j3;
        return c0913v.p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        Object obj2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8860l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            C1006a0 c1006a0 = this.f8861m;
            long j3 = this.f8862n;
            C0914w c0914w = this.f8863o;
            if (c0914w.f8867A) {
                this.f8860l = 1;
                r.l lVar = c0914w.f8878w;
                if (lVar == null || (obj2 = J2.B.e(new C0896d(c1006a0, j3, lVar, c0914w, null), this)) != enumC1145a) {
                    obj2 = c0880v;
                }
                if (obj2 == enumC1145a) {
                    return enumC1145a;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
