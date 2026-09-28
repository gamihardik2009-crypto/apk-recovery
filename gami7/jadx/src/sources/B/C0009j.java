package B;

import D.X;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import u0.V0;
import z.S;

/* renamed from: B.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0009j f223a = new C0009j();

    public final void a(S s3, X x2, HandwritingGesture handwritingGesture, V0 v0, Executor executor, final IntConsumer intConsumer, y2.c cVar) {
        final int j3 = s3 != null ? w.f235a.j(s3, handwritingGesture, x2, v0, cVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: B.i
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(j3);
                }
            });
        } else {
            intConsumer.accept(j3);
        }
    }

    public final boolean b(S s3, X x2, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (s3 != null) {
            return w.f235a.B(s3, previewableHandwritingGesture, x2, cancellationSignal);
        }
        return false;
    }
}
