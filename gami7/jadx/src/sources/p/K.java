package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class K extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public z2.s f9443l;

    /* renamed from: m, reason: collision with root package name */
    public int f9444m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f9445n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z2.s f9446o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ M f9447p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(z2.s sVar, M m3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9446o = sVar;
        this.f9447p = m3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((K) m((y2.c) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        K k3 = new K(this.f9446o, this.f9447p, interfaceC1073d);
        k3.f9445n = obj;
        return k3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r6.f9444m
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            z2.s r1 = r6.f9443l
            java.lang.Object r3 = r6.f9445n
            y2.c r3 = (y2.c) r3
            C1.y.J(r7)
            goto L50
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            C1.y.J(r7)
            java.lang.Object r7 = r6.f9445n
            y2.c r7 = (y2.c) r7
            r3 = r7
        L23:
            z2.s r1 = r6.f9446o
            java.lang.Object r7 = r1.f11909h
            boolean r4 = r7 instanceof p.C1046v
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof p.C1040s
            if (r4 != 0) goto L56
            boolean r4 = r7 instanceof p.C1042t
            r5 = 0
            if (r4 == 0) goto L37
            p.t r7 = (p.C1042t) r7
            goto L38
        L37:
            r7 = r5
        L38:
            if (r7 == 0) goto L3d
            r3.l(r7)
        L3d:
            p.M r7 = r6.f9447p
            L2.k r7 = r7.f9464A
            if (r7 == 0) goto L53
            r6.f9445n = r3
            r6.f9443l = r1
            r6.f9444m = r2
            java.lang.Object r7 = r7.c(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = r7
            p.w r5 = (p.AbstractC1048w) r5
        L53:
            r1.f11909h = r5
            goto L23
        L56:
            m2.v r7 = m2.C0880v.f8657a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.K.p(java.lang.Object):java.lang.Object");
    }
}
