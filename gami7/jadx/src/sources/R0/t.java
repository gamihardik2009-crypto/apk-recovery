package R0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import u0.X0;

/* loaded from: classes.dex */
public final class t extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5434a;

    public /* synthetic */ t(int i2) {
        this.f5434a = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f5434a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 2:
                if ((view instanceof f0.n) && (outline2 = ((f0.n) view).f7690l) != null) {
                    outline.set(outline2);
                    break;
                }
                break;
            default:
                z2.h.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b3 = ((X0) view).f10995l.b();
                z2.h.c(b3);
                outline.set(b3);
                break;
        }
    }
}
