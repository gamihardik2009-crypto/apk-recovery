package L;

import G2.h;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class e extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public Object[] f4621j;

    /* renamed from: k, reason: collision with root package name */
    public long[] f4622k;

    /* renamed from: l, reason: collision with root package name */
    public int f4623l;

    /* renamed from: m, reason: collision with root package name */
    public int f4624m;

    /* renamed from: n, reason: collision with root package name */
    public int f4625n;

    /* renamed from: o, reason: collision with root package name */
    public int f4626o;

    /* renamed from: p, reason: collision with root package name */
    public long f4627p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4628r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f4629s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4629s = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((e) m((h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        e eVar = new e(this.f4629s, interfaceC1073d);
        eVar.f4628r = obj;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r2.a r1 = r2.EnumC1145a.f10026h
            int r2 = r0.q
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            int r2 = r0.f4626o
            int r6 = r0.f4625n
            long r7 = r0.f4627p
            int r9 = r0.f4624m
            int r10 = r0.f4623l
            long[] r11 = r0.f4622k
            java.lang.Object[] r12 = r0.f4621j
            java.lang.Object r13 = r0.f4628r
            G2.h r13 = (G2.h) r13
            C1.y.J(r21)
            goto L88
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            C1.y.J(r21)
            java.lang.Object r2 = r0.f4628r
            G2.h r2 = (G2.h) r2
            L.f r6 = r0.f4629s
            j.B r6 = r6.f4630h
            java.lang.Object[] r7 = r6.f7965b
            long[] r6 = r6.f7964a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L96
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L91
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r2 >= r6) goto L8b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L88
            int r4 = r9 << 3
            int r4 = r4 + r2
            r4 = r12[r4]
            r0.f4628r = r13
            r0.f4621j = r12
            r0.f4622k = r11
            r0.f4623l = r10
            r0.f4624m = r9
            r0.f4627p = r7
            r0.f4625n = r6
            r0.f4626o = r2
            r0.q = r3
            r13.e(r4, r0)
            return r1
        L88:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L62
        L8b:
            if (r6 != r5) goto L96
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L91:
            if (r9 == r8) goto L96
            int r9 = r9 + 1
            goto L41
        L96:
            m2.v r1 = m2.C0880v.f8657a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L.e.p(java.lang.Object):java.lang.Object");
    }
}
