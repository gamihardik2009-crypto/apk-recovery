package D0;

import J.O;
import java.util.Comparator;
import m2.C0865g;
import t0.C1236E;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f987a;

    public /* synthetic */ r(int i2) {
        this.f987a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f987a) {
            case 0:
                C0865g c0865g = (C0865g) obj;
                C0865g c0865g2 = (C0865g) obj2;
                return (((Number) c0865g.f8647i).intValue() - ((Number) c0865g.f8646h).intValue()) - (((Number) c0865g2.f8647i).intValue() - ((Number) c0865g2.f8646h).intValue());
            case 1:
                return z2.h.g(((O) obj).f4060b, ((O) obj2).f4060b);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b3 = bArr[i2];
                    byte b4 = bArr2[i2];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 3:
                C1236E c1236e = (C1236E) obj;
                C1236E c1236e2 = (C1236E) obj2;
                float f3 = c1236e.f10379D.f10480r.f10442G;
                float f4 = c1236e2.f10379D.f10480r.f10442G;
                return f3 == f4 ? z2.h.g(c1236e.t(), c1236e2.t()) : Float.compare(f3, f4);
            default:
                A0.q qVar = (A0.q) obj2;
                A0.k kVar = ((A0.q) obj).f72d;
                A0.x xVar = A0.t.f108n;
                Object obj3 = kVar.f60h.get(xVar);
                if (obj3 == null) {
                    obj3 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = qVar.f72d.f60h.get(xVar);
                if (obj4 == null) {
                    obj4 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) obj4).floatValue())).intValue();
        }
    }
}
