package I0;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import n0.C0919B;

/* loaded from: classes.dex */
public class p implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f3913a;

    /* renamed from: b, reason: collision with root package name */
    public InputConnection f3914b;

    public p(B.I i2, C0919B c0919b) {
        this.f3913a = c0919b;
        this.f3914b = i2;
    }

    public final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            if (inputConnection != null) {
                a(inputConnection);
                this.f3914b = null;
            }
            this.f3913a.l(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i2, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i2);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.f3914b;
        return (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i2)) == null) ? new ExtractedText() : extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        CharSequence selectedText;
        InputConnection inputConnection = this.f3914b;
        return (inputConnection == null || (selectedText = inputConnection.getSelectedText(i2)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i2, i3);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i2, i3);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        InputConnection inputConnection = this.f3914b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i2, i3);
        }
        return false;
    }
}
