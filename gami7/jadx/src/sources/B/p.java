package B;

import J2.InterfaceC0328z;
import J2.Z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class p extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f225l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f226m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f227n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Z z3, r rVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f226m = z3;
        this.f227n = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((p) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new p(this.f226m, this.f227n, interfaceC1073d);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:8:0x003a). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r10) {
        /*
            r9 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r9.f225l
            r2 = 0
            r3 = 500(0x1f4, double:2.47E-321)
            r5 = 3
            r6 = 2
            r7 = 1
            B.r r8 = r9.f227n
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L26
            if (r1 == r6) goto L22
            if (r1 != r5) goto L1a
            C1.y.J(r10)     // Catch: java.lang.Throwable -> L18
            goto L3a
        L18:
            r10 = move-exception
            goto L58
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            C1.y.J(r10)     // Catch: java.lang.Throwable -> L18
            goto L4a
        L26:
            C1.y.J(r10)
            goto L3a
        L2a:
            C1.y.J(r10)
            J2.Z r10 = r9.f226m
            if (r10 == 0) goto L3a
            r9.f225l = r7
            java.lang.Object r10 = J2.B.d(r10, r9)
            if (r10 != r0) goto L3a
            return r0
        L3a:
            J.g0 r10 = r8.f231b     // Catch: java.lang.Throwable -> L18
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.h(r1)     // Catch: java.lang.Throwable -> L18
            r9.f225l = r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = J2.B.f(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L4a
            return r0
        L4a:
            J.g0 r10 = r8.f231b     // Catch: java.lang.Throwable -> L18
            r10.h(r2)     // Catch: java.lang.Throwable -> L18
            r9.f225l = r5     // Catch: java.lang.Throwable -> L18
            java.lang.Object r10 = J2.B.f(r3, r9)     // Catch: java.lang.Throwable -> L18
            if (r10 != r0) goto L3a
            return r0
        L58:
            J.g0 r0 = r8.f231b
            r0.h(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: B.p.p(java.lang.Object):java.lang.Object");
    }
}
