package Y1;

import J.C0285q;
import a.AbstractC0423a;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import m2.C0880v;

/* loaded from: classes.dex */
public final class m extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6323i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f6324j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, List list) {
        super(4);
        this.f6323i = i2;
        this.f6324j = list;
    }

    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        String str;
        int i3;
        int i4;
        switch (this.f6323i) {
            case 0:
                androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
                int intValue = ((Number) obj2).intValue();
                C0285q c0285q = (C0285q) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (c0285q.g(aVar) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= c0285q.e(intValue) ? 32 : 16;
                }
                if ((i2 & 147) == 146 && c0285q.A()) {
                    c0285q.P();
                } else {
                    R1.g gVar = (R1.g) this.f6324j.get(intValue);
                    c0285q.U(796885159);
                    R1.b bVar = gVar.f5507b;
                    R1.f fVar = gVar.f5506a;
                    c0285q.U(-805577617);
                    if (bVar != null) {
                        try {
                            str = LocalTime.parse(fVar.f5500e).format(DateTimeFormatter.ofPattern("hh:mm a"));
                        } catch (Exception unused) {
                            str = fVar.f5500e;
                        }
                        String name = fVar.f5501f.name();
                        z2.h.c(str);
                        C1.y.a(bVar.f5476b, name, str, c0285q, 0);
                    }
                    c0285q.r(false);
                    c0285q.r(false);
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.a aVar2 = (androidx.compose.foundation.lazy.a) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0285q c0285q2 = (C0285q) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i3 = (c0285q2.g(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i3 |= c0285q2.e(intValue3) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    R1.g gVar2 = (R1.g) this.f6324j.get(intValue3);
                    c0285q2.U(-35607766);
                    B1.C.f(gVar2, c0285q2, 0);
                    c0285q2.r(false);
                }
                break;
            default:
                androidx.compose.foundation.lazy.a aVar3 = (androidx.compose.foundation.lazy.a) obj;
                int intValue5 = ((Number) obj2).intValue();
                C0285q c0285q3 = (C0285q) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i4 = (c0285q3.g(aVar3) ? 4 : 2) | intValue6;
                } else {
                    i4 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i4 |= c0285q3.e(intValue5) ? 32 : 16;
                }
                if ((i4 & 147) == 146 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    R1.g gVar3 = (R1.g) this.f6324j.get(intValue5);
                    c0285q3.U(2060360218);
                    R1.b bVar2 = gVar3.f5507b;
                    c0285q3.U(343558300);
                    if (bVar2 != null) {
                        AbstractC0423a.k(bVar2.f5476b, bVar2.f5477c, c0285q3, 0);
                    }
                    c0285q3.r(false);
                    c0285q3.r(false);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
