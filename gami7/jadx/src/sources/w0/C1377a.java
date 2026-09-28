package w0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import b0.d;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377a extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C1378b f11432a;

    public C1377a(C1378b c1378b) {
        this.f11432a = c1378b;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f11432a.c(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f11432a.d(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        y2.a aVar = this.f11432a.f11433a;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        d dVar = this.f11432a.f11434b;
        if (rect != null) {
            rect.set((int) dVar.f7060a, (int) dVar.f7061b, (int) dVar.f7062c, (int) dVar.f7063d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C1378b c1378b = this.f11432a;
        c1378b.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C1378b.b(menu, 1, c1378b.f11435c);
        C1378b.b(menu, 2, c1378b.f11436d);
        C1378b.b(menu, 3, c1378b.f11437e);
        C1378b.b(menu, 4, c1378b.f11438f);
        return true;
    }
}
