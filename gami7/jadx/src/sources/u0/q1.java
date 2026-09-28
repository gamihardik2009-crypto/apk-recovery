package u0;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.example.bulksmsscheduler.R;
import java.util.Set;
import m2.C0880v;

/* loaded from: classes.dex */
public final class q1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11130i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1 f11131j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f11132k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(r1 r1Var, y2.e eVar, int i2) {
        super(2);
        this.f11130i = i2;
        this.f11131j = r1Var;
        this.f11132k = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f11130i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    AndroidCompositionLocals_androidKt.a(this.f11131j.f11138h, this.f11132k, c0285q, 0);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    r1 r1Var = this.f11131j;
                    Object tag = r1Var.f11138h.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof A2.a) || (tag instanceof A2.f)) ? (Set) tag : null;
                    C1314v c1314v = r1Var.f11138h;
                    if (set == null) {
                        Object parent = c1314v.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof A2.a) && !(tag2 instanceof A2.f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0285q2.f4197c);
                        c0285q2.f4210p = true;
                        c0285q2.f4182B = true;
                        c0285q2.f4197c.b();
                        c0285q2.f4185G.b();
                        J.G0 g02 = c0285q2.f4186H;
                        J.E0 e02 = g02.f4015a;
                        g02.f4019e = e02.f4006p;
                        g02.f4020f = e02.q;
                    }
                    boolean i2 = c0285q2.i(r1Var);
                    Object K3 = c0285q2.K();
                    J.W w2 = C0275l.f4150a;
                    if (i2 || K3 == w2) {
                        K3 = new o1(r1Var, null);
                        c0285q2.e0(K3);
                    }
                    C0257c.e(c0285q2, c1314v, (y2.e) K3);
                    boolean i3 = c0285q2.i(r1Var);
                    Object K4 = c0285q2.K();
                    if (i3 || K4 == w2) {
                        K4 = new p1(r1Var, null);
                        c0285q2.e0(K4);
                    }
                    C0257c.e(c0285q2, c1314v, (y2.e) K4);
                    C0257c.a(U.b.f5775a.a(set), R.b.c(-1193460702, new q1(r1Var, this.f11132k, 0), c0285q2), c0285q2, 56);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
