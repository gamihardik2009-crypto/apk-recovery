package W1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class L extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public Object f5945l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5946m;

    /* renamed from: n, reason: collision with root package name */
    public z2.q f5947n;

    /* renamed from: o, reason: collision with root package name */
    public int f5948o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P f5949p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(P p3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5949p = p3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((L) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new L(this.f5949p, interfaceC1073d);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013e A[RETURN] */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.L.p(java.lang.Object):java.lang.Object");
    }
}
