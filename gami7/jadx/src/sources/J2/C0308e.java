package J2;

import java.util.concurrent.Future;
import m2.C0880v;

/* renamed from: J2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308e extends AbstractC0309f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4388h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4389i;

    public /* synthetic */ C0308e(int i2, Object obj) {
        this.f4388h = i2;
        this.f4389i = obj;
    }

    @Override // J2.AbstractC0309f
    public final void b(Throwable th) {
        switch (this.f4388h) {
            case 0:
                if (th != null) {
                    ((Future) this.f4389i).cancel(false);
                    break;
                }
                break;
            case 1:
                ((J) this.f4389i).a();
                break;
            default:
                ((y2.c) this.f4389i).l(th);
                break;
        }
    }

    @Override // y2.c
    public final /* bridge */ /* synthetic */ Object l(Object obj) {
        switch (this.f4388h) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return C0880v.f8657a;
    }

    public final String toString() {
        switch (this.f4388h) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.f4389i) + ']';
            case 1:
                return "DisposeOnCancel[" + ((J) this.f4389i) + ']';
            default:
                return "InvokeOnCancel[" + ((y2.c) this.f4389i).getClass().getSimpleName() + '@' + B.j(this) + ']';
        }
    }
}
