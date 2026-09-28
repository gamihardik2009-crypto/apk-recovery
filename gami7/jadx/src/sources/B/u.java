package B;

import D.X;
import J2.Z;
import android.os.CancellationSignal;
import z.S;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements CancellationSignal.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f234b;

    public /* synthetic */ u(int i2, Object obj) {
        this.f233a = i2;
        this.f234b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f233a) {
            case 0:
                X x2 = (X) this.f234b;
                if (x2 != null) {
                    S s3 = x2.f783d;
                    if (s3 != null) {
                        s3.f(C0.J.f471b);
                    }
                    S s4 = x2.f783d;
                    if (s4 != null) {
                        s4.g(C0.J.f471b);
                        break;
                    }
                }
                break;
            default:
                ((Z) this.f234b).a(null);
                break;
        }
    }
}
