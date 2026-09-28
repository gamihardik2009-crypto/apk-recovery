package B;

import H.A1;
import H.T0;
import J.InterfaceC0258c0;
import J.W0;
import J2.InterfaceC0328z;
import R0.C0371a;
import android.os.Build;
import android.os.Bundle;
import b.C0487k;
import c.C0551a;
import c0.AbstractC0598q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import m2.C0880v;
import n1.C0945f;
import n2.C0970v;
import t.C1228w;
import t0.AbstractC1248f;
import t0.C1238G;
import u0.AbstractC1296l0;
import u0.V0;
import z.S;
import z.c0;
import z.p0;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f191i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f192j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f194l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f195m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f196n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0000a(r rVar, I0.s sVar, I0.z zVar, S s3, AbstractC0598q abstractC0598q) {
        super(1);
        this.f191i = 5;
        this.f193k = rVar;
        this.f194l = sVar;
        this.f192j = zVar;
        this.f195m = s3;
        this.f196n = abstractC0598q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.Parcelable, java.lang.Object] */
    @Override // y2.c
    public final Object l(Object obj) {
        Object obj2;
        List list;
        C0.H h2;
        C0880v c0880v = C0880v.f8657a;
        Object obj3 = this.f196n;
        Object obj4 = this.f195m;
        Object obj5 = this.f194l;
        Object obj6 = this.f192j;
        Object obj7 = this.f193k;
        switch (this.f191i) {
            case 0:
                G g3 = (G) obj;
                B b3 = ((C0007h) obj7).f217a;
                g3.f173h = (I0.z) obj6;
                g3.f174i = (I0.m) obj5;
                g3.f168c = (y2.c) obj4;
                g3.f169d = (y2.c) obj3;
                g3.f170e = b3 != null ? b3.f143v : null;
                g3.f171f = b3 != null ? b3.f144w : null;
                g3.f172g = b3 != null ? (V0) AbstractC1248f.i(b3, AbstractC1296l0.q) : null;
                return c0880v;
            case 1:
                int intValue = ((Number) obj).intValue();
                float f3 = A1.f1287a;
                ((InterfaceC0258c0) obj7).setValue(Boolean.valueOf(!((Boolean) r10.getValue()).booleanValue()));
                J2.B.r((InterfaceC0328z) obj6, null, 0, new T0((C1228w) obj5, intValue, (E2.d) obj4, (H.K) obj3, null), 3);
                return c0880v;
            case 2:
                R0.x xVar = (R0.x) obj6;
                xVar.f5460u.addView(xVar, xVar.f5461v);
                xVar.i((y2.a) obj7, (R0.B) obj5, (String) obj4, (O0.k) obj3);
                return new C0371a(1, xVar);
            case 3:
                C1.q qVar = new C1.q((W0) obj3);
                C0487k c0487k = (C0487k) obj7;
                c0487k.getClass();
                String str = (String) obj5;
                z2.h.f(str, "key");
                B1.C c3 = (B1.C) obj4;
                z2.h.f(c3, "contract");
                LinkedHashMap linkedHashMap = c0487k.f6991b;
                if (((Integer) linkedHashMap.get(str)) == null) {
                    e.c cVar = e.c.f7539i;
                    G2.g fVar = new G2.f(cVar, new A0.v(cVar, 2), 0);
                    if (!(fVar instanceof G2.a)) {
                        fVar = new G2.a(fVar);
                    }
                    Iterator it = ((G2.a) fVar).iterator();
                    while (it.hasNext()) {
                        Number number = (Number) it.next();
                        int intValue2 = number.intValue();
                        LinkedHashMap linkedHashMap2 = c0487k.f6990a;
                        if (!linkedHashMap2.containsKey(Integer.valueOf(intValue2))) {
                            int intValue3 = number.intValue();
                            linkedHashMap2.put(Integer.valueOf(intValue3), str);
                            linkedHashMap.put(str, Integer.valueOf(intValue3));
                        }
                    }
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                c0487k.f6994e.put(str, new e.b(qVar, c3));
                LinkedHashMap linkedHashMap3 = c0487k.f6995f;
                boolean containsKey = linkedHashMap3.containsKey(str);
                W0 w02 = (W0) qVar.f677h;
                if (containsKey) {
                    Object obj8 = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    ((y2.c) w02.getValue()).l(obj8);
                }
                int i2 = Build.VERSION.SDK_INT;
                Bundle bundle = c0487k.f6996g;
                if (i2 >= 34) {
                    obj2 = Y0.b.a(bundle, str, e.a.class);
                } else {
                    ?? parcelable = bundle.getParcelable(str);
                    obj2 = e.a.class.isInstance(parcelable) ? parcelable : null;
                }
                e.a aVar = (e.a) obj2;
                if (aVar != null) {
                    bundle.remove(str);
                    ((y2.c) w02.getValue()).l(c3.g0(aVar.f7536i, aVar.f7535h));
                }
                C0551a c0551a = (C0551a) obj6;
                c0551a.f7159a = new e.d(c0487k, str, c3);
                return new C0371a(2, c0551a);
            case 4:
                C0945f c0945f = (C0945f) obj;
                z2.h.f(c0945f, "entry");
                ((z2.o) obj6).f11905h = true;
                List list2 = (List) obj7;
                int indexOf = list2.indexOf(c0945f);
                if (indexOf != -1) {
                    z2.q qVar2 = (z2.q) obj5;
                    int i3 = indexOf + 1;
                    list = list2.subList(qVar2.f11907h, i3);
                    qVar2.f11907h = i3;
                } else {
                    list = C0970v.f9165h;
                }
                ((n1.y) obj4).a(c0945f.f9028i, (Bundle) obj3, c0945f, list);
                return c0880v;
            default:
                C1238G c1238g = (C1238G) obj;
                c1238g.a();
                float g4 = ((r) obj7).f231b.g();
                if (g4 != 0.0f) {
                    long j3 = ((I0.z) obj6).f3933b;
                    int i4 = C0.J.f472c;
                    int l3 = ((I0.s) obj5).l((int) (j3 >> 32));
                    p0 d3 = ((S) obj4).d();
                    b0.d dVar = (d3 == null || (h2 = d3.f11788a) == null) ? new b0.d(0.0f, 0.0f, 0.0f, 0.0f) : h2.c(l3);
                    float P2 = c1238g.P(c0.f11628a);
                    float f4 = P2 / 2;
                    float x2 = B1.C.x(B1.C.z(dVar.f7060a + f4, b0.f.d(c1238g.f10415h.e()) - f4), f4);
                    c1238g.o((AbstractC0598q) obj3, K1.f.e(x2, dVar.f7061b), K1.f.e(x2, dVar.f7063d), P2, 0, (r20 & 64) != 0 ? 1.0f : g4, null, 3);
                }
                return c0880v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0000a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        super(1);
        this.f191i = i2;
        this.f192j = obj;
        this.f193k = obj2;
        this.f194l = obj3;
        this.f195m = obj4;
        this.f196n = obj5;
    }
}
