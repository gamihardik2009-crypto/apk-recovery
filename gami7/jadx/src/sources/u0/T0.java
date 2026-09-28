package u0;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f10976a = new T0();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i2) {
        return view.startActionMode(callback, i2);
    }
}
