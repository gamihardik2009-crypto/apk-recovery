package H;

import J.C0285q;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m2.C0880v;
import t0.AbstractC1265x;

/* renamed from: H.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108g1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2599i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2600j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0108g1(int i2, int i3) {
        super(2);
        this.f2599i = i3;
        this.f2600j = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2599i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    t5.b(AbstractC0064a.a(this.f2600j + 1, 0, 7), A0.m.a(V.l.f5857b, C0200u.f3151p), 0L, 0L, null, null, null, 0L, null, new N0.i(3), 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 130556);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q2 = (C0285q) obj;
                ((Number) obj2).intValue();
                c0285q2.U(-1451087197);
                int i2 = this.f2600j;
                if (i2 == 0) {
                    throw null;
                }
                c0285q2.l(AndroidCompositionLocals_androidKt.f6780a);
                String string = ((Context) c0285q2.l(AndroidCompositionLocals_androidKt.f6781b)).getResources().getString(AbstractC1265x.b(i2));
                c0285q2.r(false);
                return string;
        }
    }
}
