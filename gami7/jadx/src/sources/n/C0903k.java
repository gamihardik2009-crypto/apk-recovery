package n;

import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903k extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f8797j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8798k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0905m f8799l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0903k(C0905m c0905m, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8799l = c0905m;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0903k) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0903k c0903k = new C0903k(this.f8799l, interfaceC1073d);
        c0903k.f8798k = obj;
        return c0903k;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r14) {
        /*
            r13 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r13.f8797j
            r2 = 2
            r3 = 1
            n.m r4 = r13.f8799l
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r13.f8798k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r14)
            goto L5a
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            java.lang.Object r1 = r13.f8798k
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r14)
            goto L39
        L26:
            C1.y.J(r14)
            java.lang.Object r14 = r13.f8798k
            r1 = r14
            n0.A r1 = (n0.C0918A) r1
            r13.f8798k = r1
            r13.f8797j = r3
            java.lang.Object r14 = p.b1.c(r1, r13, r2)
            if (r14 != r0) goto L39
            return r0
        L39:
            n0.r r14 = (n0.r) r14
            long r5 = r14.f8957a
            n0.q r7 = new n0.q
            r7.<init>(r5)
            r4.f8809n = r7
            b0.c r5 = new b0.c
            long r6 = r14.f8959c
            r5.<init>(r6)
            r4.f8803h = r5
        L4d:
            r13.f8798k = r1
            r13.f8797j = r2
            n0.j r14 = n0.EnumC0931j.f8947i
            java.lang.Object r14 = r1.a(r14, r13)
            if (r14 != r0) goto L5a
            return r0
        L5a:
            n0.i r14 = (n0.C0930i) r14
            java.util.List r14 = r14.f8943a
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r14.size()
            r5.<init>(r6)
            int r6 = r14.size()
            r7 = 0
            r8 = r7
        L6d:
            if (r8 >= r6) goto L80
            java.lang.Object r9 = r14.get(r8)
            r10 = r9
            n0.r r10 = (n0.r) r10
            boolean r10 = r10.f8960d
            if (r10 == 0) goto L7d
            r5.add(r9)
        L7d:
            int r8 = r8 + 1
            goto L6d
        L80:
            int r14 = r5.size()
        L84:
            r6 = 0
            if (r7 >= r14) goto La0
            java.lang.Object r8 = r5.get(r7)
            r9 = r8
            n0.r r9 = (n0.r) r9
            long r9 = r9.f8957a
            n0.q r11 = r4.f8809n
            boolean r12 = r11 instanceof n0.q
            if (r12 != 0) goto L97
            goto L9d
        L97:
            long r11 = r11.f8956a
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto La1
        L9d:
            int r7 = r7 + 1
            goto L84
        La0:
            r8 = r6
        La1:
            n0.r r8 = (n0.r) r8
            if (r8 != 0) goto Lac
            java.lang.Object r14 = n2.AbstractC0961m.H(r5)
            r8 = r14
            n0.r r8 = (n0.r) r8
        Lac:
            if (r8 == 0) goto Lc0
            n0.q r14 = new n0.q
            long r9 = r8.f8957a
            r14.<init>(r9)
            r4.f8809n = r14
            b0.c r14 = new b0.c
            long r7 = r8.f8959c
            r14.<init>(r7)
            r4.f8803h = r14
        Lc0:
            boolean r14 = r5.isEmpty()
            r14 = r14 ^ r3
            if (r14 != 0) goto L4d
            r4.f8809n = r6
            m2.v r14 = m2.C0880v.f8657a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0903k.p(java.lang.Object):java.lang.Object");
    }
}
