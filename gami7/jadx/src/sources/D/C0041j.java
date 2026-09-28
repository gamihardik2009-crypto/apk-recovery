package D;

import H.AbstractC0088d2;
import H.D1;
import J.C0275l;
import J.C0285q;
import c0.C0578S;
import c0.C0603v;
import com.example.bulksmsscheduler.R;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import i0.C0715h;
import i0.C0719l;
import i0.C0723p;
import java.util.ArrayList;
import m2.C0880v;
import m2.InterfaceC0861c;
import s.AbstractC1166e;

/* renamed from: D.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041j extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f862i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f863j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0861c f864k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0041j(int i2, InterfaceC0861c interfaceC0861c, boolean z3) {
        super(3);
        this.f862i = i2;
        this.f864k = interfaceC0861c;
        this.f863j = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [V.o] */
    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        String w2;
        boolean z3 = this.f863j;
        InterfaceC0861c interfaceC0861c = this.f864k;
        switch (this.f862i) {
            case 0:
                V.o oVar = (V.o) obj;
                C0285q c0285q = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q.U(-196777734);
                long j3 = ((g0) c0285q.l(h0.f857a)).f851a;
                y2.a aVar = (y2.a) interfaceC0861c;
                boolean f3 = c0285q.f(j3) | c0285q.g(aVar) | c0285q.h(z3);
                Object K3 = c0285q.K();
                if (f3 || K3 == C0275l.f4150a) {
                    K3 = new C0040i(j3, aVar, z3);
                    c0285q.e0(K3);
                }
                V.o b3 = androidx.compose.ui.draw.a.b(oVar, (y2.c) K3);
                c0285q.r(false);
                return b3;
            default:
                C0285q c0285q2 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    ((y2.e) interfaceC0861c).j(c0285q2, 0);
                    V.l lVar = V.l.f5857b;
                    AbstractC1166e.a(c0285q2, androidx.compose.foundation.layout.c.j(lVar, H.A.f1278e));
                    C0712e c0712e = K1.f.f4539b;
                    if (c0712e == null) {
                        C0711d c0711d = new C0711d("Filled.ArrowDropDown", false);
                        int i2 = AbstractC0732y.f7958a;
                        C0578S c0578s = new C0578S(C0603v.f7272b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C0719l(7.0f, 10.0f));
                        arrayList.add(new C0723p(5.0f, 5.0f));
                        arrayList.add(new C0723p(5.0f, -5.0f));
                        arrayList.add(C0715h.f7902b);
                        C0711d.a(c0711d, arrayList, c0578s);
                        c0712e = c0711d.b();
                        K1.f.f4539b = c0712e;
                    }
                    C0712e c0712e2 = c0712e;
                    if (z3) {
                        c0285q2.V(1071201785);
                        w2 = D1.w(R.string.m3c_date_picker_switch_to_day_selection, c0285q2);
                        c0285q2.r(false);
                    } else {
                        c0285q2.V(1071201872);
                        w2 = D1.w(R.string.m3c_date_picker_switch_to_year_selection, c0285q2);
                        c0285q2.r(false);
                    }
                    String str = w2;
                    float f4 = z3 ? 180.0f : 0.0f;
                    AbstractC0088d2.a(c0712e2, str, f4 == 0.0f ? lVar : androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, 0.0f, 0.0f, f4, null, false, 130815), 0L, c0285q2, 0, 8);
                }
                return C0880v.f8657a;
        }
    }
}
