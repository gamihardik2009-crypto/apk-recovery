package N2;

import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class s extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public L2.k f5074l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f5075m;

    /* renamed from: n, reason: collision with root package name */
    public int f5076n;

    /* renamed from: o, reason: collision with root package name */
    public int f5077o;

    /* renamed from: p, reason: collision with root package name */
    public int f5078p;
    public /* synthetic */ Object q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g[] f5079r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.a f5080s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y2.f f5081t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f5082u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC0343g[] interfaceC0343gArr, y2.a aVar, y2.f fVar, InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5079r = interfaceC0343gArr;
        this.f5080s = aVar;
        this.f5081t = fVar;
        this.f5082u = interfaceC0344h;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((s) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        s sVar = new s(this.f5079r, this.f5080s, this.f5081t, this.f5082u, interfaceC1073d);
        sVar.q = obj;
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        r13 = (java.lang.Object[]) r21.f5080s.c();
        r14 = r21.f5082u;
        r15 = r21.f5081t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        if (r13 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f6, code lost:
    
        r21.q = r11;
        r21.f5074l = r12;
        r21.f5075m = r2;
        r21.f5076n = r10;
        r21.f5077o = r9;
        r21.f5078p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0107, code lost:
    
        if (r15.i(r14, r11, r21) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0109, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        n2.AbstractC0959k.s(r11, r13, 0, 0, 14);
        r21.q = r11;
        r21.f5074l = r12;
        r21.f5075m = r2;
        r21.f5076n = r10;
        r21.f5077o = r9;
        r21.f5078p = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
    
        if (r15.i(r14, r13, r21) != r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4 A[LOOP:0: B:18:0x00c4->B:38:?, LOOP_START, PHI: r10 r14
      0x00c4: PHI (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:16:0x00c1, B:38:?] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r14v7 n2.y) = (r14v6 n2.y), (r14v13 n2.y) binds: [B:16:0x00c1, B:38:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0107 -> B:8:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0121 -> B:7:0x0124). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.s.p(java.lang.Object):java.lang.Object");
    }
}
