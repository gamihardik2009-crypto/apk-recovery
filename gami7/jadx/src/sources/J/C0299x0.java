package J;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* renamed from: J.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299x0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public C1.q f4282l;

    /* renamed from: m, reason: collision with root package name */
    public int f4283m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4284n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0303z0 f4285o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.f f4286p;
    public final /* synthetic */ X q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299x0(C0303z0 c0303z0, y2.f fVar, X x2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4285o = c0303z0;
        this.f4286p = fVar;
        this.q = x2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0299x0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0299x0 c0299x0 = new C0299x0(this.f4285o, this.f4286p, this.q, interfaceC1073d);
        c0299x0.f4284n = obj;
        return c0299x0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0299x0.p(java.lang.Object):java.lang.Object");
    }
}
