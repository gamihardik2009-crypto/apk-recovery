package u0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import c0.AbstractC0571K;

/* renamed from: u0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286g0 implements InterfaceC1284f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f11051a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11052b = new int[2];

    @Override // u0.InterfaceC1284f0
    public void b(View view, float[] fArr) {
        Matrix matrix = this.f11051a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f11052b;
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i2, iArr[1] - i3);
        AbstractC0571K.v(matrix, fArr);
    }
}
