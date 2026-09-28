package p;

import m2.C0880v;
import n0.C0918A;
import q2.InterfaceC1073d;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class E0 extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public long f9408j;

    /* renamed from: k, reason: collision with root package name */
    public int f9409k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.r f9411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(n0.r rVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9411m = rVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((E0) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        E0 e02 = new E0(this.f9411m, interfaceC1073d);
        e02.f9410l = obj;
        return e02;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // s2.AbstractC1196a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            r2.a r0 = r2.EnumC1145a.f10026h
            int r1 = r7.f9409k
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f9408j
            java.lang.Object r1 = r7.f9410l
            n0.A r1 = (n0.C0918A) r1
            C1.y.J(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            C1.y.J(r8)
            java.lang.Object r8 = r7.f9410l
            n0.A r8 = (n0.C0918A) r8
            n0.r r1 = r7.f9411m
            long r3 = r1.f8958b
            u0.V0 r1 = r8.f()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f9410l = r1
            r7.f9408j = r3
            r7.f9409k = r2
            r8 = 3
            java.lang.Object r8 = p.b1.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            n0.r r8 = (n0.r) r8
            long r5 = r8.f8958b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.E0.p(java.lang.Object):java.lang.Object");
    }
}
