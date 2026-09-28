package j;

import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* renamed from: j.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770z extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public G2.e f8071j;

    /* renamed from: k, reason: collision with root package name */
    public C0736B f8072k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f8073l;

    /* renamed from: m, reason: collision with root package name */
    public int f8074m;

    /* renamed from: n, reason: collision with root package name */
    public int f8075n;

    /* renamed from: o, reason: collision with root package name */
    public int f8076o;

    /* renamed from: p, reason: collision with root package name */
    public int f8077p;
    public long q;

    /* renamed from: r, reason: collision with root package name */
    public int f8078r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f8079s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0736B f8080t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G2.e f8081u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770z(C0736B c0736b, G2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8080t = c0736b;
        this.f8081u = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0770z) m((G2.h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0770z c0770z = new C0770z(this.f8080t, this.f8081u, interfaceC1073d);
        c0770z.f8079s = obj;
        return c0770z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0091). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.f8078r
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            int r2 = r0.f8077p
            int r6 = r0.f8076o
            long r7 = r0.q
            int r9 = r0.f8075n
            int r10 = r0.f8074m
            long[] r11 = r0.f8073l
            j.B r12 = r0.f8072k
            G2.e r13 = r0.f8071j
            java.lang.Object r14 = r0.f8079s
            G2.h r14 = (G2.h) r14
            C1.y.J(r22)
            goto L91
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            C1.y.J(r22)
            java.lang.Object r2 = r0.f8079s
            G2.h r2 = (G2.h) r2
            j.B r6 = r0.f8080t
            long[] r7 = r6.f7964a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La1
            G2.e r9 = r0.f8081u
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L94
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L91
            int r4 = r9 << 3
            int r4 = r4 + r2
            r13.f1258i = r4
            java.lang.Object[] r5 = r12.f7965b
            r4 = r5[r4]
            r0.f8079s = r14
            r0.f8071j = r13
            r0.f8072k = r12
            r0.f8073l = r11
            r0.f8074m = r10
            r0.f8075n = r9
            r0.q = r7
            r0.f8076o = r6
            r0.f8077p = r2
            r0.f8078r = r3
            r14.e(r4, r0)
            return r1
        L91:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L65
        L94:
            if (r6 != r5) goto La1
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        L9c:
            if (r10 == r8) goto La1
            int r10 = r10 + 1
            goto L42
        La1:
            m2.v r1 = m2.C0880v.f8657a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0770z.p(java.lang.Object):java.lang.Object");
    }
}
