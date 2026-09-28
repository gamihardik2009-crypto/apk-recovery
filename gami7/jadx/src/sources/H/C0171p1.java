package H;

import J2.InterfaceC0328z;
import java.io.Serializable;
import m2.C0880v;
import n2.AbstractC0961m;
import n2.AbstractC0963o;
import n2.C0970v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import s.C1180t;
import s.C1183w;

/* renamed from: H.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171p1 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2992i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2993j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2994k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2995l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2996m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Serializable f2997n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171p1(u.x xVar, int i2, InterfaceC0328z interfaceC0328z, String str, String str2) {
        super(1);
        this.f2994k = xVar;
        this.f2993j = i2;
        this.f2995l = interfaceC0328z;
        this.f2996m = str;
        this.f2997n = str2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        Object v3;
        u.q qVar;
        C0880v c0880v = C0880v.f8657a;
        Object obj2 = this.f2997n;
        int i2 = this.f2993j;
        Object obj3 = this.f2995l;
        Object obj4 = this.f2996m;
        Object obj5 = this.f2994k;
        switch (this.f2992i) {
            case 0:
                A0.k kVar = (A0.k) obj;
                u.x xVar = (u.x) obj5;
                if (xVar.f10796b.f10321b.g() == i2 || ((qVar = (u.q) AbstractC0961m.N(xVar.g().f10747g)) != null && qVar.f10755a == i2)) {
                    float f3 = A1.f1287a;
                    InterfaceC0328z interfaceC0328z = (InterfaceC0328z) obj3;
                    v3 = AbstractC0963o.v(new A0.d((String) obj4, new C0214w1(xVar, interfaceC0328z, 1)), new A0.d((String) obj2, new C0214w1(xVar, interfaceC0328z, 0)));
                } else {
                    v3 = C0970v.f9165h;
                }
                F2.d[] dVarArr = A0.w.f123a;
                A0.x xVar2 = A0.j.f55v;
                F2.d dVar = A0.w.f123a[25];
                xVar2.a(kVar, v3);
                break;
            default:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                AbstractC1103Q[] abstractC1103QArr = (AbstractC1103Q[]) obj5;
                int length = abstractC1103QArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    AbstractC1103Q abstractC1103Q = abstractC1103QArr[i3];
                    int i5 = i4 + 1;
                    z2.h.c(abstractC1103Q);
                    Object p3 = abstractC1103Q.p();
                    s.P p4 = p3 instanceof s.P ? (s.P) p3 : null;
                    O0.k layoutDirection = ((InterfaceC1096J) obj4).getLayoutDirection();
                    C1180t c1180t = (C1180t) obj3;
                    c1180t.getClass();
                    C1183w c1183w = p4 != null ? p4.f10075c : null;
                    AbstractC1102P.d(abstractC1102P, abstractC1103Q, c1183w != null ? c1183w.a(i2 - abstractC1103Q.f9834h, layoutDirection) : c1180t.f10179b.a(0, i2 - abstractC1103Q.f9834h, layoutDirection), ((int[]) obj2)[i4]);
                    i3++;
                    i4 = i5;
                }
                break;
        }
        return c0880v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0171p1(AbstractC1103Q[] abstractC1103QArr, C1180t c1180t, int i2, InterfaceC1096J interfaceC1096J, int[] iArr) {
        super(1);
        this.f2994k = abstractC1103QArr;
        this.f2995l = c1180t;
        this.f2993j = i2;
        this.f2996m = interfaceC1096J;
        this.f2997n = iArr;
    }
}
