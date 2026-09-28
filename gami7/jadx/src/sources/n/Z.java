package n;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class Z extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8723l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f8724m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8724m = a0Var;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Z) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new Z(this.f8724m, interfaceC1073d);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:6:0x004b). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r7.f8723l
            r2 = 2
            r3 = 1
            n.a0 r4 = r7.f8724m
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            C1.y.J(r8)
            goto L4b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            C1.y.J(r8)
            goto L2e
        L1e:
            C1.y.J(r8)
        L21:
            L2.g r8 = r4.f8737L
            if (r8 == 0) goto L2e
            r7.f8723l = r3
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto L2e
            return r0
        L2e:
            n.k0 r8 = r4.f8732G
            if (r8 == 0) goto L21
            n.q r8 = n.C0909q.f8828k
            r7.f8723l = r2
            q2.i r1 = r7.n()
            J.X r1 = J.C0257c.H(r1)
            J.Y r5 = new J.Y
            r6 = 0
            r5.<init>(r6, r8)
            java.lang.Object r8 = r1.d(r5, r7)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            n.k0 r8 = r4.f8732G
            if (r8 == 0) goto L21
            n.m0 r8 = (n.m0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: n.Z.p(java.lang.Object):java.lang.Object");
    }
}
