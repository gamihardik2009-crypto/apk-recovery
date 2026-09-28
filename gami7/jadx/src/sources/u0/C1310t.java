package u0;

import android.os.SystemClock;
import android.view.MotionEvent;
import m2.C0880v;

/* renamed from: u0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1310t extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11146i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1314v f11147j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1310t(C1314v c1314v, int i2) {
        super(0);
        this.f11146i = i2;
        this.f11147j = c1314v;
    }

    @Override // y2.a
    public final Object c() {
        int actionMasked;
        C1295l c1295l;
        switch (this.f11146i) {
            case 0:
                C1314v c1314v = this.f11147j;
                MotionEvent motionEvent = c1314v.f11215t0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c1314v.f11217u0 = SystemClock.uptimeMillis();
                    c1314v.post(c1314v.f11222x0);
                }
                return C0880v.f8657a;
            default:
                c1295l = this.f11147j.get_viewTreeOwners();
                return c1295l;
        }
    }
}
