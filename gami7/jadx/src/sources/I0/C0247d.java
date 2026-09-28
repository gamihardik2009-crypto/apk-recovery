package I0;

import C0.C0024g;
import C0.J;
import c0.C0565E;
import java.util.List;
import m2.C0880v;
import s.AbstractC1166e;

/* renamed from: I0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247d extends z2.i implements y2.c {

    /* renamed from: j, reason: collision with root package name */
    public static final C0247d f3869j = new C0247d(1, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0247d f3870k = new C0247d(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C0247d f3871l = new C0247d(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C0247d f3872m = new C0247d(1, 3);

    /* renamed from: n, reason: collision with root package name */
    public static final C0247d f3873n = new C0247d(1, 4);

    /* renamed from: o, reason: collision with root package name */
    public static final C0247d f3874o = new C0247d(1, 5);

    /* renamed from: p, reason: collision with root package name */
    public static final C0247d f3875p = new C0247d(1, 6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0247d(int i2, int i3) {
        super(i2);
        this.f3876i = i3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f3876i) {
            case 0:
                float[] fArr = ((C0565E) obj).f7188a;
                break;
            case 1:
                float[] fArr2 = ((C0565E) obj).f7188a;
                break;
            case 2:
                z2.h.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                K1.e eVar = C0.B.f406a;
                Boolean bool = Boolean.FALSE;
                C0024g c0024g = ((!z2.h.a(obj2, bool) || (eVar instanceof C0.A)) && obj2 != null) ? (C0024g) ((y2.c) eVar.f4537b).l(obj2) : null;
                z2.h.c(c0024g);
                Object obj3 = list.get(1);
                int i2 = J.f472c;
                K1.e eVar2 = C0.B.f421p;
                J j3 = ((!z2.h.a(obj3, bool) || (eVar2 instanceof C0.A)) && obj3 != null) ? (J) ((y2.c) eVar2.f4537b).l(obj3) : null;
                z2.h.c(j3);
                break;
            case 3:
                break;
            case 4:
                int i3 = ((l) obj).f3903a;
                break;
            case AbstractC1166e.f10138f /* 5 */:
                break;
            default:
                int i4 = ((l) obj).f3903a;
                break;
        }
        return c0880v;
    }
}
