package u0;

import android.view.accessibility.AccessibilityEvent;
import m2.C0880v;

/* loaded from: classes.dex */
public final class E extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10854i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G f10855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(G g3, int i2) {
        super(1);
        this.f10854i = i2;
        this.f10855j = g3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f10854i) {
            case 0:
                G g3 = this.f10855j;
                return Boolean.valueOf(g3.f10874d.getParent().requestSendAccessibilityEvent(g3.f10874d, (AccessibilityEvent) obj));
            default:
                O0 o02 = (O0) obj;
                G g4 = this.f10855j;
                g4.getClass();
                if (o02.f10958i.contains(o02)) {
                    g4.f10874d.getSnapshotObserver().a(o02, g4.f10873M, new D.c0(o02, 16, g4));
                }
                return C0880v.f8657a;
        }
    }
}
